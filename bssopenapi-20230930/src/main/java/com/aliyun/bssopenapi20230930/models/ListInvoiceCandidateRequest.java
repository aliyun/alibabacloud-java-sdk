// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ListInvoiceCandidateRequest extends TeaModel {
    @NameInMap("BillingCycles")
    public java.util.List<Integer> billingCycles;

    @NameInMap("BusinessIds")
    public java.util.List<String> businessIds;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EcIdAccountIds")
    public java.util.List<ListInvoiceCandidateRequestEcIdAccountIds> ecIdAccountIds;

    /**
     * <strong>example:</strong>
     * <p>2025-07-01 00:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("InvoiceIssuers")
    public java.util.List<String> invoiceIssuers;

    /**
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>2025-06-01 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public java.util.List<Integer> status;

    @NameInMap("Types")
    public java.util.List<Integer> types;

    public static ListInvoiceCandidateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInvoiceCandidateRequest self = new ListInvoiceCandidateRequest();
        return TeaModel.build(map, self);
    }

    public ListInvoiceCandidateRequest setBillingCycles(java.util.List<Integer> billingCycles) {
        this.billingCycles = billingCycles;
        return this;
    }
    public java.util.List<Integer> getBillingCycles() {
        return this.billingCycles;
    }

    public ListInvoiceCandidateRequest setBusinessIds(java.util.List<String> businessIds) {
        this.businessIds = businessIds;
        return this;
    }
    public java.util.List<String> getBusinessIds() {
        return this.businessIds;
    }

    public ListInvoiceCandidateRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListInvoiceCandidateRequest setEcIdAccountIds(java.util.List<ListInvoiceCandidateRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<ListInvoiceCandidateRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public ListInvoiceCandidateRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListInvoiceCandidateRequest setInvoiceIssuers(java.util.List<String> invoiceIssuers) {
        this.invoiceIssuers = invoiceIssuers;
        return this;
    }
    public java.util.List<String> getInvoiceIssuers() {
        return this.invoiceIssuers;
    }

    public ListInvoiceCandidateRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public ListInvoiceCandidateRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInvoiceCandidateRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListInvoiceCandidateRequest setStatus(java.util.List<Integer> status) {
        this.status = status;
        return this;
    }
    public java.util.List<Integer> getStatus() {
        return this.status;
    }

    public ListInvoiceCandidateRequest setTypes(java.util.List<Integer> types) {
        this.types = types;
        return this;
    }
    public java.util.List<Integer> getTypes() {
        return this.types;
    }

    public static class ListInvoiceCandidateRequestEcIdAccountIds extends TeaModel {
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("EcId")
        public String ecId;

        public static ListInvoiceCandidateRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            ListInvoiceCandidateRequestEcIdAccountIds self = new ListInvoiceCandidateRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public ListInvoiceCandidateRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public ListInvoiceCandidateRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

}
