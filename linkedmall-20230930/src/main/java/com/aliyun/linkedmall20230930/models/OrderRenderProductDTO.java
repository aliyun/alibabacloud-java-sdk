// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class OrderRenderProductDTO extends TeaModel {
    @NameInMap("productId")
    public String productId;

    @NameInMap("quantity")
    public Integer quantity;

    @NameInMap("shopId")
    public String shopId;

    @NameInMap("skuId")
    public String skuId;

    public static OrderRenderProductDTO build(java.util.Map<String, ?> map) throws Exception {
        OrderRenderProductDTO self = new OrderRenderProductDTO();
        return TeaModel.build(map, self);
    }

    public OrderRenderProductDTO setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public OrderRenderProductDTO setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public OrderRenderProductDTO setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public OrderRenderProductDTO setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

}
