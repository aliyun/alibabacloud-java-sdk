// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateInvoiceShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0.01</p>
     */
    @NameInMap("Amount")
    public String amount;

    @NameInMap("EcIdAccountIds")
    public String ecIdAccountIdsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InvoiceCandidateIds")
    public String invoiceCandidateIdsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InvoiceMode")
    public Integer invoiceMode;

    @NameInMap("InvoiceRemark")
    public String invoiceRemark;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("InvoiceTitleId")
    public String invoiceTitleId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InvoiceType")
    public Integer invoiceType;

    /**
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecipientEmails")
    public String recipientEmailsShrink;

    public static CreateInvoiceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInvoiceShrinkRequest self = new CreateInvoiceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateInvoiceShrinkRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public CreateInvoiceShrinkRequest setEcIdAccountIdsShrink(String ecIdAccountIdsShrink) {
        this.ecIdAccountIdsShrink = ecIdAccountIdsShrink;
        return this;
    }
    public String getEcIdAccountIdsShrink() {
        return this.ecIdAccountIdsShrink;
    }

    public CreateInvoiceShrinkRequest setInvoiceCandidateIdsShrink(String invoiceCandidateIdsShrink) {
        this.invoiceCandidateIdsShrink = invoiceCandidateIdsShrink;
        return this;
    }
    public String getInvoiceCandidateIdsShrink() {
        return this.invoiceCandidateIdsShrink;
    }

    public CreateInvoiceShrinkRequest setInvoiceMode(Integer invoiceMode) {
        this.invoiceMode = invoiceMode;
        return this;
    }
    public Integer getInvoiceMode() {
        return this.invoiceMode;
    }

    public CreateInvoiceShrinkRequest setInvoiceRemark(String invoiceRemark) {
        this.invoiceRemark = invoiceRemark;
        return this;
    }
    public String getInvoiceRemark() {
        return this.invoiceRemark;
    }

    public CreateInvoiceShrinkRequest setInvoiceTitleId(String invoiceTitleId) {
        this.invoiceTitleId = invoiceTitleId;
        return this;
    }
    public String getInvoiceTitleId() {
        return this.invoiceTitleId;
    }

    public CreateInvoiceShrinkRequest setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }
    public Integer getInvoiceType() {
        return this.invoiceType;
    }

    public CreateInvoiceShrinkRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public CreateInvoiceShrinkRequest setRecipientEmailsShrink(String recipientEmailsShrink) {
        this.recipientEmailsShrink = recipientEmailsShrink;
        return this;
    }
    public String getRecipientEmailsShrink() {
        return this.recipientEmailsShrink;
    }

}
