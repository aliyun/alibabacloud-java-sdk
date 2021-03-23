// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryMonthlyInstanceConsumptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public QueryMonthlyInstanceConsumptionResponseBodyData data;

    public static QueryMonthlyInstanceConsumptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthlyInstanceConsumptionResponseBody self = new QueryMonthlyInstanceConsumptionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMonthlyInstanceConsumptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMonthlyInstanceConsumptionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryMonthlyInstanceConsumptionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMonthlyInstanceConsumptionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMonthlyInstanceConsumptionResponseBody setData(QueryMonthlyInstanceConsumptionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMonthlyInstanceConsumptionResponseBodyData getData() {
        return this.data;
    }

    public static class QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem extends TeaModel {
        @NameInMap("InstanceID")
        public String instanceID;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("SubscriptionType")
        public String subscriptionType;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("ResourceGroup")
        public String resourceGroup;

        @NameInMap("PayerAccount")
        public String payerAccount;

        @NameInMap("OwnerID")
        public String ownerID;

        @NameInMap("Region")
        public String region;

        @NameInMap("PretaxGrossAmount")
        public Float pretaxGrossAmount;

        @NameInMap("DiscountAmount")
        public Float discountAmount;

        @NameInMap("PretaxAmount")
        public Float pretaxAmount;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("PretaxAmountLocal")
        public Float pretaxAmountLocal;

        @NameInMap("Tax")
        public Float tax;

        @NameInMap("AfterTaxAmount")
        public Float afterTaxAmount;

        @NameInMap("PaymentCurrency")
        public String paymentCurrency;

        public static QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem self = new QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem();
            return TeaModel.build(map, self);
        }

        public QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem setPayerAccount(String payerAccount) {
            this.payerAccount = payerAccount;
            return this;
        }
        public String getPayerAccount() {
            return this.payerAccount;
        }

        public QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem setPretaxGrossAmount(Float pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Float getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem setPretaxAmount(Float pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Float getPretaxAmount() {
            return this.pretaxAmount;
        }

        public QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem setPretaxAmountLocal(Float pretaxAmountLocal) {
            this.pretaxAmountLocal = pretaxAmountLocal;
            return this;
        }
        public Float getPretaxAmountLocal() {
            return this.pretaxAmountLocal;
        }

        public QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem setTax(Float tax) {
            this.tax = tax;
            return this;
        }
        public Float getTax() {
            return this.tax;
        }

        public QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem setAfterTaxAmount(Float afterTaxAmount) {
            this.afterTaxAmount = afterTaxAmount;
            return this;
        }
        public Float getAfterTaxAmount() {
            return this.afterTaxAmount;
        }

        public QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem setPaymentCurrency(String paymentCurrency) {
            this.paymentCurrency = paymentCurrency;
            return this;
        }
        public String getPaymentCurrency() {
            return this.paymentCurrency;
        }

    }

    public static class QueryMonthlyInstanceConsumptionResponseBodyDataItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem> item;

        public static QueryMonthlyInstanceConsumptionResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlyInstanceConsumptionResponseBodyDataItems self = new QueryMonthlyInstanceConsumptionResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public QueryMonthlyInstanceConsumptionResponseBodyDataItems setItem(java.util.List<QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryMonthlyInstanceConsumptionResponseBodyDataItemsItem> getItem() {
            return this.item;
        }

    }

    public static class QueryMonthlyInstanceConsumptionResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("BillingCycle")
        public String billingCycle;

        @NameInMap("Items")
        public QueryMonthlyInstanceConsumptionResponseBodyDataItems items;

        public static QueryMonthlyInstanceConsumptionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlyInstanceConsumptionResponseBodyData self = new QueryMonthlyInstanceConsumptionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMonthlyInstanceConsumptionResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryMonthlyInstanceConsumptionResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryMonthlyInstanceConsumptionResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryMonthlyInstanceConsumptionResponseBodyData setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QueryMonthlyInstanceConsumptionResponseBodyData setItems(QueryMonthlyInstanceConsumptionResponseBodyDataItems items) {
            this.items = items;
            return this;
        }
        public QueryMonthlyInstanceConsumptionResponseBodyDataItems getItems() {
            return this.items;
        }

    }

}
