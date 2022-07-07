// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class UpdatePointGrantRuleRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("PointAmount")
    public Long pointAmount;

    @NameInMap("StartAmount")
    public String startAmount;

    @NameInMap("Status")
    public Long status;

    @NameInMap("Type")
    public String type;

    @NameInMap("TypeCode")
    public Integer typeCode;

    @NameInMap("UserId")
    public Long userId;

    public static UpdatePointGrantRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePointGrantRuleRequest self = new UpdatePointGrantRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePointGrantRuleRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdatePointGrantRuleRequest setPointAmount(Long pointAmount) {
        this.pointAmount = pointAmount;
        return this;
    }
    public Long getPointAmount() {
        return this.pointAmount;
    }

    public UpdatePointGrantRuleRequest setStartAmount(String startAmount) {
        this.startAmount = startAmount;
        return this;
    }
    public String getStartAmount() {
        return this.startAmount;
    }

    public UpdatePointGrantRuleRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public UpdatePointGrantRuleRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdatePointGrantRuleRequest setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
        return this;
    }
    public Integer getTypeCode() {
        return this.typeCode;
    }

    public UpdatePointGrantRuleRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
