// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAlertHistoriesRequest extends TeaModel {
    /**
     * <p>The unique identifier (transId) of an alert history record.</p>
     * 
     * <strong>example:</strong>
     * <p>lme6hk5qih5o769m379jjuo5i1</p>
     */
    @NameInMap("alertHistoryId")
    public String alertHistoryId;

    /**
     * <p>Filters the history records by a specific alert rule. Specify the unique identifier (ruleUuid) of the alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>mig_prom_v2_11308451</p>
     */
    @NameInMap("alertRuleId")
    public String alertRuleId;

    /**
     * <p>The business source of the alert history. For example, <code>managed_service_for_prometheus</code> indicates the managed type of the Prometheus integration center. The default value is empty. Leave this parameter empty if you are unsure about the value.</p>
     * 
     * <strong>example:</strong>
     * <p>managed_service_for_prometheus</p>
     */
    @NameInMap("bizSource")
    public String bizSource;

    /**
     * <p>The namespace of CloudMonitor. Examples: acs_rds_dashboard and acs_ecs_dashboard.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_rds_dashboard</p>
     */
    @NameInMap("cmsNamespace")
    public String cmsNamespace;

    /**
     * <p>The product category of CloudMonitor.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("cmsProductCategory")
    public String cmsProductCategory;

    /**
     * <p>The keyword used for fuzzy matching and filtering based on the display name of the alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>keyword</p>
     */
    @NameInMap("displayNameKeyWord")
    public String displayNameKeyWord;

    /**
     * <p>The unique key (instanceKey) used to identify the alert object instance.</p>
     * 
     * <strong>example:</strong>
     * <p>entity/apm/apm.service/6dc9e46fda6d012537b48c3250ff806b</p>
     */
    @NameInMap("instanceKey")
    public String instanceKey;

    /**
     * <p>The filter condition for rule labels. The value is a JSON-formatted string that supports filtering by label key-value pairs.</p>
     */
    @NameInMap("labelFilter")
    public AlertRuleLabelFilter labelFilter;

    /**
     * <p>The level of the most recent alert during the alert duration. Valid values: CRITICAL, WARN, and INFO.</p>
     * 
     * <strong>example:</strong>
     * <p>CRITICAL</p>
     */
    @NameInMap("latestLevel")
    public String latestLevel;

    /**
     * <p>The highest alert level reached during the alert duration. Valid values: CRITICAL, WARN, and INFO.</p>
     * 
     * <strong>example:</strong>
     * <p>CRITICAL</p>
     */
    @NameInMap("maxLevel")
    public String maxLevel;

    /**
     * <p>The maximum number of results to return on each page. This parameter is not supported. Use pageSize and pageNumber for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The migration status of the alert history.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("migrationStatus")
    public Integer migrationStatus;

    /**
     * <p>The pagination token used for the next query. This parameter is not supported. Use pageSize and pageNumber for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>2-ba4d-4b9f-aa24-dcb067a30f1c</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Filters alert rules that contain specific notification recipients. Only rules that contain at least one of the notification recipients specified in notifyTargets are returned in the result list.</p>
     */
    @NameInMap("notificationFilter")
    public AlertRuleNotificationFilter notificationFilter;

    /**
     * <p>The relation type of the observed object. Examples: GROUP, INSTANCE, and TAG.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("observeRelationType")
    public String observeRelationType;

    /**
     * <p>The dimension column (domain) of the observed object.</p>
     * 
     * <strong>example:</strong>
     * <p>acs</p>
     */
    @NameInMap("observeResourceDomain")
    public String observeResourceDomain;

    /**
     * <p>Specifies whether the observed object is in the global scope.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("observeResourceGlobalScope")
    public Boolean observeResourceGlobalScope;

    /**
     * <p>Filters the alert history by resource instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1234567890abcdef</p>
     */
    @NameInMap("observeResourceInstanceId")
    public String observeResourceInstanceId;

    /**
     * <p>The type of the observed object. Examples: PROMETHEUS, APM, RUM, and cms_basic.</p>
     * 
     * <strong>example:</strong>
     * <p>PROMETHEUS</p>
     */
    @NameInMap("observeResourceType")
    public String observeResourceType;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of alert history records to return on each page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The key used for data partitioning. Typically, you do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("partitionKey")
    public String partitionKey;

    /**
     * <p>The start timestamp of the time range for the alert start time. The value is a UNIX timestamp in milliseconds. If not specified, the default value is the time 30 days ago.</p>
     * 
     * <strong>example:</strong>
     * <p>1739866071668</p>
     */
    @NameInMap("startTimeFrom")
    public Long startTimeFrom;

    /**
     * <p>The end timestamp of the time range for the alert start time. The value is a UNIX timestamp in milliseconds. If not specified, the default value is the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>1739866071668</p>
     */
    @NameInMap("startTimeTo")
    public Long startTimeTo;

    /**
     * <p>The current status of the alert history. Valid values: OK and ALARM.</p>
     * 
     * <strong>example:</strong>
     * <p>ALARM</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The identifier of the workspace to which the alert history belongs. If not specified, the default workspace is used.</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-<userId>-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static ListAlertHistoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertHistoriesRequest self = new ListAlertHistoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertHistoriesRequest setAlertHistoryId(String alertHistoryId) {
        this.alertHistoryId = alertHistoryId;
        return this;
    }
    public String getAlertHistoryId() {
        return this.alertHistoryId;
    }

    public ListAlertHistoriesRequest setAlertRuleId(String alertRuleId) {
        this.alertRuleId = alertRuleId;
        return this;
    }
    public String getAlertRuleId() {
        return this.alertRuleId;
    }

    public ListAlertHistoriesRequest setBizSource(String bizSource) {
        this.bizSource = bizSource;
        return this;
    }
    public String getBizSource() {
        return this.bizSource;
    }

    public ListAlertHistoriesRequest setCmsNamespace(String cmsNamespace) {
        this.cmsNamespace = cmsNamespace;
        return this;
    }
    public String getCmsNamespace() {
        return this.cmsNamespace;
    }

    public ListAlertHistoriesRequest setCmsProductCategory(String cmsProductCategory) {
        this.cmsProductCategory = cmsProductCategory;
        return this;
    }
    public String getCmsProductCategory() {
        return this.cmsProductCategory;
    }

    public ListAlertHistoriesRequest setDisplayNameKeyWord(String displayNameKeyWord) {
        this.displayNameKeyWord = displayNameKeyWord;
        return this;
    }
    public String getDisplayNameKeyWord() {
        return this.displayNameKeyWord;
    }

    public ListAlertHistoriesRequest setInstanceKey(String instanceKey) {
        this.instanceKey = instanceKey;
        return this;
    }
    public String getInstanceKey() {
        return this.instanceKey;
    }

    public ListAlertHistoriesRequest setLabelFilter(AlertRuleLabelFilter labelFilter) {
        this.labelFilter = labelFilter;
        return this;
    }
    public AlertRuleLabelFilter getLabelFilter() {
        return this.labelFilter;
    }

    public ListAlertHistoriesRequest setLatestLevel(String latestLevel) {
        this.latestLevel = latestLevel;
        return this;
    }
    public String getLatestLevel() {
        return this.latestLevel;
    }

    public ListAlertHistoriesRequest setMaxLevel(String maxLevel) {
        this.maxLevel = maxLevel;
        return this;
    }
    public String getMaxLevel() {
        return this.maxLevel;
    }

    public ListAlertHistoriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAlertHistoriesRequest setMigrationStatus(Integer migrationStatus) {
        this.migrationStatus = migrationStatus;
        return this;
    }
    public Integer getMigrationStatus() {
        return this.migrationStatus;
    }

    public ListAlertHistoriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAlertHistoriesRequest setNotificationFilter(AlertRuleNotificationFilter notificationFilter) {
        this.notificationFilter = notificationFilter;
        return this;
    }
    public AlertRuleNotificationFilter getNotificationFilter() {
        return this.notificationFilter;
    }

    public ListAlertHistoriesRequest setObserveRelationType(String observeRelationType) {
        this.observeRelationType = observeRelationType;
        return this;
    }
    public String getObserveRelationType() {
        return this.observeRelationType;
    }

    public ListAlertHistoriesRequest setObserveResourceDomain(String observeResourceDomain) {
        this.observeResourceDomain = observeResourceDomain;
        return this;
    }
    public String getObserveResourceDomain() {
        return this.observeResourceDomain;
    }

    public ListAlertHistoriesRequest setObserveResourceGlobalScope(Boolean observeResourceGlobalScope) {
        this.observeResourceGlobalScope = observeResourceGlobalScope;
        return this;
    }
    public Boolean getObserveResourceGlobalScope() {
        return this.observeResourceGlobalScope;
    }

    public ListAlertHistoriesRequest setObserveResourceInstanceId(String observeResourceInstanceId) {
        this.observeResourceInstanceId = observeResourceInstanceId;
        return this;
    }
    public String getObserveResourceInstanceId() {
        return this.observeResourceInstanceId;
    }

    public ListAlertHistoriesRequest setObserveResourceType(String observeResourceType) {
        this.observeResourceType = observeResourceType;
        return this;
    }
    public String getObserveResourceType() {
        return this.observeResourceType;
    }

    public ListAlertHistoriesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAlertHistoriesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAlertHistoriesRequest setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }
    public String getPartitionKey() {
        return this.partitionKey;
    }

    public ListAlertHistoriesRequest setStartTimeFrom(Long startTimeFrom) {
        this.startTimeFrom = startTimeFrom;
        return this;
    }
    public Long getStartTimeFrom() {
        return this.startTimeFrom;
    }

    public ListAlertHistoriesRequest setStartTimeTo(Long startTimeTo) {
        this.startTimeTo = startTimeTo;
        return this;
    }
    public Long getStartTimeTo() {
        return this.startTimeTo;
    }

    public ListAlertHistoriesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListAlertHistoriesRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
