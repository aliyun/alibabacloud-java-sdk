// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryMonthlyBillResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryMonthlyBillResponseBodyData data;

    public static QueryMonthlyBillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthlyBillResponseBody self = new QueryMonthlyBillResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMonthlyBillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMonthlyBillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMonthlyBillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMonthlyBillResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryMonthlyBillResponseBody setData(QueryMonthlyBillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMonthlyBillResponseBodyData getData() {
        return this.data;
    }

    public static class QueryMonthlyBillResponseBodyDataItemsItem extends TeaModel {
        @NameInMap("PretaxAmount")
        public Float pretaxAmount;

        @NameInMap("SolutionCode")
        public String solutionCode;

        @NameInMap("Item")
        public String item;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("DeductedByCashCoupons")
        public Float deductedByCashCoupons;

        @NameInMap("SubscriptionType")
        public String subscriptionType;

        @NameInMap("PaymentCurrency")
        public String paymentCurrency;

        @NameInMap("DeductedByPrepaidCard")
        public Float deductedByPrepaidCard;

        @NameInMap("DeductedByCoupons")
        public Float deductedByCoupons;

        @NameInMap("PaymentAmount")
        public Float paymentAmount;

        @NameInMap("InvoiceDiscount")
        public Float invoiceDiscount;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("OutstandingAmount")
        public Float outstandingAmount;

        @NameInMap("AfterTaxAmount")
        public Float afterTaxAmount;

        @NameInMap("PretaxGrossAmount")
        public Float pretaxGrossAmount;

        @NameInMap("SolutionName")
        public String solutionName;

        @NameInMap("Tax")
        public Float tax;

        @NameInMap("PretaxAmountLocal")
        public Float pretaxAmountLocal;

        @NameInMap("ProductCode")
        public String productCode;

        public static QueryMonthlyBillResponseBodyDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlyBillResponseBodyDataItemsItem self = new QueryMonthlyBillResponseBodyDataItemsItem();
            return TeaModel.build(map, self);
        }

        public QueryMonthlyBillResponseBodyDataItemsItem setPretaxAmount(Float pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Float getPretaxAmount() {
            return this.pretaxAmount;
        }

        public QueryMonthlyBillResponseBodyDataItemsItem setSolutionCode(String solutionCode) {
            this.solutionCode = solutionCode;
            return this;
        }
        public String getSolutionCode() {
            return this.solutionCode;
        }

        public QueryMonthlyBillResponseBodyDataItemsItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public QueryMonthlyBillResponseBodyDataItemsItem setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryMonthlyBillResponseBodyDataItemsItem setDeductedByCashCoupons(Float deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public Float getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public QueryMonthlyBillResponseBodyDataItemsItem setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QueryMonthlyBillResponseBodyDataItemsItem setPaymentCurrency(String paymentCurrency) {
            this.paymentCurrency = paymentCurrency;
            return this;
        }
        public String getPaymentCurrency() {
            return this.paymentCurrency;
        }

        public QueryMonthlyBillResponseBodyDataItemsItem setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Float getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public QueryMonthlyBillResponseBodyDataItemsItem setDeductedByCoupons(Float deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Float getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public QueryMonthlyBillResponseBodyDataItemsItem setPaymentAmount(Float paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Float getPaymentAmount() {
            return this.paymentAmount;
        }

        public QueryMonthlyBillResponseBodyDataItemsItem setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public QueryMonthlyBillResponseBodyDataItemsItem setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QueryMonthlyBillResponseBodyDataItemsItem setOutstandingAmount(Float outstandingAmount) {
            this.outstandingAmount = outstandingAmount;
            return this;
        }
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        public QueryMonthlyBillResponseBodyDataItemsItem setAfterTaxAmount(Float afterTaxAmount) {
            this.afterTaxAmount = afterTaxAmount;
            return this;
        }
        public Float getAfterTaxAmount() {
            return this.afterTaxAmount;
        }

        public QueryMonthlyBillResponseBodyDataItemsItem setPretaxGrossAmount(Float pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Float getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public QueryMonthlyBillResponseBodyDataItemsItem setSolutionName(String solutionName) {
            this.solutionName = solutionName;
            return this;
        }
        public String getSolutionName() {
            return this.solutionName;
        }

        public QueryMonthlyBillResponseBodyDataItemsItem setTax(Float tax) {
            this.tax = tax;
            return this;
        }
        public Float getTax() {
            return this.tax;
        }

        public QueryMonthlyBillResponseBodyDataItemsItem setPretaxAmountLocal(Float pretaxAmountLocal) {
            this.pretaxAmountLocal = pretaxAmountLocal;
            return this;
        }
        public Float getPretaxAmountLocal() {
            return this.pretaxAmountLocal;
        }

        public QueryMonthlyBillResponseBodyDataItemsItem setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

    public static class QueryMonthlyBillResponseBodyDataItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<QueryMonthlyBillResponseBodyDataItemsItem> item;

        public static QueryMonthlyBillResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlyBillResponseBodyDataItems self = new QueryMonthlyBillResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public QueryMonthlyBillResponseBodyDataItems setItem(java.util.List<QueryMonthlyBillResponseBodyDataItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryMonthlyBillResponseBodyDataItemsItem> getItem() {
            return this.item;
        }

    }

    public static class QueryMonthlyBillResponseBodyData extends TeaModel {
        @NameInMap("OutstandingAmount")
        public Float outstandingAmount;

        @NameInMap("BillingCycle")
        public String billingCycle;

        @NameInMap("TotalOutstandingAmount")
        public Float totalOutstandingAmount;

        @NameInMap("NewInvoiceAmount")
        public Float newInvoiceAmount;

        @NameInMap("Items")
        public QueryMonthlyBillResponseBodyDataItems items;

        public static QueryMonthlyBillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlyBillResponseBodyData self = new QueryMonthlyBillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMonthlyBillResponseBodyData setOutstandingAmount(Float outstandingAmount) {
            this.outstandingAmount = outstandingAmount;
            return this;
        }
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        public QueryMonthlyBillResponseBodyData setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QueryMonthlyBillResponseBodyData setTotalOutstandingAmount(Float totalOutstandingAmount) {
            this.totalOutstandingAmount = totalOutstandingAmount;
            return this;
        }
        public Float getTotalOutstandingAmount() {
            return this.totalOutstandingAmount;
        }

        public QueryMonthlyBillResponseBodyData setNewInvoiceAmount(Float newInvoiceAmount) {
            this.newInvoiceAmount = newInvoiceAmount;
            return this;
        }
        public Float getNewInvoiceAmount() {
            return this.newInvoiceAmount;
        }

        public QueryMonthlyBillResponseBodyData setItems(QueryMonthlyBillResponseBodyDataItems items) {
            this.items = items;
            return this;
        }
        public QueryMonthlyBillResponseBodyDataItems getItems() {
            return this.items;
        }

    }

}
