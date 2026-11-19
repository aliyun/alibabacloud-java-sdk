// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class PurchaseOrderRenderQuery extends TeaModel {
    /**
     * <p>The actual buyer ID for distribution. <notice>Assign a unique ID to each buyer. Do not use the same ID for different buyers.</notice></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1234567</p>
     */
    @NameInMap("buyerId")
    public String buyerId;

    /**
     * <p>The address information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("deliveryAddress")
    public AddressInfo deliveryAddress;

    /**
     * <p>The extension information.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("extInfo")
    public java.util.Map<String, ?> extInfo;

    /**
     * <p>The product list.</p>
     * <blockquote>
     * <p>Maximum number of SKUs per purchase order: 20.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("productList")
    public java.util.List<OrderRenderProductDTO> productList;

    public static PurchaseOrderRenderQuery build(java.util.Map<String, ?> map) throws Exception {
        PurchaseOrderRenderQuery self = new PurchaseOrderRenderQuery();
        return TeaModel.build(map, self);
    }

    public PurchaseOrderRenderQuery setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public PurchaseOrderRenderQuery setDeliveryAddress(AddressInfo deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }
    public AddressInfo getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public PurchaseOrderRenderQuery setExtInfo(java.util.Map<String, ?> extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtInfo() {
        return this.extInfo;
    }

    public PurchaseOrderRenderQuery setProductList(java.util.List<OrderRenderProductDTO> productList) {
        this.productList = productList;
        return this;
    }
    public java.util.List<OrderRenderProductDTO> getProductList() {
        return this.productList;
    }

}
