// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateInvoiceRequest extends TeaModel {
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
    public java.util.List<CreateInvoiceRequestEcIdAccountIds> ecIdAccountIds;

    /**
     * <p>The list of invoice candidate IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InvoiceCandidateIds")
    public java.util.List<String> invoiceCandidateIds;

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
    public java.util.List<String> recipientEmails;

    public static CreateInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInvoiceRequest self = new CreateInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInvoiceRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public CreateInvoiceRequest setEcIdAccountIds(java.util.List<CreateInvoiceRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<CreateInvoiceRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public CreateInvoiceRequest setInvoiceCandidateIds(java.util.List<String> invoiceCandidateIds) {
        this.invoiceCandidateIds = invoiceCandidateIds;
        return this;
    }
    public java.util.List<String> getInvoiceCandidateIds() {
        return this.invoiceCandidateIds;
    }

    public CreateInvoiceRequest setInvoiceMode(Integer invoiceMode) {
        this.invoiceMode = invoiceMode;
        return this;
    }
    public Integer getInvoiceMode() {
        return this.invoiceMode;
    }

    public CreateInvoiceRequest setInvoiceRemark(String invoiceRemark) {
        this.invoiceRemark = invoiceRemark;
        return this;
    }
    public String getInvoiceRemark() {
        return this.invoiceRemark;
    }

    public CreateInvoiceRequest setInvoiceTitleId(String invoiceTitleId) {
        this.invoiceTitleId = invoiceTitleId;
        return this;
    }
    public String getInvoiceTitleId() {
        return this.invoiceTitleId;
    }

    public CreateInvoiceRequest setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }
    public Integer getInvoiceType() {
        return this.invoiceType;
    }

    public CreateInvoiceRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public CreateInvoiceRequest setRecipientEmails(java.util.List<String> recipientEmails) {
        this.recipientEmails = recipientEmails;
        return this;
    }
    public java.util.List<String> getRecipientEmails() {
        return this.recipientEmails;
    }

    public static class CreateInvoiceRequestEcIdAccountIds extends TeaModel {
        /**
         * <p>The list of accounts to access. If this parameter is left empty, all accounts under the current entity ID are selected.</p>
         */
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        /**
         * <p>The enterprise entity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("EcId")
        public String ecId;

        public static CreateInvoiceRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            CreateInvoiceRequestEcIdAccountIds self = new CreateInvoiceRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public CreateInvoiceRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public CreateInvoiceRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

}
