// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetPermissionApplyOrderDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ApplyOrderDetail")
    @Validation(required = true)
    public GetPermissionApplyOrderDetailResponseApplyOrderDetail applyOrderDetail;

    public static GetPermissionApplyOrderDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPermissionApplyOrderDetailResponse self = new GetPermissionApplyOrderDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetPermissionApplyOrderDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPermissionApplyOrderDetailResponse setApplyOrderDetail(GetPermissionApplyOrderDetailResponseApplyOrderDetail applyOrderDetail) {
        this.applyOrderDetail = applyOrderDetail;
        return this;
    }
    public GetPermissionApplyOrderDetailResponseApplyOrderDetail getApplyOrderDetail() {
        return this.applyOrderDetail;
    }

    public static class GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveAccountList extends TeaModel {
        @NameInMap("BaseId")
        @Validation(required = true)
        public String baseId;

        public static GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveAccountList build(java.util.Map<String, ?> map) throws Exception {
            GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveAccountList self = new GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveAccountList();
            return TeaModel.build(map, self);
        }

        public GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveAccountList setBaseId(String baseId) {
            this.baseId = baseId;
            return this;
        }
        public String getBaseId() {
            return this.baseId;
        }

    }

    public static class GetPermissionApplyOrderDetailResponseApplyOrderDetailGranteeObjectList extends TeaModel {
        @NameInMap("GranteeId")
        @Validation(required = true)
        public String granteeId;

        @NameInMap("GranteeName")
        @Validation(required = true)
        public String granteeName;

        @NameInMap("GranteeType")
        @Validation(required = true)
        public Integer granteeType;

        @NameInMap("GranteeTypeSub")
        @Validation(required = true)
        public Integer granteeTypeSub;

        public static GetPermissionApplyOrderDetailResponseApplyOrderDetailGranteeObjectList build(java.util.Map<String, ?> map) throws Exception {
            GetPermissionApplyOrderDetailResponseApplyOrderDetailGranteeObjectList self = new GetPermissionApplyOrderDetailResponseApplyOrderDetailGranteeObjectList();
            return TeaModel.build(map, self);
        }

        public GetPermissionApplyOrderDetailResponseApplyOrderDetailGranteeObjectList setGranteeId(String granteeId) {
            this.granteeId = granteeId;
            return this;
        }
        public String getGranteeId() {
            return this.granteeId;
        }

        public GetPermissionApplyOrderDetailResponseApplyOrderDetailGranteeObjectList setGranteeName(String granteeName) {
            this.granteeName = granteeName;
            return this;
        }
        public String getGranteeName() {
            return this.granteeName;
        }

        public GetPermissionApplyOrderDetailResponseApplyOrderDetailGranteeObjectList setGranteeType(Integer granteeType) {
            this.granteeType = granteeType;
            return this;
        }
        public Integer getGranteeType() {
            return this.granteeType;
        }

        public GetPermissionApplyOrderDetailResponseApplyOrderDetailGranteeObjectList setGranteeTypeSub(Integer granteeTypeSub) {
            this.granteeTypeSub = granteeTypeSub;
            return this;
        }
        public Integer getGranteeTypeSub() {
            return this.granteeTypeSub;
        }

    }

    public static class GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList extends TeaModel {
        @NameInMap("ColumnComment")
        @Validation(required = true)
        public String columnComment;

        @NameInMap("ColumnName")
        @Validation(required = true)
        public String columnName;

        public static GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList build(java.util.Map<String, ?> map) throws Exception {
            GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList self = new GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList();
            return TeaModel.build(map, self);
        }

        public GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList setColumnComment(String columnComment) {
            this.columnComment = columnComment;
            return this;
        }
        public String getColumnComment() {
            return this.columnComment;
        }

        public GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

    }

    public static class GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMetaObjectMetaList extends TeaModel {
        @NameInMap("ObjectName")
        @Validation(required = true)
        public String objectName;

        @NameInMap("ColumnMetaList")
        @Validation(required = true)
        public java.util.List<GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList> columnMetaList;

        public static GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMetaObjectMetaList build(java.util.Map<String, ?> map) throws Exception {
            GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMetaObjectMetaList self = new GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMetaObjectMetaList();
            return TeaModel.build(map, self);
        }

        public GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMetaObjectMetaList setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMetaObjectMetaList setColumnMetaList(java.util.List<GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList> columnMetaList) {
            this.columnMetaList = columnMetaList;
            return this;
        }
        public java.util.List<GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList> getColumnMetaList() {
            return this.columnMetaList;
        }

    }

    public static class GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMeta extends TeaModel {
        @NameInMap("WorkspaceId")
        @Validation(required = true)
        public Integer workspaceId;

        @NameInMap("MaxComputeProjectName")
        @Validation(required = true)
        public String maxComputeProjectName;

        @NameInMap("ObjectMetaList")
        @Validation(required = true)
        public java.util.List<GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMetaObjectMetaList> objectMetaList;

        public static GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMeta build(java.util.Map<String, ?> map) throws Exception {
            GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMeta self = new GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMeta();
            return TeaModel.build(map, self);
        }

        public GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMeta setWorkspaceId(Integer workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public Integer getWorkspaceId() {
            return this.workspaceId;
        }

        public GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMeta setMaxComputeProjectName(String maxComputeProjectName) {
            this.maxComputeProjectName = maxComputeProjectName;
            return this;
        }
        public String getMaxComputeProjectName() {
            return this.maxComputeProjectName;
        }

        public GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMeta setObjectMetaList(java.util.List<GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMetaObjectMetaList> objectMetaList) {
            this.objectMetaList = objectMetaList;
            return this;
        }
        public java.util.List<GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMetaObjectMetaList> getObjectMetaList() {
            return this.objectMetaList;
        }

    }

    public static class GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContent extends TeaModel {
        @NameInMap("ApplyReason")
        @Validation(required = true)
        public String applyReason;

        @NameInMap("Deadline")
        @Validation(required = true)
        public Long deadline;

        @NameInMap("OrderType")
        @Validation(required = true)
        public Integer orderType;

        @NameInMap("ProjectMeta")
        @Validation(required = true)
        public GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMeta projectMeta;

        public static GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContent build(java.util.Map<String, ?> map) throws Exception {
            GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContent self = new GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContent();
            return TeaModel.build(map, self);
        }

        public GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContent setApplyReason(String applyReason) {
            this.applyReason = applyReason;
            return this;
        }
        public String getApplyReason() {
            return this.applyReason;
        }

        public GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContent setDeadline(Long deadline) {
            this.deadline = deadline;
            return this;
        }
        public Long getDeadline() {
            return this.deadline;
        }

        public GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContent setOrderType(Integer orderType) {
            this.orderType = orderType;
            return this;
        }
        public Integer getOrderType() {
            return this.orderType;
        }

        public GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContent setProjectMeta(GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMeta projectMeta) {
            this.projectMeta = projectMeta;
            return this;
        }
        public GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContentProjectMeta getProjectMeta() {
            return this.projectMeta;
        }

    }

    public static class GetPermissionApplyOrderDetailResponseApplyOrderDetail extends TeaModel {
        @NameInMap("ApplyBaseId")
        @Validation(required = true)
        public String applyBaseId;

        @NameInMap("ApplyTimestamp")
        @Validation(required = true)
        public Long applyTimestamp;

        @NameInMap("FlowId")
        @Validation(required = true)
        public String flowId;

        @NameInMap("FlowStatus")
        @Validation(required = true)
        public Integer flowStatus;

        @NameInMap("ApproveAccountList")
        @Validation(required = true)
        public java.util.List<GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveAccountList> approveAccountList;

        @NameInMap("GranteeObjectList")
        @Validation(required = true)
        public java.util.List<GetPermissionApplyOrderDetailResponseApplyOrderDetailGranteeObjectList> granteeObjectList;

        @NameInMap("ApproveContent")
        @Validation(required = true)
        public GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContent approveContent;

        public static GetPermissionApplyOrderDetailResponseApplyOrderDetail build(java.util.Map<String, ?> map) throws Exception {
            GetPermissionApplyOrderDetailResponseApplyOrderDetail self = new GetPermissionApplyOrderDetailResponseApplyOrderDetail();
            return TeaModel.build(map, self);
        }

        public GetPermissionApplyOrderDetailResponseApplyOrderDetail setApplyBaseId(String applyBaseId) {
            this.applyBaseId = applyBaseId;
            return this;
        }
        public String getApplyBaseId() {
            return this.applyBaseId;
        }

        public GetPermissionApplyOrderDetailResponseApplyOrderDetail setApplyTimestamp(Long applyTimestamp) {
            this.applyTimestamp = applyTimestamp;
            return this;
        }
        public Long getApplyTimestamp() {
            return this.applyTimestamp;
        }

        public GetPermissionApplyOrderDetailResponseApplyOrderDetail setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public GetPermissionApplyOrderDetailResponseApplyOrderDetail setFlowStatus(Integer flowStatus) {
            this.flowStatus = flowStatus;
            return this;
        }
        public Integer getFlowStatus() {
            return this.flowStatus;
        }

        public GetPermissionApplyOrderDetailResponseApplyOrderDetail setApproveAccountList(java.util.List<GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveAccountList> approveAccountList) {
            this.approveAccountList = approveAccountList;
            return this;
        }
        public java.util.List<GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveAccountList> getApproveAccountList() {
            return this.approveAccountList;
        }

        public GetPermissionApplyOrderDetailResponseApplyOrderDetail setGranteeObjectList(java.util.List<GetPermissionApplyOrderDetailResponseApplyOrderDetailGranteeObjectList> granteeObjectList) {
            this.granteeObjectList = granteeObjectList;
            return this;
        }
        public java.util.List<GetPermissionApplyOrderDetailResponseApplyOrderDetailGranteeObjectList> getGranteeObjectList() {
            return this.granteeObjectList;
        }

        public GetPermissionApplyOrderDetailResponseApplyOrderDetail setApproveContent(GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContent approveContent) {
            this.approveContent = approveContent;
            return this;
        }
        public GetPermissionApplyOrderDetailResponseApplyOrderDetailApproveContent getApproveContent() {
            return this.approveContent;
        }

    }

}
