// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetApprovalResponseBody extends TeaModel {
    /**
     * <p>The approval instance.</p>
     */
    @NameInMap("Approval")
    public java.util.List<GetApprovalResponseBodyApproval> approval;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7E9D7ACD-53D5-56EF-A913-79D148D06299</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetApprovalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApprovalResponseBody self = new GetApprovalResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApprovalResponseBody setApproval(java.util.List<GetApprovalResponseBodyApproval> approval) {
        this.approval = approval;
        return this;
    }
    public java.util.List<GetApprovalResponseBodyApproval> getApproval() {
        return this.approval;
    }

    public GetApprovalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApprovalResponseBodyApprovalApprovalProgressesOperators extends TeaModel {
        /**
         * <p>The ID of the operator for the approval progress node.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

        /**
         * <p>The username of the operator for the approval progress node.</p>
         * 
         * <strong>example:</strong>
         * <p>John Smith</p>
         */
        @NameInMap("Username")
        public String username;

        public static GetApprovalResponseBodyApprovalApprovalProgressesOperators build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalResponseBodyApprovalApprovalProgressesOperators self = new GetApprovalResponseBodyApprovalApprovalProgressesOperators();
            return TeaModel.build(map, self);
        }

        public GetApprovalResponseBodyApprovalApprovalProgressesOperators setSaseUserId(String saseUserId) {
            this.saseUserId = saseUserId;
            return this;
        }
        public String getSaseUserId() {
            return this.saseUserId;
        }

        public GetApprovalResponseBodyApprovalApprovalProgressesOperators setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetApprovalResponseBodyApprovalApprovalProgresses extends TeaModel {
        /**
         * <p>The action performed on the approval progress node. Valid values:</p>
         * <ul>
         * <li><strong>Approve</strong>: Approved.</li>
         * <li><strong>Reject</strong>: Rejected.</li>
         * <li><strong>Revoke</strong>: Revoked.</li>
         * <li><strong>Comment</strong>: Commented.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Approve</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The comment on the approval progress node.</p>
         * 
         * <strong>example:</strong>
         * <p>Approved</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The executor ID of the approval progress node.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("Executor")
        public String executor;

        /**
         * <p>The list of operators for the approval progress node.</p>
         */
        @NameInMap("Operators")
        public java.util.List<GetApprovalResponseBodyApprovalApprovalProgressesOperators> operators;

        /**
         * <p>The status of the approval progress node. Valid values:</p>
         * <ul>
         * <li><strong>Pending</strong>: Pending approval.</li>
         * <li><strong>Approved</strong>: Approved.</li>
         * <li><strong>Rejected</strong>: Rejected.</li>
         * <li><strong>Revoked</strong>: Revoked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Approved</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the action was performed on the approval progress node. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1736752000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static GetApprovalResponseBodyApprovalApprovalProgresses build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalResponseBodyApprovalApprovalProgresses self = new GetApprovalResponseBodyApprovalApprovalProgresses();
            return TeaModel.build(map, self);
        }

        public GetApprovalResponseBodyApprovalApprovalProgresses setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetApprovalResponseBodyApprovalApprovalProgresses setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetApprovalResponseBodyApprovalApprovalProgresses setExecutor(String executor) {
            this.executor = executor;
            return this;
        }
        public String getExecutor() {
            return this.executor;
        }

        public GetApprovalResponseBodyApprovalApprovalProgresses setOperators(java.util.List<GetApprovalResponseBodyApprovalApprovalProgressesOperators> operators) {
            this.operators = operators;
            return this;
        }
        public java.util.List<GetApprovalResponseBodyApprovalApprovalProgressesOperators> getOperators() {
            return this.operators;
        }

        public GetApprovalResponseBodyApprovalApprovalProgresses setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetApprovalResponseBodyApprovalApprovalProgresses setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetApprovalResponseBodyApprovalBackendReportDetailTargetUser extends TeaModel {
        @NameInMap("UserId")
        public String userId;

        @NameInMap("Username")
        public String username;

        public static GetApprovalResponseBodyApprovalBackendReportDetailTargetUser build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalResponseBodyApprovalBackendReportDetailTargetUser self = new GetApprovalResponseBodyApprovalBackendReportDetailTargetUser();
            return TeaModel.build(map, self);
        }

        public GetApprovalResponseBodyApprovalBackendReportDetailTargetUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetApprovalResponseBodyApprovalBackendReportDetailTargetUser setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetApprovalResponseBodyApprovalBackendReportDetail extends TeaModel {
        @NameInMap("AssociatedPolicyName")
        public String associatedPolicyName;

        @NameInMap("AssociatedPolicyType")
        public String associatedPolicyType;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("ReportObject")
        public Object reportObject;

        @NameInMap("TargetUser")
        public GetApprovalResponseBodyApprovalBackendReportDetailTargetUser targetUser;

        public static GetApprovalResponseBodyApprovalBackendReportDetail build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalResponseBodyApprovalBackendReportDetail self = new GetApprovalResponseBodyApprovalBackendReportDetail();
            return TeaModel.build(map, self);
        }

        public GetApprovalResponseBodyApprovalBackendReportDetail setAssociatedPolicyName(String associatedPolicyName) {
            this.associatedPolicyName = associatedPolicyName;
            return this;
        }
        public String getAssociatedPolicyName() {
            return this.associatedPolicyName;
        }

        public GetApprovalResponseBodyApprovalBackendReportDetail setAssociatedPolicyType(String associatedPolicyType) {
            this.associatedPolicyType = associatedPolicyType;
            return this;
        }
        public String getAssociatedPolicyType() {
            return this.associatedPolicyType;
        }

        public GetApprovalResponseBodyApprovalBackendReportDetail setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetApprovalResponseBodyApprovalBackendReportDetail setReportObject(Object reportObject) {
            this.reportObject = reportObject;
            return this;
        }
        public Object getReportObject() {
            return this.reportObject;
        }

        public GetApprovalResponseBodyApprovalBackendReportDetail setTargetUser(GetApprovalResponseBodyApprovalBackendReportDetailTargetUser targetUser) {
            this.targetUser = targetUser;
            return this;
        }
        public GetApprovalResponseBodyApprovalBackendReportDetailTargetUser getTargetUser() {
            return this.targetUser;
        }

    }

    public static class GetApprovalResponseBodyApproval extends TeaModel {
        /**
         * <p>The details of the approval instance.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;initiatorName&quot;:&quot;John Smith&quot;,&quot;initiatorDept&quot;:&quot;QA Department&quot;,&quot;devType&quot;:&quot;windows&quot;,&quot;deviceType&quot;:&quot;usbStorage&quot;,&quot;deviceId&quot;:&quot;FC216E9E3****&quot;,&quot;approvalEndTimestamp&quot;:1736524799,&quot;approvalReason&quot;:&quot;This is a test&quot;}</p>
         */
        @NameInMap("ApprovalDetail")
        public String approvalDetail;

        /**
         * <p>The approval instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-3564b140642f****</p>
         */
        @NameInMap("ApprovalId")
        public String approvalId;

        /**
         * <p>The list of approval progress nodes.</p>
         */
        @NameInMap("ApprovalProgresses")
        public java.util.List<GetApprovalResponseBodyApprovalApprovalProgresses> approvalProgresses;

        @NameInMap("ApprovalType")
        public Integer approvalType;

        /**
         * <p>The backend report details. This parameter is returned only when ReportType is set to BackendReport.</p>
         */
        @NameInMap("BackendReportDetail")
        public GetApprovalResponseBodyApprovalBackendReportDetail backendReportDetail;

        /**
         * <p>The time when the approval instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-15 22:11:55</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateTimeUnix")
        public Long createTimeUnix;

        /**
         * <p>The department of the user who created the approval instance.</p>
         * 
         * <strong>example:</strong>
         * <p>QA Department</p>
         */
        @NameInMap("CreatorDepartment")
        public String creatorDepartment;

        /**
         * <p>The device ID of the terminal that created the approval instance.</p>
         * 
         * <strong>example:</strong>
         * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
         */
        @NameInMap("CreatorDevTag")
        public String creatorDevTag;

        /**
         * <p>The ID of the user who created the approval instance.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("CreatorUserId")
        public String creatorUserId;

        /**
         * <p>The username of the user who created the approval instance.</p>
         * 
         * <strong>example:</strong>
         * <p>John Smith</p>
         */
        @NameInMap("CreatorUsername")
        public String creatorUsername;

        /**
         * <p>The effective status of the report. Enabled indicates that the report is active, and Expired indicates that the report has expired.</p>
         */
        @NameInMap("EffectStatus")
        public String effectStatus;

        /**
         * <p>The expiration time of the approval instance. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1757952000</p>
         */
        @NameInMap("EndTimestamp")
        public Long endTimestamp;

        /**
         * <p>The policy type associated with the approval instance. Valid values:</p>
         * <ul>
         * <li><strong>DomainBlacklist</strong>: Domain name blacklist.</li>
         * <li><strong>DomainWhitelist</strong>: Domain name whitelist.</li>
         * <li><strong>SoftwareBlock</strong>: Software blocking.</li>
         * <li><strong>AppUninstall</strong>: Agent uninstallation.</li>
         * <li><strong>DlpSend</strong>: File outbound transfer.</li>
         * <li><strong>PeripheralBlock</strong>: Peripheral device control.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DlpSend</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>The ID of the process associated with the approval instance.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-process-fcc351b8a95b****</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>The name of the process associated with the approval instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        /**
         * <p>The reason for creating the approval instance.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a test</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The report type. ApprovalReport indicates an approval report, and BackendReport indicates a backend report.</p>
         */
        @NameInMap("ReportType")
        public String reportType;

        /**
         * <p>The content of the template associated with the approval instance.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;form&quot;: {&quot;labelCol&quot;: 6,&quot;wrapperCol&quot;: 12}}</p>
         */
        @NameInMap("SchemaContent")
        public String schemaContent;

        /**
         * <p>The ID of the template associated with the approval instance.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        /**
         * <p>The name of the template associated with the approval instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><strong>Pending</strong>: Pending approval.</li>
         * <li><strong>Approved</strong>: Approved.</li>
         * <li><strong>Rejected</strong>: Denied.</li>
         * <li><strong>Revoked</strong>: Revoked.</li>
         * <li><strong>Expired</strong>: Expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The validity duration type. When the value is Permanent, EndTimestamp returns 0.</p>
         */
        @NameInMap("ValidityType")
        public String validityType;

        public static GetApprovalResponseBodyApproval build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalResponseBodyApproval self = new GetApprovalResponseBodyApproval();
            return TeaModel.build(map, self);
        }

        public GetApprovalResponseBodyApproval setApprovalDetail(String approvalDetail) {
            this.approvalDetail = approvalDetail;
            return this;
        }
        public String getApprovalDetail() {
            return this.approvalDetail;
        }

        public GetApprovalResponseBodyApproval setApprovalId(String approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public String getApprovalId() {
            return this.approvalId;
        }

        public GetApprovalResponseBodyApproval setApprovalProgresses(java.util.List<GetApprovalResponseBodyApprovalApprovalProgresses> approvalProgresses) {
            this.approvalProgresses = approvalProgresses;
            return this;
        }
        public java.util.List<GetApprovalResponseBodyApprovalApprovalProgresses> getApprovalProgresses() {
            return this.approvalProgresses;
        }

        public GetApprovalResponseBodyApproval setApprovalType(Integer approvalType) {
            this.approvalType = approvalType;
            return this;
        }
        public Integer getApprovalType() {
            return this.approvalType;
        }

        public GetApprovalResponseBodyApproval setBackendReportDetail(GetApprovalResponseBodyApprovalBackendReportDetail backendReportDetail) {
            this.backendReportDetail = backendReportDetail;
            return this;
        }
        public GetApprovalResponseBodyApprovalBackendReportDetail getBackendReportDetail() {
            return this.backendReportDetail;
        }

        public GetApprovalResponseBodyApproval setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetApprovalResponseBodyApproval setCreateTimeUnix(Long createTimeUnix) {
            this.createTimeUnix = createTimeUnix;
            return this;
        }
        public Long getCreateTimeUnix() {
            return this.createTimeUnix;
        }

        public GetApprovalResponseBodyApproval setCreatorDepartment(String creatorDepartment) {
            this.creatorDepartment = creatorDepartment;
            return this;
        }
        public String getCreatorDepartment() {
            return this.creatorDepartment;
        }

        public GetApprovalResponseBodyApproval setCreatorDevTag(String creatorDevTag) {
            this.creatorDevTag = creatorDevTag;
            return this;
        }
        public String getCreatorDevTag() {
            return this.creatorDevTag;
        }

        public GetApprovalResponseBodyApproval setCreatorUserId(String creatorUserId) {
            this.creatorUserId = creatorUserId;
            return this;
        }
        public String getCreatorUserId() {
            return this.creatorUserId;
        }

        public GetApprovalResponseBodyApproval setCreatorUsername(String creatorUsername) {
            this.creatorUsername = creatorUsername;
            return this;
        }
        public String getCreatorUsername() {
            return this.creatorUsername;
        }

        public GetApprovalResponseBodyApproval setEffectStatus(String effectStatus) {
            this.effectStatus = effectStatus;
            return this;
        }
        public String getEffectStatus() {
            return this.effectStatus;
        }

        public GetApprovalResponseBodyApproval setEndTimestamp(Long endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }
        public Long getEndTimestamp() {
            return this.endTimestamp;
        }

        public GetApprovalResponseBodyApproval setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public GetApprovalResponseBodyApproval setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public GetApprovalResponseBodyApproval setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public GetApprovalResponseBodyApproval setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetApprovalResponseBodyApproval setReportType(String reportType) {
            this.reportType = reportType;
            return this;
        }
        public String getReportType() {
            return this.reportType;
        }

        public GetApprovalResponseBodyApproval setSchemaContent(String schemaContent) {
            this.schemaContent = schemaContent;
            return this;
        }
        public String getSchemaContent() {
            return this.schemaContent;
        }

        public GetApprovalResponseBodyApproval setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

        public GetApprovalResponseBodyApproval setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public GetApprovalResponseBodyApproval setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetApprovalResponseBodyApproval setValidityType(String validityType) {
            this.validityType = validityType;
            return this;
        }
        public String getValidityType() {
            return this.validityType;
        }

    }

}
