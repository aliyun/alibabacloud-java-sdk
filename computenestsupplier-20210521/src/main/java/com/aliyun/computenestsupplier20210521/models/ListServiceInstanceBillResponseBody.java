// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceInstanceBillResponseBody extends TeaModel {
    /**
     * <p>The billing information of the backup schedule.</p>
     */
    @NameInMap("Item")
    public java.util.List<ListServiceInstanceBillResponseBodyItem> item;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAfu+XtuBE55iRLHEYYuojI4=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7B68C6D1-0C22-53F7-997C-F95D109C31AA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>65</p>
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
         * <p>The billing cycle. Format: YYYY-MM.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12</p>
         */
        @NameInMap("BillingCycle")
        public String billingCycle;

        /**
         * <p>The billing date. This parameter is required only if the <strong>Granularity</strong> parameter is set to DAILY. Format: YYYY-MM-DD.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-05</p>
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
         * <p>The currency unit.</p>
         * <ul>
         * <li>China site: <strong>CNY</strong>.</li>
         * <li>International site: <strong>USD</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The amount deducted with resource plans.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeductedByResourcePackage")
        public String deductedByResourcePackage;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-wz9k051l23j3o3xa9</p>
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
         * <p>The unit price.</p>
         * 
         * <strong>example:</strong>
         * <p>0.12</p>
         */
        @NameInMap("ListPrice")
        public String listPrice;

        /**
         * <p>The unit of the unit price.</p>
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
         * <p>The code of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The details of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>sls</p>
         */
        @NameInMap("ProductDetail")
        public String productDetail;

        /**
         * <p>The name of the cloud service or the name of the service-linked role with which the cloud service is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>Service instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>si-bc5d6ac7022647d3a3bd</p>
         */
        @NameInMap("ServiceInstanceId")
        public String serviceInstanceId;

        /**
         * <p>The billing cycle in which the bill is split.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06</p>
         */
        @NameInMap("SplitBillingCycle")
        public String splitBillingCycle;

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>Subscription: the subscription billing method.</li>
         * <li>PayAsYouGo: the pay-as-you-go billing method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Subscription</p>
         */
        @NameInMap("SubscriptionType")
        public String subscriptionType;

        /**
         * <p>The amount of resource usage.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Usage")
        public String usage;

        /**
         * <p>The unit of usage.</p>
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

        public ListServiceInstanceBillResponseBodyItem setServiceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }
        public String getServiceInstanceId() {
            return this.serviceInstanceId;
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
