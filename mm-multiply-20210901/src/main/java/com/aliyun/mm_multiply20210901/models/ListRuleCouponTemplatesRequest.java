// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListRuleCouponTemplatesRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("TypeCode")
    public Integer typeCode;

    @NameInMap("UserId")
    public Long userId;

    public static ListRuleCouponTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRuleCouponTemplatesRequest self = new ListRuleCouponTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListRuleCouponTemplatesRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListRuleCouponTemplatesRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ListRuleCouponTemplatesRequest setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
        return this;
    }
    public Integer getTypeCode() {
        return this.typeCode;
    }

    public ListRuleCouponTemplatesRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
