// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDetectionRulesShrinkRequest extends TeaModel {
    /**
     * <p>The ATT\&amp;CK technique of the alert.</p>
     * 
     * <strong>example:</strong>
     * <p>Discovery</p>
     */
    @NameInMap("AlertAttCk")
    public String alertAttCk;

    /**
     * <p>The threat level of the alert. Valid values:</p>
     * <ul>
     * <li><p>5: critical.</p>
     * </li>
     * <li><p>4: important.</p>
     * </li>
     * <li><p>3: medium.</p>
     * </li>
     * <li><p>2: low.</p>
     * </li>
     * <li><p>1: informational.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AlertLevel")
    public String alertLevel;

    /**
     * <p>The alert tactic phase.</p>
     * 
     * <strong>example:</strong>
     * <p>TA0042</p>
     */
    @NameInMap("AlertTacticId")
    public String alertTacticId;

    /**
     * <p>The alert type.</p>
     * 
     * <strong>example:</strong>
     * <p>siem_rule_type_alert_storm</p>
     */
    @NameInMap("AlertType")
    public String alertType;

    /**
     * <p>The type of the detection rule expression.</p>
     * 
     * <strong>example:</strong>
     * <p>playbook</p>
     */
    @NameInMap("DetectionExpressionType")
    public String detectionExpressionType;

    /**
     * <p>The ID of the detection rule.</p>
     * 
     * <strong>example:</strong>
     * <p>dr-ppa85gfw69tgwkys****</p>
     */
    @NameInMap("DetectionRuleId")
    public String detectionRuleId;

    /**
     * <p>The list of detection rule IDs.</p>
     */
    @NameInMap("DetectionRuleIds")
    public String detectionRuleIdsShrink;

    /**
     * <p>The name of the detection rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Detect Discovery Behavior for Local Systems Groups</p>
     */
    @NameInMap("DetectionRuleName")
    public String detectionRuleName;

    /**
     * <p>The status of the detection rule.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("DetectionRuleStatus")
    public String detectionRuleStatus;

    /**
     * <p>The type of the detection rule. Valid values:</p>
     * <ul>
     * <li><p>preset: a built-in detection rule.</p>
     * </li>
     * <li><p>custom: a custom detection rule.</p>
     * </li>
     * <li><p>custom_template: a rule template.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>preset</p>
     */
    @NameInMap("DetectionRuleType")
    public String detectionRuleType;

    /**
     * <p>The event aggregation type. Valid values:</p>
     * <ul>
     * <li><p>none: No events are generated.</p>
     * </li>
     * <li><p>graph_compute: graph computing (supported by predefined rules).</p>
     * </li>
     * <li><p>expert: expert rule.</p>
     * </li>
     * <li><p>passthrough: alert passthrough (one-to-one).</p>
     * </li>
     * <li><p>window: aggregation of similar alerts (by window).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>graph_compute</p>
     */
    @NameInMap("IncidentAggregationType")
    public String incidentAggregationType;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the log normalization category.</p>
     * 
     * <strong>example:</strong>
     * <p>NETWORK_CATEGORY</p>
     */
    @NameInMap("LogCategoryId")
    public String logCategoryId;

    /**
     * <p>The ID of the log normalization schema.</p>
     * 
     * <strong>example:</strong>
     * <p>API_RISK_ACTIVITY</p>
     */
    @NameInMap("LogSchemaId")
    public String logSchemaId;

    /**
     * <p>The maximum number of data entries to read.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to start the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p><strong>asc</strong>: ascending order. This is the default value.</p>
     * </li>
     * <li><p><strong>desc</strong>: descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("OrderDirection")
    public String orderDirection;

    /**
     * <p>The field to sort by. Valid values:</p>
     * <ul>
     * <li><p>GmtCreate: the creation time.</p>
     * </li>
     * <li><p>GmtModified: the update time.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtModified</p>
     */
    @NameInMap("OrderFieldName")
    public String orderFieldName;

    /**
     * <p>The pagination parameter. This specifies the current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The pagination parameter. This specifies the number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region where the Data Management center of threat analysis is located. Select a region based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Your assets are in the Chinese mainland.</p>
     * </li>
     * <li><p>ap-southeast-1: Your assets are outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID that the administrator uses to switch to the perspective of another member.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static ListDetectionRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDetectionRulesShrinkRequest self = new ListDetectionRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDetectionRulesShrinkRequest setAlertAttCk(String alertAttCk) {
        this.alertAttCk = alertAttCk;
        return this;
    }
    public String getAlertAttCk() {
        return this.alertAttCk;
    }

    public ListDetectionRulesShrinkRequest setAlertLevel(String alertLevel) {
        this.alertLevel = alertLevel;
        return this;
    }
    public String getAlertLevel() {
        return this.alertLevel;
    }

    public ListDetectionRulesShrinkRequest setAlertTacticId(String alertTacticId) {
        this.alertTacticId = alertTacticId;
        return this;
    }
    public String getAlertTacticId() {
        return this.alertTacticId;
    }

    public ListDetectionRulesShrinkRequest setAlertType(String alertType) {
        this.alertType = alertType;
        return this;
    }
    public String getAlertType() {
        return this.alertType;
    }

    public ListDetectionRulesShrinkRequest setDetectionExpressionType(String detectionExpressionType) {
        this.detectionExpressionType = detectionExpressionType;
        return this;
    }
    public String getDetectionExpressionType() {
        return this.detectionExpressionType;
    }

    public ListDetectionRulesShrinkRequest setDetectionRuleId(String detectionRuleId) {
        this.detectionRuleId = detectionRuleId;
        return this;
    }
    public String getDetectionRuleId() {
        return this.detectionRuleId;
    }

    public ListDetectionRulesShrinkRequest setDetectionRuleIdsShrink(String detectionRuleIdsShrink) {
        this.detectionRuleIdsShrink = detectionRuleIdsShrink;
        return this;
    }
    public String getDetectionRuleIdsShrink() {
        return this.detectionRuleIdsShrink;
    }

    public ListDetectionRulesShrinkRequest setDetectionRuleName(String detectionRuleName) {
        this.detectionRuleName = detectionRuleName;
        return this;
    }
    public String getDetectionRuleName() {
        return this.detectionRuleName;
    }

    public ListDetectionRulesShrinkRequest setDetectionRuleStatus(String detectionRuleStatus) {
        this.detectionRuleStatus = detectionRuleStatus;
        return this;
    }
    public String getDetectionRuleStatus() {
        return this.detectionRuleStatus;
    }

    public ListDetectionRulesShrinkRequest setDetectionRuleType(String detectionRuleType) {
        this.detectionRuleType = detectionRuleType;
        return this;
    }
    public String getDetectionRuleType() {
        return this.detectionRuleType;
    }

    public ListDetectionRulesShrinkRequest setIncidentAggregationType(String incidentAggregationType) {
        this.incidentAggregationType = incidentAggregationType;
        return this;
    }
    public String getIncidentAggregationType() {
        return this.incidentAggregationType;
    }

    public ListDetectionRulesShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListDetectionRulesShrinkRequest setLogCategoryId(String logCategoryId) {
        this.logCategoryId = logCategoryId;
        return this;
    }
    public String getLogCategoryId() {
        return this.logCategoryId;
    }

    public ListDetectionRulesShrinkRequest setLogSchemaId(String logSchemaId) {
        this.logSchemaId = logSchemaId;
        return this;
    }
    public String getLogSchemaId() {
        return this.logSchemaId;
    }

    public ListDetectionRulesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDetectionRulesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDetectionRulesShrinkRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListDetectionRulesShrinkRequest setOrderFieldName(String orderFieldName) {
        this.orderFieldName = orderFieldName;
        return this;
    }
    public String getOrderFieldName() {
        return this.orderFieldName;
    }

    public ListDetectionRulesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDetectionRulesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDetectionRulesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDetectionRulesShrinkRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
