// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ListInvoiceCandidateResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of data entries.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListInvoiceCandidateResponseBodyData> data;

    /**
     * <p>The metadata of the response.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6000EE23-274B-4E07-A697-FF2E999520A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
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
         * <p>The accepted offset amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("AcceptedOffsetAmount")
        public String acceptedOffsetAmount;

        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1990699401005016</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The account name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试账号</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The billing cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>202506</p>
         */
        @NameInMap("BillingCycle")
        public Integer billingCycle;

        /**
         * <p>The business document number.</p>
         * 
         * <strong>example:</strong>
         * <p>202506</p>
         */
        @NameInMap("BusinessId")
        public String businessId;

        /**
         * <p>The time when the business event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-01 00:00:00</p>
         */
        @NameInMap("BusinessTime")
        public String businessTime;

        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>pts</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The commodity name.</p>
         * 
         * <strong>example:</strong>
         * <p>性能测试</p>
         */
        @NameInMap("CommodityName")
        public String commodityName;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-91 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the invoice candidate.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The invoice issuer.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN_SERVICE</p>
         */
        @NameInMap("InvoiceIssuer")
        public String invoiceIssuer;

        /**
         * <p>The invoiceable amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("InvoiceableAmount")
        public String invoiceableAmount;

        /**
         * <p>The invoiced amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InvoicedAmount")
        public String invoicedAmount;

        /**
         * <p>The offset amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OffsetAmount")
        public String offsetAmount;

        /**
         * <p>The product code.</p>
         * 
         * <strong>example:</strong>
         * <p>pts</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The product name.</p>
         * 
         * <strong>example:</strong>
         * <p>性能测试</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The ID of the resource owner account.</p>
         * 
         * <strong>example:</strong>
         * <p>1990699401005016</p>
         */
        @NameInMap("ResourceOwnerAccountId")
        public Long resourceOwnerAccountId;

        /**
         * <p>The name of the resource owner account.</p>
         * 
         * <strong>example:</strong>
         * <p>测试账号</p>
         */
        @NameInMap("ResourceOwnerAccountName")
        public String resourceOwnerAccountName;

        /**
         * <p>The status of the invoice candidate.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The total amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("TotalAmount")
        public String totalAmount;

        /**
         * <p>The type of the invoice candidate.</p>
         * 
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
