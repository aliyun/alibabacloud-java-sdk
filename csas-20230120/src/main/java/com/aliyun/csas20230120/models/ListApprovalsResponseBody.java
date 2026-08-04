// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApprovalsResponseBody extends TeaModel {
    /**
     * <p>List of approval instances.</p>
     */
    @NameInMap("Approvals")
    public java.util.List<ListApprovalsResponseBodyApprovals> approvals;

    /**
     * <p>ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6965F5BA-53B6-5650-A708-51F090F843BB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of approval instances.</p>
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
         * <p>ID of the operator for the approval progress node.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

        /**
         * <p>Username of the operator for the approval progress node.</p>
         * 
         * <strong>example:</strong>
         * <p>王先生</p>
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
         * <p>Action performed at the approval progress node. Valid values:</p>
         * <ul>
         * <li><p><strong>Approve</strong>: Approve.</p>
         * </li>
         * <li><p><strong>Reject</strong>: Reject.</p>
         * </li>
         * <li><p><strong>Revoke</strong>: Revoke.</p>
         * </li>
         * <li><p><strong>Comment</strong>: Comment.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Approve</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>Comment added at the approval progress node.</p>
         * 
         * <strong>example:</strong>
         * <p>审核通过</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>ID of the executor for the approval progress node.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("Executor")
        public String executor;

        /**
         * <p>List of operators for the approval progress node.</p>
         */
        @NameInMap("Operators")
        public java.util.List<ListApprovalsResponseBodyApprovalsApprovalProgressesOperators> operators;

        /**
         * <p>Status of the approval progress node. Valid values:</p>
         * <ul>
         * <li><p><strong>Pending</strong>: Pending approval.</p>
         * </li>
         * <li><p><strong>Approved</strong>: Approved.</p>
         * </li>
         * <li><p><strong>Rejected</strong>: Rejected.</p>
         * </li>
         * <li><p><strong>Revoked</strong>: Revoked.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Approved</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Time when the action was performed at the approval progress node, in seconds since the Unix epoch.</p>
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
         * <p>Details of the approval instance.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;initiatorName&quot;:&quot;王先生&quot;,&quot;initiatorDept&quot;:&quot;测试部&quot;,&quot;devType&quot;:&quot;windows&quot;,&quot;deviceType&quot;:&quot;usbStorage&quot;,&quot;deviceId&quot;:&quot;FC216E9E3****&quot;,&quot;approvalEndTimestamp&quot;:1736524799,&quot;approvalReason&quot;:&quot;这是一个测试&quot;}</p>
         */
        @NameInMap("ApprovalDetail")
        public String approvalDetail;

        /**
         * <p>Approval instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-872b5e911b35****</p>
         */
        @NameInMap("ApprovalId")
        public String approvalId;

        /**
         * <p>List of approval progress nodes.</p>
         */
        @NameInMap("ApprovalProgresses")
        public java.util.List<ListApprovalsResponseBodyApprovalsApprovalProgresses> approvalProgresses;

        @NameInMap("ApprovalType")
        public Integer approvalType;

        /**
         * <p>Time when the approval instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-15 22:11:55</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Department of the user who created the approval instance.</p>
         * 
         * <strong>example:</strong>
         * <p>测试部</p>
         */
        @NameInMap("CreatorDepartment")
        public String creatorDepartment;

        /**
         * <p>ID of the device used to create the approval instance.</p>
         * 
         * <strong>example:</strong>
         * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
         */
        @NameInMap("CreatorDevTag")
        public String creatorDevTag;

        /**
         * <p>ID of the user who created the approval instance.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("CreatorUserId")
        public String creatorUserId;

        /**
         * <p>Username of the user who created the approval instance.</p>
         * 
         * <strong>example:</strong>
         * <p>王先生</p>
         */
        @NameInMap("CreatorUsername")
        public String creatorUsername;

        /**
         * <p>Expiration time of the approval instance, in seconds since the Unix epoch.</p>
         * 
         * <strong>example:</strong>
         * <p>1757952000</p>
         */
        @NameInMap("EndTimestamp")
        public Long endTimestamp;

        /**
         * <p>Policy type associated with the approval instance. Valid values:</p>
         * <ul>
         * <li><p><strong>DomainBlacklist</strong>: Domain blacklist.</p>
         * </li>
         * <li><p><strong>DomainWhitelist</strong>: Domain whitelist.</p>
         * </li>
         * <li><p><strong>SoftwareBlock</strong>: Software blocking.</p>
         * </li>
         * <li><p><strong>AppUninstall</strong>: App uninstallation.</p>
         * </li>
         * <li><p><strong>DlpSend</strong>: File outbound transfer.</p>
         * </li>
         * <li><p><strong>PeripheralBlock</strong>: Peripheral control.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DlpSend</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>ID of the associated approval process.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-process-fcc351b8a95b****</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>Name of the associated approval process.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        /**
         * <p>Reason for creating the approval instance.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一个测试</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>Content of the associated approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;form&quot;: {&quot;labelCol&quot;: 6,&quot;wrapperCol&quot;: 12}}</p>
         */
        @NameInMap("SchemaContent")
        public String schemaContent;

        /**
         * <p>ID of the associated approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        /**
         * <p>Name of the associated approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>Status of the approval instance. Valid values:</p>
         * <ul>
         * <li><p><strong>Pending</strong>: Pending approval.</p>
         * </li>
         * <li><p><strong>Approved</strong>: Approved.</p>
         * </li>
         * <li><p><strong>Rejected</strong>: Rejected.</p>
         * </li>
         * <li><p><strong>Revoked</strong>: Revoked.</p>
         * </li>
         * <li><p><strong>Expired</strong>: Expired.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("Status")
        public String status;

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

    }

}
