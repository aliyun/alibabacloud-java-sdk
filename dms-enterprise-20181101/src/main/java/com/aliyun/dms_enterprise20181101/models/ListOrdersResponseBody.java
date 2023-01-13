// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListOrdersResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The details about the tickets.</p>
     */
    @NameInMap("Orders")
    public ListOrdersResponseBodyOrders orders;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>- **true**: The request was successful.</p>
     * <p>- **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries that are returned.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrdersResponseBody self = new ListOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrdersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListOrdersResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListOrdersResponseBody setOrders(ListOrdersResponseBodyOrders orders) {
        this.orders = orders;
        return this;
    }
    public ListOrdersResponseBodyOrders getOrders() {
        return this.orders;
    }

    public ListOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrdersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListOrdersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListOrdersResponseBodyOrdersOrder extends TeaModel {
        /**
         * <p>The remarks of the ticket.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The user who submitted the ticket.</p>
         */
        @NameInMap("Committer")
        public String committer;

        /**
         * <p>The ID of the user who submitted the ticket.</p>
         */
        @NameInMap("CommitterId")
        public Long committerId;

        /**
         * <p>The time when the ticket was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the ticket was last modified.</p>
         */
        @NameInMap("LastModifyTime")
        public String lastModifyTime;

        /**
         * <p>The ID of the ticket.</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        /**
         * <p>The type of the ticket.</p>
         */
        @NameInMap("PluginType")
        public String pluginType;

        /**
         * <p>The status code of the ticket. Valid values:</p>
         * <br>
         * <p>*   **fail**: The ticket fails to be executed.</p>
         * <p>*   **toaudit**: The ticket is waiting for approval.</p>
         * <p>*   **cancel**: The ticket is cancelled.</p>
         * <p>*   **processing**: The ticket is being executed.</p>
         * <p>*   **approved**: The ticket is approved.</p>
         * <p>*   **reject**: The ticket is rejected.</p>
         * <p>*   **success**: The ticket is executed.</p>
         * <p>*   **closed**: The ticket is closed.</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>The status description of the ticket.</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        public static ListOrdersResponseBodyOrdersOrder build(java.util.Map<String, ?> map) throws Exception {
            ListOrdersResponseBodyOrdersOrder self = new ListOrdersResponseBodyOrdersOrder();
            return TeaModel.build(map, self);
        }

        public ListOrdersResponseBodyOrdersOrder setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListOrdersResponseBodyOrdersOrder setCommitter(String committer) {
            this.committer = committer;
            return this;
        }
        public String getCommitter() {
            return this.committer;
        }

        public ListOrdersResponseBodyOrdersOrder setCommitterId(Long committerId) {
            this.committerId = committerId;
            return this;
        }
        public Long getCommitterId() {
            return this.committerId;
        }

        public ListOrdersResponseBodyOrdersOrder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListOrdersResponseBodyOrdersOrder setLastModifyTime(String lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        public ListOrdersResponseBodyOrdersOrder setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public ListOrdersResponseBodyOrdersOrder setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public ListOrdersResponseBodyOrdersOrder setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public ListOrdersResponseBodyOrdersOrder setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

    }

    public static class ListOrdersResponseBodyOrders extends TeaModel {
        @NameInMap("Order")
        public java.util.List<ListOrdersResponseBodyOrdersOrder> order;

        public static ListOrdersResponseBodyOrders build(java.util.Map<String, ?> map) throws Exception {
            ListOrdersResponseBodyOrders self = new ListOrdersResponseBodyOrders();
            return TeaModel.build(map, self);
        }

        public ListOrdersResponseBodyOrders setOrder(java.util.List<ListOrdersResponseBodyOrdersOrder> order) {
            this.order = order;
            return this;
        }
        public java.util.List<ListOrdersResponseBodyOrdersOrder> getOrder() {
            return this.order;
        }

    }

}
