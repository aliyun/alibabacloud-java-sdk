// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class GetVerifyTokenRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

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

    @NameInMap("PrivacyPolicyId")
    public Long privacyPolicyId;

    @NameInMap("Source")
    public String source;

    @NameInMap("TicketId")
    public String ticketId;

    public static GetVerifyTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVerifyTokenRequest self = new GetVerifyTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetVerifyTokenRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetVerifyTokenRequest setBiz(String biz) {
        this.biz = biz;
        return this;
    }
    public String getBiz() {
        return this.biz;
    }

    public GetVerifyTokenRequest setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }
    public String getCardNumber() {
        return this.cardNumber;
    }

    public GetVerifyTokenRequest setCardType(String cardType) {
        this.cardType = cardType;
        return this;
    }
    public String getCardType() {
        return this.cardType;
    }

    public GetVerifyTokenRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

    public GetVerifyTokenRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetVerifyTokenRequest setPrivacyPolicyId(Long privacyPolicyId) {
        this.privacyPolicyId = privacyPolicyId;
        return this;
    }
    public Long getPrivacyPolicyId() {
        return this.privacyPolicyId;
    }

    public GetVerifyTokenRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetVerifyTokenRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

}
