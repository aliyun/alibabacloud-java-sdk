// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsureOrderCreateShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("applicant")
    public String applicantShrink;

    /**
     * <strong>example:</strong>
     * <p>20202109390122</p>
     */
    @NameInMap("btrip_user_id")
    public String btripUserId;

    @NameInMap("buyer_name")
    public String buyerName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ins_person_and_segment_list")
    public String insPersonAndSegmentListShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PostalSavingsBank</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    /**
     * <strong>example:</strong>
     * <p>100000320302020</p>
     */
    @NameInMap("out_ins_order_id")
    public String outInsOrderId;

    /**
     * <p>This parameter is required.</p>
     * 
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

    public static InsureOrderCreateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InsureOrderCreateShrinkRequest self = new InsureOrderCreateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InsureOrderCreateShrinkRequest setApplicantShrink(String applicantShrink) {
        this.applicantShrink = applicantShrink;
        return this;
    }
    public String getApplicantShrink() {
        return this.applicantShrink;
    }

    public InsureOrderCreateShrinkRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public InsureOrderCreateShrinkRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public InsureOrderCreateShrinkRequest setInsPersonAndSegmentListShrink(String insPersonAndSegmentListShrink) {
        this.insPersonAndSegmentListShrink = insPersonAndSegmentListShrink;
        return this;
    }
    public String getInsPersonAndSegmentListShrink() {
        return this.insPersonAndSegmentListShrink;
    }

    public InsureOrderCreateShrinkRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public InsureOrderCreateShrinkRequest setOutInsOrderId(String outInsOrderId) {
        this.outInsOrderId = outInsOrderId;
        return this;
    }
    public String getOutInsOrderId() {
        return this.outInsOrderId;
    }

    public InsureOrderCreateShrinkRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public InsureOrderCreateShrinkRequest setOutSubOrderId(String outSubOrderId) {
        this.outSubOrderId = outSubOrderId;
        return this;
    }
    public String getOutSubOrderId() {
        return this.outSubOrderId;
    }

    public InsureOrderCreateShrinkRequest setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
        return this;
    }
    public String getSupplierCode() {
        return this.supplierCode;
    }

}
