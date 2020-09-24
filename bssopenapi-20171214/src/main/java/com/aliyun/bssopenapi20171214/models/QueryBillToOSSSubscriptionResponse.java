// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryBillToOSSSubscriptionResponse extends TeaModel {
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
    public QueryBillToOSSSubscriptionResponseData data;

    public static QueryBillToOSSSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBillToOSSSubscriptionResponse self = new QueryBillToOSSSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public QueryBillToOSSSubscriptionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBillToOSSSubscriptionResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryBillToOSSSubscriptionResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBillToOSSSubscriptionResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBillToOSSSubscriptionResponse setData(QueryBillToOSSSubscriptionResponseData data) {
        this.data = data;
        return this;
    }
    public QueryBillToOSSSubscriptionResponseData getData() {
        return this.data;
    }

    public static class QueryBillToOSSSubscriptionResponseDataItemsItem extends TeaModel {
        @NameInMap("SubscribeType")
        @Validation(required = true)
        public String subscribeType;

        @NameInMap("SubscribeBucket")
        @Validation(required = true)
        public String subscribeBucket;

        @NameInMap("BucketOwnerId")
        @Validation(required = true)
        public Long bucketOwnerId;

        @NameInMap("SubscribeTime")
        @Validation(required = true)
        public String subscribeTime;

        @NameInMap("SubscribeLanguage")
        @Validation(required = true)
        public String subscribeLanguage;

        @NameInMap("MultAccountRelSubscribe")
        @Validation(required = true)
        public String multAccountRelSubscribe;

        public static QueryBillToOSSSubscriptionResponseDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QueryBillToOSSSubscriptionResponseDataItemsItem self = new QueryBillToOSSSubscriptionResponseDataItemsItem();
            return TeaModel.build(map, self);
        }

        public QueryBillToOSSSubscriptionResponseDataItemsItem setSubscribeType(String subscribeType) {
            this.subscribeType = subscribeType;
            return this;
        }
        public String getSubscribeType() {
            return this.subscribeType;
        }

        public QueryBillToOSSSubscriptionResponseDataItemsItem setSubscribeBucket(String subscribeBucket) {
            this.subscribeBucket = subscribeBucket;
            return this;
        }
        public String getSubscribeBucket() {
            return this.subscribeBucket;
        }

        public QueryBillToOSSSubscriptionResponseDataItemsItem setBucketOwnerId(Long bucketOwnerId) {
            this.bucketOwnerId = bucketOwnerId;
            return this;
        }
        public Long getBucketOwnerId() {
            return this.bucketOwnerId;
        }

        public QueryBillToOSSSubscriptionResponseDataItemsItem setSubscribeTime(String subscribeTime) {
            this.subscribeTime = subscribeTime;
            return this;
        }
        public String getSubscribeTime() {
            return this.subscribeTime;
        }

        public QueryBillToOSSSubscriptionResponseDataItemsItem setSubscribeLanguage(String subscribeLanguage) {
            this.subscribeLanguage = subscribeLanguage;
            return this;
        }
        public String getSubscribeLanguage() {
            return this.subscribeLanguage;
        }

        public QueryBillToOSSSubscriptionResponseDataItemsItem setMultAccountRelSubscribe(String multAccountRelSubscribe) {
            this.multAccountRelSubscribe = multAccountRelSubscribe;
            return this;
        }
        public String getMultAccountRelSubscribe() {
            return this.multAccountRelSubscribe;
        }

    }

    public static class QueryBillToOSSSubscriptionResponseDataItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<QueryBillToOSSSubscriptionResponseDataItemsItem> item;

        public static QueryBillToOSSSubscriptionResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryBillToOSSSubscriptionResponseDataItems self = new QueryBillToOSSSubscriptionResponseDataItems();
            return TeaModel.build(map, self);
        }

        public QueryBillToOSSSubscriptionResponseDataItems setItem(java.util.List<QueryBillToOSSSubscriptionResponseDataItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryBillToOSSSubscriptionResponseDataItemsItem> getItem() {
            return this.item;
        }

    }

    public static class QueryBillToOSSSubscriptionResponseData extends TeaModel {
        @NameInMap("AccountID")
        @Validation(required = true)
        public String accountID;

        @NameInMap("AccountName")
        @Validation(required = true)
        public String accountName;

        @NameInMap("Items")
        @Validation(required = true)
        public QueryBillToOSSSubscriptionResponseDataItems items;

        public static QueryBillToOSSSubscriptionResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryBillToOSSSubscriptionResponseData self = new QueryBillToOSSSubscriptionResponseData();
            return TeaModel.build(map, self);
        }

        public QueryBillToOSSSubscriptionResponseData setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }
        public String getAccountID() {
            return this.accountID;
        }

        public QueryBillToOSSSubscriptionResponseData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryBillToOSSSubscriptionResponseData setItems(QueryBillToOSSSubscriptionResponseDataItems items) {
            this.items = items;
            return this;
        }
        public QueryBillToOSSSubscriptionResponseDataItems getItems() {
            return this.items;
        }

    }

}
