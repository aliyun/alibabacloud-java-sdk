// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class PurchaseOrderRenderResult extends TeaModel {
    /**
     * <p>The address list.</p>
     */
    @NameInMap("addressList")
    public java.util.List<AddressInfo> addressList;

    /**
     * <p>Indicates whether the item is sellable.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("canSell")
    public Boolean canSell;

    /**
     * <p>The extended information.</p>
     */
    @NameInMap("extInfo")
    public java.util.Map<String, ?> extInfo;

    /**
     * <p>The reason why the item is unsellable.</p>
     * 
     * <strong>example:</strong>
     * <p>Out of stock</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The list of sellable primary orders.</p>
     */
    @NameInMap("orderList")
    public java.util.List<OrderRenderResult> orderList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>841471F6-5D61-1331-8C38-2****B55</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of unsellable primary orders.</p>
     */
    @NameInMap("unsellableOrderList")
    public java.util.List<OrderRenderResult> unsellableOrderList;

    public static PurchaseOrderRenderResult build(java.util.Map<String, ?> map) throws Exception {
        PurchaseOrderRenderResult self = new PurchaseOrderRenderResult();
        return TeaModel.build(map, self);
    }

    public PurchaseOrderRenderResult setAddressList(java.util.List<AddressInfo> addressList) {
        this.addressList = addressList;
        return this;
    }
    public java.util.List<AddressInfo> getAddressList() {
        return this.addressList;
    }

    public PurchaseOrderRenderResult setCanSell(Boolean canSell) {
        this.canSell = canSell;
        return this;
    }
    public Boolean getCanSell() {
        return this.canSell;
    }

    public PurchaseOrderRenderResult setExtInfo(java.util.Map<String, ?> extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtInfo() {
        return this.extInfo;
    }

    public PurchaseOrderRenderResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PurchaseOrderRenderResult setOrderList(java.util.List<OrderRenderResult> orderList) {
        this.orderList = orderList;
        return this;
    }
    public java.util.List<OrderRenderResult> getOrderList() {
        return this.orderList;
    }

    public PurchaseOrderRenderResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PurchaseOrderRenderResult setUnsellableOrderList(java.util.List<OrderRenderResult> unsellableOrderList) {
        this.unsellableOrderList = unsellableOrderList;
        return this;
    }
    public java.util.List<OrderRenderResult> getUnsellableOrderList() {
        return this.unsellableOrderList;
    }

}
