// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class PrecheckUsabilityRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("Biz")
    public String biz;

    @NameInMap("CardNumber")
    public String cardNumber;

    @NameInMap("CardType")
    public String cardType;

    @NameInMap("ClientInfo")
    public String clientInfo;

    @NameInMap("Name")
    public String name;

    @NameInMap("Source")
    public String source;

    public static PrecheckUsabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        PrecheckUsabilityRequest self = new PrecheckUsabilityRequest();
        return TeaModel.build(map, self);
    }

    public PrecheckUsabilityRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public PrecheckUsabilityRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public PrecheckUsabilityRequest setBiz(String biz) {
        this.biz = biz;
        return this;
    }
    public String getBiz() {
        return this.biz;
    }

    public PrecheckUsabilityRequest setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }
    public String getCardNumber() {
        return this.cardNumber;
    }

    public PrecheckUsabilityRequest setCardType(String cardType) {
        this.cardType = cardType;
        return this;
    }
    public String getCardType() {
        return this.cardType;
    }

    public PrecheckUsabilityRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

    public PrecheckUsabilityRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PrecheckUsabilityRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
