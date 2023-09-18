// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ProductDTO extends TeaModel {
    @NameInMap("price")
    public Long price;

    @NameInMap("productId")
    public String productId;

    @NameInMap("purchaserId")
    public String purchaserId;

    @NameInMap("quantity")
    public Integer quantity;

    @NameInMap("skuId")
    public String skuId;

    public static ProductDTO build(java.util.Map<String, ?> map) throws Exception {
        ProductDTO self = new ProductDTO();
        return TeaModel.build(map, self);
    }

    public ProductDTO setPrice(Long price) {
        this.price = price;
        return this;
    }
    public Long getPrice() {
        return this.price;
    }

    public ProductDTO setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ProductDTO setPurchaserId(String purchaserId) {
        this.purchaserId = purchaserId;
        return this;
    }
    public String getPurchaserId() {
        return this.purchaserId;
    }

    public ProductDTO setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public ProductDTO setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

}
