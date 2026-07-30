// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateDetectionRuleRequest extends TeaModel {
    /**
     * <p>The alert ATT&amp;CK technique.</p>
     * 
     * <strong>example:</strong>
     * <p>Discovery</p>
     */
    @NameInMap("AlertAttCk")
    public String alertAttCk;

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
     * <li>5: Critical.</li>
     * <li>4: High.</li>
     * <li>3: Medium.</li>
     * <li>2: Low.</li>
     * <li>1: Informational.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AlertLevel")
    public String alertLevel;

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
     * <p>The ID of the detection rule alert template. Valid values:</p>
     * <ul>
     * <li>ALERT_ACTIVITY: other alerts.</li>
     * <li>EDR_ALERT_ACTIVITY: endpoint detection and response alerts.</li>
     * <li>FIREWALL_ALERT_ACTIVITY: firewall alerts.</li>
     * <li>WAF_ALERT_ACTIVITY: web application firewall alerts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALERT_ACTIVITY</p>
     */
    @NameInMap("AlertSchemaId")
    public String alertSchemaId;

    /**
     * <p>The alert tactic stage.</p>
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
     * <p>The list of alert threshold fields, separated by commas (,).</p>
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
     * <p>The Alarm Metric of the alerting rule.</p>
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
     * <li>sql: SQL.</li>
     * <li>playbook: playbook.</li>
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
     * <li>preset: preset detection rule.</li>
     * <li>custom: custom detection rule.</li>
     * <li>custom_template: rule template.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("DetectionRuleType")
    public String detectionRuleType;

    @NameInMap("DetectionRules")
    public String detectionRules;

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
     * <p>5m</p>
     */
    @NameInMap("IncidentAggregationExpression")
    public String incidentAggregationExpression;

    /**
     * <p>The event aggregation type. Valid values:</p>
     * <ul>
     * <li>none: No event is generated.</li>
     * <li>graph_compute: Graph computing. This value is supported by predefined rules.</li>
     * <li>expert: Expert rule.</li>
     * <li>passthrough: Alerting pass-through (one-to-one).</li>
     * <li>window: Same-type aggregation (window).</li>
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
     * <p>The custom parameters of the playbook.</p>
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
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in the Chinese mainland.</li>
     * <li>ap-southeast-1: Your assets reside outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the member to which the administrator switches the view.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The scheduling start time. The value is a 13-digit UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1733269771123</p>
     */
    @NameInMap("ScheduleBeginTime")
    public Long scheduleBeginTime;

    /**
     * <p>The scheduling cron expression. This parameter is required when ScheduleType is set to cron.</p>
     * 
     * <strong>example:</strong>
     * <p>0/5 * * * *</p>
     */
    @NameInMap("ScheduleExpression")
    public String scheduleExpression;

    /**
     * <p>The maximum number of retries upon timeout. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScheduleMaxRetries")
    public Integer scheduleMaxRetries;

    /**
     * <p>The maximum timeout period, in seconds. Valid values: 60 to 1800.</p>
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

    public CreateDetectionRuleRequest setDetectionRules(String detectionRules) {
        this.detectionRules = detectionRules;
        return this;
    }
    public String getDetectionRules() {
        return this.detectionRules;
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
