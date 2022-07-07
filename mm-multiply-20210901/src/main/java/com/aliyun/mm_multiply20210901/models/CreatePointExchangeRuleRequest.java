// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class CreatePointExchangeRuleRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    // 卡券模板ID列表
    @NameInMap("CouponTemplateIdList")
    public String couponTemplateIdList;

    // 积分（最多4位）
    @NameInMap("PointAmount")
    public Long pointAmount;

    // 备注
    @NameInMap("Remark")
    public String remark;

    // 规则名称
    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("TypeCode")
    public Integer typeCode;

    @NameInMap("UserId")
    public Long userId;

    public static CreatePointExchangeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePointExchangeRuleRequest self = new CreatePointExchangeRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreatePointExchangeRuleRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreatePointExchangeRuleRequest setCouponTemplateIdList(String couponTemplateIdList) {
        this.couponTemplateIdList = couponTemplateIdList;
        return this;
    }
    public String getCouponTemplateIdList() {
        return this.couponTemplateIdList;
    }

    public CreatePointExchangeRuleRequest setPointAmount(Long pointAmount) {
        this.pointAmount = pointAmount;
        return this;
    }
    public Long getPointAmount() {
        return this.pointAmount;
    }

    public CreatePointExchangeRuleRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreatePointExchangeRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreatePointExchangeRuleRequest setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
        return this;
    }
    public Integer getTypeCode() {
        return this.typeCode;
    }

    public CreatePointExchangeRuleRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
