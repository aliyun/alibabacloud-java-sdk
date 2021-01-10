// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RepayOrderRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizUid")
    public String bizUid;

    @NameInMap("LmOrderId")
    public Long lmOrderId;

    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    @NameInMap("AccountType")
    public String accountType;

    public static RepayOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        RepayOrderRequest self = new RepayOrderRequest();
        return TeaModel.build(map, self);
    }

    public RepayOrderRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RepayOrderRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public RepayOrderRequest setLmOrderId(Long lmOrderId) {
        this.lmOrderId = lmOrderId;
        return this;
    }
    public Long getLmOrderId() {
        return this.lmOrderId;
    }

    public RepayOrderRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

    public RepayOrderRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public RepayOrderRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

}
