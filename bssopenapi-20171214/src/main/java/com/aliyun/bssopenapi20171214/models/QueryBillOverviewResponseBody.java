// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryBillOverviewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public QueryBillOverviewResponseBodyData data;

    public static QueryBillOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBillOverviewResponseBody self = new QueryBillOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBillOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBillOverviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryBillOverviewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBillOverviewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBillOverviewResponseBody setData(QueryBillOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryBillOverviewResponseBodyData getData() {
        return this.data;
    }

    public static class QueryBillOverviewResponseBodyDataItemsItem extends TeaModel {
        @NameInMap("Item")
        public String item;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("SubscriptionType")
        public String subscriptionType;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("ProductDetail")
        public String productDetail;

        @NameInMap("PretaxGrossAmount")
        public Float pretaxGrossAmount;

        @NameInMap("InvoiceDiscount")
        public Float invoiceDiscount;

        @NameInMap("DeductedByCoupons")
        public Float deductedByCoupons;

        @NameInMap("PretaxAmount")
        public Float pretaxAmount;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("PaymentAmount")
        public Float paymentAmount;

        @NameInMap("OutstandingAmount")
        public Float outstandingAmount;

        @NameInMap("DeductedByCashCoupons")
        public Float deductedByCashCoupons;

        @NameInMap("DeductedByPrepaidCard")
        public Float deductedByPrepaidCard;

        @NameInMap("PretaxAmountLocal")
        public Float pretaxAmountLocal;

        @NameInMap("Tax")
        public Float tax;

        @NameInMap("AfterTaxAmount")
        public Float afterTaxAmount;

        @NameInMap("PaymentCurrency")
        public String paymentCurrency;

        @NameInMap("RoundDownDiscount")
        public String roundDownDiscount;

        @NameInMap("PipCode")
        public String pipCode;

        @NameInMap("CommodityCode")
        public String commodityCode;

        public static QueryBillOverviewResponseBodyDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QueryBillOverviewResponseBodyDataItemsItem self = new QueryBillOverviewResponseBodyDataItemsItem();
            return TeaModel.build(map, self);
        }

        public QueryBillOverviewResponseBodyDataItemsItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public QueryBillOverviewResponseBodyDataItemsItem setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryBillOverviewResponseBodyDataItemsItem setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QueryBillOverviewResponseBodyDataItemsItem setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QueryBillOverviewResponseBodyDataItemsItem setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryBillOverviewResponseBodyDataItemsItem setProductDetail(String productDetail) {
            this.productDetail = productDetail;
            return this;
        }
        public String getProductDetail() {
            return this.productDetail;
        }

        public QueryBillOverviewResponseBodyDataItemsItem setPretaxGrossAmount(Float pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Float getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public QueryBillOverviewResponseBodyDataItemsItem setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public QueryBillOverviewResponseBodyDataItemsItem setDeductedByCoupons(Float deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Float getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public QueryBillOverviewResponseBodyDataItemsItem setPretaxAmount(Float pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Float getPretaxAmount() {
            return this.pretaxAmount;
        }

        public QueryBillOverviewResponseBodyDataItemsItem setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryBillOverviewResponseBodyDataItemsItem setPaymentAmount(Float paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Float getPaymentAmount() {
            return this.paymentAmount;
        }

        public QueryBillOverviewResponseBodyDataItemsItem setOutstandingAmount(Float outstandingAmount) {
            this.outstandingAmount = outstandingAmount;
            return this;
        }
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        public QueryBillOverviewResponseBodyDataItemsItem setDeductedByCashCoupons(Float deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public Float getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public QueryBillOverviewResponseBodyDataItemsItem setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Float getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public QueryBillOverviewResponseBodyDataItemsItem setPretaxAmountLocal(Float pretaxAmountLocal) {
            this.pretaxAmountLocal = pretaxAmountLocal;
            return this;
        }
        public Float getPretaxAmountLocal() {
            return this.pretaxAmountLocal;
        }

        public QueryBillOverviewResponseBodyDataItemsItem setTax(Float tax) {
            this.tax = tax;
            return this;
        }
        public Float getTax() {
            return this.tax;
        }

        public QueryBillOverviewResponseBodyDataItemsItem setAfterTaxAmount(Float afterTaxAmount) {
            this.afterTaxAmount = afterTaxAmount;
            return this;
        }
        public Float getAfterTaxAmount() {
            return this.afterTaxAmount;
        }

        public QueryBillOverviewResponseBodyDataItemsItem setPaymentCurrency(String paymentCurrency) {
            this.paymentCurrency = paymentCurrency;
            return this;
        }
        public String getPaymentCurrency() {
            return this.paymentCurrency;
        }

        public QueryBillOverviewResponseBodyDataItemsItem setRoundDownDiscount(String roundDownDiscount) {
            this.roundDownDiscount = roundDownDiscount;
            return this;
        }
        public String getRoundDownDiscount() {
            return this.roundDownDiscount;
        }

        public QueryBillOverviewResponseBodyDataItemsItem setPipCode(String pipCode) {
            this.pipCode = pipCode;
            return this;
        }
        public String getPipCode() {
            return this.pipCode;
        }

        public QueryBillOverviewResponseBodyDataItemsItem setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

    }

    public static class QueryBillOverviewResponseBodyDataItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<QueryBillOverviewResponseBodyDataItemsItem> item;

        public static QueryBillOverviewResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryBillOverviewResponseBodyDataItems self = new QueryBillOverviewResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public QueryBillOverviewResponseBodyDataItems setItem(java.util.List<QueryBillOverviewResponseBodyDataItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryBillOverviewResponseBodyDataItemsItem> getItem() {
            return this.item;
        }

    }

    public static class QueryBillOverviewResponseBodyData extends TeaModel {
        @NameInMap("BillingCycle")
        public String billingCycle;

        @NameInMap("AccountID")
        public String accountID;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("Items")
        public QueryBillOverviewResponseBodyDataItems items;

        public static QueryBillOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryBillOverviewResponseBodyData self = new QueryBillOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryBillOverviewResponseBodyData setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QueryBillOverviewResponseBodyData setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }
        public String getAccountID() {
            return this.accountID;
        }

        public QueryBillOverviewResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryBillOverviewResponseBodyData setItems(QueryBillOverviewResponseBodyDataItems items) {
            this.items = items;
            return this;
        }
        public QueryBillOverviewResponseBodyDataItems getItems() {
            return this.items;
        }

    }

}
