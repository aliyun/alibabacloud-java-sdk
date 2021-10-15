// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class EnableOrderRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("BizUid")
    @Validation(required = true)
    public String bizUid;

    @NameInMap("ExtJson")
    public String extJson;

    @NameInMap("LmOrderId")
    public String lmOrderId;

    @NameInMap("OutTradeId")
    @Validation(required = true)
    public String outTradeId;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    public static EnableOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableOrderRequest self = new EnableOrderRequest();
        return TeaModel.build(map, self);
    }

    public EnableOrderRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public EnableOrderRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public EnableOrderRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public EnableOrderRequest setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

    public EnableOrderRequest setLmOrderId(String lmOrderId) {
        this.lmOrderId = lmOrderId;
        return this;
    }
    public String getLmOrderId() {
        return this.lmOrderId;
    }

    public EnableOrderRequest setOutTradeId(String outTradeId) {
        this.outTradeId = outTradeId;
        return this;
    }
    public String getOutTradeId() {
        return this.outTradeId;
    }

    public EnableOrderRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public EnableOrderRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

}
