// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class Good extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>儿童学习桌</p>
     */
    @NameInMap("goodName")
    public String goodName;

    /**
     * <strong>example:</strong>
     * <p>6600****6736</p>
     */
    @NameInMap("productId")
    public String productId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("quantity")
    public Integer quantity;

    @NameInMap("skuId")
    public String skuId;

    @NameInMap("skuTitle")
    public String skuTitle;

    public static Good build(java.util.Map<String, ?> map) throws Exception {
        Good self = new Good();
        return TeaModel.build(map, self);
    }

    public Good setGoodName(String goodName) {
        this.goodName = goodName;
        return this;
    }
    public String getGoodName() {
        return this.goodName;
    }

    public Good setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public Good setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public Good setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public Good setSkuTitle(String skuTitle) {
        this.skuTitle = skuTitle;
        return this;
    }
    public String getSkuTitle() {
        return this.skuTitle;
    }

}
