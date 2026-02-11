// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListDisposeStrategyRequest extends TeaModel {
    /**
     * <p>The page number. Pages start from page 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The status of the policy. Valid values:</p>
     * <ul>
     * <li>0: invalid</li>
     * <li>1: valid</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EffectiveStatus")
    public Integer effectiveStatus;

    /**
     * <p>The end of the time range to query. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1577808000000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The feature value of the entity. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test22.php</p>
     */
    @NameInMap("EntityIdentity")
    public String entityIdentity;

    /**
     * <p>The entity type of the playbook. Valid values:</p>
     * <ul>
     * <li>ip</li>
     * <li>process</li>
     * <li>file</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("IncidentUuid")
    public String incidentUuid;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li>desc: descending order.</li>
     * <li>asc: ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The sort field. Valid values:</p>
     * <ul>
     * <li>GmtModified: sorts the policies by update time.</li>
     * <li>GmtCreate: sorts the policies by creation time.</li>
     * <li>FinishTime: sorts the policies by end time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtModified</p>
     */
    @NameInMap("OrderField")
    public String orderField;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the playbook, which is the unique identifier of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>WafBlockIP</p>
     */
    @NameInMap("PlaybookName")
    public String playbookName;

    /**
     * <p>The type of the playbook. Valid values:</p>
     * <ul>
     * <li>system: user-triggered playbook</li>
     * <li>custom: event-triggered playbook</li>
     * <li>custom_alert: alert-triggered playbook</li>
     * <li>soar-manual: user-run playbook</li>
     * <li>soar-mdr: MDR-run playbook</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("PlaybookTypes")
    public String playbookTypes;

    /**
     * <p>The UUID of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>system_aliyun_clb_process_book</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in regions in China.</li>
     * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the account that you switch from the management account.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The type of the view. Valid values:</p>
     * <ul>
     * <li>0: the current Alibaba Cloud account</li>
     * <li>1: the global account</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The ID of the SOAR handling policy.</p>
     * 
     * <strong>example:</strong>
     * <p>a50a49b7-6044-4593-ab15-2b46567caadd</p>
     */
    @NameInMap("SophonTaskId")
    public String sophonTaskId;

    /**
     * <p>The beginning of the time range to query. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1577808000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Status")
    public Integer status;

    public static ListDisposeStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDisposeStrategyRequest self = new ListDisposeStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ListDisposeStrategyRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDisposeStrategyRequest setEffectiveStatus(Integer effectiveStatus) {
        this.effectiveStatus = effectiveStatus;
        return this;
    }
    public Integer getEffectiveStatus() {
        return this.effectiveStatus;
    }

    public ListDisposeStrategyRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListDisposeStrategyRequest setEntityIdentity(String entityIdentity) {
        this.entityIdentity = entityIdentity;
        return this;
    }
    public String getEntityIdentity() {
        return this.entityIdentity;
    }

    public ListDisposeStrategyRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public ListDisposeStrategyRequest setIncidentUuid(String incidentUuid) {
        this.incidentUuid = incidentUuid;
        return this;
    }
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    public ListDisposeStrategyRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListDisposeStrategyRequest setOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }
    public String getOrderField() {
        return this.orderField;
    }

    public ListDisposeStrategyRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDisposeStrategyRequest setPlaybookName(String playbookName) {
        this.playbookName = playbookName;
        return this;
    }
    public String getPlaybookName() {
        return this.playbookName;
    }

    public ListDisposeStrategyRequest setPlaybookTypes(String playbookTypes) {
        this.playbookTypes = playbookTypes;
        return this;
    }
    public String getPlaybookTypes() {
        return this.playbookTypes;
    }

    public ListDisposeStrategyRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public ListDisposeStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDisposeStrategyRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListDisposeStrategyRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public ListDisposeStrategyRequest setSophonTaskId(String sophonTaskId) {
        this.sophonTaskId = sophonTaskId;
        return this;
    }
    public String getSophonTaskId() {
        return this.sophonTaskId;
    }

    public ListDisposeStrategyRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListDisposeStrategyRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
