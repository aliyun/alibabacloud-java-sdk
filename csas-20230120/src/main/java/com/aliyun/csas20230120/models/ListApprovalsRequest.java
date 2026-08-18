// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApprovalsRequest extends TeaModel {
    /**
     * <p>The collection of approval instance IDs.</p>
     */
    @NameInMap("ApprovalIds")
    public java.util.List<String> approvalIds;

    /**
     * <p>The end time for approval instance creation, in seconds-level timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1736750500</p>
     */
    @NameInMap("CreateEndTime")
    public Long createEndTime;

    /**
     * <p>The start time for approval instance creation, in seconds-level timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1730000000</p>
     */
    @NameInMap("CreateStartTime")
    public Long createStartTime;

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
     * <p>The page number of the current page in a paging query. Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The list of report effective statuses. Valid values: Enabled, Expired.</p>
     */
    @NameInMap("EffectStatuses")
    public java.util.List<String> effectStatuses;

    /**
     * <p>The ID of the approval instance operator.</p>
     * 
     * <strong>example:</strong>
     * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
     */
    @NameInMap("OperatorUserId")
    public String operatorUserId;

    /**
     * <p>The username of the approval instance operator.</p>
     * 
     * <strong>example:</strong>
     * <p>Ms. Li</p>
     */
    @NameInMap("OperatorUsername")
    public String operatorUsername;

    /**
     * <p>The number of entries per page in a paging query. Valid values: 1 to 500.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The adaptation policy type. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>DlpSend</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The associated approval process ID.</p>
     * 
     * <strong>example:</strong>
     * <p>approval-process-fcc351b8a95b****</p>
     */
    @NameInMap("ProcessId")
    public String processId;

    /**
     * <p>The associated approval process name.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("ProcessName")
    public String processName;

    /**
     * <p>The list of report types. If not specified, only ApprovalReport is queried.</p>
     */
    @NameInMap("ReportTypes")
    public java.util.List<String> reportTypes;

    /**
     * <p>The associated approval template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>approval-schema-090134f1ebff****</p>
     */
    @NameInMap("SchemaId")
    public String schemaId;

    /**
     * <p>The associated approval template name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The collection of approval instance statuses.</p>
     */
    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    public static ListApprovalsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApprovalsRequest self = new ListApprovalsRequest();
        return TeaModel.build(map, self);
    }

    public ListApprovalsRequest setApprovalIds(java.util.List<String> approvalIds) {
        this.approvalIds = approvalIds;
        return this;
    }
    public java.util.List<String> getApprovalIds() {
        return this.approvalIds;
    }

    public ListApprovalsRequest setCreateEndTime(Long createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }
    public Long getCreateEndTime() {
        return this.createEndTime;
    }

    public ListApprovalsRequest setCreateStartTime(Long createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }
    public Long getCreateStartTime() {
        return this.createStartTime;
    }

    public ListApprovalsRequest setCreatorDepartment(String creatorDepartment) {
        this.creatorDepartment = creatorDepartment;
        return this;
    }
    public String getCreatorDepartment() {
        return this.creatorDepartment;
    }

    public ListApprovalsRequest setCreatorDevTag(String creatorDevTag) {
        this.creatorDevTag = creatorDevTag;
        return this;
    }
    public String getCreatorDevTag() {
        return this.creatorDevTag;
    }

    public ListApprovalsRequest setCreatorUserId(String creatorUserId) {
        this.creatorUserId = creatorUserId;
        return this;
    }
    public String getCreatorUserId() {
        return this.creatorUserId;
    }

    public ListApprovalsRequest setCreatorUsername(String creatorUsername) {
        this.creatorUsername = creatorUsername;
        return this;
    }
    public String getCreatorUsername() {
        return this.creatorUsername;
    }

    public ListApprovalsRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListApprovalsRequest setEffectStatuses(java.util.List<String> effectStatuses) {
        this.effectStatuses = effectStatuses;
        return this;
    }
    public java.util.List<String> getEffectStatuses() {
        return this.effectStatuses;
    }

    public ListApprovalsRequest setOperatorUserId(String operatorUserId) {
        this.operatorUserId = operatorUserId;
        return this;
    }
    public String getOperatorUserId() {
        return this.operatorUserId;
    }

    public ListApprovalsRequest setOperatorUsername(String operatorUsername) {
        this.operatorUsername = operatorUsername;
        return this;
    }
    public String getOperatorUsername() {
        return this.operatorUsername;
    }

    public ListApprovalsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListApprovalsRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public ListApprovalsRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public ListApprovalsRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public ListApprovalsRequest setReportTypes(java.util.List<String> reportTypes) {
        this.reportTypes = reportTypes;
        return this;
    }
    public java.util.List<String> getReportTypes() {
        return this.reportTypes;
    }

    public ListApprovalsRequest setSchemaId(String schemaId) {
        this.schemaId = schemaId;
        return this;
    }
    public String getSchemaId() {
        return this.schemaId;
    }

    public ListApprovalsRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public ListApprovalsRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

}
