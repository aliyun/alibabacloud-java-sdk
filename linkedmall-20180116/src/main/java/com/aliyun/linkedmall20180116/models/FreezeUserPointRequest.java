// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class FreezeUserPointRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("Amount")
    public Long amount;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ExtInfo")
    public java.util.Map<String, ?> extInfo;

    @NameInMap("IdempotentId")
    public String idempotentId;

    @NameInMap("Message")
    public String message;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    @NameInMap("Title")
    public String title;

    public static FreezeUserPointRequest build(java.util.Map<String, ?> map) throws Exception {
        FreezeUserPointRequest self = new FreezeUserPointRequest();
        return TeaModel.build(map, self);
    }

    public FreezeUserPointRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public FreezeUserPointRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public FreezeUserPointRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public FreezeUserPointRequest setExtInfo(java.util.Map<String, ?> extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtInfo() {
        return this.extInfo;
    }

    public FreezeUserPointRequest setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public FreezeUserPointRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FreezeUserPointRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public FreezeUserPointRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public FreezeUserPointRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
