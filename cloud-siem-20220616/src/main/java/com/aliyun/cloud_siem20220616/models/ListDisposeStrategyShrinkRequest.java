// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListDisposeStrategyShrinkRequest extends TeaModel {
    @NameInMap("AlertUuid")
    public String alertUuid;

    /**
     * <p>The current page number, which must be greater than or equal to 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The policy status. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EffectiveStatus")
    public Integer effectiveStatus;

    /**
     * <p>The query end time, in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1577808000000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The entity characteristic value, which can be used for fuzzy match on response entities.</p>
     * 
     * <strong>example:</strong>
     * <p>test22.php</p>
     */
    @NameInMap("EntityIdentity")
    public String entityIdentity;

    /**
     * <p>The entity type. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("EntityUuidList")
    public String entityUuidListShrink;

    @NameInMap("GroupBy")
    public String groupBy;

    @NameInMap("GroupKey")
    public String groupKey;

    /**
     * <p>The event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>49670d3bbf7aa9556a2fff3dbaa9****</p>
     */
    @NameInMap("IncidentUuid")
    public String incidentUuid;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort direction. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The field used to sort results. Valid values:</p>
     * <ul>
     * <li>GmtModified: sorts results by update time.</li>
     * <li>GmtCreate: sorts results by creation time.</li>
     * <li>FinishTime: sorts results by policy end time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtModified</p>
     */
    @NameInMap("OrderField")
    public String orderField;

    /**
     * <p>The number of entries per page, with a maximum of 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique identifier name of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>WafBlockIP</p>
     */
    @NameInMap("PlaybookName")
    public String playbookName;

    /**
     * <p>The playbook type. Valid values:</p>
     * <ul>
     * <li>system: manual handling</li>
     * <li>custom: event-triggered playbook</li>
     * <li>custom_alert: alert-triggered playbook</li>
     * <li>soar-manual: manually run playbook</li>
     * <li>soar-mdr: MDR-run playbook</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("PlaybookTypes")
    public String playbookTypes;

    /**
     * <p>The playbook UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>system_aliyun_clb_process_book</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    @NameInMap("QueryMode")
    public String queryMode;

    /**
     * <p>The region where the data management center of Cloud Threat Detection and Response (CTDR) is located. Specify the management center based on the region of your assets. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResponseRuleId")
    public String responseRuleId;

    /**
     * <p>The Alibaba Cloud account ID of the member to which the administrator switches the view.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The SOAR response policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>a50a49b7-6044-4593-ab15-2b46567c****</p>
     */
    @NameInMap("SophonTaskId")
    public String sophonTaskId;

    /**
     * <p>The query start time, in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1577808000000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The response policy status.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public Integer status;

    @NameInMap("StrategyId")
    public String strategyId;

    public static ListDisposeStrategyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDisposeStrategyShrinkRequest self = new ListDisposeStrategyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDisposeStrategyShrinkRequest setAlertUuid(String alertUuid) {
        this.alertUuid = alertUuid;
        return this;
    }
    public String getAlertUuid() {
        return this.alertUuid;
    }

    public ListDisposeStrategyShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDisposeStrategyShrinkRequest setEffectiveStatus(Integer effectiveStatus) {
        this.effectiveStatus = effectiveStatus;
        return this;
    }
    public Integer getEffectiveStatus() {
        return this.effectiveStatus;
    }

    public ListDisposeStrategyShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListDisposeStrategyShrinkRequest setEntityIdentity(String entityIdentity) {
        this.entityIdentity = entityIdentity;
        return this;
    }
    public String getEntityIdentity() {
        return this.entityIdentity;
    }

    public ListDisposeStrategyShrinkRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public ListDisposeStrategyShrinkRequest setEntityUuidListShrink(String entityUuidListShrink) {
        this.entityUuidListShrink = entityUuidListShrink;
        return this;
    }
    public String getEntityUuidListShrink() {
        return this.entityUuidListShrink;
    }

    public ListDisposeStrategyShrinkRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public ListDisposeStrategyShrinkRequest setGroupKey(String groupKey) {
        this.groupKey = groupKey;
        return this;
    }
    public String getGroupKey() {
        return this.groupKey;
    }

    public ListDisposeStrategyShrinkRequest setIncidentUuid(String incidentUuid) {
        this.incidentUuid = incidentUuid;
        return this;
    }
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    public ListDisposeStrategyShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDisposeStrategyShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDisposeStrategyShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListDisposeStrategyShrinkRequest setOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }
    public String getOrderField() {
        return this.orderField;
    }

    public ListDisposeStrategyShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDisposeStrategyShrinkRequest setPlaybookName(String playbookName) {
        this.playbookName = playbookName;
        return this;
    }
    public String getPlaybookName() {
        return this.playbookName;
    }

    public ListDisposeStrategyShrinkRequest setPlaybookTypes(String playbookTypes) {
        this.playbookTypes = playbookTypes;
        return this;
    }
    public String getPlaybookTypes() {
        return this.playbookTypes;
    }

    public ListDisposeStrategyShrinkRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public ListDisposeStrategyShrinkRequest setQueryMode(String queryMode) {
        this.queryMode = queryMode;
        return this;
    }
    public String getQueryMode() {
        return this.queryMode;
    }

    public ListDisposeStrategyShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDisposeStrategyShrinkRequest setResponseRuleId(String responseRuleId) {
        this.responseRuleId = responseRuleId;
        return this;
    }
    public String getResponseRuleId() {
        return this.responseRuleId;
    }

    public ListDisposeStrategyShrinkRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ListDisposeStrategyShrinkRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public ListDisposeStrategyShrinkRequest setSophonTaskId(String sophonTaskId) {
        this.sophonTaskId = sophonTaskId;
        return this;
    }
    public String getSophonTaskId() {
        return this.sophonTaskId;
    }

    public ListDisposeStrategyShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListDisposeStrategyShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListDisposeStrategyShrinkRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

}
