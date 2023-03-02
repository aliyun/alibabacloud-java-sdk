// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListPermissionApplyOrdersResponseBody extends TeaModel {
    /**
     * <p>The query results returned by page.</p>
     */
    @NameInMap("ApplyOrders")
    public ListPermissionApplyOrdersResponseBodyApplyOrders applyOrders;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPermissionApplyOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionApplyOrdersResponseBody self = new ListPermissionApplyOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPermissionApplyOrdersResponseBody setApplyOrders(ListPermissionApplyOrdersResponseBodyApplyOrders applyOrders) {
        this.applyOrders = applyOrders;
        return this;
    }
    public ListPermissionApplyOrdersResponseBodyApplyOrders getApplyOrders() {
        return this.applyOrders;
    }

    public ListPermissionApplyOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContentProjectMetaObjectMetaList extends TeaModel {
        /**
         * <p>The permission that you wanted to request. If you wanted to request multiple permissions at the same time, separate them with commas (,).</p>
         * <br>
         * <p>You can request only the following permissions: Select, Describe, Drop, Alter, Update, and Download.</p>
         */
        @NameInMap("Actions")
        public java.util.List<String> actions;

        /**
         * <p>The name of the table on which you requested permissions.</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        public static ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContentProjectMetaObjectMetaList build(java.util.Map<String, ?> map) throws Exception {
            ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContentProjectMetaObjectMetaList self = new ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContentProjectMetaObjectMetaList();
            return TeaModel.build(map, self);
        }

        public ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContentProjectMetaObjectMetaList setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContentProjectMetaObjectMetaList setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

    }

    public static class ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContentProjectMeta extends TeaModel {
        /**
         * <p>The information about the object on which you requested permissions.</p>
         */
        @NameInMap("ObjectMetaList")
        public java.util.List<ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContentProjectMetaObjectMetaList> objectMetaList;

        /**
         * <p>The name of the DataWorks workspace that was associated with the MaxCompute project in which you requested permissions on a table.</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContentProjectMeta build(java.util.Map<String, ?> map) throws Exception {
            ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContentProjectMeta self = new ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContentProjectMeta();
            return TeaModel.build(map, self);
        }

        public ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContentProjectMeta setObjectMetaList(java.util.List<ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContentProjectMetaObjectMetaList> objectMetaList) {
            this.objectMetaList = objectMetaList;
            return this;
        }
        public java.util.List<ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContentProjectMetaObjectMetaList> getObjectMetaList() {
            return this.objectMetaList;
        }

        public ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContentProjectMeta setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

    public static class ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContent extends TeaModel {
        /**
         * <p>The reason for your request. The administrator determines whether to approve the request based on the reason.</p>
         */
        @NameInMap("ApplyReason")
        public String applyReason;

        /**
         * <p>The type of the permission request order. The parameter value is 1 and cannot be changed. This value indicates ACL-based authorization.</p>
         */
        @NameInMap("OrderType")
        public Integer orderType;

        /**
         * <p>The content of the object on which you requested permissions.</p>
         */
        @NameInMap("ProjectMeta")
        public ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContentProjectMeta projectMeta;

        public static ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContent build(java.util.Map<String, ?> map) throws Exception {
            ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContent self = new ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContent();
            return TeaModel.build(map, self);
        }

        public ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContent setApplyReason(String applyReason) {
            this.applyReason = applyReason;
            return this;
        }
        public String getApplyReason() {
            return this.applyReason;
        }

        public ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContent setOrderType(Integer orderType) {
            this.orderType = orderType;
            return this;
        }
        public Integer getOrderType() {
            return this.orderType;
        }

        public ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContent setProjectMeta(ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContentProjectMeta projectMeta) {
            this.projectMeta = projectMeta;
            return this;
        }
        public ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContentProjectMeta getProjectMeta() {
            return this.projectMeta;
        }

    }

    public static class ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrder extends TeaModel {
        /**
         * <p>The unique ID of the Alibaba Cloud account that was used to submit the permission request order.</p>
         */
        @NameInMap("ApplyBaseId")
        public String applyBaseId;

        /**
         * <p>The time when the permission request order was submitted. The parameter value is a UNIX timestamp.</p>
         */
        @NameInMap("ApplyTimestamp")
        public Long applyTimestamp;

        /**
         * <p>The content of the permission request order.</p>
         */
        @NameInMap("ApproveContent")
        public ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContent approveContent;

        /**
         * <p>The ID of the permission request order.</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>The status of the permission request order. Valid values:</p>
         * <br>
         * <p>*   1: pending approval</p>
         * <p>*   2: approved and authorized</p>
         * <p>*   3: approved but authorization failed</p>
         * <p>*   4: rejected</p>
         */
        @NameInMap("FlowStatus")
        public Integer flowStatus;

        public static ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrder build(java.util.Map<String, ?> map) throws Exception {
            ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrder self = new ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrder();
            return TeaModel.build(map, self);
        }

        public ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrder setApplyBaseId(String applyBaseId) {
            this.applyBaseId = applyBaseId;
            return this;
        }
        public String getApplyBaseId() {
            return this.applyBaseId;
        }

        public ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrder setApplyTimestamp(Long applyTimestamp) {
            this.applyTimestamp = applyTimestamp;
            return this;
        }
        public Long getApplyTimestamp() {
            return this.applyTimestamp;
        }

        public ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrder setApproveContent(ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContent approveContent) {
            this.approveContent = approveContent;
            return this;
        }
        public ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContent getApproveContent() {
            return this.approveContent;
        }

        public ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrder setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrder setFlowStatus(Integer flowStatus) {
            this.flowStatus = flowStatus;
            return this;
        }
        public Integer getFlowStatus() {
            return this.flowStatus;
        }

    }

    public static class ListPermissionApplyOrdersResponseBodyApplyOrders extends TeaModel {
        /**
         * <p>The list of the permission request orders.</p>
         */
        @NameInMap("ApplyOrder")
        public java.util.List<ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrder> applyOrder;

        /**
         * <p>The number of the returned page.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of permission request orders returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListPermissionApplyOrdersResponseBodyApplyOrders build(java.util.Map<String, ?> map) throws Exception {
            ListPermissionApplyOrdersResponseBodyApplyOrders self = new ListPermissionApplyOrdersResponseBodyApplyOrders();
            return TeaModel.build(map, self);
        }

        public ListPermissionApplyOrdersResponseBodyApplyOrders setApplyOrder(java.util.List<ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrder> applyOrder) {
            this.applyOrder = applyOrder;
            return this;
        }
        public java.util.List<ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrder> getApplyOrder() {
            return this.applyOrder;
        }

        public ListPermissionApplyOrdersResponseBodyApplyOrders setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListPermissionApplyOrdersResponseBodyApplyOrders setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPermissionApplyOrdersResponseBodyApplyOrders setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
