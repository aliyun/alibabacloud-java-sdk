// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CancelOrderRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("BizUid")
    @Validation(required = true)
    public String bizUid;

    @NameInMap("LmOrderId")
    @Validation(required = true)
    public String lmOrderId;

    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    public static CancelOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelOrderRequest self = new CancelOrderRequest();
        return TeaModel.build(map, self);
    }

    public CancelOrderRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CancelOrderRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public CancelOrderRequest setLmOrderId(String lmOrderId) {
        this.lmOrderId = lmOrderId;
        return this;
    }
    public String getLmOrderId() {
        return this.lmOrderId;
    }

    public CancelOrderRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public CancelOrderRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public CancelOrderRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

}
