// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryBillOverviewResponse extends TeaModel {
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
    public QueryBillOverviewResponseData data;

    public static QueryBillOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBillOverviewResponse self = new QueryBillOverviewResponse();
        return TeaModel.build(map, self);
    }

    public QueryBillOverviewResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBillOverviewResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryBillOverviewResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBillOverviewResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBillOverviewResponse setData(QueryBillOverviewResponseData data) {
        this.data = data;
        return this;
    }
    public QueryBillOverviewResponseData getData() {
        return this.data;
    }

    public static class QueryBillOverviewResponseDataItemsItem extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public String item;

        @NameInMap("ProductCode")
        @Validation(required = true)
        public String productCode;

        @NameInMap("ProductType")
        @Validation(required = true)
        public String productType;

        @NameInMap("SubscriptionType")
        @Validation(required = true)
        public String subscriptionType;

        @NameInMap("ProductName")
        @Validation(required = true)
        public String productName;

        @NameInMap("ProductDetail")
        @Validation(required = true)
        public String productDetail;

        @NameInMap("PretaxGrossAmount")
        @Validation(required = true)
        public Float pretaxGrossAmount;

        @NameInMap("InvoiceDiscount")
        @Validation(required = true)
        public Float invoiceDiscount;

        @NameInMap("DeductedByCoupons")
        @Validation(required = true)
        public Float deductedByCoupons;

        @NameInMap("PretaxAmount")
        @Validation(required = true)
        public Float pretaxAmount;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("PaymentAmount")
        @Validation(required = true)
        public Float paymentAmount;

        @NameInMap("OutstandingAmount")
        @Validation(required = true)
        public Float outstandingAmount;

        @NameInMap("DeductedByCashCoupons")
        @Validation(required = true)
        public Float deductedByCashCoupons;

        @NameInMap("DeductedByPrepaidCard")
        @Validation(required = true)
        public Float deductedByPrepaidCard;

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

        @NameInMap("RoundDownDiscount")
        @Validation(required = true)
        public String roundDownDiscount;

        @NameInMap("PipCode")
        @Validation(required = true)
        public String pipCode;

        @NameInMap("CommodityCode")
        @Validation(required = true)
        public String commodityCode;

        public static QueryBillOverviewResponseDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QueryBillOverviewResponseDataItemsItem self = new QueryBillOverviewResponseDataItemsItem();
            return TeaModel.build(map, self);
        }

        public QueryBillOverviewResponseDataItemsItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public QueryBillOverviewResponseDataItemsItem setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryBillOverviewResponseDataItemsItem setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QueryBillOverviewResponseDataItemsItem setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QueryBillOverviewResponseDataItemsItem setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryBillOverviewResponseDataItemsItem setProductDetail(String productDetail) {
            this.productDetail = productDetail;
            return this;
        }
        public String getProductDetail() {
            return this.productDetail;
        }

        public QueryBillOverviewResponseDataItemsItem setPretaxGrossAmount(Float pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Float getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public QueryBillOverviewResponseDataItemsItem setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public QueryBillOverviewResponseDataItemsItem setDeductedByCoupons(Float deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Float getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public QueryBillOverviewResponseDataItemsItem setPretaxAmount(Float pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Float getPretaxAmount() {
            return this.pretaxAmount;
        }

        public QueryBillOverviewResponseDataItemsItem setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryBillOverviewResponseDataItemsItem setPaymentAmount(Float paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Float getPaymentAmount() {
            return this.paymentAmount;
        }

        public QueryBillOverviewResponseDataItemsItem setOutstandingAmount(Float outstandingAmount) {
            this.outstandingAmount = outstandingAmount;
            return this;
        }
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        public QueryBillOverviewResponseDataItemsItem setDeductedByCashCoupons(Float deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public Float getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public QueryBillOverviewResponseDataItemsItem setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Float getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public QueryBillOverviewResponseDataItemsItem setPretaxAmountLocal(Float pretaxAmountLocal) {
            this.pretaxAmountLocal = pretaxAmountLocal;
            return this;
        }
        public Float getPretaxAmountLocal() {
            return this.pretaxAmountLocal;
        }

        public QueryBillOverviewResponseDataItemsItem setTax(Float tax) {
            this.tax = tax;
            return this;
        }
        public Float getTax() {
            return this.tax;
        }

        public QueryBillOverviewResponseDataItemsItem setAfterTaxAmount(Float afterTaxAmount) {
            this.afterTaxAmount = afterTaxAmount;
            return this;
        }
        public Float getAfterTaxAmount() {
            return this.afterTaxAmount;
        }

        public QueryBillOverviewResponseDataItemsItem setPaymentCurrency(String paymentCurrency) {
            this.paymentCurrency = paymentCurrency;
            return this;
        }
        public String getPaymentCurrency() {
            return this.paymentCurrency;
        }

        public QueryBillOverviewResponseDataItemsItem setRoundDownDiscount(String roundDownDiscount) {
            this.roundDownDiscount = roundDownDiscount;
            return this;
        }
        public String getRoundDownDiscount() {
            return this.roundDownDiscount;
        }

        public QueryBillOverviewResponseDataItemsItem setPipCode(String pipCode) {
            this.pipCode = pipCode;
            return this;
        }
        public String getPipCode() {
            return this.pipCode;
        }

        public QueryBillOverviewResponseDataItemsItem setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

    }

    public static class QueryBillOverviewResponseDataItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<QueryBillOverviewResponseDataItemsItem> item;

        public static QueryBillOverviewResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryBillOverviewResponseDataItems self = new QueryBillOverviewResponseDataItems();
            return TeaModel.build(map, self);
        }

        public QueryBillOverviewResponseDataItems setItem(java.util.List<QueryBillOverviewResponseDataItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryBillOverviewResponseDataItemsItem> getItem() {
            return this.item;
        }

    }

    public static class QueryBillOverviewResponseData extends TeaModel {
        @NameInMap("BillingCycle")
        @Validation(required = true)
        public String billingCycle;

        @NameInMap("AccountID")
        @Validation(required = true)
        public String accountID;

        @NameInMap("AccountName")
        @Validation(required = true)
        public String accountName;

        @NameInMap("Items")
        @Validation(required = true)
        public QueryBillOverviewResponseDataItems items;

        public static QueryBillOverviewResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryBillOverviewResponseData self = new QueryBillOverviewResponseData();
            return TeaModel.build(map, self);
        }

        public QueryBillOverviewResponseData setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QueryBillOverviewResponseData setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }
        public String getAccountID() {
            return this.accountID;
        }

        public QueryBillOverviewResponseData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryBillOverviewResponseData setItems(QueryBillOverviewResponseDataItems items) {
            this.items = items;
            return this;
        }
        public QueryBillOverviewResponseDataItems getItems() {
            return this.items;
        }

    }

}
