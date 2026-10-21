// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDetectionRuleRequest extends TeaModel {
    /**
     * <p>The ATT&amp;CK technique of the alert.</p>
     * 
     * <strong>example:</strong>
     * <p>Discovery</p>
     */
    @NameInMap("AlertAttCk")
    public String alertAttCk;

    /**
     * <p>The MITRE ATT&amp;CK technique mapping.</p>
     */
    @NameInMap("AlertAttCkMapping")
    public String alertAttCkMapping;

    /**
     * <p>The alert description. You can use $$ to reference query output fields.</p>
     * 
     * <strong>example:</strong>
     * <p>Alert from: $product_code$, detected network attack from $src_ip$, affected assets include: $dst_ip$</p>
     */
    @NameInMap("AlertDescription")
    public String alertDescription;

    /**
     * <p>The threat level of the alert. Valid values:</p>
     * <ul>
     * <li>5: critical.</li>
     * <li>4: high.</li>
     * <li>3: medium.</li>
     * <li>2: low.</li>
     * <li>1: informational.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AlertLevel")
    public String alertLevel;

    /**
     * <p>The alert level mapping.</p>
     */
    @NameInMap("AlertLevelMapping")
    public String alertLevelMapping;

    /**
     * <p>The alert name. You can use $$ to reference query output fields.</p>
     * 
     * <strong>example:</strong>
     * <p>Detected high-frequency multi-type network attacks from $src_ip$</p>
     */
    @NameInMap("AlertName")
    public String alertName;

    /**
     * <p>The ID of the alert template for the detection rule.</p>
     * 
     * <strong>example:</strong>
     * <p>ALERT_ACTIVITY</p>
     */
    @NameInMap("AlertSchemaId")
    public String alertSchemaId;

    /**
     * <p>The ATT&amp;CK tactic phase of the alert.</p>
     * 
     * <strong>example:</strong>
     * <p>TA0042</p>
     */
    @NameInMap("AlertTacticId")
    public String alertTacticId;

    /**
     * <p>The alert threshold count.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AlertThresholdCount")
    public Integer alertThresholdCount;

    /**
     * <p>The list of alert threshold fields, separated by commas.</p>
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
     * <p>The Alarm Metric for alerting.</p>
     * 
     * <strong>example:</strong>
     * <p>siem_rule_type_alert_storm</p>
     */
    @NameInMap("AlertType")
    public String alertType;

    /**
     * <p>The Alarm Metric mapping for alerting.</p>
     */
    @NameInMap("AlertTypeMapping")
    public String alertTypeMapping;

    /**
     * <p>The expression content of the detection rule.</p>
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
     * <p>The expression content of the detection rule.</p>
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
     * <p>Check the enumeration behavior of local system groups. An attacker may attempt to find the Local Systems group and its permission settings.</p>
     */
    @NameInMap("DetectionRuleDescription")
    public String detectionRuleDescription;

    /**
     * <p>The ID of the detection rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>jndi-attack-success_http_dns</p>
     */
    @NameInMap("DetectionRuleId")
    public String detectionRuleId;

    /**
     * <p>The name of the detection rule.</p>
     * 
     * <strong>example:</strong>
     * <p>CTDR Port Scan Behavior</p>
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
     * <li>preset: preset detection rule.</li>
     * <li>custom: custom detection rule.</li>
     * <li>custom_template: rule template.</li>
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
     * <p>The event aggregation period configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>60m</p>
     */
    @NameInMap("IncidentAggregationExpression")
    public String incidentAggregationExpression;

    /**
     * <p>The event aggregation type. Valid values:</p>
     * <ul>
     * <li>none: no event is generated.</li>
     * <li>graph_compute: graph computing (supported by predefined rules).</li>
     * <li>expert: expert rule.</li>
     * <li>passthrough: alert pass-through (one-to-one).</li>
     * <li>window: same-type aggregation (window).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>window</p>
     */
    @NameInMap("IncidentAggregationType")
    public String incidentAggregationType;

    /**
     * <p>The language of the response messages. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
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
     * <p>The user-defined parameters of the playbook.</p>
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
     * <p>The unique identifier of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>31568394-7a86-487c-b8ec-b3f42b59****</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>The region where the data management center of Cloud Threat Detection and Response is located. Select the management center region based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in the Chinese mainland.</li>
     * <li>ap-southeast-1: Your assets reside outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The scheduling start time, expressed as a 13-digit timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1733269771123</p>
     */
    @NameInMap("ScheduleBeginTime")
    public Long scheduleBeginTime;

    /**
     * <p>The cron expression for scheduling. Required when ScheduleType is set to cron.</p>
     * 
     * <strong>example:</strong>
     * <p>1h</p>
     */
    @NameInMap("ScheduleExpression")
    public String scheduleExpression;

    /**
     * <p>The maximum number of retries on timeout. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScheduleMaxRetries")
    public Integer scheduleMaxRetries;

    /**
     * <p>The maximum timeout duration, in seconds. Valid values: 60 to 1800.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("ScheduleMaxTimeout")
    public Integer scheduleMaxTimeout;

    /**
     * <p>The scheduling type. Valid values:</p>
     * <ul>
     * <li>fixed_rate: fixed interval.</li>
     * <li>cron: cron expression.</li>
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

    public static UpdateDetectionRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDetectionRuleRequest self = new UpdateDetectionRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDetectionRuleRequest setAlertAttCk(String alertAttCk) {
        this.alertAttCk = alertAttCk;
        return this;
    }
    public String getAlertAttCk() {
        return this.alertAttCk;
    }

    public UpdateDetectionRuleRequest setAlertAttCkMapping(String alertAttCkMapping) {
        this.alertAttCkMapping = alertAttCkMapping;
        return this;
    }
    public String getAlertAttCkMapping() {
        return this.alertAttCkMapping;
    }

    public UpdateDetectionRuleRequest setAlertDescription(String alertDescription) {
        this.alertDescription = alertDescription;
        return this;
    }
    public String getAlertDescription() {
        return this.alertDescription;
    }

    public UpdateDetectionRuleRequest setAlertLevel(String alertLevel) {
        this.alertLevel = alertLevel;
        return this;
    }
    public String getAlertLevel() {
        return this.alertLevel;
    }

    public UpdateDetectionRuleRequest setAlertLevelMapping(String alertLevelMapping) {
        this.alertLevelMapping = alertLevelMapping;
        return this;
    }
    public String getAlertLevelMapping() {
        return this.alertLevelMapping;
    }

    public UpdateDetectionRuleRequest setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public UpdateDetectionRuleRequest setAlertSchemaId(String alertSchemaId) {
        this.alertSchemaId = alertSchemaId;
        return this;
    }
    public String getAlertSchemaId() {
        return this.alertSchemaId;
    }

    public UpdateDetectionRuleRequest setAlertTacticId(String alertTacticId) {
        this.alertTacticId = alertTacticId;
        return this;
    }
    public String getAlertTacticId() {
        return this.alertTacticId;
    }

    public UpdateDetectionRuleRequest setAlertThresholdCount(Integer alertThresholdCount) {
        this.alertThresholdCount = alertThresholdCount;
        return this;
    }
    public Integer getAlertThresholdCount() {
        return this.alertThresholdCount;
    }

    public UpdateDetectionRuleRequest setAlertThresholdGroup(String alertThresholdGroup) {
        this.alertThresholdGroup = alertThresholdGroup;
        return this;
    }
    public String getAlertThresholdGroup() {
        return this.alertThresholdGroup;
    }

    public UpdateDetectionRuleRequest setAlertThresholdPeriod(String alertThresholdPeriod) {
        this.alertThresholdPeriod = alertThresholdPeriod;
        return this;
    }
    public String getAlertThresholdPeriod() {
        return this.alertThresholdPeriod;
    }

    public UpdateDetectionRuleRequest setAlertType(String alertType) {
        this.alertType = alertType;
        return this;
    }
    public String getAlertType() {
        return this.alertType;
    }

    public UpdateDetectionRuleRequest setAlertTypeMapping(String alertTypeMapping) {
        this.alertTypeMapping = alertTypeMapping;
        return this;
    }
    public String getAlertTypeMapping() {
        return this.alertTypeMapping;
    }

    public UpdateDetectionRuleRequest setDetectionExpressionContent(String detectionExpressionContent) {
        this.detectionExpressionContent = detectionExpressionContent;
        return this;
    }
    public String getDetectionExpressionContent() {
        return this.detectionExpressionContent;
    }

    public UpdateDetectionRuleRequest setDetectionExpressionType(String detectionExpressionType) {
        this.detectionExpressionType = detectionExpressionType;
        return this;
    }
    public String getDetectionExpressionType() {
        return this.detectionExpressionType;
    }

    public UpdateDetectionRuleRequest setDetectionRuleDescription(String detectionRuleDescription) {
        this.detectionRuleDescription = detectionRuleDescription;
        return this;
    }
    public String getDetectionRuleDescription() {
        return this.detectionRuleDescription;
    }

    public UpdateDetectionRuleRequest setDetectionRuleId(String detectionRuleId) {
        this.detectionRuleId = detectionRuleId;
        return this;
    }
    public String getDetectionRuleId() {
        return this.detectionRuleId;
    }

    public UpdateDetectionRuleRequest setDetectionRuleName(String detectionRuleName) {
        this.detectionRuleName = detectionRuleName;
        return this;
    }
    public String getDetectionRuleName() {
        return this.detectionRuleName;
    }

    public UpdateDetectionRuleRequest setDetectionRuleStatus(String detectionRuleStatus) {
        this.detectionRuleStatus = detectionRuleStatus;
        return this;
    }
    public String getDetectionRuleStatus() {
        return this.detectionRuleStatus;
    }

    public UpdateDetectionRuleRequest setDetectionRuleType(String detectionRuleType) {
        this.detectionRuleType = detectionRuleType;
        return this;
    }
    public String getDetectionRuleType() {
        return this.detectionRuleType;
    }

    public UpdateDetectionRuleRequest setEntityMappings(String entityMappings) {
        this.entityMappings = entityMappings;
        return this;
    }
    public String getEntityMappings() {
        return this.entityMappings;
    }

    public UpdateDetectionRuleRequest setIncidentAggregationExpression(String incidentAggregationExpression) {
        this.incidentAggregationExpression = incidentAggregationExpression;
        return this;
    }
    public String getIncidentAggregationExpression() {
        return this.incidentAggregationExpression;
    }

    public UpdateDetectionRuleRequest setIncidentAggregationType(String incidentAggregationType) {
        this.incidentAggregationType = incidentAggregationType;
        return this;
    }
    public String getIncidentAggregationType() {
        return this.incidentAggregationType;
    }

    public UpdateDetectionRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDetectionRuleRequest setLogCategoryId(String logCategoryId) {
        this.logCategoryId = logCategoryId;
        return this;
    }
    public String getLogCategoryId() {
        return this.logCategoryId;
    }

    public UpdateDetectionRuleRequest setLogSchemaId(String logSchemaId) {
        this.logSchemaId = logSchemaId;
        return this;
    }
    public String getLogSchemaId() {
        return this.logSchemaId;
    }

    public UpdateDetectionRuleRequest setPlaybookParameters(String playbookParameters) {
        this.playbookParameters = playbookParameters;
        return this;
    }
    public String getPlaybookParameters() {
        return this.playbookParameters;
    }

    public UpdateDetectionRuleRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public UpdateDetectionRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDetectionRuleRequest setScheduleBeginTime(Long scheduleBeginTime) {
        this.scheduleBeginTime = scheduleBeginTime;
        return this;
    }
    public Long getScheduleBeginTime() {
        return this.scheduleBeginTime;
    }

    public UpdateDetectionRuleRequest setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
        return this;
    }
    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    public UpdateDetectionRuleRequest setScheduleMaxRetries(Integer scheduleMaxRetries) {
        this.scheduleMaxRetries = scheduleMaxRetries;
        return this;
    }
    public Integer getScheduleMaxRetries() {
        return this.scheduleMaxRetries;
    }

    public UpdateDetectionRuleRequest setScheduleMaxTimeout(Integer scheduleMaxTimeout) {
        this.scheduleMaxTimeout = scheduleMaxTimeout;
        return this;
    }
    public Integer getScheduleMaxTimeout() {
        return this.scheduleMaxTimeout;
    }

    public UpdateDetectionRuleRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public UpdateDetectionRuleRequest setScheduleWindow(String scheduleWindow) {
        this.scheduleWindow = scheduleWindow;
        return this;
    }
    public String getScheduleWindow() {
        return this.scheduleWindow;
    }

}
