// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListApprovalTasksByUserRequest extends TeaModel {
    /**
     * <p>The query conditions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListApprovalTasksByUserRequestListQuery listQuery;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static ListApprovalTasksByUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApprovalTasksByUserRequest self = new ListApprovalTasksByUserRequest();
        return TeaModel.build(map, self);
    }

    public ListApprovalTasksByUserRequest setListQuery(ListApprovalTasksByUserRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListApprovalTasksByUserRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListApprovalTasksByUserRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListApprovalTasksByUserRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class ListApprovalTasksByUserRequestListQuery extends TeaModel {
        /**
         * <p>The approval task type. Valid values:</p>
         * <ul>
         * <li>APPROVE: Permission approval.</li>
         * <li>MANAGE: Management.</li>
         * <li>OTHERS: Others.</li>
         * <li>ATOMIC: Atomic metric approval.</li>
         * <li>BIZ_OBJECT: Business object approval.</li>
         * <li>BIZ_PROCESS: Business process approval.</li>
         * <li>PUBLISH_APPROVE: Publish approval.</li>
         * <li>BASELINE_APPROVE: Baseline approval.</li>
         * <li>CODE_REVIEW: Asset approval.</li>
         * <li>OBJECT_CODE_REVIEW: Code review.</li>
         * <li>STANDARD_APPROVAL: Standard online approval.</li>
         * <li>BATCH_STANDARD_APPROVAL: Batch standard online approval.</li>
         * <li>STANDARD_OFFLINE_APPROVAL: Standard offline approval.</li>
         * <li>BATCH_STANDARD_OFFLINE_APPROVAL: Batch standard offline approval.</li>
         * <li>PRIVILEGE_TRANSFER_APPROVAL: Permission transfer approval.</li>
         * <li>QD_FEATURE_ONLINE: Label listing.</li>
         * <li>QD_FEATURE_OFFLINE: Label delisting.</li>
         * <li>QD_CLUSTER_ONLINE: Group online.</li>
         * <li>QD_CLUSTER_OFFLINE: Group offline.</li>
         * <li>QD_MEMBER_ADD_APP: Add member to application.</li>
         * <li>QD_FEATURE_ADD_APP: Add label to application.</li>
         * <li>QD_CLUSTER_ADD_APP: Add group to application.</li>
         * <li>QD_FEATURE_ADD_PROJECT: Add label to project.</li>
         * <li>QD_CLUSTER_ADD_PROJECT: Add group to project.</li>
         * <li>TASK_DATA_DOWNLOAD: Data download.</li>
         * <li>CUSTOM_OPERATE: Custom operation.</li>
         * <li>PRIVACY_COMPUTING: Privacy-preserving computation.</li>
         * <li>MDC_TOPIC_DIR_PUBLISH: Asset topic directory publish.</li>
         * <li>ASSET_PUBLISH: Asset listing approval.</li>
         * <li>ASSET_UN_PUBLISH: Asset delisting approval.</li>
         * <li>APPLICATION_CREATE: Application creation approval.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DATA_SOURCE</p>
         */
        @NameInMap("ApprovalType")
        public String approvalType;

        /**
         * <p>The keyword for fuzzy match on the task name.</p>
         * 
         * <strong>example:</strong>
         * <p>datasource</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>The page number, starting from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of records per page. Default value: 20. Maximum value: 100. Values greater than 100 are automatically adjusted to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The relationship type between the current user and the approval task. This parameter is required. Valid values:</p>
         * <ul>
         * <li>SUBMITTED: Submitted by me.</li>
         * <li>PENDING_APPROVAL: Pending my approval.</li>
         * <li>PROCESSED: Processed by me.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SUBMITTED</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        /**
         * <p>The approval status filter. Status filtering is not supported in the pending scenario. Valid values:</p>
         * <ul>
         * <li>APPROVING: Approving.</li>
         * <li>APPROVED: Approved.</li>
         * <li>REJECTED: Rejected.</li>
         * <li>REVOKED: Revoked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>APPROVED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The start of the submission time range, in the format yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01 00:00:00</p>
         */
        @NameInMap("SubmittedFrom")
        public String submittedFrom;

        /**
         * <p>The end of the submission time range, in the format yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-31 23:59:59</p>
         */
        @NameInMap("SubmittedTo")
        public String submittedTo;

        public static ListApprovalTasksByUserRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListApprovalTasksByUserRequestListQuery self = new ListApprovalTasksByUserRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListApprovalTasksByUserRequestListQuery setApprovalType(String approvalType) {
            this.approvalType = approvalType;
            return this;
        }
        public String getApprovalType() {
            return this.approvalType;
        }

        public ListApprovalTasksByUserRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListApprovalTasksByUserRequestListQuery setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListApprovalTasksByUserRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListApprovalTasksByUserRequestListQuery setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public ListApprovalTasksByUserRequestListQuery setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListApprovalTasksByUserRequestListQuery setSubmittedFrom(String submittedFrom) {
            this.submittedFrom = submittedFrom;
            return this;
        }
        public String getSubmittedFrom() {
            return this.submittedFrom;
        }

        public ListApprovalTasksByUserRequestListQuery setSubmittedTo(String submittedTo) {
            this.submittedTo = submittedTo;
            return this;
        }
        public String getSubmittedTo() {
            return this.submittedTo;
        }

    }

}
