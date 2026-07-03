// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateDetectionRuleRequest extends TeaModel {
    /**
     * <p>The ATT\&amp;CK stage of the alert.</p>
     * 
     * <strong>example:</strong>
     * <p>Discovery</p>
     */
    @NameInMap("AlertAttCk")
    public String alertAttCk;

    @NameInMap("AlertAttCkMapping")
    public String alertAttCkMapping;

    /**
     * <p>The alert description. You can use $$ to reference fields from the query output.</p>
     * 
     * <strong>example:</strong>
     * <p>Alert from: $product_code$, detected network attack from $src_ip$, affected assets include: $dst_ip$</p>
     */
    @NameInMap("AlertDescription")
    public String alertDescription;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AlertLevel")
    public String alertLevel;

    @NameInMap("AlertLevelMapping")
    public String alertLevelMapping;

    /**
     * <p>The alert name. You can use $$ to reference fields from the query output.</p>
     * 
     * <strong>example:</strong>
     * <p>Detected high-frequency multi-type network attacks from $src_ip$</p>
     */
    @NameInMap("AlertName")
    public String alertName;

    /**
     * <p>The ID of the alert template for the detection rule. Valid values:</p>
     * <ul>
     * <li><p>ALERT_ACTIVITY: other alerts.</p>
     * </li>
     * <li><p>EDR_ALERT_ACTIVITY: Endpoint Detection and Response (EDR) alerts.</p>
     * </li>
     * <li><p>FIREWALL_ALERT_ACTIVITY: firewall alerts.</p>
     * </li>
     * <li><p>WAF_ALERT_ACTIVITY: Web Application Firewall (WAF) alerts.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALERT_ACTIVITY</p>
     */
    @NameInMap("AlertSchemaId")
    public String alertSchemaId;

    /**
     * <p>The tactic phase of the alert.</p>
     * 
     * <strong>example:</strong>
     * <p>TA0042</p>
     */
    @NameInMap("AlertTacticId")
    public String alertTacticId;

    /**
     * <p>The count for the alert threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AlertThresholdCount")
    public Integer alertThresholdCount;

    /**
     * <p>The list of fields for the alert threshold. Separate multiple fields with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>alert_type,ip</p>
     */
    @NameInMap("AlertThresholdGroup")
    public String alertThresholdGroup;

    /**
     * <p>The length of the alert threshold period.</p>
     * 
     * <strong>example:</strong>
     * <p>5m</p>
     */
    @NameInMap("AlertThresholdPeriod")
    public String alertThresholdPeriod;

    /**
     * <p>The alert type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WebShell</p>
     */
    @NameInMap("AlertType")
    public String alertType;

    @NameInMap("AlertTypeMapping")
    public String alertTypeMapping;

    /**
     * <p>The content of the detection rule expression.</p>
     * 
     * <strong>example:</strong>
     * <p>*|set session mode=scan;SELECT * FROM log
     * WHERE schema = \&quot;PROCESS_START_ACTIVITY\&quot;
     * AND (
     *     proc_path LIKE \&quot;%/groups\&quot;
     *     OR (
     *         (
     *             proc_path LIKE \&quot;%/cat\&quot;
     *             OR proc_path LIKE \&quot;%/head\&quot;
     *             OR proc_path LIKE \&quot;%/tail\&quot;
     *             OR proc_path LIKE \&quot;%/more\&quot;
     *         )
     *         AND cmdline LIKE \&quot;%/etc/group%\&quot;
     *     )
     * )</p>
     */
    @NameInMap("DetectionExpressionContent")
    public String detectionExpressionContent;

    /**
     * <p>The type of the detection rule expression. Valid values:</p>
     * <ul>
     * <li><p>sql: SQL.</p>
     * </li>
     * <li><p>playbook: playbook.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sql</p>
     */
    @NameInMap("DetectionExpressionType")
    public String detectionExpressionType;

    /**
     * <p>The description of the detection rule.</p>
     * 
     * <strong>example:</strong>
     * <p>dr-123</p>
     */
    @NameInMap("DetectionRuleDescription")
    public String detectionRuleDescription;

    /**
     * <p>The name of the detection rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dr-ha1i09ob3zmqrs85****</p>
     */
    @NameInMap("DetectionRuleName")
    public String detectionRuleName;

    /**
     * <p>The status of the detection rule.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DetectionRuleStatus")
    public String detectionRuleStatus;

    /**
     * <p>The ID of the detection rule template.</p>
     * 
     * <strong>example:</strong>
     * <p>cfw-out-ip_aegis-netstat</p>
     */
    @NameInMap("DetectionRuleTemplateId")
    public String detectionRuleTemplateId;

    /**
     * <p>The version of the detection rule template.</p>
     * 
     * <strong>example:</strong>
     * <p>v1.0.0</p>
     */
    @NameInMap("DetectionRuleTemplateVersion")
    public String detectionRuleTemplateVersion;

    /**
     * <p>The type of the detection rule. Valid values:</p>
     * <ul>
     * <li><p>preset: predefined detection rule.</p>
     * </li>
     * <li><p>custom: custom detection rule.</p>
     * </li>
     * <li><p>custom_template: rule template.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("DetectionRuleType")
    public String detectionRuleType;

    /**
     * <p>The entity mapping configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;NormalizationSchemaId\&quot;:\&quot;host\&quot;,\&quot;NormalizationFieldMappings\&quot;:[{\&quot;NormalizationFieldName\&quot;:\&quot;uuid\&quot;,\&quot;MappingFieldName\&quot;:\&quot;host\&quot;,\&quot;NormalizationFieldType\&quot;:\&quot;varchar\&quot;}]}]</p>
     */
    @NameInMap("EntityMappings")
    public String entityMappings;

    /**
     * <p>The configuration of the event aggregation period.</p>
     * 
     * <strong>example:</strong>
     * <p>5m</p>
     */
    @NameInMap("IncidentAggregationExpression")
    public String incidentAggregationExpression;

    /**
     * <p>The event aggregation type. Valid values:</p>
     * <ul>
     * <li><p>none: Events are not generated.</p>
     * </li>
     * <li><p>graph_compute: graph computing (supported by predefined rules).</p>
     * </li>
     * <li><p>expert: expert rules.</p>
     * </li>
     * <li><p>passthrough: Alerts are passed through (one-to-one).</p>
     * </li>
     * <li><p>window: Similar alerts are aggregated (window).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>window</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>API_RISK_ACTIVITY</p>
     */
    @NameInMap("LogSchemaId")
    public String logSchemaId;

    /**
     * <p>The custom parameters for the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;ip&quot;: {
     *         &quot;ip&quot;: &quot;124.23.<em>.</em>&quot;
     *     }
     * }</p>
     */
    @NameInMap("PlaybookParameters")
    public String playbookParameters;

    /**
     * <p>The UUID of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>system_aliyun_clb_process_book</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>The region where the Data Management center of Threat Analysis is located. Select a region based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Your assets are in the Chinese mainland.</p>
     * </li>
     * <li><p>ap-southeast-1: Your assets are in a region outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID that an administrator uses to switch to the perspective of another member.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The start time for scheduling. This is a 13-digit UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1733269771123</p>
     */
    @NameInMap("ScheduleBeginTime")
    public Long scheduleBeginTime;

    /**
     * <p>The cron expression for scheduling. This parameter is required if you set ScheduleType to cron.</p>
     * 
     * <strong>example:</strong>
     * <p>0/5 * * * *</p>
     */
    @NameInMap("ScheduleExpression")
    public String scheduleExpression;

    /**
     * <p>The maximum number of retries after a timeout. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScheduleMaxRetries")
    public Integer scheduleMaxRetries;

    /**
     * <p>The maximum timeout period in seconds. Valid values: 60 to 1800.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("ScheduleMaxTimeout")
    public Integer scheduleMaxTimeout;

    /**
     * <p>The scheduling type. Valid values:</p>
     * <ul>
     * <li><p>fixed_rate: fixed interval.</p>
     * </li>
     * <li><p>cron: cron expression.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fixed_rate</p>
     */
    @NameInMap("ScheduleType")
    public String scheduleType;

    /**
     * <p>The length of the scheduling window.</p>
     * 
     * <strong>example:</strong>
     * <p>5m</p>
     */
    @NameInMap("ScheduleWindow")
    public String scheduleWindow;

    public static CreateDetectionRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDetectionRuleRequest self = new CreateDetectionRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateDetectionRuleRequest setAlertAttCk(String alertAttCk) {
        this.alertAttCk = alertAttCk;
        return this;
    }
    public String getAlertAttCk() {
        return this.alertAttCk;
    }

    public CreateDetectionRuleRequest setAlertAttCkMapping(String alertAttCkMapping) {
        this.alertAttCkMapping = alertAttCkMapping;
        return this;
    }
    public String getAlertAttCkMapping() {
        return this.alertAttCkMapping;
    }

    public CreateDetectionRuleRequest setAlertDescription(String alertDescription) {
        this.alertDescription = alertDescription;
        return this;
    }
    public String getAlertDescription() {
        return this.alertDescription;
    }

    public CreateDetectionRuleRequest setAlertLevel(String alertLevel) {
        this.alertLevel = alertLevel;
        return this;
    }
    public String getAlertLevel() {
        return this.alertLevel;
    }

    public CreateDetectionRuleRequest setAlertLevelMapping(String alertLevelMapping) {
        this.alertLevelMapping = alertLevelMapping;
        return this;
    }
    public String getAlertLevelMapping() {
        return this.alertLevelMapping;
    }

    public CreateDetectionRuleRequest setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public CreateDetectionRuleRequest setAlertSchemaId(String alertSchemaId) {
        this.alertSchemaId = alertSchemaId;
        return this;
    }
    public String getAlertSchemaId() {
        return this.alertSchemaId;
    }

    public CreateDetectionRuleRequest setAlertTacticId(String alertTacticId) {
        this.alertTacticId = alertTacticId;
        return this;
    }
    public String getAlertTacticId() {
        return this.alertTacticId;
    }

    public CreateDetectionRuleRequest setAlertThresholdCount(Integer alertThresholdCount) {
        this.alertThresholdCount = alertThresholdCount;
        return this;
    }
    public Integer getAlertThresholdCount() {
        return this.alertThresholdCount;
    }

    public CreateDetectionRuleRequest setAlertThresholdGroup(String alertThresholdGroup) {
        this.alertThresholdGroup = alertThresholdGroup;
        return this;
    }
    public String getAlertThresholdGroup() {
        return this.alertThresholdGroup;
    }

    public CreateDetectionRuleRequest setAlertThresholdPeriod(String alertThresholdPeriod) {
        this.alertThresholdPeriod = alertThresholdPeriod;
        return this;
    }
    public String getAlertThresholdPeriod() {
        return this.alertThresholdPeriod;
    }

    public CreateDetectionRuleRequest setAlertType(String alertType) {
        this.alertType = alertType;
        return this;
    }
    public String getAlertType() {
        return this.alertType;
    }

    public CreateDetectionRuleRequest setAlertTypeMapping(String alertTypeMapping) {
        this.alertTypeMapping = alertTypeMapping;
        return this;
    }
    public String getAlertTypeMapping() {
        return this.alertTypeMapping;
    }

    public CreateDetectionRuleRequest setDetectionExpressionContent(String detectionExpressionContent) {
        this.detectionExpressionContent = detectionExpressionContent;
        return this;
    }
    public String getDetectionExpressionContent() {
        return this.detectionExpressionContent;
    }

    public CreateDetectionRuleRequest setDetectionExpressionType(String detectionExpressionType) {
        this.detectionExpressionType = detectionExpressionType;
        return this;
    }
    public String getDetectionExpressionType() {
        return this.detectionExpressionType;
    }

    public CreateDetectionRuleRequest setDetectionRuleDescription(String detectionRuleDescription) {
        this.detectionRuleDescription = detectionRuleDescription;
        return this;
    }
    public String getDetectionRuleDescription() {
        return this.detectionRuleDescription;
    }

    public CreateDetectionRuleRequest setDetectionRuleName(String detectionRuleName) {
        this.detectionRuleName = detectionRuleName;
        return this;
    }
    public String getDetectionRuleName() {
        return this.detectionRuleName;
    }

    public CreateDetectionRuleRequest setDetectionRuleStatus(String detectionRuleStatus) {
        this.detectionRuleStatus = detectionRuleStatus;
        return this;
    }
    public String getDetectionRuleStatus() {
        return this.detectionRuleStatus;
    }

    public CreateDetectionRuleRequest setDetectionRuleTemplateId(String detectionRuleTemplateId) {
        this.detectionRuleTemplateId = detectionRuleTemplateId;
        return this;
    }
    public String getDetectionRuleTemplateId() {
        return this.detectionRuleTemplateId;
    }

    public CreateDetectionRuleRequest setDetectionRuleTemplateVersion(String detectionRuleTemplateVersion) {
        this.detectionRuleTemplateVersion = detectionRuleTemplateVersion;
        return this;
    }
    public String getDetectionRuleTemplateVersion() {
        return this.detectionRuleTemplateVersion;
    }

    public CreateDetectionRuleRequest setDetectionRuleType(String detectionRuleType) {
        this.detectionRuleType = detectionRuleType;
        return this;
    }
    public String getDetectionRuleType() {
        return this.detectionRuleType;
    }

    public CreateDetectionRuleRequest setEntityMappings(String entityMappings) {
        this.entityMappings = entityMappings;
        return this;
    }
    public String getEntityMappings() {
        return this.entityMappings;
    }

    public CreateDetectionRuleRequest setIncidentAggregationExpression(String incidentAggregationExpression) {
        this.incidentAggregationExpression = incidentAggregationExpression;
        return this;
    }
    public String getIncidentAggregationExpression() {
        return this.incidentAggregationExpression;
    }

    public CreateDetectionRuleRequest setIncidentAggregationType(String incidentAggregationType) {
        this.incidentAggregationType = incidentAggregationType;
        return this;
    }
    public String getIncidentAggregationType() {
        return this.incidentAggregationType;
    }

    public CreateDetectionRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateDetectionRuleRequest setLogCategoryId(String logCategoryId) {
        this.logCategoryId = logCategoryId;
        return this;
    }
    public String getLogCategoryId() {
        return this.logCategoryId;
    }

    public CreateDetectionRuleRequest setLogSchemaId(String logSchemaId) {
        this.logSchemaId = logSchemaId;
        return this;
    }
    public String getLogSchemaId() {
        return this.logSchemaId;
    }

    public CreateDetectionRuleRequest setPlaybookParameters(String playbookParameters) {
        this.playbookParameters = playbookParameters;
        return this;
    }
    public String getPlaybookParameters() {
        return this.playbookParameters;
    }

    public CreateDetectionRuleRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public CreateDetectionRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDetectionRuleRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public CreateDetectionRuleRequest setScheduleBeginTime(Long scheduleBeginTime) {
        this.scheduleBeginTime = scheduleBeginTime;
        return this;
    }
    public Long getScheduleBeginTime() {
        return this.scheduleBeginTime;
    }

    public CreateDetectionRuleRequest setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
        return this;
    }
    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    public CreateDetectionRuleRequest setScheduleMaxRetries(Integer scheduleMaxRetries) {
        this.scheduleMaxRetries = scheduleMaxRetries;
        return this;
    }
    public Integer getScheduleMaxRetries() {
        return this.scheduleMaxRetries;
    }

    public CreateDetectionRuleRequest setScheduleMaxTimeout(Integer scheduleMaxTimeout) {
        this.scheduleMaxTimeout = scheduleMaxTimeout;
        return this;
    }
    public Integer getScheduleMaxTimeout() {
        return this.scheduleMaxTimeout;
    }

    public CreateDetectionRuleRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public CreateDetectionRuleRequest setScheduleWindow(String scheduleWindow) {
        this.scheduleWindow = scheduleWindow;
        return this;
    }
    public String getScheduleWindow() {
        return this.scheduleWindow;
    }

}
