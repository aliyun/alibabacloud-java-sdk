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

    }

    public static class QueryBillToOSSSubscriptionResponseDataItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<QueryBillToOSSSubscriptionResponseDataItemsItem> item;

        public static QueryBillToOSSSubscriptionResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryBillToOSSSubscriptionResponseDataItems self = new QueryBillToOSSSubscriptionResponseDataItems();
            return TeaModel.build(map, self);
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

    }

}
