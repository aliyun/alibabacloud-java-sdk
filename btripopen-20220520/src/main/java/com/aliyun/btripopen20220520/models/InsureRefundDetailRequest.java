// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsureRefundDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1423052318072952023</p>
     */
    @NameInMap("apply_id")
    public String applyId;

    /**
     * <strong>example:</strong>
     * <p>1000000001</p>
     */
    @NameInMap("btrip_user_id")
    public String btripUserId;

    @NameInMap("buyer_name")
    public String buyerName;

    /**
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
     * <p>1021000196440356908</p>
     */
    @NameInMap("out_apply_id")
    public String outApplyId;

    /**
     * <strong>example:</strong>
     * <p>fliggy</p>
     */
    @NameInMap("supplier_code")
    public String supplierCode;

    public static InsureRefundDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        InsureRefundDetailRequest self = new InsureRefundDetailRequest();
        return TeaModel.build(map, self);
    }

    public InsureRefundDetailRequest setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public InsureRefundDetailRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public InsureRefundDetailRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public InsureRefundDetailRequest setInsOrderId(String insOrderId) {
        this.insOrderId = insOrderId;
        return this;
    }
    public String getInsOrderId() {
        return this.insOrderId;
    }

    public InsureRefundDetailRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public InsureRefundDetailRequest setOutApplyId(String outApplyId) {
        this.outApplyId = outApplyId;
        return this;
    }
    public String getOutApplyId() {
        return this.outApplyId;
    }

    public InsureRefundDetailRequest setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
        return this;
    }
    public String getSupplierCode() {
        return this.supplierCode;
    }

}
