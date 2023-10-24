// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsureOrderRefundShrinkRequest extends TeaModel {
    @NameInMap("btrip_user_id")
    public String btripUserId;

    @NameInMap("buyer_name")
    public String buyerName;

    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("out_apply_id")
    public String outApplyId;

    @NameInMap("policy_no_list")
    public String policyNoListShrink;

    @NameInMap("sub_ins_order_ids")
    public String subInsOrderIdsShrink;

    @NameInMap("supplier_code")
    public String supplierCode;

    public static InsureOrderRefundShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InsureOrderRefundShrinkRequest self = new InsureOrderRefundShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InsureOrderRefundShrinkRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public InsureOrderRefundShrinkRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public InsureOrderRefundShrinkRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public InsureOrderRefundShrinkRequest setOutApplyId(String outApplyId) {
        this.outApplyId = outApplyId;
        return this;
    }
    public String getOutApplyId() {
        return this.outApplyId;
    }

    public InsureOrderRefundShrinkRequest setPolicyNoListShrink(String policyNoListShrink) {
        this.policyNoListShrink = policyNoListShrink;
        return this;
    }
    public String getPolicyNoListShrink() {
        return this.policyNoListShrink;
    }

    public InsureOrderRefundShrinkRequest setSubInsOrderIdsShrink(String subInsOrderIdsShrink) {
        this.subInsOrderIdsShrink = subInsOrderIdsShrink;
        return this;
    }
    public String getSubInsOrderIdsShrink() {
        return this.subInsOrderIdsShrink;
    }

    public InsureOrderRefundShrinkRequest setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
        return this;
    }
    public String getSupplierCode() {
        return this.supplierCode;
    }

}
