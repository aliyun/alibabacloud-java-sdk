// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QueryOrderRequest extends TeaModel {
    @NameInMap("BuyerAccountId")
    @Validation(required = true)
    public String buyerAccountId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public String orderId;

    @NameInMap("AccountDomain")
    public String accountDomain;

    public static QueryOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderRequest self = new QueryOrderRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrderRequest setBuyerAccountId(String buyerAccountId) {
        this.buyerAccountId = buyerAccountId;
        return this;
    }
    public String getBuyerAccountId() {
        return this.buyerAccountId;
    }

    public QueryOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryOrderRequest setAccountDomain(String accountDomain) {
        this.accountDomain = accountDomain;
        return this;
    }
    public String getAccountDomain() {
        return this.accountDomain;
    }

}
