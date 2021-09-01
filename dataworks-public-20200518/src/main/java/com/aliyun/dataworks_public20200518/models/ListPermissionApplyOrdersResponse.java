// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListPermissionApplyOrdersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ApplyOrders")
    @Validation(required = true)
    public ListPermissionApplyOrdersResponseApplyOrders applyOrders;

    public static ListPermissionApplyOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionApplyOrdersResponse self = new ListPermissionApplyOrdersResponse();
        return TeaModel.build(map, self);
    }

    public ListPermissionApplyOrdersResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPermissionApplyOrdersResponse setApplyOrders(ListPermissionApplyOrdersResponseApplyOrders applyOrders) {
        this.applyOrders = applyOrders;
        return this;
    }
    public ListPermissionApplyOrdersResponseApplyOrders getApplyOrders() {
        return this.applyOrders;
    }

    public static class ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContentProjectMetaObjectMetaList extends TeaModel {
        @NameInMap("ObjectName")
        @Validation(required = true)
        public String objectName;

        @NameInMap("Actions")
        @Validation(required = true)
        public java.util.List<String> actions;

        public static ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContentProjectMetaObjectMetaList build(java.util.Map<String, ?> map) throws Exception {
            ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContentProjectMetaObjectMetaList self = new ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContentProjectMetaObjectMetaList();
            return TeaModel.build(map, self);
        }

        public ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContentProjectMetaObjectMetaList setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContentProjectMetaObjectMetaList setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

    }

    public static class ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContentProjectMeta extends TeaModel {
        @NameInMap("WorkspaceName")
        @Validation(required = true)
        public String workspaceName;

        @NameInMap("ObjectMetaList")
        @Validation(required = true)
        public java.util.List<ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContentProjectMetaObjectMetaList> objectMetaList;

        public static ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContentProjectMeta build(java.util.Map<String, ?> map) throws Exception {
            ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContentProjectMeta self = new ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContentProjectMeta();
            return TeaModel.build(map, self);
        }

        public ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContentProjectMeta setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContentProjectMeta setObjectMetaList(java.util.List<ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContentProjectMetaObjectMetaList> objectMetaList) {
            this.objectMetaList = objectMetaList;
            return this;
        }
        public java.util.List<ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContentProjectMetaObjectMetaList> getObjectMetaList() {
            return this.objectMetaList;
        }

    }

    public static class ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContent extends TeaModel {
        @NameInMap("ApplyReason")
        @Validation(required = true)
        public String applyReason;

        @NameInMap("OrderType")
        @Validation(required = true)
        public Integer orderType;

        @NameInMap("ProjectMeta")
        @Validation(required = true)
        public ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContentProjectMeta projectMeta;

        public static ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContent build(java.util.Map<String, ?> map) throws Exception {
            ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContent self = new ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContent();
            return TeaModel.build(map, self);
        }

        public ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContent setApplyReason(String applyReason) {
            this.applyReason = applyReason;
            return this;
        }
        public String getApplyReason() {
            return this.applyReason;
        }

        public ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContent setOrderType(Integer orderType) {
            this.orderType = orderType;
            return this;
        }
        public Integer getOrderType() {
            return this.orderType;
        }

        public ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContent setProjectMeta(ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContentProjectMeta projectMeta) {
            this.projectMeta = projectMeta;
            return this;
        }
        public ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContentProjectMeta getProjectMeta() {
            return this.projectMeta;
        }

    }

    public static class ListPermissionApplyOrdersResponseApplyOrdersApplyOrder extends TeaModel {
        @NameInMap("FlowId")
        @Validation(required = true)
        public String flowId;

        @NameInMap("ApplyBaseId")
        @Validation(required = true)
        public String applyBaseId;

        @NameInMap("ApplyTimestamp")
        @Validation(required = true)
        public Long applyTimestamp;

        @NameInMap("FlowStatus")
        @Validation(required = true)
        public Integer flowStatus;

        @NameInMap("ApproveContent")
        @Validation(required = true)
        public ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContent approveContent;

        public static ListPermissionApplyOrdersResponseApplyOrdersApplyOrder build(java.util.Map<String, ?> map) throws Exception {
            ListPermissionApplyOrdersResponseApplyOrdersApplyOrder self = new ListPermissionApplyOrdersResponseApplyOrdersApplyOrder();
            return TeaModel.build(map, self);
        }

        public ListPermissionApplyOrdersResponseApplyOrdersApplyOrder setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListPermissionApplyOrdersResponseApplyOrdersApplyOrder setApplyBaseId(String applyBaseId) {
            this.applyBaseId = applyBaseId;
            return this;
        }
        public String getApplyBaseId() {
            return this.applyBaseId;
        }

        public ListPermissionApplyOrdersResponseApplyOrdersApplyOrder setApplyTimestamp(Long applyTimestamp) {
            this.applyTimestamp = applyTimestamp;
            return this;
        }
        public Long getApplyTimestamp() {
            return this.applyTimestamp;
        }

        public ListPermissionApplyOrdersResponseApplyOrdersApplyOrder setFlowStatus(Integer flowStatus) {
            this.flowStatus = flowStatus;
            return this;
        }
        public Integer getFlowStatus() {
            return this.flowStatus;
        }

        public ListPermissionApplyOrdersResponseApplyOrdersApplyOrder setApproveContent(ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContent approveContent) {
            this.approveContent = approveContent;
            return this;
        }
        public ListPermissionApplyOrdersResponseApplyOrdersApplyOrderApproveContent getApproveContent() {
            return this.approveContent;
        }

    }

    public static class ListPermissionApplyOrdersResponseApplyOrders extends TeaModel {
        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("ApplyOrder")
        @Validation(required = true)
        public java.util.List<ListPermissionApplyOrdersResponseApplyOrdersApplyOrder> applyOrder;

        public static ListPermissionApplyOrdersResponseApplyOrders build(java.util.Map<String, ?> map) throws Exception {
            ListPermissionApplyOrdersResponseApplyOrders self = new ListPermissionApplyOrdersResponseApplyOrders();
            return TeaModel.build(map, self);
        }

        public ListPermissionApplyOrdersResponseApplyOrders setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPermissionApplyOrdersResponseApplyOrders setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListPermissionApplyOrdersResponseApplyOrders setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListPermissionApplyOrdersResponseApplyOrders setApplyOrder(java.util.List<ListPermissionApplyOrdersResponseApplyOrdersApplyOrder> applyOrder) {
            this.applyOrder = applyOrder;
            return this;
        }
        public java.util.List<ListPermissionApplyOrdersResponseApplyOrdersApplyOrder> getApplyOrder() {
            return this.applyOrder;
        }

    }

}
