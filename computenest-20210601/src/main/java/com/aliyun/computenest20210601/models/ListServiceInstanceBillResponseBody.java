// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServiceInstanceBillResponseBody extends TeaModel {
    /**
     * <p>A list of billing information for the service instance.</p>
     */
    @NameInMap("Item")
    public java.util.List<ListServiceInstanceBillResponseBodyItem> item;

    /**
     * <p>The number of entries returned per page. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAc3HCuYhJi/wvpk4xOr0VLbAx7BkQzyYC+ONO+WudHGKEdB0uWSY7AGnM3qCgm/Ynge7zU6NWdbj0Tegyajyqyc=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2849EE73-AFFA-5AFD-9575-12FA886451DA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListServiceInstanceBillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceBillResponseBody self = new ListServiceInstanceBillResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceBillResponseBody setItem(java.util.List<ListServiceInstanceBillResponseBodyItem> item) {
        this.item = item;
        return this;
    }
    public java.util.List<ListServiceInstanceBillResponseBodyItem> getItem() {
        return this.item;
    }

    public ListServiceInstanceBillResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceInstanceBillResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceInstanceBillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceInstanceBillResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListServiceInstanceBillResponseBodyItem extends TeaModel {
        /**
         * <p>The billing cycle of the computing resources for the instance. This parameter is supported only for pay-as-you-go instances. Valid values:</p>
         * <ul>
         * <li><p><strong>Day</strong>: daily billing.</p>
         * </li>
         * <li><p><strong>Month</strong>: monthly billing.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2025-02</p>
         */
        @NameInMap("BillingCycle")
        public String billingCycle;

        /**
         * <p>The billing date in YYYY-MM-DD format. This parameter is returned only when <strong>Granularity</strong> is set to DAILY.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-23</p>
         */
        @NameInMap("BillingDate")
        public String billingDate;

        /**
         * <p>The billable item.</p>
         * 
         * <strong>example:</strong>
         * <p>Bandwidth</p>
         */
        @NameInMap("BillingItem")
        public String billingItem;

        /**
         * <p>The code of the billable item.</p>
         * 
         * <strong>example:</strong>
         * <p>disk</p>
         */
        @NameInMap("BillingItemCode")
        public String billingItemCode;

        /**
         * <p>The currency. Valid values:</p>
         * <ul>
         * <li><p>CNY: Chinese Yuan.</p>
         * </li>
         * <li><p>USD: US Dollar.</p>
         * </li>
         * <li><p>JPY: Japanese Yen.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RMB</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The amount deducted by a resource plan.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeductedByResourcePackage")
        public String deductedByResourcePackage;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1z88pb48487907u</p>
         */
        @NameInMap("InstanceID")
        public String instanceID;

        /**
         * <p>The discount amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InvoiceDiscount")
        public String invoiceDiscount;

        /**
         * <p>The list price.</p>
         * 
         * <strong>example:</strong>
         * <p>0.12</p>
         */
        @NameInMap("ListPrice")
        public String listPrice;

        /**
         * <p>The unit of the list price.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY/GB</p>
         */
        @NameInMap("ListPriceUnit")
        public String listPriceUnit;

        /**
         * <p>The pretax amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PretaxAmount")
        public String pretaxAmount;

        /**
         * <p>The pretax gross amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PretaxGrossAmount")
        public String pretaxGrossAmount;

        /**
         * <p>The product code.</p>
         * 
         * <strong>example:</strong>
         * <p>sls</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The product details.</p>
         * 
         * <strong>example:</strong>
         * <p>sls</p>
         */
        @NameInMap("ProductDetail")
        public String productDetail;

        /**
         * <p>The name of the product to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>NLB</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The month of the split bill.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07</p>
         */
        @NameInMap("SplitBillingCycle")
        public String splitBillingCycle;

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><p>Subscription: subscription.</p>
         * </li>
         * <li><p>PayAsYouGo: pay-as-you-go.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Subscription</p>
         */
        @NameInMap("SubscriptionType")
        public String subscriptionType;

        /**
         * <p>The number of input tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;EmbeddingTokens\&quot;: 314}</p>
         */
        @NameInMap("Usage")
        public String usage;

        /**
         * <p>The unit of the usage.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("UsageUnit")
        public String usageUnit;

        public static ListServiceInstanceBillResponseBodyItem build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstanceBillResponseBodyItem self = new ListServiceInstanceBillResponseBodyItem();
            return TeaModel.build(map, self);
        }

        public ListServiceInstanceBillResponseBodyItem setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public ListServiceInstanceBillResponseBodyItem setBillingDate(String billingDate) {
            this.billingDate = billingDate;
            return this;
        }
        public String getBillingDate() {
            return this.billingDate;
        }

        public ListServiceInstanceBillResponseBodyItem setBillingItem(String billingItem) {
            this.billingItem = billingItem;
            return this;
        }
        public String getBillingItem() {
            return this.billingItem;
        }

        public ListServiceInstanceBillResponseBodyItem setBillingItemCode(String billingItemCode) {
            this.billingItemCode = billingItemCode;
            return this;
        }
        public String getBillingItemCode() {
            return this.billingItemCode;
        }

        public ListServiceInstanceBillResponseBodyItem setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public ListServiceInstanceBillResponseBodyItem setDeductedByResourcePackage(String deductedByResourcePackage) {
            this.deductedByResourcePackage = deductedByResourcePackage;
            return this;
        }
        public String getDeductedByResourcePackage() {
            return this.deductedByResourcePackage;
        }

        public ListServiceInstanceBillResponseBodyItem setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public ListServiceInstanceBillResponseBodyItem setInvoiceDiscount(String invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public String getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public ListServiceInstanceBillResponseBodyItem setListPrice(String listPrice) {
            this.listPrice = listPrice;
            return this;
        }
        public String getListPrice() {
            return this.listPrice;
        }

        public ListServiceInstanceBillResponseBodyItem setListPriceUnit(String listPriceUnit) {
            this.listPriceUnit = listPriceUnit;
            return this;
        }
        public String getListPriceUnit() {
            return this.listPriceUnit;
        }

        public ListServiceInstanceBillResponseBodyItem setPretaxAmount(String pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public String getPretaxAmount() {
            return this.pretaxAmount;
        }

        public ListServiceInstanceBillResponseBodyItem setPretaxGrossAmount(String pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public String getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public ListServiceInstanceBillResponseBodyItem setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListServiceInstanceBillResponseBodyItem setProductDetail(String productDetail) {
            this.productDetail = productDetail;
            return this;
        }
        public String getProductDetail() {
            return this.productDetail;
        }

        public ListServiceInstanceBillResponseBodyItem setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListServiceInstanceBillResponseBodyItem setSplitBillingCycle(String splitBillingCycle) {
            this.splitBillingCycle = splitBillingCycle;
            return this;
        }
        public String getSplitBillingCycle() {
            return this.splitBillingCycle;
        }

        public ListServiceInstanceBillResponseBodyItem setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public ListServiceInstanceBillResponseBodyItem setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public ListServiceInstanceBillResponseBodyItem setUsageUnit(String usageUnit) {
            this.usageUnit = usageUnit;
            return this;
        }
        public String getUsageUnit() {
            return this.usageUnit;
        }

    }

}
