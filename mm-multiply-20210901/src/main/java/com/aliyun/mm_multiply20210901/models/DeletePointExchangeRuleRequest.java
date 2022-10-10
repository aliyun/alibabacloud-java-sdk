// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class DeletePointExchangeRuleRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("RuleIdList")
    public String ruleIdList;

    @NameInMap("TypeCode")
    public Integer typeCode;

    @NameInMap("UserId")
    public Long userId;

    public static DeletePointExchangeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePointExchangeRuleRequest self = new DeletePointExchangeRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeletePointExchangeRuleRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DeletePointExchangeRuleRequest setRuleIdList(String ruleIdList) {
        this.ruleIdList = ruleIdList;
        return this;
    }
    public String getRuleIdList() {
        return this.ruleIdList;
    }

    public DeletePointExchangeRuleRequest setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
        return this;
    }
    public Integer getTypeCode() {
        return this.typeCode;
    }

    public DeletePointExchangeRuleRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
