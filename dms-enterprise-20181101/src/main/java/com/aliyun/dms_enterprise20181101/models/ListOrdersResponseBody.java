// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListOrdersResponseBody extends TeaModel {
    // The error code.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The details about the tickets.
    @NameInMap("Orders")
    public ListOrdersResponseBodyOrders orders;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // - **true**: The request was successful.
    // - **false**: The request failed.
    @NameInMap("Success")
    public Boolean success;

    // The total number of entries that are returned.
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
        // The remarks of the ticket.
        @NameInMap("Comment")
        public String comment;

        // The user who submitted the ticket.
        @NameInMap("Committer")
        public String committer;

        // The ID of the user who submitted the ticket.
        @NameInMap("CommitterId")
        public Long committerId;

        // The time when the ticket was created.
        @NameInMap("CreateTime")
        public String createTime;

        // The time when the ticket was last modified.
        @NameInMap("LastModifyTime")
        public String lastModifyTime;

        // The ID of the ticket.
        @NameInMap("OrderId")
        public Long orderId;

        // The type of the ticket.
        @NameInMap("PluginType")
        public String pluginType;

        // The status code of the ticket. Valid values:
        // 
        // *   **fail**: The ticket fails to be executed.
        // *   **toaudit**: The ticket is waiting for approval.
        // *   **cancel**: The ticket is cancelled.
        // *   **processing**: The ticket is being executed.
        // *   **approved**: The ticket is approved.
        // *   **reject**: The ticket is rejected.
        // *   **success**: The ticket is executed.
        // *   **closed**: The ticket is closed.
        @NameInMap("StatusCode")
        public String statusCode;

        // The status description of the ticket.
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
