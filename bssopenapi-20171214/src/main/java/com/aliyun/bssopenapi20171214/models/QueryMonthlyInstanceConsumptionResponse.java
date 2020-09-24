// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryMonthlyInstanceConsumptionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryMonthlyInstanceConsumptionResponseData data;

    public static QueryMonthlyInstanceConsumptionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthlyInstanceConsumptionResponse self = new QueryMonthlyInstanceConsumptionResponse();
        return TeaModel.build(map, self);
    }

    public QueryMonthlyInstanceConsumptionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMonthlyInstanceConsumptionResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryMonthlyInstanceConsumptionResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMonthlyInstanceConsumptionResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMonthlyInstanceConsumptionResponse setData(QueryMonthlyInstanceConsumptionResponseData data) {
        this.data = data;
        return this;
    }
    public QueryMonthlyInstanceConsumptionResponseData getData() {
        return this.data;
    }

    public static class QueryMonthlyInstanceConsumptionResponseDataItemsItem extends TeaModel {
        @NameInMap("InstanceID")
        @Validation(required = true)
        public String instanceID;

        @NameInMap("ProductCode")
        @Validation(required = true)
        public String productCode;

        @NameInMap("ProductType")
        @Validation(required = true)
        public String productType;

        @NameInMap("SubscriptionType")
        @Validation(required = true)
        public String subscriptionType;

        @NameInMap("Tag")
        @Validation(required = true)
        public String tag;

        @NameInMap("ResourceGroup")
        @Validation(required = true)
        public String resourceGroup;

        @NameInMap("PayerAccount")
        @Validation(required = true)
        public String payerAccount;

        @NameInMap("OwnerID")
        @Validation(required = true)
        public String ownerID;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("PretaxGrossAmount")
        @Validation(required = true)
        public Float pretaxGrossAmount;

        @NameInMap("DiscountAmount")
        @Validation(required = true)
        public Float discountAmount;

        @NameInMap("PretaxAmount")
        @Validation(required = true)
        public Float pretaxAmount;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("PretaxAmountLocal")
        @Validation(required = true)
        public Float pretaxAmountLocal;

        @NameInMap("Tax")
        @Validation(required = true)
        public Float tax;

        @NameInMap("AfterTaxAmount")
        @Validation(required = true)
        public Float afterTaxAmount;

        @NameInMap("PaymentCurrency")
        @Validation(required = true)
        public String paymentCurrency;

        public static QueryMonthlyInstanceConsumptionResponseDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlyInstanceConsumptionResponseDataItemsItem self = new QueryMonthlyInstanceConsumptionResponseDataItemsItem();
            return TeaModel.build(map, self);
        }

        public QueryMonthlyInstanceConsumptionResponseDataItemsItem setInstanceID(String instanceID) {
            this.instanceID = instanceID;
            return this;
        }
        public String getInstanceID() {
            return this.instanceID;
        }

        public QueryMonthlyInstanceConsumptionResponseDataItemsItem setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryMonthlyInstanceConsumptionResponseDataItemsItem setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QueryMonthlyInstanceConsumptionResponseDataItemsItem setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QueryMonthlyInstanceConsumptionResponseDataItemsItem setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public QueryMonthlyInstanceConsumptionResponseDataItemsItem setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public QueryMonthlyInstanceConsumptionResponseDataItemsItem setPayerAccount(String payerAccount) {
            this.payerAccount = payerAccount;
            return this;
        }
        public String getPayerAccount() {
            return this.payerAccount;
        }

        public QueryMonthlyInstanceConsumptionResponseDataItemsItem setOwnerID(String ownerID) {
            this.ownerID = ownerID;
            return this;
        }
        public String getOwnerID() {
            return this.ownerID;
        }

        public QueryMonthlyInstanceConsumptionResponseDataItemsItem setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryMonthlyInstanceConsumptionResponseDataItemsItem setPretaxGrossAmount(Float pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Float getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public QueryMonthlyInstanceConsumptionResponseDataItemsItem setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryMonthlyInstanceConsumptionResponseDataItemsItem setPretaxAmount(Float pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Float getPretaxAmount() {
            return this.pretaxAmount;
        }

        public QueryMonthlyInstanceConsumptionResponseDataItemsItem setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryMonthlyInstanceConsumptionResponseDataItemsItem setPretaxAmountLocal(Float pretaxAmountLocal) {
            this.pretaxAmountLocal = pretaxAmountLocal;
            return this;
        }
        public Float getPretaxAmountLocal() {
            return this.pretaxAmountLocal;
        }

        public QueryMonthlyInstanceConsumptionResponseDataItemsItem setTax(Float tax) {
            this.tax = tax;
            return this;
        }
        public Float getTax() {
            return this.tax;
        }

        public QueryMonthlyInstanceConsumptionResponseDataItemsItem setAfterTaxAmount(Float afterTaxAmount) {
            this.afterTaxAmount = afterTaxAmount;
            return this;
        }
        public Float getAfterTaxAmount() {
            return this.afterTaxAmount;
        }

        public QueryMonthlyInstanceConsumptionResponseDataItemsItem setPaymentCurrency(String paymentCurrency) {
            this.paymentCurrency = paymentCurrency;
            return this;
        }
        public String getPaymentCurrency() {
            return this.paymentCurrency;
        }

    }

    public static class QueryMonthlyInstanceConsumptionResponseDataItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<QueryMonthlyInstanceConsumptionResponseDataItemsItem> item;

        public static QueryMonthlyInstanceConsumptionResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlyInstanceConsumptionResponseDataItems self = new QueryMonthlyInstanceConsumptionResponseDataItems();
            return TeaModel.build(map, self);
        }

        public QueryMonthlyInstanceConsumptionResponseDataItems setItem(java.util.List<QueryMonthlyInstanceConsumptionResponseDataItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryMonthlyInstanceConsumptionResponseDataItemsItem> getItem() {
            return this.item;
        }

    }

    public static class QueryMonthlyInstanceConsumptionResponseData extends TeaModel {
        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("BillingCycle")
        @Validation(required = true)
        public String billingCycle;

        @NameInMap("Items")
        @Validation(required = true)
        public QueryMonthlyInstanceConsumptionResponseDataItems items;

        public static QueryMonthlyInstanceConsumptionResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlyInstanceConsumptionResponseData self = new QueryMonthlyInstanceConsumptionResponseData();
            return TeaModel.build(map, self);
        }

        public QueryMonthlyInstanceConsumptionResponseData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryMonthlyInstanceConsumptionResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryMonthlyInstanceConsumptionResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryMonthlyInstanceConsumptionResponseData setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QueryMonthlyInstanceConsumptionResponseData setItems(QueryMonthlyInstanceConsumptionResponseDataItems items) {
            this.items = items;
            return this;
        }
        public QueryMonthlyInstanceConsumptionResponseDataItems getItems() {
            return this.items;
        }

    }

}
