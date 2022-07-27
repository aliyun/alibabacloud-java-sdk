// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GiveUserPointRequest extends TeaModel {
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

    @NameInMap("TargetBizUid")
    public String targetBizUid;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    @NameInMap("Title")
    public String title;

    public static GiveUserPointRequest build(java.util.Map<String, ?> map) throws Exception {
        GiveUserPointRequest self = new GiveUserPointRequest();
        return TeaModel.build(map, self);
    }

    public GiveUserPointRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public GiveUserPointRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public GiveUserPointRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GiveUserPointRequest setExtInfo(java.util.Map<String, ?> extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtInfo() {
        return this.extInfo;
    }

    public GiveUserPointRequest setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public GiveUserPointRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GiveUserPointRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public GiveUserPointRequest setTargetBizUid(String targetBizUid) {
        this.targetBizUid = targetBizUid;
        return this;
    }
    public String getTargetBizUid() {
        return this.targetBizUid;
    }

    public GiveUserPointRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public GiveUserPointRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
