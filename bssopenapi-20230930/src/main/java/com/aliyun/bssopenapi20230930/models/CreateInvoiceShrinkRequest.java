// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateInvoiceShrinkRequest extends TeaModel {
    /**
     * <p>Specifies the invoice amount. Two decimal places are supported.</p>
     * <ul>
     * <li>If left empty, the invoice is issued for the total invoiceable amount of all invoice candidate IDs.</li>
     * <li>If specified, the invoice is issued for the specified amount. The specified amount cannot exceed the total invoiceable amount of all invoice candidate IDs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0.01</p>
     */
    @NameInMap("Amount")
    public String amount;

    /**
     * <p>The list of enterprises and accounts. If this parameter is left empty, the current account is queried.</p>
     */
    @NameInMap("EcIdAccountIds")
    public String ecIdAccountIdsShrink;

    /**
     * <p>The list of invoice candidate IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InvoiceCandidateIds")
    public String invoiceCandidateIdsShrink;

    /**
     * <p>The invoicing mode. Valid values:</p>
     * <ul>
     * <li>0: Independent invoicing. The consumption of multiple accounts under an enterprise is invoiced independently for each account.</li>
     * <li>1: Consolidated invoicing. The consumption of multiple accounts under an enterprise is consolidated and invoiced based on the invoicing entity.
     * If only one account is specified in the AccountIds request parameter, independent invoicing is applied.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InvoiceMode")
    public Integer invoiceMode;

    /**
     * <p>The invoice remark.</p>
     * 
     * <strong>example:</strong>
     * <p>Remark information</p>
     */
    @NameInMap("InvoiceRemark")
    public String invoiceRemark;

    /**
     * <p>The invoice title ID.</p>
     * <ul>
     * <li>The ID returned by the ListInvoiceTitle operation for the current logon account.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("InvoiceTitleId")
    public String invoiceTitleId;

    /**
     * <p>The invoice type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InvoiceType")
    public Integer invoiceType;

    /**
     * <p>The level-1 marketplace ID. If this parameter is left empty, the marketplace ID of the current user is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <p>The list of email addresses that receive the invoice. You can specify up to three email addresses.</p>
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
