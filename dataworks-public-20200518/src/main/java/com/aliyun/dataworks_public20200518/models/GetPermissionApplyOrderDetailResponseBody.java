// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetPermissionApplyOrderDetailResponseBody extends TeaModel {
    @NameInMap("ApplyOrderDetail")
    public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetail applyOrderDetail;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPermissionApplyOrderDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPermissionApplyOrderDetailResponseBody self = new GetPermissionApplyOrderDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPermissionApplyOrderDetailResponseBody setApplyOrderDetail(GetPermissionApplyOrderDetailResponseBodyApplyOrderDetail applyOrderDetail) {
        this.applyOrderDetail = applyOrderDetail;
        return this;
    }
    public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetail getApplyOrderDetail() {
        return this.applyOrderDetail;
    }

    public GetPermissionApplyOrderDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveAccountList extends TeaModel {
        @NameInMap("BaseId")
        public String baseId;

        public static GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveAccountList build(java.util.Map<String, ?> map) throws Exception {
            GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveAccountList self = new GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveAccountList();
            return TeaModel.build(map, self);
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveAccountList setBaseId(String baseId) {
            this.baseId = baseId;
            return this;
        }
        public String getBaseId() {
            return this.baseId;
        }

    }

    public static class GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList extends TeaModel {
        @NameInMap("ColumnComment")
        public String columnComment;

        @NameInMap("ColumnName")
        public String columnName;

        public static GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList build(java.util.Map<String, ?> map) throws Exception {
            GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList self = new GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList();
            return TeaModel.build(map, self);
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList setColumnComment(String columnComment) {
            this.columnComment = columnComment;
            return this;
        }
        public String getColumnComment() {
            return this.columnComment;
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

    }

    public static class GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaList extends TeaModel {
        @NameInMap("ColumnMetaList")
        public java.util.List<GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList> columnMetaList;

        @NameInMap("ObjectName")
        public String objectName;

        public static GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaList build(java.util.Map<String, ?> map) throws Exception {
            GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaList self = new GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaList();
            return TeaModel.build(map, self);
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaList setColumnMetaList(java.util.List<GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList> columnMetaList) {
            this.columnMetaList = columnMetaList;
            return this;
        }
        public java.util.List<GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList> getColumnMetaList() {
            return this.columnMetaList;
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaList setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

    }

    public static class GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMeta extends TeaModel {
        @NameInMap("MaxComputeProjectName")
        public String maxComputeProjectName;

        @NameInMap("ObjectMetaList")
        public java.util.List<GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaList> objectMetaList;

        @NameInMap("WorkspaceId")
        public Integer workspaceId;

        public static GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMeta build(java.util.Map<String, ?> map) throws Exception {
            GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMeta self = new GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMeta();
            return TeaModel.build(map, self);
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMeta setMaxComputeProjectName(String maxComputeProjectName) {
            this.maxComputeProjectName = maxComputeProjectName;
            return this;
        }
        public String getMaxComputeProjectName() {
            return this.maxComputeProjectName;
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMeta setObjectMetaList(java.util.List<GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaList> objectMetaList) {
            this.objectMetaList = objectMetaList;
            return this;
        }
        public java.util.List<GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaList> getObjectMetaList() {
            return this.objectMetaList;
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMeta setWorkspaceId(Integer workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public Integer getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContent extends TeaModel {
        @NameInMap("ApplyReason")
        public String applyReason;

        @NameInMap("Deadline")
        public Long deadline;

        @NameInMap("OrderType")
        public Integer orderType;

        @NameInMap("ProjectMeta")
        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMeta projectMeta;

        public static GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContent build(java.util.Map<String, ?> map) throws Exception {
            GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContent self = new GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContent();
            return TeaModel.build(map, self);
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContent setApplyReason(String applyReason) {
            this.applyReason = applyReason;
            return this;
        }
        public String getApplyReason() {
            return this.applyReason;
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContent setDeadline(Long deadline) {
            this.deadline = deadline;
            return this;
        }
        public Long getDeadline() {
            return this.deadline;
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContent setOrderType(Integer orderType) {
            this.orderType = orderType;
            return this;
        }
        public Integer getOrderType() {
            return this.orderType;
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContent setProjectMeta(GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMeta projectMeta) {
            this.projectMeta = projectMeta;
            return this;
        }
        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMeta getProjectMeta() {
            return this.projectMeta;
        }

    }

    public static class GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailGranteeObjectList extends TeaModel {
        @NameInMap("GranteeId")
        public String granteeId;

        @NameInMap("GranteeName")
        public String granteeName;

        @NameInMap("GranteeType")
        public Integer granteeType;

        @NameInMap("GranteeTypeSub")
        public Integer granteeTypeSub;

        public static GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailGranteeObjectList build(java.util.Map<String, ?> map) throws Exception {
            GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailGranteeObjectList self = new GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailGranteeObjectList();
            return TeaModel.build(map, self);
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailGranteeObjectList setGranteeId(String granteeId) {
            this.granteeId = granteeId;
            return this;
        }
        public String getGranteeId() {
            return this.granteeId;
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailGranteeObjectList setGranteeName(String granteeName) {
            this.granteeName = granteeName;
            return this;
        }
        public String getGranteeName() {
            return this.granteeName;
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailGranteeObjectList setGranteeType(Integer granteeType) {
            this.granteeType = granteeType;
            return this;
        }
        public Integer getGranteeType() {
            return this.granteeType;
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailGranteeObjectList setGranteeTypeSub(Integer granteeTypeSub) {
            this.granteeTypeSub = granteeTypeSub;
            return this;
        }
        public Integer getGranteeTypeSub() {
            return this.granteeTypeSub;
        }

    }

    public static class GetPermissionApplyOrderDetailResponseBodyApplyOrderDetail extends TeaModel {
        @NameInMap("ApplyBaseId")
        public String applyBaseId;

        @NameInMap("ApplyTimestamp")
        public Long applyTimestamp;

        @NameInMap("ApproveAccountList")
        public java.util.List<GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveAccountList> approveAccountList;

        @NameInMap("ApproveContent")
        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContent approveContent;

        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("FlowStatus")
        public Integer flowStatus;

        @NameInMap("GranteeObjectList")
        public java.util.List<GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailGranteeObjectList> granteeObjectList;

        public static GetPermissionApplyOrderDetailResponseBodyApplyOrderDetail build(java.util.Map<String, ?> map) throws Exception {
            GetPermissionApplyOrderDetailResponseBodyApplyOrderDetail self = new GetPermissionApplyOrderDetailResponseBodyApplyOrderDetail();
            return TeaModel.build(map, self);
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetail setApplyBaseId(String applyBaseId) {
            this.applyBaseId = applyBaseId;
            return this;
        }
        public String getApplyBaseId() {
            return this.applyBaseId;
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetail setApplyTimestamp(Long applyTimestamp) {
            this.applyTimestamp = applyTimestamp;
            return this;
        }
        public Long getApplyTimestamp() {
            return this.applyTimestamp;
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetail setApproveAccountList(java.util.List<GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveAccountList> approveAccountList) {
            this.approveAccountList = approveAccountList;
            return this;
        }
        public java.util.List<GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveAccountList> getApproveAccountList() {
            return this.approveAccountList;
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetail setApproveContent(GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContent approveContent) {
            this.approveContent = approveContent;
            return this;
        }
        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContent getApproveContent() {
            return this.approveContent;
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetail setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetail setFlowStatus(Integer flowStatus) {
            this.flowStatus = flowStatus;
            return this;
        }
        public Integer getFlowStatus() {
            return this.flowStatus;
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetail setGranteeObjectList(java.util.List<GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailGranteeObjectList> granteeObjectList) {
            this.granteeObjectList = granteeObjectList;
            return this;
        }
        public java.util.List<GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailGranteeObjectList> getGranteeObjectList() {
            return this.granteeObjectList;
        }

    }

}
