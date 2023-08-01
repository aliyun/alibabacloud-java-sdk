// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListRecentChangeOrderResponseBody extends TeaModel {
    /**
     * <p>The information about change processes.</p>
     */
    @NameInMap("ChangeOrderList")
    public ListRecentChangeOrderResponseBodyChangeOrderList changeOrderList;

    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListRecentChangeOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecentChangeOrderResponseBody self = new ListRecentChangeOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecentChangeOrderResponseBody setChangeOrderList(ListRecentChangeOrderResponseBodyChangeOrderList changeOrderList) {
        this.changeOrderList = changeOrderList;
        return this;
    }
    public ListRecentChangeOrderResponseBodyChangeOrderList getChangeOrderList() {
        return this.changeOrderList;
    }

    public ListRecentChangeOrderResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListRecentChangeOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRecentChangeOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The number of batches for the change. Valid values: 1 to 5.</p>
         */
        @NameInMap("BatchCount")
        public Integer batchCount;

        /**
         * <p>The way in which the next batch is triggered during a phased release. Valid values:</p>
         * <br>
         * <p>*   Automatic</p>
         * <p>*   Manual</p>
         */
        @NameInMap("BatchType")
        public String batchType;

        /**
         * <p>The description of the change process.</p>
         */
        @NameInMap("ChangeOrderDescription")
        public String changeOrderDescription;

        /**
         * <p>The unique ID of the change process.</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        /**
         * <p>The type of the change process.</p>
         */
        @NameInMap("CoType")
        public String coType;

        /**
         * <p>The type of the change process.</p>
         */
        @NameInMap("CoTypeCode")
        public String coTypeCode;

        /**
         * <p>The time when the change process was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The user who created the change process.</p>
         */
        @NameInMap("CreateUserId")
        public String createUserId;

        /**
         * <p>The time when the change process ended.</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The ID of the application instance group on which the change was performed.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The source of the change. Valid values:</p>
         * <br>
         * <p>*   console: the Enterprise Distributed Application Service (EDAS) console</p>
         * <p>*   pop: the POP API or tool</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The state of the change process. Valid values:</p>
         * <br>
         * <p>*   0: ready to start execution</p>
         * <p>*   1: in progress</p>
         * <p>*   2: successful</p>
         * <p>*   3: failed</p>
         * <p>*   6: terminated</p>
         * <p>*   8: waiting for manual confirmation (You can see the state when you manually confirm the execution of the next batch of the change.)</p>
         * <p>*   9: waiting for automatic execution</p>
         * <p>*   10: failed due to a system error</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the user who created the change process.</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder build(java.util.Map<String, ?> map) throws Exception {
            ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder self = new ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder();
            return TeaModel.build(map, self);
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setBatchCount(Integer batchCount) {
            this.batchCount = batchCount;
            return this;
        }
        public Integer getBatchCount() {
            return this.batchCount;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setBatchType(String batchType) {
            this.batchType = batchType;
            return this;
        }
        public String getBatchType() {
            return this.batchType;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setChangeOrderDescription(String changeOrderDescription) {
            this.changeOrderDescription = changeOrderDescription;
            return this;
        }
        public String getChangeOrderDescription() {
            return this.changeOrderDescription;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setCoType(String coType) {
            this.coType = coType;
            return this;
        }
        public String getCoType() {
            return this.coType;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setCoTypeCode(String coTypeCode) {
            this.coTypeCode = coTypeCode;
            return this;
        }
        public String getCoTypeCode() {
            return this.coTypeCode;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListRecentChangeOrderResponseBodyChangeOrderList extends TeaModel {
        @NameInMap("ChangeOrder")
        public java.util.List<ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder> changeOrder;

        public static ListRecentChangeOrderResponseBodyChangeOrderList build(java.util.Map<String, ?> map) throws Exception {
            ListRecentChangeOrderResponseBodyChangeOrderList self = new ListRecentChangeOrderResponseBodyChangeOrderList();
            return TeaModel.build(map, self);
        }

        public ListRecentChangeOrderResponseBodyChangeOrderList setChangeOrder(java.util.List<ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder> changeOrder) {
            this.changeOrder = changeOrder;
            return this;
        }
        public java.util.List<ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder> getChangeOrder() {
            return this.changeOrder;
        }

    }

}
