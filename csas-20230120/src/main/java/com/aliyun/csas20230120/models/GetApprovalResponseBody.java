// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetApprovalResponseBody extends TeaModel {
    @NameInMap("Approval")
    public java.util.List<GetApprovalResponseBodyApproval> approval;

    /**
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
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

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
        public java.util.List<GetApprovalResponseBodyApprovalApprovalProgressesOperators> operators;

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
        @NameInMap("ApprovalDetail")
        public String approvalDetail;

        /**
         * <strong>example:</strong>
         * <p>approval-3564b140642f****</p>
         */
        @NameInMap("ApprovalId")
        public String approvalId;

        @NameInMap("ApprovalProgresses")
        public java.util.List<GetApprovalResponseBodyApprovalApprovalProgresses> approvalProgresses;

        /**
         * <strong>example:</strong>
         * <p>2022-11-15 22:11:55</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreatorDepartment")
        public String creatorDepartment;

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

        @NameInMap("CreatorUsername")
        public String creatorUsername;

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
