// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateApprovalStatusResponseBody extends TeaModel {
    @NameInMap("Approval")
    public java.util.List<UpdateApprovalStatusResponseBodyApproval> approval;

    /**
     * <strong>example:</strong>
     * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateApprovalStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApprovalStatusResponseBody self = new UpdateApprovalStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApprovalStatusResponseBody setApproval(java.util.List<UpdateApprovalStatusResponseBodyApproval> approval) {
        this.approval = approval;
        return this;
    }
    public java.util.List<UpdateApprovalStatusResponseBodyApproval> getApproval() {
        return this.approval;
    }

    public UpdateApprovalStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateApprovalStatusResponseBodyApprovalApprovalProgressesOperators extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

        @NameInMap("Username")
        public String username;

        public static UpdateApprovalStatusResponseBodyApprovalApprovalProgressesOperators build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalStatusResponseBodyApprovalApprovalProgressesOperators self = new UpdateApprovalStatusResponseBodyApprovalApprovalProgressesOperators();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalStatusResponseBodyApprovalApprovalProgressesOperators setSaseUserId(String saseUserId) {
            this.saseUserId = saseUserId;
            return this;
        }
        public String getSaseUserId() {
            return this.saseUserId;
        }

        public UpdateApprovalStatusResponseBodyApprovalApprovalProgressesOperators setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class UpdateApprovalStatusResponseBodyApprovalApprovalProgresses extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Approve</p>
         */
        @NameInMap("Action")
        public String action;

        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("Executor")
        public String executor;

        @NameInMap("Operators")
        public java.util.List<UpdateApprovalStatusResponseBodyApprovalApprovalProgressesOperators> operators;

        /**
         * <strong>example:</strong>
         * <p>Approved</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1736752000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static UpdateApprovalStatusResponseBodyApprovalApprovalProgresses build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalStatusResponseBodyApprovalApprovalProgresses self = new UpdateApprovalStatusResponseBodyApprovalApprovalProgresses();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalStatusResponseBodyApprovalApprovalProgresses setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public UpdateApprovalStatusResponseBodyApprovalApprovalProgresses setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public UpdateApprovalStatusResponseBodyApprovalApprovalProgresses setExecutor(String executor) {
            this.executor = executor;
            return this;
        }
        public String getExecutor() {
            return this.executor;
        }

        public UpdateApprovalStatusResponseBodyApprovalApprovalProgresses setOperators(java.util.List<UpdateApprovalStatusResponseBodyApprovalApprovalProgressesOperators> operators) {
            this.operators = operators;
            return this;
        }
        public java.util.List<UpdateApprovalStatusResponseBodyApprovalApprovalProgressesOperators> getOperators() {
            return this.operators;
        }

        public UpdateApprovalStatusResponseBodyApprovalApprovalProgresses setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateApprovalStatusResponseBodyApprovalApprovalProgresses setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class UpdateApprovalStatusResponseBodyApproval extends TeaModel {
        @NameInMap("ApprovalDetail")
        public String approvalDetail;

        /**
         * <strong>example:</strong>
         * <p>approval-165e6738ad9d****</p>
         */
        @NameInMap("ApprovalId")
        public String approvalId;

        @NameInMap("ApprovalProgresses")
        public java.util.List<UpdateApprovalStatusResponseBodyApprovalApprovalProgresses> approvalProgresses;

        /**
         * <strong>example:</strong>
         * <p>2022-11-15 22:11:55</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
         */
        @NameInMap("CreatorDevTag")
        public String creatorDevTag;

        /**
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("CreatorUserId")
        public String creatorUserId;

        /**
         * <strong>example:</strong>
         * <p>1757952000</p>
         */
        @NameInMap("EndTimestamp")
        public Long endTimestamp;

        /**
         * <strong>example:</strong>
         * <p>DlpSend</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <strong>example:</strong>
         * <p>approval-process-fcc351b8a95b****</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        @NameInMap("ProcessName")
        public String processName;

        @NameInMap("Reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>{&quot;form&quot;: {&quot;labelCol&quot;: 6,&quot;wrapperCol&quot;: 12}}</p>
         */
        @NameInMap("SchemaContent")
        public String schemaContent;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("Status")
        public String status;

        public static UpdateApprovalStatusResponseBodyApproval build(java.util.Map<String, ?> map) throws Exception {
            UpdateApprovalStatusResponseBodyApproval self = new UpdateApprovalStatusResponseBodyApproval();
            return TeaModel.build(map, self);
        }

        public UpdateApprovalStatusResponseBodyApproval setApprovalDetail(String approvalDetail) {
            this.approvalDetail = approvalDetail;
            return this;
        }
        public String getApprovalDetail() {
            return this.approvalDetail;
        }

        public UpdateApprovalStatusResponseBodyApproval setApprovalId(String approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public String getApprovalId() {
            return this.approvalId;
        }

        public UpdateApprovalStatusResponseBodyApproval setApprovalProgresses(java.util.List<UpdateApprovalStatusResponseBodyApprovalApprovalProgresses> approvalProgresses) {
            this.approvalProgresses = approvalProgresses;
            return this;
        }
        public java.util.List<UpdateApprovalStatusResponseBodyApprovalApprovalProgresses> getApprovalProgresses() {
            return this.approvalProgresses;
        }

        public UpdateApprovalStatusResponseBodyApproval setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateApprovalStatusResponseBodyApproval setCreatorDevTag(String creatorDevTag) {
            this.creatorDevTag = creatorDevTag;
            return this;
        }
        public String getCreatorDevTag() {
            return this.creatorDevTag;
        }

        public UpdateApprovalStatusResponseBodyApproval setCreatorUserId(String creatorUserId) {
            this.creatorUserId = creatorUserId;
            return this;
        }
        public String getCreatorUserId() {
            return this.creatorUserId;
        }

        public UpdateApprovalStatusResponseBodyApproval setEndTimestamp(Long endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }
        public Long getEndTimestamp() {
            return this.endTimestamp;
        }

        public UpdateApprovalStatusResponseBodyApproval setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public UpdateApprovalStatusResponseBodyApproval setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public UpdateApprovalStatusResponseBodyApproval setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

        public UpdateApprovalStatusResponseBodyApproval setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public UpdateApprovalStatusResponseBodyApproval setSchemaContent(String schemaContent) {
            this.schemaContent = schemaContent;
            return this;
        }
        public String getSchemaContent() {
            return this.schemaContent;
        }

        public UpdateApprovalStatusResponseBodyApproval setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

        public UpdateApprovalStatusResponseBodyApproval setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public UpdateApprovalStatusResponseBodyApproval setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
