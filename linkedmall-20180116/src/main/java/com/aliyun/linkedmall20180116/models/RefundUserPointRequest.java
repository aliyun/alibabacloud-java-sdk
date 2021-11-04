// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RefundUserPointRequest extends TeaModel {
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

    @NameInMap("OriginRecordId")
    public String originRecordId;

    // 规则ID
    @NameInMap("RuleId")
    public String ruleId;

    // 业务方用户ID
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    // 发放主题
    @NameInMap("Title")
    public String title;

    public static RefundUserPointRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundUserPointRequest self = new RefundUserPointRequest();
        return TeaModel.build(map, self);
    }

    public RefundUserPointRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public RefundUserPointRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public RefundUserPointRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RefundUserPointRequest setExtInfo(java.util.Map<String, ?> extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtInfo() {
        return this.extInfo;
    }

    public RefundUserPointRequest setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public RefundUserPointRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RefundUserPointRequest setOriginRecordId(String originRecordId) {
        this.originRecordId = originRecordId;
        return this;
    }
    public String getOriginRecordId() {
        return this.originRecordId;
    }

    public RefundUserPointRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public RefundUserPointRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public RefundUserPointRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
