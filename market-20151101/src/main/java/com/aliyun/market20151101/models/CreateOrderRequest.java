// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class CreateOrderRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Commodity")
    public String commodity;

    @NameInMap("OrderSouce")
    public String orderSouce;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("PaymentType")
    public String paymentType;

    public static CreateOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderRequest self = new CreateOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateOrderRequest setCommodity(String commodity) {
        this.commodity = commodity;
        return this;
    }
    public String getCommodity() {
        return this.commodity;
    }

    public CreateOrderRequest setOrderSouce(String orderSouce) {
        this.orderSouce = orderSouce;
        return this;
    }
    public String getOrderSouce() {
        return this.orderSouce;
    }

    public CreateOrderRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public CreateOrderRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateOrderRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

}
