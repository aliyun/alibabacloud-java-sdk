// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsureOrderPayRequest extends TeaModel {
    @NameInMap("btrip_user_id")
    public String btripUserId;

    @NameInMap("buyer_name")
    public String buyerName;

    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("out_order_id")
    public String outOrderId;

    @NameInMap("out_sub_order_id")
    public String outSubOrderId;

    @NameInMap("payment_amount")
    public Long paymentAmount;

    @NameInMap("supplier_code")
    public String supplierCode;

    public static InsureOrderPayRequest build(java.util.Map<String, ?> map) throws Exception {
        InsureOrderPayRequest self = new InsureOrderPayRequest();
        return TeaModel.build(map, self);
    }

    public InsureOrderPayRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public InsureOrderPayRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public InsureOrderPayRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public InsureOrderPayRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public InsureOrderPayRequest setOutSubOrderId(String outSubOrderId) {
        this.outSubOrderId = outSubOrderId;
        return this;
    }
    public String getOutSubOrderId() {
        return this.outSubOrderId;
    }

    public InsureOrderPayRequest setPaymentAmount(Long paymentAmount) {
        this.paymentAmount = paymentAmount;
        return this;
    }
    public Long getPaymentAmount() {
        return this.paymentAmount;
    }

    public InsureOrderPayRequest setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
        return this;
    }
    public String getSupplierCode() {
        return this.supplierCode;
    }

}
