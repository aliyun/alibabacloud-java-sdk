// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class CreateOrderRequest extends TeaModel {
    @NameInMap("Amount")
    public Long amount;

    @NameInMap("BuyerId")
    public Long buyerId;

    @NameInMap("ItemId")
    public Long itemId;

    public static CreateOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderRequest self = new CreateOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public CreateOrderRequest setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public Long getBuyerId() {
        return this.buyerId;
    }

    public CreateOrderRequest setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

}
