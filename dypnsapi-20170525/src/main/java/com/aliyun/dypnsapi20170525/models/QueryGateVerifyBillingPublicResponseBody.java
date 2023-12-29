// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class QueryGateVerifyBillingPublicResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <br>
     * <p>*   If OK is returned, the request is successful.</p>
     * <p>*   For more information about other error codes, see [API response codes](~~85198~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The billing information about each verification service.</p>
     */
    @NameInMap("Data")
    public QueryGateVerifyBillingPublicResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryGateVerifyBillingPublicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGateVerifyBillingPublicResponseBody self = new QueryGateVerifyBillingPublicResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGateVerifyBillingPublicResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryGateVerifyBillingPublicResponseBody setData(QueryGateVerifyBillingPublicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryGateVerifyBillingPublicResponseBodyData getData() {
        return this.data;
    }

    public QueryGateVerifyBillingPublicResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryGateVerifyBillingPublicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryGateVerifyBillingPublicResponseBodyDataSceneBillingList extends TeaModel {
        /**
         * <p>The billable items.</p>
         */
        @NameInMap("Add")
        public String add;

        /**
         * <p>The fees generated for the verification service. Unitrogen: CNY.</p>
         */
        @NameInMap("Amount")
        public String amount;

        /**
         * <p>The application name.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The verification method.</p>
         */
        @NameInMap("ItemName")
        public String itemName;

        /**
         * <p>The service code.</p>
         */
        @NameInMap("SceneCode")
        public String sceneCode;

        /**
         * <p>The service name.</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>The unit price. Unit: CNY.</p>
         */
        @NameInMap("SinglePrice")
        public String singlePrice;

        public static QueryGateVerifyBillingPublicResponseBodyDataSceneBillingList build(java.util.Map<String, ?> map) throws Exception {
            QueryGateVerifyBillingPublicResponseBodyDataSceneBillingList self = new QueryGateVerifyBillingPublicResponseBodyDataSceneBillingList();
            return TeaModel.build(map, self);
        }

        public QueryGateVerifyBillingPublicResponseBodyDataSceneBillingList setAdd(String add) {
            this.add = add;
            return this;
        }
        public String getAdd() {
            return this.add;
        }

        public QueryGateVerifyBillingPublicResponseBodyDataSceneBillingList setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public QueryGateVerifyBillingPublicResponseBodyDataSceneBillingList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryGateVerifyBillingPublicResponseBodyDataSceneBillingList setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public QueryGateVerifyBillingPublicResponseBodyDataSceneBillingList setSceneCode(String sceneCode) {
            this.sceneCode = sceneCode;
            return this;
        }
        public String getSceneCode() {
            return this.sceneCode;
        }

        public QueryGateVerifyBillingPublicResponseBodyDataSceneBillingList setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryGateVerifyBillingPublicResponseBodyDataSceneBillingList setSinglePrice(String singlePrice) {
            this.singlePrice = singlePrice;
            return this;
        }
        public String getSinglePrice() {
            return this.singlePrice;
        }

    }

    public static class QueryGateVerifyBillingPublicResponseBodyData extends TeaModel {
        /**
         * <p>The fees generated for all verification services. Unitrogen: CNY.</p>
         */
        @NameInMap("AmountSum")
        public String amountSum;

        /**
         * <p>The details of fees.</p>
         */
        @NameInMap("SceneBillingList")
        public java.util.List<QueryGateVerifyBillingPublicResponseBodyDataSceneBillingList> sceneBillingList;

        public static QueryGateVerifyBillingPublicResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryGateVerifyBillingPublicResponseBodyData self = new QueryGateVerifyBillingPublicResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryGateVerifyBillingPublicResponseBodyData setAmountSum(String amountSum) {
            this.amountSum = amountSum;
            return this;
        }
        public String getAmountSum() {
            return this.amountSum;
        }

        public QueryGateVerifyBillingPublicResponseBodyData setSceneBillingList(java.util.List<QueryGateVerifyBillingPublicResponseBodyDataSceneBillingList> sceneBillingList) {
            this.sceneBillingList = sceneBillingList;
            return this;
        }
        public java.util.List<QueryGateVerifyBillingPublicResponseBodyDataSceneBillingList> getSceneBillingList() {
            return this.sceneBillingList;
        }

    }

}
