// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ListInvoiceCandidateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public java.util.List<ListInvoiceCandidateResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>6000EE23-274B-4E07-A697-FF2E999520A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListInvoiceCandidateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInvoiceCandidateResponseBody self = new ListInvoiceCandidateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInvoiceCandidateResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListInvoiceCandidateResponseBody setData(java.util.List<ListInvoiceCandidateResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListInvoiceCandidateResponseBodyData> getData() {
        return this.data;
    }

    public ListInvoiceCandidateResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public ListInvoiceCandidateResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInvoiceCandidateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInvoiceCandidateResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListInvoiceCandidateResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("AcceptedOffsetAmount")
        public String acceptedOffsetAmount;

        /**
         * <strong>example:</strong>
         * <p>1990699401005016</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("AccountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p>202506</p>
         */
        @NameInMap("BillingCycle")
        public Integer billingCycle;

        /**
         * <strong>example:</strong>
         * <p>202506</p>
         */
        @NameInMap("BusinessId")
        public String businessId;

        /**
         * <strong>example:</strong>
         * <p>2025-06-01 00:00:00</p>
         */
        @NameInMap("BusinessTime")
        public String businessTime;

        /**
         * <strong>example:</strong>
         * <p>pts</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("CommodityName")
        public String commodityName;

        /**
         * <strong>example:</strong>
         * <p>2025-06-91 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>ALIYUN_SERVICE</p>
         */
        @NameInMap("InvoiceIssuer")
        public String invoiceIssuer;

        /**
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("InvoiceableAmount")
        public String invoiceableAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InvoicedAmount")
        public String invoicedAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OffsetAmount")
        public String offsetAmount;

        /**
         * <strong>example:</strong>
         * <p>pts</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductName")
        public String productName;

        /**
         * <strong>example:</strong>
         * <p>1990699401005016</p>
         */
        @NameInMap("ResourceOwnerAccountId")
        public Long resourceOwnerAccountId;

        @NameInMap("ResourceOwnerAccountName")
        public String resourceOwnerAccountName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("TotalAmount")
        public String totalAmount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static ListInvoiceCandidateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInvoiceCandidateResponseBodyData self = new ListInvoiceCandidateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInvoiceCandidateResponseBodyData setAcceptedOffsetAmount(String acceptedOffsetAmount) {
            this.acceptedOffsetAmount = acceptedOffsetAmount;
            return this;
        }
        public String getAcceptedOffsetAmount() {
            return this.acceptedOffsetAmount;
        }

        public ListInvoiceCandidateResponseBodyData setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public ListInvoiceCandidateResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListInvoiceCandidateResponseBodyData setBillingCycle(Integer billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public Integer getBillingCycle() {
            return this.billingCycle;
        }

        public ListInvoiceCandidateResponseBodyData setBusinessId(String businessId) {
            this.businessId = businessId;
            return this;
        }
        public String getBusinessId() {
            return this.businessId;
        }

        public ListInvoiceCandidateResponseBodyData setBusinessTime(String businessTime) {
            this.businessTime = businessTime;
            return this;
        }
        public String getBusinessTime() {
            return this.businessTime;
        }

        public ListInvoiceCandidateResponseBodyData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListInvoiceCandidateResponseBodyData setCommodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }
        public String getCommodityName() {
            return this.commodityName;
        }

        public ListInvoiceCandidateResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListInvoiceCandidateResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListInvoiceCandidateResponseBodyData setInvoiceIssuer(String invoiceIssuer) {
            this.invoiceIssuer = invoiceIssuer;
            return this;
        }
        public String getInvoiceIssuer() {
            return this.invoiceIssuer;
        }

        public ListInvoiceCandidateResponseBodyData setInvoiceableAmount(String invoiceableAmount) {
            this.invoiceableAmount = invoiceableAmount;
            return this;
        }
        public String getInvoiceableAmount() {
            return this.invoiceableAmount;
        }

        public ListInvoiceCandidateResponseBodyData setInvoicedAmount(String invoicedAmount) {
            this.invoicedAmount = invoicedAmount;
            return this;
        }
        public String getInvoicedAmount() {
            return this.invoicedAmount;
        }

        public ListInvoiceCandidateResponseBodyData setOffsetAmount(String offsetAmount) {
            this.offsetAmount = offsetAmount;
            return this;
        }
        public String getOffsetAmount() {
            return this.offsetAmount;
        }

        public ListInvoiceCandidateResponseBodyData setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListInvoiceCandidateResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListInvoiceCandidateResponseBodyData setResourceOwnerAccountId(Long resourceOwnerAccountId) {
            this.resourceOwnerAccountId = resourceOwnerAccountId;
            return this;
        }
        public Long getResourceOwnerAccountId() {
            return this.resourceOwnerAccountId;
        }

        public ListInvoiceCandidateResponseBodyData setResourceOwnerAccountName(String resourceOwnerAccountName) {
            this.resourceOwnerAccountName = resourceOwnerAccountName;
            return this;
        }
        public String getResourceOwnerAccountName() {
            return this.resourceOwnerAccountName;
        }

        public ListInvoiceCandidateResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListInvoiceCandidateResponseBodyData setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public String getTotalAmount() {
            return this.totalAmount;
        }

        public ListInvoiceCandidateResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
