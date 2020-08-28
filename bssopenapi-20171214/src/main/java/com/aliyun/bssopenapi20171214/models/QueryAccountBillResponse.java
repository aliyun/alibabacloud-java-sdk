// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountBillResponse extends TeaModel {
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
    public QueryAccountBillResponseData data;

    public static QueryAccountBillResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountBillResponse self = new QueryAccountBillResponse();
        return TeaModel.build(map, self);
    }

    public static class QueryAccountBillResponseDataItemsItem extends TeaModel {
        @NameInMap("CostUnit")
        @Validation(required = true)
        public String costUnit;

        @NameInMap("OwnerID")
        @Validation(required = true)
        public String ownerID;

        @NameInMap("PretaxGrossAmount")
        @Validation(required = true)
        public Double pretaxGrossAmount;

        @NameInMap("InvoiceDiscount")
        @Validation(required = true)
        public Double invoiceDiscount;

        @NameInMap("DeductedByCoupons")
        @Validation(required = true)
        public Double deductedByCoupons;

        @NameInMap("PretaxAmount")
        @Validation(required = true)
        public Double pretaxAmount;

        @NameInMap("DeductedByCashCoupons")
        @Validation(required = true)
        public Double deductedByCashCoupons;

        @NameInMap("DeductedByPrepaidCard")
        @Validation(required = true)
        public Double deductedByPrepaidCard;

        @NameInMap("PaymentAmount")
        @Validation(required = true)
        public Double paymentAmount;

        @NameInMap("OutstandingAmount")
        @Validation(required = true)
        public Double outstandingAmount;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("OwnerName")
        @Validation(required = true)
        public String ownerName;

        @NameInMap("ProductCode")
        @Validation(required = true)
        public String productCode;

        @NameInMap("ProductName")
        @Validation(required = true)
        public String productName;

        @NameInMap("SubscriptionType")
        @Validation(required = true)
        public String subscriptionType;

        public static QueryAccountBillResponseDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountBillResponseDataItemsItem self = new QueryAccountBillResponseDataItemsItem();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryAccountBillResponseDataItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<QueryAccountBillResponseDataItemsItem> item;

        public static QueryAccountBillResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountBillResponseDataItems self = new QueryAccountBillResponseDataItems();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryAccountBillResponseData extends TeaModel {
        @NameInMap("BillingCycle")
        @Validation(required = true)
        public String billingCycle;

        @NameInMap("AccountID")
        @Validation(required = true)
        public String accountID;

        @NameInMap("AccountName")
        @Validation(required = true)
        public String accountName;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("Items")
        @Validation(required = true)
        public QueryAccountBillResponseDataItems items;

        public static QueryAccountBillResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountBillResponseData self = new QueryAccountBillResponseData();
            return TeaModel.build(map, self);
        }

    }

}
