// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class UpdatePointExchangeRuleRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CouponTemplateIdList")
    public String couponTemplateIdList;

    @NameInMap("PointAmount")
    public Long pointAmount;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("TypeCode")
    public Integer typeCode;

    @NameInMap("UserId")
    public Long userId;

    public static UpdatePointExchangeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePointExchangeRuleRequest self = new UpdatePointExchangeRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePointExchangeRuleRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdatePointExchangeRuleRequest setCouponTemplateIdList(String couponTemplateIdList) {
        this.couponTemplateIdList = couponTemplateIdList;
        return this;
    }
    public String getCouponTemplateIdList() {
        return this.couponTemplateIdList;
    }

    public UpdatePointExchangeRuleRequest setPointAmount(Long pointAmount) {
        this.pointAmount = pointAmount;
        return this;
    }
    public Long getPointAmount() {
        return this.pointAmount;
    }

    public UpdatePointExchangeRuleRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdatePointExchangeRuleRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public UpdatePointExchangeRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdatePointExchangeRuleRequest setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
        return this;
    }
    public Integer getTypeCode() {
        return this.typeCode;
    }

    public UpdatePointExchangeRuleRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
