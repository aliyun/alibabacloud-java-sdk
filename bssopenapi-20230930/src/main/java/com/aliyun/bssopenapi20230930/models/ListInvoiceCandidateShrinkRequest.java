// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ListInvoiceCandidateShrinkRequest extends TeaModel {
    /**
     * <p>The list of billing cycles.</p>
     */
    @NameInMap("BillingCycles")
    public String billingCyclesShrink;

    /**
     * <p>The list of business document numbers.</p>
     */
    @NameInMap("BusinessIds")
    public String businessIdsShrink;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of enterprises and accounts. If this parameter is left empty, the current account is queried.</p>
     */
    @NameInMap("EcIdAccountIds")
    public String ecIdAccountIdsShrink;

    /**
     * <p>The end time. Format: yyyy-mm-dd hh:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-07-01 00:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The list of invoice issuers.</p>
     */
    @NameInMap("InvoiceIssuers")
    public String invoiceIssuersShrink;

    /**
     * <p>The level-1 marketplace ID. If this parameter is left empty, the marketplace ID of the current user is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start time. Format: yyyy-mm-dd hh:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-01 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The list of invoice object statuses.</p>
     */
    @NameInMap("Status")
    public String statusShrink;

    /**
     * <p>The list of invoice object types.</p>
     */
    @NameInMap("Types")
    public String typesShrink;

    public static ListInvoiceCandidateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInvoiceCandidateShrinkRequest self = new ListInvoiceCandidateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListInvoiceCandidateShrinkRequest setBillingCyclesShrink(String billingCyclesShrink) {
        this.billingCyclesShrink = billingCyclesShrink;
        return this;
    }
    public String getBillingCyclesShrink() {
        return this.billingCyclesShrink;
    }

    public ListInvoiceCandidateShrinkRequest setBusinessIdsShrink(String businessIdsShrink) {
        this.businessIdsShrink = businessIdsShrink;
        return this;
    }
    public String getBusinessIdsShrink() {
        return this.businessIdsShrink;
    }

    public ListInvoiceCandidateShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListInvoiceCandidateShrinkRequest setEcIdAccountIdsShrink(String ecIdAccountIdsShrink) {
        this.ecIdAccountIdsShrink = ecIdAccountIdsShrink;
        return this;
    }
    public String getEcIdAccountIdsShrink() {
        return this.ecIdAccountIdsShrink;
    }

    public ListInvoiceCandidateShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListInvoiceCandidateShrinkRequest setInvoiceIssuersShrink(String invoiceIssuersShrink) {
        this.invoiceIssuersShrink = invoiceIssuersShrink;
        return this;
    }
    public String getInvoiceIssuersShrink() {
        return this.invoiceIssuersShrink;
    }

    public ListInvoiceCandidateShrinkRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public ListInvoiceCandidateShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInvoiceCandidateShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListInvoiceCandidateShrinkRequest setStatusShrink(String statusShrink) {
        this.statusShrink = statusShrink;
        return this;
    }
    public String getStatusShrink() {
        return this.statusShrink;
    }

    public ListInvoiceCandidateShrinkRequest setTypesShrink(String typesShrink) {
        this.typesShrink = typesShrink;
        return this;
    }
    public String getTypesShrink() {
        return this.typesShrink;
    }

}
