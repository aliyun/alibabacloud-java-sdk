// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class PurchaseOrderCreateCmd extends TeaModel {
    @NameInMap("buyerId")
    public String buyerId;

    @NameInMap("deliveryAddress")
    public AddressInfo deliveryAddress;

    @NameInMap("extInfo")
    public java.util.Map<String, ?> extInfo;

    @NameInMap("outerPurchaseOrderId")
    public String outerPurchaseOrderId;

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
