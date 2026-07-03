// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListDisposeStrategyRequest extends TeaModel {
    /**
     * <p>Current page number. Must be greater than or equal to 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Strategy status. Valid values:</p>
     * <ul>
     * <li><p>0: disabled</p>
     * </li>
     * <li><p>1: enabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EffectiveStatus")
    public Integer effectiveStatus;

    /**
     * <p>End time of the query, in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1577808000000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Entity feature value. Use this to perform a fuzzy search on entities.</p>
     * 
     * <strong>example:</strong>
     * <p>test22.php</p>
     */
    @NameInMap("EntityIdentity")
    public String entityIdentity;

    /**
     * <p>Entity type. Valid values:</p>
     * <ul>
     * <li><p>ip</p>
     * </li>
     * <li><p>process</p>
     * </li>
     * <li><p>file</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>Event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>49670d3bbf7aa9556a2fff3dbaa9****</p>
     */
    @NameInMap("IncidentUuid")
    public String incidentUuid;

    /**
     * <p>Sort order. Valid values:</p>
     * <ul>
     * <li><p>desc: descending</p>
     * </li>
     * <li><p>asc: ascending</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>Sort field. Valid values:</p>
     * <ul>
     * <li><p>GmtModified: sort by last modified time</p>
     * </li>
     * <li><p>GmtCreate: sort by creation time</p>
     * </li>
     * <li><p>FinishTime: sort by strategy end time</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtModified</p>
     */
    @NameInMap("OrderField")
    public String orderField;

    /**
     * <p>Number of entries per page. Maximum value is 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Unique name of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>WafBlockIP</p>
     */
    @NameInMap("PlaybookName")
    public String playbookName;

    /**
     * <p>Playbook type. Valid values:</p>
     * <ul>
     * <li><p>system: manual disposal</p>
     * </li>
     * <li><p>custom: event-triggered playbook</p>
     * </li>
     * <li><p>custom_alert: alert-triggered playbook</p>
     * </li>
     * <li><p>soar-manual: manually run playbook</p>
     * </li>
     * <li><p>soar-mdr: MDR-run playbook</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("PlaybookTypes")
    public String playbookTypes;

    /**
     * <p>UUID of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>system_aliyun_clb_process_book</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>Location of the Data Management center for Threat Analysis and Response. Select the location based on where your assets are deployed. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: assets in the Chinese mainland or Hong Kong (China)</p>
     * </li>
     * <li><p>ap-southeast-1: assets outside China</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Alibaba Cloud account ID when an administrator switches to another member\&quot;s perspective.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>View type. Valid values:</p>
     * <ul>
     * <li><p>0: view for the current Alibaba Cloud account</p>
     * </li>
     * <li><p>1: view for all accounts under the enterprise</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>ID of the security orchestration and automated response disposal strategy.</p>
     * 
     * <strong>example:</strong>
     * <p>a50a49b7-6044-4593-ab15-2b46567c****</p>
     */
    @NameInMap("SophonTaskId")
    public String sophonTaskId;

    /**
     * <p>Start time of the query, in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1577808000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>Disposal strategy status.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
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
