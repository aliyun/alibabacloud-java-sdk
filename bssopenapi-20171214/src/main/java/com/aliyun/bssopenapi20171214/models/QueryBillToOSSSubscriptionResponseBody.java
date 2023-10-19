// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryBillToOSSSubscriptionResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public QueryBillToOSSSubscriptionResponseBodyData data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
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
        /**
         * <p>The owner ID of the Object Storage Service (OSS) bucket.</p>
         */
        @NameInMap("BucketOwnerId")
        public Long bucketOwnerId;

        /**
         * <p>The path in the OSS bucket.</p>
         */
        @NameInMap("BucketPath")
        public String bucketPath;

        /**
         * <p>The maximum number of data rows in a single file. If the number of data rows in a bill exceeds the upper limit, the bill is split into multiple files. Then, multiple files are merged and compressed into a package.</p>
         */
        @NameInMap("RowLimitPerFile")
        public Integer rowLimitPerFile;

        /**
         * <p>The ID of the OSS bucket that stores the subscribed bill.</p>
         */
        @NameInMap("SubscribeBucket")
        public String subscribeBucket;

        /**
         * <p>The code of the language.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   en: English</p>
         * <p>*   zh: Chinese</p>
         */
        @NameInMap("SubscribeLanguage")
        public String subscribeLanguage;

        /**
         * <p>The time when the subscribed bill was stored in the OSS bucket. The time is displayed in the YYYY-MM-DD hh:mm:ss format.</p>
         */
        @NameInMap("SubscribeTime")
        public String subscribeTime;

        /**
         * <p>The type of the subscribed bill. Valid values:</p>
         * <br>
         * <p>*   BillingItemDetailForBillingPeriod: the bill of a billable item.</p>
         * <p>*   InstanceDetailForBillingPeriod: the bill of an instance.</p>
         */
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

        public QueryBillToOSSSubscriptionResponseBodyDataItemsItem setBucketPath(String bucketPath) {
            this.bucketPath = bucketPath;
            return this;
        }
        public String getBucketPath() {
            return this.bucketPath;
        }

        public QueryBillToOSSSubscriptionResponseBodyDataItemsItem setRowLimitPerFile(Integer rowLimitPerFile) {
            this.rowLimitPerFile = rowLimitPerFile;
            return this;
        }
        public Integer getRowLimitPerFile() {
            return this.rowLimitPerFile;
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
        /**
         * <p>The ID of the account used to perform the query.</p>
         */
        @NameInMap("AccountID")
        public String accountID;

        /**
         * <p>The name of the account used to perform the query.</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The details of the subscribed bill.</p>
         */
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
