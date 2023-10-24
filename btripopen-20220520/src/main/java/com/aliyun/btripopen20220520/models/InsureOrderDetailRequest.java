// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsureOrderDetailRequest extends TeaModel {
    @NameInMap("btrip_user_id")
    public String btripUserId;

    @NameInMap("buyer_name")
    public String buyerName;

    @NameInMap("ins_order_id")
    public String insOrderId;

    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("supplier_code")
    public String supplierCode;

    public static InsureOrderDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        InsureOrderDetailRequest self = new InsureOrderDetailRequest();
        return TeaModel.build(map, self);
    }

    public InsureOrderDetailRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public InsureOrderDetailRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public InsureOrderDetailRequest setInsOrderId(String insOrderId) {
        this.insOrderId = insOrderId;
        return this;
    }
    public String getInsOrderId() {
        return this.insOrderId;
    }

    public InsureOrderDetailRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public InsureOrderDetailRequest setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
        return this;
    }
    public String getSupplierCode() {
        return this.supplierCode;
    }

}
