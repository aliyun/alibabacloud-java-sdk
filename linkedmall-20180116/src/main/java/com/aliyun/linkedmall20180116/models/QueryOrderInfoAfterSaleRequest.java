// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderInfoAfterSaleRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("ChannelUserId")
    @Validation(required = true)
    public String channelUserId;

    @NameInMap("LmOrderId")
    @Validation(required = true)
    public String lmOrderId;

    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    @NameInMap("AccountType")
    public String accountType;

    public static QueryOrderInfoAfterSaleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderInfoAfterSaleRequest self = new QueryOrderInfoAfterSaleRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrderInfoAfterSaleRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryOrderInfoAfterSaleRequest setChannelUserId(String channelUserId) {
        this.channelUserId = channelUserId;
        return this;
    }
    public String getChannelUserId() {
        return this.channelUserId;
    }

    public QueryOrderInfoAfterSaleRequest setLmOrderId(String lmOrderId) {
        this.lmOrderId = lmOrderId;
        return this;
    }
    public String getLmOrderId() {
        return this.lmOrderId;
    }

    public QueryOrderInfoAfterSaleRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

    public QueryOrderInfoAfterSaleRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public QueryOrderInfoAfterSaleRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

}
