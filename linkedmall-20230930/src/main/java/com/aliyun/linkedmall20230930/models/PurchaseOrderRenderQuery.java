// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class PurchaseOrderRenderQuery extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("buyerId")
    public String buyerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("deliveryAddress")
    public AddressInfo deliveryAddress;

    @NameInMap("extInfo")
    public java.util.Map<String, ?> extInfo;

    /**
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
