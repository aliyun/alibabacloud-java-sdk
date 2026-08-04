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
     * <p>The ID of the request.</p>
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
         * <p>The ID of the operator for the progress node.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

        /**
         * <p>The username of the operator for the progress node.</p>
         * 
         * <strong>example:</strong>
         * <p>王先生</p>
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
         * <p>The action performed on the progress node. Valid values:</p>
         * <ul>
         * <li><p><strong>Approve</strong>: Approve</p>
         * </li>
         * <li><p><strong>Reject</strong>: Reject</p>
         * </li>
         * <li><p><strong>Revoke</strong>: Revoke</p>
         * </li>
         * <li><p><strong>Comment</strong>: Comment</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Approve</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The comment for the action on the progress node.</p>
         * 
         * <strong>example:</strong>
         * <p>审核通过</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The ID of the executor for the progress node.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("Executor")
        public String executor;

        /**
         * <p>A list of operators for the progress node.</p>
         */
        @NameInMap("Operators")
        public java.util.List<GetApprovalResponseBodyApprovalApprovalProgressesOperators> operators;

        /**
         * <p>The status of the progress node. Valid values:</p>
         * <ul>
         * <li><p><strong>Pending</strong>: Pending</p>
         * </li>
         * <li><p><strong>Approved</strong>: Approved</p>
         * </li>
         * <li><p><strong>Rejected</strong>: Rejected</p>
         * </li>
         * <li><p><strong>Revoked</strong>: Revoked</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Approved</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the action was performed on the progress node. This is a UNIX timestamp. Unit: seconds.</p>
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

    public static class GetApprovalResponseBodyApproval extends TeaModel {
        /**
         * <p>The details of the approval instance.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;initiatorName&quot;:&quot;王先生&quot;,&quot;initiatorDept&quot;:&quot;测试部&quot;,&quot;devType&quot;:&quot;windows&quot;,&quot;deviceType&quot;:&quot;usbStorage&quot;,&quot;deviceId&quot;:&quot;FC216E9E3****&quot;,&quot;approvalEndTimestamp&quot;:1736524799,&quot;approvalReason&quot;:&quot;这是一个测试&quot;}</p>
         */
        @NameInMap("ApprovalDetail")
        public String approvalDetail;

        /**
         * <p>The ID of the approval instance.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-3564b140642f****</p>
         */
        @NameInMap("ApprovalId")
        public String approvalId;

        /**
         * <p>A list of progress nodes for the approval instance.</p>
         */
        @NameInMap("ApprovalProgresses")
        public java.util.List<GetApprovalResponseBodyApprovalApprovalProgresses> approvalProgresses;

        /**
         * <p>The time when the approval instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-15 22:11:55</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The department of the user who created the approval instance.</p>
         * 
         * <strong>example:</strong>
         * <p>测试部</p>
         */
        @NameInMap("CreatorDepartment")
        public String creatorDepartment;

        /**
         * <p>The ID of the client device from which the approval instance was created.</p>
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
         * <p>王先生</p>
         */
        @NameInMap("CreatorUsername")
        public String creatorUsername;

        /**
         * <p>The expiration time of the approval instance. This is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1757952000</p>
         */
        @NameInMap("EndTimestamp")
        public Long endTimestamp;

        /**
         * <p>The type of the associated policy. Valid values:</p>
         * <ul>
         * <li><p><strong>DomainBlacklist</strong>: Domain blacklist</p>
         * </li>
         * <li><p><strong>DomainWhitelist</strong>: Domain whitelist</p>
         * </li>
         * <li><p><strong>SoftwareBlock</strong>: Software block</p>
         * </li>
         * <li><p><strong>AppUninstall</strong>: Client uninstall</p>
         * </li>
         * <li><p><strong>DlpSend</strong>: Outbound file transfer</p>
         * </li>
         * <li><p><strong>PeripheralBlock</strong>: Peripheral control</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DlpSend</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>The ID of the associated approval flow.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-process-fcc351b8a95b****</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>The name of the associated approval flow.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        /**
         * <p>The reason for creating the approval instance.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一个测试</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The content of the associated template.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;form&quot;: {&quot;labelCol&quot;: 6,&quot;wrapperCol&quot;: 12}}</p>
         */
        @NameInMap("SchemaContent")
        public String schemaContent;

        /**
         * <p>The ID of the associated template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        /**
         * <p>The name of the associated template.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The status of the approval instance. Valid values:</p>
         * <ul>
         * <li><p><strong>Pending</strong>: Pending</p>
         * </li>
         * <li><p><strong>Approved</strong>: Approved</p>
         * </li>
         * <li><p><strong>Rejected</strong>: Rejected</p>
         * </li>
         * <li><p><strong>Revoked</strong>: Revoked</p>
         * </li>
         * <li><p><strong>Expired</strong>: Expired</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("Status")
        public String status;

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

        public GetApprovalResponseBodyApproval setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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

    }

}
