// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListPermissionApplyOrdersResponseBody extends TeaModel {
    @NameInMap("ApplyOrders")
    public ListPermissionApplyOrdersResponseBodyApplyOrders applyOrders;

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
        @NameInMap("Actions")
        public java.util.List<String> actions;

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
        @NameInMap("ObjectMetaList")
        public java.util.List<ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContentProjectMetaObjectMetaList> objectMetaList;

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
        @NameInMap("ApplyReason")
        public String applyReason;

        @NameInMap("OrderType")
        public Integer orderType;

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
        @NameInMap("ApplyBaseId")
        public String applyBaseId;

        @NameInMap("ApplyTimestamp")
        public Long applyTimestamp;

        @NameInMap("ApproveContent")
        public ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContent approveContent;

        @NameInMap("FlowId")
        public String flowId;

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
        @NameInMap("ApplyOrder")
        public java.util.List<ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrder> applyOrder;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

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
