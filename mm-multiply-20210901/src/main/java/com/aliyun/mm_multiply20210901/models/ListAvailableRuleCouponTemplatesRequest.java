// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListAvailableRuleCouponTemplatesRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("TypeCode")
    public Integer typeCode;

    @NameInMap("UserId")
    public Long userId;

    public static ListAvailableRuleCouponTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableRuleCouponTemplatesRequest self = new ListAvailableRuleCouponTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListAvailableRuleCouponTemplatesRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListAvailableRuleCouponTemplatesRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ListAvailableRuleCouponTemplatesRequest setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
        return this;
    }
    public Integer getTypeCode() {
        return this.typeCode;
    }

    public ListAvailableRuleCouponTemplatesRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
