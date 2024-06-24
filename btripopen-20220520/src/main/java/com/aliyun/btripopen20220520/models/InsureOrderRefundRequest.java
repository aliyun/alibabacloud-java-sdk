// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsureOrderRefundRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1000001</p>
     */
    @NameInMap("btrip_user_id")
    public String btripUserId;

    @NameInMap("buyer_name")
    public String buyerName;

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

    @NameInMap("policy_no_list")
    public java.util.List<String> policyNoList;

    @NameInMap("sub_ins_order_ids")
    public java.util.List<String> subInsOrderIds;

    /**
     * <strong>example:</strong>
     * <p>fliggy</p>
     */
    @NameInMap("supplier_code")
    public String supplierCode;

    public static InsureOrderRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        InsureOrderRefundRequest self = new InsureOrderRefundRequest();
        return TeaModel.build(map, self);
    }

    public InsureOrderRefundRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public InsureOrderRefundRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public InsureOrderRefundRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public InsureOrderRefundRequest setOutApplyId(String outApplyId) {
        this.outApplyId = outApplyId;
        return this;
    }
    public String getOutApplyId() {
        return this.outApplyId;
    }

    public InsureOrderRefundRequest setPolicyNoList(java.util.List<String> policyNoList) {
        this.policyNoList = policyNoList;
        return this;
    }
    public java.util.List<String> getPolicyNoList() {
        return this.policyNoList;
    }

    public InsureOrderRefundRequest setSubInsOrderIds(java.util.List<String> subInsOrderIds) {
        this.subInsOrderIds = subInsOrderIds;
        return this;
    }
    public java.util.List<String> getSubInsOrderIds() {
        return this.subInsOrderIds;
    }

    public InsureOrderRefundRequest setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
        return this;
    }
    public String getSupplierCode() {
        return this.supplierCode;
    }

}
