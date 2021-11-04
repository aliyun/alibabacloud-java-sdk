// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class DeductUserPointShrinkRequest extends TeaModel {
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
    public String extInfoShrink;

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

    public static DeductUserPointShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeductUserPointShrinkRequest self = new DeductUserPointShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeductUserPointShrinkRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public DeductUserPointShrinkRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public DeductUserPointShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DeductUserPointShrinkRequest setExtInfoShrink(String extInfoShrink) {
        this.extInfoShrink = extInfoShrink;
        return this;
    }
    public String getExtInfoShrink() {
        return this.extInfoShrink;
    }

    public DeductUserPointShrinkRequest setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public DeductUserPointShrinkRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeductUserPointShrinkRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public DeductUserPointShrinkRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public DeductUserPointShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
