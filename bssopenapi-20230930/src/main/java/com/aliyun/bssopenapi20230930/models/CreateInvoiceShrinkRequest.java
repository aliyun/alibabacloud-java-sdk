// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateInvoiceShrinkRequest extends TeaModel {
    /**
     * <p>Specifies the invoice amount. Supports up to two decimal places.</p>
     * <ul>
     * <li>If not specified, the invoice will be issued for the total invoiceable amount of all invoiceCandidateIds.</li>
     * <li>If specified, the invoice will be issued for the specified amount. The specified amount cannot exceed the total invoiceable amount of all invoiceCandidateIds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0.01</p>
     */
    @NameInMap("Amount")
    public String amount;

    /**
     * <p>Enterprise and account list. If empty, the current account is queried.</p>
     */
    @NameInMap("EcIdAccountIds")
    public String ecIdAccountIdsShrink;

    /**
     * <p>List of invoice candidate IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InvoiceCandidateIds")
    public String invoiceCandidateIdsShrink;

    /**
     * <p>Invoice mode.</p>
     * <ul>
     * <li>0: Independent invoicing. Expenses of multiple accounts under the enterprise are invoiced separately for each account.</li>
     * <li>1: Consolidated invoicing. Expenses of multiple accounts under the enterprise are consolidated and invoiced under the invoicing entity.
     * If only one account is passed in the AccountIds parameter, independent invoicing is applied.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InvoiceMode")
    public Integer invoiceMode;

    /**
     * <p>Invoice remark.</p>
     * 
     * <strong>example:</strong>
     * <p>备注信息</p>
     */
    @NameInMap("InvoiceRemark")
    public String invoiceRemark;

    /**
     * <p>Invoice title ID.</p>
     * <ul>
     * <li>The ID parameter returned by the ListInvoiceTitle API for the current logged-in account.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("InvoiceTitleId")
    public String invoiceTitleId;

    /**
     * <p>Invoice type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InvoiceType")
    public Integer invoiceType;

    /**
     * <p>Primary marketplace ID. If empty, the marketplace ID of the current user is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <p>List of email addresses to receive the invoice. A maximum of 3 can be specified.</p>
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
