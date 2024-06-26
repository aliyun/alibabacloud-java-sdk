// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsureOrderApplyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100000102</p>
     */
    @NameInMap("btrip_user_id")
    public String btripUserId;

    @NameInMap("buyer_name")
    public String buyerName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000003000000490</p>
     */
    @NameInMap("ins_order_id")
    public String insOrderId;

    /**
     * <strong>example:</strong>
     * <p>PostalSavingsBank</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    /**
     * <strong>example:</strong>
     * <p>202310101026030</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    /**
     * <strong>example:</strong>
     * <p>1020030003332000</p>
     */
    @NameInMap("out_sub_order_id")
    public String outSubOrderId;

    /**
     * <strong>example:</strong>
     * <p>fliggy</p>
     */
    @NameInMap("supplier_code")
    public String supplierCode;

    public static InsureOrderApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        InsureOrderApplyRequest self = new InsureOrderApplyRequest();
        return TeaModel.build(map, self);
    }

    public InsureOrderApplyRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public InsureOrderApplyRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public InsureOrderApplyRequest setInsOrderId(String insOrderId) {
        this.insOrderId = insOrderId;
        return this;
    }
    public String getInsOrderId() {
        return this.insOrderId;
    }

    public InsureOrderApplyRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public InsureOrderApplyRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public InsureOrderApplyRequest setOutSubOrderId(String outSubOrderId) {
        this.outSubOrderId = outSubOrderId;
        return this;
    }
    public String getOutSubOrderId() {
        return this.outSubOrderId;
    }

    public InsureOrderApplyRequest setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
        return this;
    }
    public String getSupplierCode() {
        return this.supplierCode;
    }

}
