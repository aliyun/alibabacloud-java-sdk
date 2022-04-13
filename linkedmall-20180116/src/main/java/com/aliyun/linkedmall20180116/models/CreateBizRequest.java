// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateBizRequest extends TeaModel {
    @NameInMap("BizName")
    public String bizName;

    @NameInMap("BizType")
    public Integer bizType;

    @NameInMap("Description")
    public String description;

    @NameInMap("EndTimeMs")
    public Long endTimeMs;

    @NameInMap("IsDeduction")
    public Integer isDeduction;

    @NameInMap("TenantId")
    public String tenantId;

    public static CreateBizRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBizRequest self = new CreateBizRequest();
        return TeaModel.build(map, self);
    }

    public CreateBizRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public CreateBizRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public CreateBizRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBizRequest setEndTimeMs(Long endTimeMs) {
        this.endTimeMs = endTimeMs;
        return this;
    }
    public Long getEndTimeMs() {
        return this.endTimeMs;
    }

    public CreateBizRequest setIsDeduction(Integer isDeduction) {
        this.isDeduction = isDeduction;
        return this;
    }
    public Integer getIsDeduction() {
        return this.isDeduction;
    }

    public CreateBizRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
