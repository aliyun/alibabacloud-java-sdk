// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListRecentChangeOrderResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ChangeOrderList")
    public ListRecentChangeOrderResponseBodyChangeOrderList changeOrderList;

    @NameInMap("Code")
    public Integer code;

    public static ListRecentChangeOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecentChangeOrderResponseBody self = new ListRecentChangeOrderResponseBody();
        return TeaModel.build(map, self);
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

    public static class ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("ChangeOrderDescription")
        public String changeOrderDescription;

        @NameInMap("Source")
        public String source;

        @NameInMap("CreateUserId")
        public String createUserId;

        @NameInMap("BatchCount")
        public Integer batchCount;

        @NameInMap("CoTypeCode")
        public String coTypeCode;

        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        @NameInMap("BatchType")
        public String batchType;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("CoType")
        public String coType;

        @NameInMap("AppId")
        public String appId;

        public static ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder build(java.util.Map<String, ?> map) throws Exception {
            ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder self = new ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder();
            return TeaModel.build(map, self);
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setChangeOrderDescription(String changeOrderDescription) {
            this.changeOrderDescription = changeOrderDescription;
            return this;
        }
        public String getChangeOrderDescription() {
            return this.changeOrderDescription;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setBatchCount(Integer batchCount) {
            this.batchCount = batchCount;
            return this;
        }
        public Integer getBatchCount() {
            return this.batchCount;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setCoTypeCode(String coTypeCode) {
            this.coTypeCode = coTypeCode;
            return this;
        }
        public String getCoTypeCode() {
            return this.coTypeCode;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setBatchType(String batchType) {
            this.batchType = batchType;
            return this;
        }
        public String getBatchType() {
            return this.batchType;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setCoType(String coType) {
            this.coType = coType;
            return this;
        }
        public String getCoType() {
            return this.coType;
        }

        public ListRecentChangeOrderResponseBodyChangeOrderListChangeOrder setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
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
