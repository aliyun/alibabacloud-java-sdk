// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class OrderRenderProductDTO extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6600****6736</p>
     */
    @NameInMap("productId")
    public String productId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>56****2304</p>
     */
    @NameInMap("purchaserId")
    public String purchaserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("quantity")
    public Integer quantity;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6600****6737</p>
     */
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

    public OrderRenderProductDTO setPurchaserId(String purchaserId) {
        this.purchaserId = purchaserId;
        return this;
    }
    public String getPurchaserId() {
        return this.purchaserId;
    }

    public OrderRenderProductDTO setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

    public OrderRenderProductDTO setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

}
