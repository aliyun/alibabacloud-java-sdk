// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class UnFreezeUserPointRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    // 数额
    @NameInMap("Amount")
    public Long amount;

    // 业务ID
    @NameInMap("BizId")
    public String bizId;

    // 扩展信息
    @NameInMap("ExtInfo")
    public java.util.Map<String, ?> extInfo;

    // 幂等ID
    @NameInMap("IdempotentId")
    public String idempotentId;

    // 发放说明
    @NameInMap("Message")
    public String message;

    // 规则ID
    @NameInMap("RuleId")
    public String ruleId;

    // 业务方用户ID
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    // 发放主题
    @NameInMap("Title")
    public String title;

    public static UnFreezeUserPointRequest build(java.util.Map<String, ?> map) throws Exception {
        UnFreezeUserPointRequest self = new UnFreezeUserPointRequest();
        return TeaModel.build(map, self);
    }

    public UnFreezeUserPointRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public UnFreezeUserPointRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public UnFreezeUserPointRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UnFreezeUserPointRequest setExtInfo(java.util.Map<String, ?> extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtInfo() {
        return this.extInfo;
    }

    public UnFreezeUserPointRequest setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public UnFreezeUserPointRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnFreezeUserPointRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public UnFreezeUserPointRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public UnFreezeUserPointRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
