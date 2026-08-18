// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApprovalsResponseBody extends TeaModel {
    /**
     * <p>The list of approval instances.</p>
     */
    @NameInMap("Approvals")
    public java.util.List<ListApprovalsResponseBodyApprovals> approvals;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6965F5BA-53B6-5650-A708-51F090F843BB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of approval instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNum")
    public String totalNum;

    public static ListApprovalsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApprovalsResponseBody self = new ListApprovalsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApprovalsResponseBody setApprovals(java.util.List<ListApprovalsResponseBodyApprovals> approvals) {
        this.approvals = approvals;
        return this;
    }
    public java.util.List<ListApprovalsResponseBodyApprovals> getApprovals() {
        return this.approvals;
    }

    public ListApprovalsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApprovalsResponseBody setTotalNum(String totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public String getTotalNum() {
        return this.totalNum;
    }

    public static class ListApprovalsResponseBodyApprovalsApprovalProgressesOperators extends TeaModel {
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
         * <p>Mr. Wang</p>
         */
        @NameInMap("Username")
        public String username;

        public static ListApprovalsResponseBodyApprovalsApprovalProgressesOperators build(java.util.Map<String, ?> map) throws Exception {
            ListApprovalsResponseBodyApprovalsApprovalProgressesOperators self = new ListApprovalsResponseBodyApprovalsApprovalProgressesOperators();
            return TeaModel.build(map, self);
        }

        public ListApprovalsResponseBodyApprovalsApprovalProgressesOperators setSaseUserId(String saseUserId) {
            this.saseUserId = saseUserId;
            return this;
        }
        public String getSaseUserId() {
            return this.saseUserId;
        }

        public ListApprovalsResponseBodyApprovalsApprovalProgressesOperators setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListApprovalsResponseBodyApprovalsApprovalProgresses extends TeaModel {
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
         * <p>The ID of the executor for the approval progress node.</p>
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
        public java.util.List<ListApprovalsResponseBodyApprovalsApprovalProgressesOperators> operators;

        /**
         * <p>The status of the approval progress node. Valid values:</p>
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

        public static ListApprovalsResponseBodyApprovalsApprovalProgresses build(java.util.Map<String, ?> map) throws Exception {
            ListApprovalsResponseBodyApprovalsApprovalProgresses self = new ListApprovalsResponseBodyApprovalsApprovalProgresses();
            return TeaModel.build(map, self);
        }

        public ListApprovalsResponseBodyApprovalsApprovalProgresses setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListApprovalsResponseBodyApprovalsApprovalProgresses setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListApprovalsResponseBodyApprovalsApprovalProgresses setExecutor(String executor) {
            this.executor = executor;
            return this;
        }
        public String getExecutor() {
            return this.executor;
        }

        public ListApprovalsResponseBodyApprovalsApprovalProgresses setOperators(java.util.List<ListApprovalsResponseBodyApprovalsApprovalProgressesOperators> operators) {
            this.operators = operators;
            return this;
        }
        public java.util.List<ListApprovalsResponseBodyApprovalsApprovalProgressesOperators> getOperators() {
            return this.operators;
        }

        public ListApprovalsResponseBodyApprovalsApprovalProgresses setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListApprovalsResponseBodyApprovalsApprovalProgresses setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class ListApprovalsResponseBodyApprovals extends TeaModel {
        /**
         * <p>The details of the approval instance.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;initiatorName&quot;:&quot;Mr. Wang&quot;,&quot;initiatorDept&quot;:&quot;Testing Department&quot;,&quot;devType&quot;:&quot;windows&quot;,&quot;deviceType&quot;:&quot;usbStorage&quot;,&quot;deviceId&quot;:&quot;FC216E9E3****&quot;,&quot;approvalEndTimestamp&quot;:1736524799,&quot;approvalReason&quot;:&quot;This is a test&quot;}</p>
         */
        @NameInMap("ApprovalDetail")
        public String approvalDetail;

        /**
         * <p>The instance ID of the approval.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-872b5e911b35****</p>
         */
        @NameInMap("ApprovalId")
        public String approvalId;

        /**
         * <p>The list of approval progress nodes.</p>
         */
        @NameInMap("ApprovalProgresses")
        public java.util.List<ListApprovalsResponseBodyApprovalsApprovalProgresses> approvalProgresses;

        @NameInMap("ApprovalType")
        public Integer approvalType;

        /**
         * <p>The time when the approval instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-15 22:11:55</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The department of the approval instance creator.</p>
         * 
         * <strong>example:</strong>
         * <p>QA Department</p>
         */
        @NameInMap("CreatorDepartment")
        public String creatorDepartment;

        /**
         * <p>The terminal device ID of the approval instance creator.</p>
         * 
         * <strong>example:</strong>
         * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
         */
        @NameInMap("CreatorDevTag")
        public String creatorDevTag;

        /**
         * <p>The ID of the approval instance creator.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("CreatorUserId")
        public String creatorUserId;

        /**
         * <p>The username of the approval instance creator.</p>
         * 
         * <strong>example:</strong>
         * <p>Mr. Wang</p>
         */
        @NameInMap("CreatorUsername")
        public String creatorUsername;

        /**
         * <p>The effective status of the report. Enabled indicates that the report is effective. Expired indicates that the report has expired.</p>
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
         * <p>The type of the policy associated with the approval instance. Valid values:</p>
         * <ul>
         * <li><strong>DomainBlacklist</strong>: domain name blacklist.</li>
         * <li><strong>DomainWhitelist</strong>: domain name whitelist.</li>
         * <li><strong>SoftwareBlock</strong>: software blocking.</li>
         * <li><strong>AppUninstall</strong>: terminal uninstallation.</li>
         * <li><strong>DlpSend</strong>: file outgoing.</li>
         * <li><strong>PeripheralBlock</strong>: peripheral control.</li>
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
         * <p>The report type. ApprovalReport indicates an approval report. BackendReport indicates a backend report.</p>
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
         * <p>The approval instance status. Valid values:</p>
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

        public static ListApprovalsResponseBodyApprovals build(java.util.Map<String, ?> map) throws Exception {
            ListApprovalsResponseBodyApprovals self = new ListApprovalsResponseBodyApprovals();
            return TeaModel.build(map, self);
        }

        public ListApprovalsResponseBodyApprovals setApprovalDetail(String approvalDetail) {
            this.approvalDetail = approvalDetail;
            return this;
        }
        public String getApprovalDetail() {
            return this.approvalDetail;
        }

        public ListApprovalsResponseBodyApprovals setApprovalId(String approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public String getApprovalId() {
            return this.approvalId;
        }

        public ListApprovalsResponseBodyApprovals setApprovalProgresses(java.util.List<ListApprovalsResponseBodyApprovalsApprovalProgresses> approvalProgresses) {
            this.approvalProgresses = approvalProgresses;
            return this;
        }
        public java.util.List<ListApprovalsResponseBodyApprovalsApprovalProgresses> getApprovalProgresses() {
            return this.approvalProgresses;
        }

        public ListApprovalsResponseBodyApprovals setApprovalType(Integer approvalType) {
            this.approvalType = approvalType;
            return this;
        }
        public Integer getApprovalType() {
            return this.approvalType;
        }

        public ListApprovalsResponseBodyApprovals setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListApprovalsResponseBodyApprovals setCreatorDepartment(String creatorDepartment) {
            this.creatorDepartment = creatorDepartment;
            return this;
        }
        public String getCreatorDepartment() {
            return this.creatorDepartment;
        }

        public ListApprovalsResponseBodyApprovals setCreatorDevTag(String creatorDevTag) {
            this.creatorDevTag = creatorDevTag;
            return this;
        }
        public String getCreatorDevTag() {
            return this.creatorDevTag;
        }

        public ListApprovalsResponseBodyApprovals setCreatorUserId(String creatorUserId) {
            this.creatorUserId = creatorUserId;
            return this;
        }
        public String getCreatorUserId() {
            return this.creatorUserId;
        }

        public ListApprovalsResponseBodyApprovals setCreatorUsername(String creatorUsername) {
            this.creatorUsername = creatorUsername;
            return this;
        }
        public String getCreatorUsername() {
            return this.creatorUsername;
        }

        public ListApprovalsResponseBodyApprovals setEffectStatus(String effectStatus) {
            this.effectStatus = effectStatus;
            return this;
        }
        public String getEffectStatus() {
            return this.effectStatus;
        }

        public ListApprovalsResponseBodyApprovals setEndTimestamp(Long endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }
        public Long getEndTimestamp() {
            return this.endTimestamp;
        }

        public ListApprovalsResponseBodyApprovals setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public ListApprovalsResponseBodyApprovals setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public ListApprovalsResponseBodyApprovals setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public ListApprovalsResponseBodyApprovals setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListApprovalsResponseBodyApprovals setReportType(String reportType) {
            this.reportType = reportType;
            return this;
        }
        public String getReportType() {
            return this.reportType;
        }

        public ListApprovalsResponseBodyApprovals setSchemaContent(String schemaContent) {
            this.schemaContent = schemaContent;
            return this;
        }
        public String getSchemaContent() {
            return this.schemaContent;
        }

        public ListApprovalsResponseBodyApprovals setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

        public ListApprovalsResponseBodyApprovals setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public ListApprovalsResponseBodyApprovals setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListApprovalsResponseBodyApprovals setValidityType(String validityType) {
            this.validityType = validityType;
            return this;
        }
        public String getValidityType() {
            return this.validityType;
        }

    }

}
