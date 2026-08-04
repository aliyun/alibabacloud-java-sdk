// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApprovalsRequest extends TeaModel {
    /**
     * <p>Collection of approval instance IDs.</p>
     */
    @NameInMap("ApprovalIds")
    public java.util.List<String> approvalIds;

    /**
     * <p>End time when the approval instance was created, in seconds since the Unix epoch.</p>
     * 
     * <strong>example:</strong>
     * <p>1736750500</p>
     */
    @NameInMap("CreateEndTime")
    public Long createEndTime;

    /**
     * <p>Start time when the approval instance was created, in seconds since the Unix epoch.</p>
     * 
     * <strong>example:</strong>
     * <p>1730000000</p>
     */
    @NameInMap("CreateStartTime")
    public Long createStartTime;

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
     * <p>Page number for the current page in a paged query. Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>ID of the user who performed an operation on the approval instance.</p>
     * 
     * <strong>example:</strong>
     * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
     */
    @NameInMap("OperatorUserId")
    public String operatorUserId;

    /**
     * <p>Username of the user who performed an operation on the approval instance.</p>
     * 
     * <strong>example:</strong>
     * <p>李小姐</p>
     */
    @NameInMap("OperatorUsername")
    public String operatorUsername;

    /**
     * <p>Number of entries per page in a paged query. Valid values: 1 to 500.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Policy type. Valid values:</p>
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
     * <p>test</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>Collection of approval instance statuses.</p>
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
