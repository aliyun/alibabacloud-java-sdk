// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryMonthlyBillResponse extends TeaModel {
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
    public QueryMonthlyBillResponseData data;

    public static QueryMonthlyBillResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMonthlyBillResponse self = new QueryMonthlyBillResponse();
        return TeaModel.build(map, self);
    }

    public QueryMonthlyBillResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMonthlyBillResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryMonthlyBillResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMonthlyBillResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMonthlyBillResponse setData(QueryMonthlyBillResponseData data) {
        this.data = data;
        return this;
    }
    public QueryMonthlyBillResponseData getData() {
        return this.data;
    }

    public static class QueryMonthlyBillResponseDataItemsItem extends TeaModel {
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

        @NameInMap("SolutionCode")
        @Validation(required = true)
        public String solutionCode;

        @NameInMap("SolutionName")
        @Validation(required = true)
        public String solutionName;

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

        @NameInMap("PretaxAmountLocal")
        @Validation(required = true)
        public Float pretaxAmountLocal;

        @NameInMap("Tax")
        @Validation(required = true)
        public Float tax;

        @NameInMap("AfterTaxAmount")
        @Validation(required = true)
        public Float afterTaxAmount;

        @NameInMap("OutstandingAmount")
        @Validation(required = true)
        public Float outstandingAmount;

        @NameInMap("DeductedByCashCoupons")
        @Validation(required = true)
        public Float deductedByCashCoupons;

        @NameInMap("DeductedByPrepaidCard")
        @Validation(required = true)
        public Float deductedByPrepaidCard;

        @NameInMap("PaymentAmount")
        @Validation(required = true)
        public Float paymentAmount;

        @NameInMap("PaymentCurrency")
        @Validation(required = true)
        public String paymentCurrency;

        public static QueryMonthlyBillResponseDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlyBillResponseDataItemsItem self = new QueryMonthlyBillResponseDataItemsItem();
            return TeaModel.build(map, self);
        }

        public QueryMonthlyBillResponseDataItemsItem setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public QueryMonthlyBillResponseDataItemsItem setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryMonthlyBillResponseDataItemsItem setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public QueryMonthlyBillResponseDataItemsItem setSubscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            return this;
        }
        public String getSubscriptionType() {
            return this.subscriptionType;
        }

        public QueryMonthlyBillResponseDataItemsItem setSolutionCode(String solutionCode) {
            this.solutionCode = solutionCode;
            return this;
        }
        public String getSolutionCode() {
            return this.solutionCode;
        }

        public QueryMonthlyBillResponseDataItemsItem setSolutionName(String solutionName) {
            this.solutionName = solutionName;
            return this;
        }
        public String getSolutionName() {
            return this.solutionName;
        }

        public QueryMonthlyBillResponseDataItemsItem setPretaxGrossAmount(Float pretaxGrossAmount) {
            this.pretaxGrossAmount = pretaxGrossAmount;
            return this;
        }
        public Float getPretaxGrossAmount() {
            return this.pretaxGrossAmount;
        }

        public QueryMonthlyBillResponseDataItemsItem setInvoiceDiscount(Float invoiceDiscount) {
            this.invoiceDiscount = invoiceDiscount;
            return this;
        }
        public Float getInvoiceDiscount() {
            return this.invoiceDiscount;
        }

        public QueryMonthlyBillResponseDataItemsItem setDeductedByCoupons(Float deductedByCoupons) {
            this.deductedByCoupons = deductedByCoupons;
            return this;
        }
        public Float getDeductedByCoupons() {
            return this.deductedByCoupons;
        }

        public QueryMonthlyBillResponseDataItemsItem setPretaxAmount(Float pretaxAmount) {
            this.pretaxAmount = pretaxAmount;
            return this;
        }
        public Float getPretaxAmount() {
            return this.pretaxAmount;
        }

        public QueryMonthlyBillResponseDataItemsItem setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryMonthlyBillResponseDataItemsItem setPretaxAmountLocal(Float pretaxAmountLocal) {
            this.pretaxAmountLocal = pretaxAmountLocal;
            return this;
        }
        public Float getPretaxAmountLocal() {
            return this.pretaxAmountLocal;
        }

        public QueryMonthlyBillResponseDataItemsItem setTax(Float tax) {
            this.tax = tax;
            return this;
        }
        public Float getTax() {
            return this.tax;
        }

        public QueryMonthlyBillResponseDataItemsItem setAfterTaxAmount(Float afterTaxAmount) {
            this.afterTaxAmount = afterTaxAmount;
            return this;
        }
        public Float getAfterTaxAmount() {
            return this.afterTaxAmount;
        }

        public QueryMonthlyBillResponseDataItemsItem setOutstandingAmount(Float outstandingAmount) {
            this.outstandingAmount = outstandingAmount;
            return this;
        }
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        public QueryMonthlyBillResponseDataItemsItem setDeductedByCashCoupons(Float deductedByCashCoupons) {
            this.deductedByCashCoupons = deductedByCashCoupons;
            return this;
        }
        public Float getDeductedByCashCoupons() {
            return this.deductedByCashCoupons;
        }

        public QueryMonthlyBillResponseDataItemsItem setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
            this.deductedByPrepaidCard = deductedByPrepaidCard;
            return this;
        }
        public Float getDeductedByPrepaidCard() {
            return this.deductedByPrepaidCard;
        }

        public QueryMonthlyBillResponseDataItemsItem setPaymentAmount(Float paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }
        public Float getPaymentAmount() {
            return this.paymentAmount;
        }

        public QueryMonthlyBillResponseDataItemsItem setPaymentCurrency(String paymentCurrency) {
            this.paymentCurrency = paymentCurrency;
            return this;
        }
        public String getPaymentCurrency() {
            return this.paymentCurrency;
        }

    }

    public static class QueryMonthlyBillResponseDataItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<QueryMonthlyBillResponseDataItemsItem> item;

        public static QueryMonthlyBillResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlyBillResponseDataItems self = new QueryMonthlyBillResponseDataItems();
            return TeaModel.build(map, self);
        }

        public QueryMonthlyBillResponseDataItems setItem(java.util.List<QueryMonthlyBillResponseDataItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryMonthlyBillResponseDataItemsItem> getItem() {
            return this.item;
        }

    }

    public static class QueryMonthlyBillResponseData extends TeaModel {
        @NameInMap("OutstandingAmount")
        @Validation(required = true)
        public Float outstandingAmount;

        @NameInMap("TotalOutstandingAmount")
        @Validation(required = true)
        public Float totalOutstandingAmount;

        @NameInMap("NewInvoiceAmount")
        @Validation(required = true)
        public Float newInvoiceAmount;

        @NameInMap("BillingCycle")
        @Validation(required = true)
        public String billingCycle;

        @NameInMap("Items")
        @Validation(required = true)
        public QueryMonthlyBillResponseDataItems items;

        public static QueryMonthlyBillResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryMonthlyBillResponseData self = new QueryMonthlyBillResponseData();
            return TeaModel.build(map, self);
        }

        public QueryMonthlyBillResponseData setOutstandingAmount(Float outstandingAmount) {
            this.outstandingAmount = outstandingAmount;
            return this;
        }
        public Float getOutstandingAmount() {
            return this.outstandingAmount;
        }

        public QueryMonthlyBillResponseData setTotalOutstandingAmount(Float totalOutstandingAmount) {
            this.totalOutstandingAmount = totalOutstandingAmount;
            return this;
        }
        public Float getTotalOutstandingAmount() {
            return this.totalOutstandingAmount;
        }

        public QueryMonthlyBillResponseData setNewInvoiceAmount(Float newInvoiceAmount) {
            this.newInvoiceAmount = newInvoiceAmount;
            return this;
        }
        public Float getNewInvoiceAmount() {
            return this.newInvoiceAmount;
        }

        public QueryMonthlyBillResponseData setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QueryMonthlyBillResponseData setItems(QueryMonthlyBillResponseDataItems items) {
            this.items = items;
            return this;
        }
        public QueryMonthlyBillResponseDataItems getItems() {
            return this.items;
        }

    }

}
