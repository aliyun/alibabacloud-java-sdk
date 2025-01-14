// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApprovalsResponseBody extends TeaModel {
    @NameInMap("Approvals")
    public java.util.List<ListApprovalsResponseBodyApprovals> approvals;

    /**
     * <strong>example:</strong>
     * <p>6965F5BA-53B6-5650-A708-51F090F843BB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

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
        public java.util.List<ListApprovalsResponseBodyApprovalsApprovalProgressesOperators> operators;

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
        @NameInMap("ApprovalDetail")
        public String approvalDetail;

        /**
         * <strong>example:</strong>
         * <p>approval-872b5e911b35****</p>
         */
        @NameInMap("ApprovalId")
        public String approvalId;

        @NameInMap("ApprovalProgresses")
        public java.util.List<ListApprovalsResponseBodyApprovalsApprovalProgresses> approvalProgresses;

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
