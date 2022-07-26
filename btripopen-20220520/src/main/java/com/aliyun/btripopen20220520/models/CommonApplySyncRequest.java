// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CommonApplySyncRequest extends TeaModel {
    @NameInMap("apply_id")
    public Long applyId;

    @NameInMap("biz_category")
    public Integer bizCategory;

    @NameInMap("remark")
    public String remark;

    @NameInMap("status")
    public Integer status;

    @NameInMap("thirdparty_flow_id")
    public String thirdpartyFlowId;

    @NameInMap("user_id")
    public String userId;

    public static CommonApplySyncRequest build(java.util.Map<String, ?> map) throws Exception {
        CommonApplySyncRequest self = new CommonApplySyncRequest();
        return TeaModel.build(map, self);
    }

    public CommonApplySyncRequest setApplyId(Long applyId) {
        this.applyId = applyId;
        return this;
    }
    public Long getApplyId() {
        return this.applyId;
    }

    public CommonApplySyncRequest setBizCategory(Integer bizCategory) {
        this.bizCategory = bizCategory;
        return this;
    }
    public Integer getBizCategory() {
        return this.bizCategory;
    }

    public CommonApplySyncRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CommonApplySyncRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CommonApplySyncRequest setThirdpartyFlowId(String thirdpartyFlowId) {
        this.thirdpartyFlowId = thirdpartyFlowId;
        return this;
    }
    public String getThirdpartyFlowId() {
        return this.thirdpartyFlowId;
    }

    public CommonApplySyncRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
