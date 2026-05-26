// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentretailvision20260506.models;

import com.aliyun.tea.*;

public class QueryRecognitionResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryRecognitionResultResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryRecognitionResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRecognitionResultResponseBody self = new QueryRecognitionResultResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRecognitionResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRecognitionResultResponseBody setData(QueryRecognitionResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryRecognitionResultResponseBodyData getData() {
        return this.data;
    }

    public QueryRecognitionResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRecognitionResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRecognitionResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRecognitionResultResponseBodyDataResultCheckoutInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TRUSTED</p>
         */
        @NameInMap("CheckoutStatus")
        public String checkoutStatus;

        public static QueryRecognitionResultResponseBodyDataResultCheckoutInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryRecognitionResultResponseBodyDataResultCheckoutInfo self = new QueryRecognitionResultResponseBodyDataResultCheckoutInfo();
            return TeaModel.build(map, self);
        }

        public QueryRecognitionResultResponseBodyDataResultCheckoutInfo setCheckoutStatus(String checkoutStatus) {
            this.checkoutStatus = checkoutStatus;
            return this;
        }
        public String getCheckoutStatus() {
            return this.checkoutStatus;
        }

    }

    public static class QueryRecognitionResultResponseBodyDataResultItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>690234524880781</p>
         */
        @NameInMap("ItemUniqueId")
        public String itemUniqueId;

        /**
         * <strong>example:</strong>
         * <p>535c3daaee3b4b5382db4913413419bc2d</p>
         */
        @NameInMap("PlatformItemId")
        public String platformItemId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Quantity")
        public Integer quantity;

        public static QueryRecognitionResultResponseBodyDataResultItems build(java.util.Map<String, ?> map) throws Exception {
            QueryRecognitionResultResponseBodyDataResultItems self = new QueryRecognitionResultResponseBodyDataResultItems();
            return TeaModel.build(map, self);
        }

        public QueryRecognitionResultResponseBodyDataResultItems setItemUniqueId(String itemUniqueId) {
            this.itemUniqueId = itemUniqueId;
            return this;
        }
        public String getItemUniqueId() {
            return this.itemUniqueId;
        }

        public QueryRecognitionResultResponseBodyDataResultItems setPlatformItemId(String platformItemId) {
            this.platformItemId = platformItemId;
            return this;
        }
        public String getPlatformItemId() {
            return this.platformItemId;
        }

        public QueryRecognitionResultResponseBodyDataResultItems setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

    }

    public static class QueryRecognitionResultResponseBodyDataResult extends TeaModel {
        @NameInMap("CheckoutInfo")
        public QueryRecognitionResultResponseBodyDataResultCheckoutInfo checkoutInfo;

        @NameInMap("Items")
        public java.util.List<QueryRecognitionResultResponseBodyDataResultItems> items;

        public static QueryRecognitionResultResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            QueryRecognitionResultResponseBodyDataResult self = new QueryRecognitionResultResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public QueryRecognitionResultResponseBodyDataResult setCheckoutInfo(QueryRecognitionResultResponseBodyDataResultCheckoutInfo checkoutInfo) {
            this.checkoutInfo = checkoutInfo;
            return this;
        }
        public QueryRecognitionResultResponseBodyDataResultCheckoutInfo getCheckoutInfo() {
            return this.checkoutInfo;
        }

        public QueryRecognitionResultResponseBodyDataResult setItems(java.util.List<QueryRecognitionResultResponseBodyDataResultItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QueryRecognitionResultResponseBodyDataResultItems> getItems() {
            return this.items;
        }

    }

    public static class QueryRecognitionResultResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ORDER_001</p>
         */
        @NameInMap("OrderUniqueId")
        public String orderUniqueId;

        @NameInMap("Result")
        public QueryRecognitionResultResponseBodyDataResult result;

        /**
         * <strong>example:</strong>
         * <p>TASK_001</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        public static QueryRecognitionResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRecognitionResultResponseBodyData self = new QueryRecognitionResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRecognitionResultResponseBodyData setOrderUniqueId(String orderUniqueId) {
            this.orderUniqueId = orderUniqueId;
            return this;
        }
        public String getOrderUniqueId() {
            return this.orderUniqueId;
        }

        public QueryRecognitionResultResponseBodyData setResult(QueryRecognitionResultResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public QueryRecognitionResultResponseBodyDataResult getResult() {
            return this.result;
        }

        public QueryRecognitionResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryRecognitionResultResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
