// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListPermissionApplyOrdersResponseBody extends TeaModel {
    /**
     * <p>The paginated query results of permission application orders.</p>
     */
    @NameInMap("ApplyOrders")
    public ListPermissionApplyOrdersResponseBodyApplyOrders applyOrders;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1ec92159376****</p>
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
         * <p>The action types.</p>
         */
        @NameInMap("Actions")
        public java.util.List<String> actions;

        /**
         * <p>The name of the applied table.</p>
         * 
         * <strong>example:</strong>
         * <p>aTableName</p>
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
         * <p>The information about the applied objects.</p>
         */
        @NameInMap("ObjectMetaList")
        public java.util.List<ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContentProjectMetaObjectMetaList> objectMetaList;

        /**
         * <p>The name of the DataWorks workspace to which the MaxCompute project with the requested permissions belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>aWorkspaceName</p>
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
         * <p>The reason for the application, used by the administrator for evaluation and approval.</p>
         * 
         * <strong>example:</strong>
         * <p>I need to use this table</p>
         */
        @NameInMap("ApplyReason")
        public String applyReason;

        /**
         * <p>The application order type. Currently, only the value 1 is supported, indicating an object ACL permission application.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OrderType")
        public Integer orderType;

        /**
         * <p>The content of the applied object.</p>
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
         * <p>The Alibaba Cloud user UID that submitted the application order.</p>
         * 
         * <strong>example:</strong>
         * <p>267842600408993176</p>
         */
        @NameInMap("ApplyBaseId")
        public String applyBaseId;

        /**
         * <p>The submission time of the application order, displayed as a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1615284086000</p>
         */
        @NameInMap("ApplyTimestamp")
        public Long applyTimestamp;

        /**
         * <p>The content of the application order.</p>
         */
        @NameInMap("ApproveContent")
        public ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrderApproveContent approveContent;

        /**
         * <p>The final approval comment.</p>
         * 
         * <strong>example:</strong>
         * <p>agree</p>
         */
        @NameInMap("FinishApprovalComment")
        public String finishApprovalComment;

        /**
         * <p>The final approval completion time, displayed as a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1757496687000</p>
         */
        @NameInMap("FinishApprovalTimestamp")
        public Long finishApprovalTimestamp;

        /**
         * <p>The application order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ad8da78d-8135-455e-9486-27cf213fc140</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>The status of the application order. Valid values:</p>
         * <ul>
         * <li>1: Pending approval.</li>
         * <li>2: Approved, authorization succeeded.</li>
         * <li>3: Approved, authorization failed.</li>
         * <li>4: Rejected.</li>
         * <li>5: Withdrawn.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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

        public ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrder setFinishApprovalComment(String finishApprovalComment) {
            this.finishApprovalComment = finishApprovalComment;
            return this;
        }
        public String getFinishApprovalComment() {
            return this.finishApprovalComment;
        }

        public ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrder setFinishApprovalTimestamp(Long finishApprovalTimestamp) {
            this.finishApprovalTimestamp = finishApprovalTimestamp;
            return this;
        }
        public Long getFinishApprovalTimestamp() {
            return this.finishApprovalTimestamp;
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
         * <p>The list of permission application orders.</p>
         */
        @NameInMap("ApplyOrder")
        public java.util.List<ListPermissionApplyOrdersResponseBodyApplyOrdersApplyOrder> applyOrder;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of permission application orders returned.</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
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
