// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class PurchaseOrderCreateCmd extends TeaModel {
    /**
     * <p>User ID in the distributor\&quot;s business, customized by the distributor.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>Allocate different buyer IDs for different buyers.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>buyer123456</p>
     */
    @NameInMap("buyerId")
    public String buyerId;

    /**
     * <p>Address information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("deliveryAddress")
    public AddressInfo deliveryAddress;

    /**
     * <p>Extension information.</p>
     */
    @NameInMap("extInfo")
    public java.util.Map<String, ?> extInfo;

    /**
     * <p>Order ID in the distributor\&quot;s business, customized by the distributor.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>outer123456</p>
     */
    @NameInMap("outerPurchaseOrderId")
    public String outerPurchaseOrderId;

    /**
     * <p>Product collection.</p>
     * <blockquote>
     * <p>Maximum number of SKUs per purchase order: 20.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("productList")
    public java.util.List<ProductDTO> productList;

    public static PurchaseOrderCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        PurchaseOrderCreateCmd self = new PurchaseOrderCreateCmd();
        return TeaModel.build(map, self);
    }

    public PurchaseOrderCreateCmd setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public PurchaseOrderCreateCmd setDeliveryAddress(AddressInfo deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }
    public AddressInfo getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public PurchaseOrderCreateCmd setExtInfo(java.util.Map<String, ?> extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtInfo() {
        return this.extInfo;
    }

    public PurchaseOrderCreateCmd setOuterPurchaseOrderId(String outerPurchaseOrderId) {
        this.outerPurchaseOrderId = outerPurchaseOrderId;
        return this;
    }
    public String getOuterPurchaseOrderId() {
        return this.outerPurchaseOrderId;
    }

    public PurchaseOrderCreateCmd setProductList(java.util.List<ProductDTO> productList) {
        this.productList = productList;
        return this;
    }
    public java.util.List<ProductDTO> getProductList() {
        return this.productList;
    }

}
