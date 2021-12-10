// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class CloseOrderRequest extends TeaModel {
    @NameInMap("AccountDomain")
    public String accountDomain;

    @NameInMap("BuyerAccountId")
    public String buyerAccountId;

    @NameInMap("OrderId")
    public String orderId;

    public static CloseOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseOrderRequest self = new CloseOrderRequest();
        return TeaModel.build(map, self);
    }

    public CloseOrderRequest setAccountDomain(String accountDomain) {
        this.accountDomain = accountDomain;
        return this;
    }
    public String getAccountDomain() {
        return this.accountDomain;
    }

    public CloseOrderRequest setBuyerAccountId(String buyerAccountId) {
        this.buyerAccountId = buyerAccountId;
        return this;
    }
    public String getBuyerAccountId() {
        return this.buyerAccountId;
    }

    public CloseOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
