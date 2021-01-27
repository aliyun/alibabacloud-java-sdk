// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryBillToOSSSubscriptionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryBillToOSSSubscriptionResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryBillToOSSSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBillToOSSSubscriptionResponseBody self = new QueryBillToOSSSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBillToOSSSubscriptionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBillToOSSSubscriptionResponseBody setData(QueryBillToOSSSubscriptionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryBillToOSSSubscriptionResponseBodyData getData() {
        return this.data;
    }

    public QueryBillToOSSSubscriptionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBillToOSSSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBillToOSSSubscriptionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryBillToOSSSubscriptionResponseBodyDataItemsItem extends TeaModel {
        @NameInMap("BucketOwnerId")
        public Long bucketOwnerId;

        @NameInMap("SubscribeBucket")
        public String subscribeBucket;

        @NameInMap("SubscribeLanguage")
        public String subscribeLanguage;

        @NameInMap("SubscribeTime")
        public String subscribeTime;

        @NameInMap("SubscribeType")
        public String subscribeType;

        public static QueryBillToOSSSubscriptionResponseBodyDataItemsItem build(java.util.Map<String, ?> map) throws Exception {
            QueryBillToOSSSubscriptionResponseBodyDataItemsItem self = new QueryBillToOSSSubscriptionResponseBodyDataItemsItem();
            return TeaModel.build(map, self);
        }

        public QueryBillToOSSSubscriptionResponseBodyDataItemsItem setBucketOwnerId(Long bucketOwnerId) {
            this.bucketOwnerId = bucketOwnerId;
            return this;
        }
        public Long getBucketOwnerId() {
            return this.bucketOwnerId;
        }

        public QueryBillToOSSSubscriptionResponseBodyDataItemsItem setSubscribeBucket(String subscribeBucket) {
            this.subscribeBucket = subscribeBucket;
            return this;
        }
        public String getSubscribeBucket() {
            return this.subscribeBucket;
        }

        public QueryBillToOSSSubscriptionResponseBodyDataItemsItem setSubscribeLanguage(String subscribeLanguage) {
            this.subscribeLanguage = subscribeLanguage;
            return this;
        }
        public String getSubscribeLanguage() {
            return this.subscribeLanguage;
        }

        public QueryBillToOSSSubscriptionResponseBodyDataItemsItem setSubscribeTime(String subscribeTime) {
            this.subscribeTime = subscribeTime;
            return this;
        }
        public String getSubscribeTime() {
            return this.subscribeTime;
        }

        public QueryBillToOSSSubscriptionResponseBodyDataItemsItem setSubscribeType(String subscribeType) {
            this.subscribeType = subscribeType;
            return this;
        }
        public String getSubscribeType() {
            return this.subscribeType;
        }

    }

    public static class QueryBillToOSSSubscriptionResponseBodyDataItems extends TeaModel {
        @NameInMap("Item")
        public java.util.List<QueryBillToOSSSubscriptionResponseBodyDataItemsItem> item;

        public static QueryBillToOSSSubscriptionResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryBillToOSSSubscriptionResponseBodyDataItems self = new QueryBillToOSSSubscriptionResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public QueryBillToOSSSubscriptionResponseBodyDataItems setItem(java.util.List<QueryBillToOSSSubscriptionResponseBodyDataItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<QueryBillToOSSSubscriptionResponseBodyDataItemsItem> getItem() {
            return this.item;
        }

    }

    public static class QueryBillToOSSSubscriptionResponseBodyData extends TeaModel {
        @NameInMap("AccountID")
        public String accountID;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("Items")
        public QueryBillToOSSSubscriptionResponseBodyDataItems items;

        public static QueryBillToOSSSubscriptionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryBillToOSSSubscriptionResponseBodyData self = new QueryBillToOSSSubscriptionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryBillToOSSSubscriptionResponseBodyData setAccountID(String accountID) {
            this.accountID = accountID;
            return this;
        }
        public String getAccountID() {
            return this.accountID;
        }

        public QueryBillToOSSSubscriptionResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryBillToOSSSubscriptionResponseBodyData setItems(QueryBillToOSSSubscriptionResponseBodyDataItems items) {
            this.items = items;
            return this;
        }
        public QueryBillToOSSSubscriptionResponseBodyDataItems getItems() {
            return this.items;
        }

    }

}
