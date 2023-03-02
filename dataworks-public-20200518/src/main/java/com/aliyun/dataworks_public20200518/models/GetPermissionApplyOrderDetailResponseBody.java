// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetPermissionApplyOrderDetailResponseBody extends TeaModel {
    /**
     * <p>Details about the permission request order.</p>
     */
    @NameInMap("ApplyOrderDetail")
    public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetail applyOrderDetail;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The unique ID of the Alibaba Cloud account that is used to approve the permission request order.</p>
         */
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
        /**
         * <p>The description of the column on which you request permissions.</p>
         */
        @NameInMap("ColumnComment")
        public String columnComment;

        /**
         * <p>The name of the column on which you request permissions.</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("SecurityLevel")
        public String securityLevel;

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

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList setSecurityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public String getSecurityLevel() {
            return this.securityLevel;
        }

    }

    public static class GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaList extends TeaModel {
        /**
         * <p>The information about the column fields in the object on which you request permissions.</p>
         */
        @NameInMap("ColumnMetaList")
        public java.util.List<GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList> columnMetaList;

        /**
         * <p>The name of the table on which you request permissions.</p>
         */
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
        /**
         * <p>The MaxCompute project to which the object on which you request permissions belongs.</p>
         */
        @NameInMap("MaxComputeProjectName")
        public String maxComputeProjectName;

        /**
         * <p>Details about the object on which you request permissions.</p>
         */
        @NameInMap("ObjectMetaList")
        public java.util.List<GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaList> objectMetaList;

        /**
         * <p>The ID of the DataWorks workspace that is associated with the object on which you request permissions.</p>
         */
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
        /**
         * <p>The reason for your request. The administrator decides whether to approve the request based on the request reason.</p>
         */
        @NameInMap("ApplyReason")
        public String applyReason;

        /**
         * <p>The expiration time of the permissions that you requested. The parameter value is a UNIX timestamp.</p>
         * <br>
         * <p>If LabelSecurity is disabled in the MaxCompute project, or the security level of fields in the MaxCompute table on which you request permissions is 0 or is less than or equal to the security level of the Alibaba Cloud account for which you request permissions, you can request only permanent permissions.</p>
         */
        @NameInMap("Deadline")
        public Long deadline;

        /**
         * <p>The type of the permission request order. The parameter value is 1 and cannot be changed. 1 indicates that ACL-based authorization is requested.</p>
         */
        @NameInMap("OrderType")
        public Integer orderType;

        /**
         * <p>The information about the project and workspace that are associated with the object on which you requested permissions.</p>
         */
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
        /**
         * <p>The unique ID of the account that is used to request permissions.</p>
         */
        @NameInMap("GranteeId")
        public String granteeId;

        /**
         * <p>The name of the account that is used to request permissions. The name is in the same format as that of the account used to access the MaxCompute project.</p>
         * <br>
         * <p>*   An Alibaba Cloud account is in the format of ALIYUN$+Account name.</p>
         * <p>*   A RAM user is in the format of RAM$+Account name.</p>
         */
        @NameInMap("GranteeName")
        public String granteeName;

        /**
         * <p>The type of the subject that requests permissions. The parameter value is 1 and cannot be changed. It indicates user.</p>
         */
        @NameInMap("GranteeType")
        public Integer granteeType;

        /**
         * <p>The subtype of the subject that requests permissions. Valid values:</p>
         * <br>
         * <p>*   101: production account</p>
         * <p>*   103: individual account</p>
         * <p>*   105: account that requests permissions for others</p>
         */
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
        /**
         * <p>The unique ID of the Alibaba Cloud account that is used to submit the permission request order.</p>
         */
        @NameInMap("ApplyBaseId")
        public String applyBaseId;

        /**
         * <p>The time when the permission request order was submitted. The parameter value is a UNIX timestamp.</p>
         */
        @NameInMap("ApplyTimestamp")
        public Long applyTimestamp;

        /**
         * <p>The list of Alibaba Cloud accounts that are used to approve the permission request order.</p>
         */
        @NameInMap("ApproveAccountList")
        public java.util.List<GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveAccountList> approveAccountList;

        /**
         * <p>The content of the permission request.</p>
         */
        @NameInMap("ApproveContent")
        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContent approveContent;

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

        /**
         * <p>Information about the account that is used to request permissions.</p>
         */
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
