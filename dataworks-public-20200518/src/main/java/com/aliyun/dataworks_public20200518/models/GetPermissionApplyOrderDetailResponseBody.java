// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetPermissionApplyOrderDetailResponseBody extends TeaModel {
    /**
     * <p>The details of the request order.</p>
     */
    @NameInMap("ApplyOrderDetail")
    public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetail applyOrderDetail;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1ec92159376****</p>
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
         * <p>The UID of the Alibaba Cloud account that approved the request order.</p>
         * 
         * <strong>example:</strong>
         * <p>182293110403****</p>
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
        @NameInMap("ColumnActions")
        public java.util.List<String> columnActions;

        /**
         * <p>The description of the requested column.</p>
         * 
         * <strong>example:</strong>
         * <p>Field description</p>
         */
        @NameInMap("ColumnComment")
        public String columnComment;

        /**
         * <p>The name of the requested column.</p>
         * 
         * <strong>example:</strong>
         * <p>aColumnName</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The security level of the requested column. Valid values: 0 to 9.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("SecurityLevel")
        public String securityLevel;

        public static GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList build(java.util.Map<String, ?> map) throws Exception {
            GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList self = new GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList();
            return TeaModel.build(map, self);
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList setColumnActions(java.util.List<String> columnActions) {
            this.columnActions = columnActions;
            return this;
        }
        public java.util.List<String> getColumnActions() {
            return this.columnActions;
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
        @NameInMap("Actions")
        public java.util.List<String> actions;

        /**
         * <p>The column field information of the requested object.</p>
         */
        @NameInMap("ColumnMetaList")
        public java.util.List<GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaListColumnMetaList> columnMetaList;

        /**
         * <p>The name of the requested table.</p>
         * 
         * <strong>example:</strong>
         * <p>aTableName</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        public static GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaList build(java.util.Map<String, ?> map) throws Exception {
            GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaList self = new GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaList();
            return TeaModel.build(map, self);
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaList setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
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
         * <p>The MaxCompute project in which the requested object resides.</p>
         * 
         * <strong>example:</strong>
         * <p>aMaxComputeProject</p>
         */
        @NameInMap("MaxComputeProjectName")
        public String maxComputeProjectName;

        /**
         * <p>The detailed information about the requested objects.</p>
         */
        @NameInMap("ObjectMetaList")
        public java.util.List<GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContentProjectMetaObjectMetaList> objectMetaList;

        /**
         * <p>The ID of the DataWorks workspace in which the requested object resides.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
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
         * <p>The reason for the request, used as a reference for the administrator during approval.</p>
         * 
         * <strong>example:</strong>
         * <p>I need to use this table</p>
         */
        @NameInMap("ApplyReason")
        public String applyReason;

        /**
         * <p>The expiration time of the requested permissions, displayed as a UNIX timestamp.
         * If the MaxCompute project does not have LabelSecurity enabled, or the security level of the requested table field is 0 or less than or equal to the security level of the requesting account, only permanent permissions can be requested.</p>
         * 
         * <strong>example:</strong>
         * <p>1617115071885</p>
         */
        @NameInMap("Deadline")
        public Long deadline;

        /**
         * <p>The type of the request order. Currently, only the value 1 is supported, indicating an object ACL permission request.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OrderType")
        public Integer orderType;

        /**
         * <p>The information about the project and workspace to which the requested object belongs.</p>
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
         * <p>The UID of the Alibaba Cloud account that requested permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>26784260040899****</p>
         */
        @NameInMap("GranteeId")
        public String granteeId;

        /**
         * <p>The name of the Alibaba Cloud account that requested permissions. The format is consistent with the MaxCompute account format.</p>
         * <ul>
         * <li>Primary account: ALIYUN$+account name.</li>
         * <li>RAM user: RAM$+account name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RAM$dataworks_3h1_1:StsRamUser(StsRamUser)</p>
         */
        @NameInMap("GranteeName")
        public String granteeName;

        /**
         * <p>The type of the entity that requested permissions. Currently, only 1 (user) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GranteeType")
        public Integer granteeType;

        /**
         * <p>The subtype of the entity that requested permissions. Valid values:</p>
         * <ul>
         * <li>101: Production Alibaba Cloud account.</li>
         * <li>103: Personal Alibaba Cloud account.</li>
         * <li>105: Alibaba Cloud account applied on behalf of another user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>103</p>
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
         * <p>The UID of the Alibaba Cloud account that submitted the request order.</p>
         * 
         * <strong>example:</strong>
         * <p>26784260040899****</p>
         */
        @NameInMap("ApplyBaseId")
        public String applyBaseId;

        /**
         * <p>The time when the request order was submitted, displayed as a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1615284086000</p>
         */
        @NameInMap("ApplyTimestamp")
        public Long applyTimestamp;

        /**
         * <p>The list of Alibaba Cloud accounts that approved the request order.</p>
         */
        @NameInMap("ApproveAccountList")
        public java.util.List<GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveAccountList> approveAccountList;

        /**
         * <p>The specific content of the request.</p>
         */
        @NameInMap("ApproveContent")
        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetailApproveContent approveContent;

        /**
         * <p>The time when the final approval was completed, displayed as a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1757496687000</p>
         */
        @NameInMap("FinishAapprovalTimestamp")
        public Long finishAapprovalTimestamp;

        /**
         * <p>The final approval comment.</p>
         * 
         * <strong>example:</strong>
         * <p>agree</p>
         */
        @NameInMap("FinishApprovalComment")
        public String finishApprovalComment;

        /**
         * <p>The ID of the request order.</p>
         * 
         * <strong>example:</strong>
         * <p>ad8da78d-8135-455e-9486-27cf213f****</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>The status of the request order. Valid values:</p>
         * <ul>
         * <li>1: Pending approval.</li>
         * <li>2: Approved and authorization succeeded.</li>
         * <li>3: Approved but authorization failed.</li>
         * <li>4: Rejected.</li>
         * <li>5: Withdrawn.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FlowStatus")
        public Integer flowStatus;

        /**
         * <p>The information about the accounts that requested permissions.</p>
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

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetail setFinishAapprovalTimestamp(Long finishAapprovalTimestamp) {
            this.finishAapprovalTimestamp = finishAapprovalTimestamp;
            return this;
        }
        public Long getFinishAapprovalTimestamp() {
            return this.finishAapprovalTimestamp;
        }

        public GetPermissionApplyOrderDetailResponseBodyApplyOrderDetail setFinishApprovalComment(String finishApprovalComment) {
            this.finishApprovalComment = finishApprovalComment;
            return this;
        }
        public String getFinishApprovalComment() {
            return this.finishApprovalComment;
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
