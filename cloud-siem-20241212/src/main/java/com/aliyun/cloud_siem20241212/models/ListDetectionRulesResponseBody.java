// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDetectionRulesResponseBody extends TeaModel {
    @NameInMap("DetectionRules")
    public java.util.List<ListDetectionRulesResponseBodyDetectionRules> detectionRules;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>508DCFFD-4508-54BF-A8A0-E97A0FA6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDetectionRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDetectionRulesResponseBody self = new ListDetectionRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDetectionRulesResponseBody setDetectionRules(java.util.List<ListDetectionRulesResponseBodyDetectionRules> detectionRules) {
        this.detectionRules = detectionRules;
        return this;
    }
    public java.util.List<ListDetectionRulesResponseBodyDetectionRules> getDetectionRules() {
        return this.detectionRules;
    }

    public ListDetectionRulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDetectionRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDetectionRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDetectionRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDetectionRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDetectionRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDetectionRulesResponseBodyDetectionRulesEntityMappingsNormalizationFieldMappings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("MappingFieldName")
        public String mappingFieldName;

        /**
         * <strong>example:</strong>
         * <p>src_ip</p>
         */
        @NameInMap("NormalizationFieldName")
        public String normalizationFieldName;

        /**
         * <strong>example:</strong>
         * <p>vachar</p>
         */
        @NameInMap("NormalizationFieldType")
        public String normalizationFieldType;

        public static ListDetectionRulesResponseBodyDetectionRulesEntityMappingsNormalizationFieldMappings build(java.util.Map<String, ?> map) throws Exception {
            ListDetectionRulesResponseBodyDetectionRulesEntityMappingsNormalizationFieldMappings self = new ListDetectionRulesResponseBodyDetectionRulesEntityMappingsNormalizationFieldMappings();
            return TeaModel.build(map, self);
        }

        public ListDetectionRulesResponseBodyDetectionRulesEntityMappingsNormalizationFieldMappings setMappingFieldName(String mappingFieldName) {
            this.mappingFieldName = mappingFieldName;
            return this;
        }
        public String getMappingFieldName() {
            return this.mappingFieldName;
        }

        public ListDetectionRulesResponseBodyDetectionRulesEntityMappingsNormalizationFieldMappings setNormalizationFieldName(String normalizationFieldName) {
            this.normalizationFieldName = normalizationFieldName;
            return this;
        }
        public String getNormalizationFieldName() {
            return this.normalizationFieldName;
        }

        public ListDetectionRulesResponseBodyDetectionRulesEntityMappingsNormalizationFieldMappings setNormalizationFieldType(String normalizationFieldType) {
            this.normalizationFieldType = normalizationFieldType;
            return this;
        }
        public String getNormalizationFieldType() {
            return this.normalizationFieldType;
        }

    }

    public static class ListDetectionRulesResponseBodyDetectionRulesEntityMappings extends TeaModel {
        @NameInMap("NormalizationFieldMappings")
        public java.util.List<ListDetectionRulesResponseBodyDetectionRulesEntityMappingsNormalizationFieldMappings> normalizationFieldMappings;

        /**
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("NormalizationSchemaId")
        public String normalizationSchemaId;

        public static ListDetectionRulesResponseBodyDetectionRulesEntityMappings build(java.util.Map<String, ?> map) throws Exception {
            ListDetectionRulesResponseBodyDetectionRulesEntityMappings self = new ListDetectionRulesResponseBodyDetectionRulesEntityMappings();
            return TeaModel.build(map, self);
        }

        public ListDetectionRulesResponseBodyDetectionRulesEntityMappings setNormalizationFieldMappings(java.util.List<ListDetectionRulesResponseBodyDetectionRulesEntityMappingsNormalizationFieldMappings> normalizationFieldMappings) {
            this.normalizationFieldMappings = normalizationFieldMappings;
            return this;
        }
        public java.util.List<ListDetectionRulesResponseBodyDetectionRulesEntityMappingsNormalizationFieldMappings> getNormalizationFieldMappings() {
            return this.normalizationFieldMappings;
        }

        public ListDetectionRulesResponseBodyDetectionRulesEntityMappings setNormalizationSchemaId(String normalizationSchemaId) {
            this.normalizationSchemaId = normalizationSchemaId;
            return this;
        }
        public String getNormalizationSchemaId() {
            return this.normalizationSchemaId;
        }

    }

    public static class ListDetectionRulesResponseBodyDetectionRulesPlaybook extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;name&quot;: &quot;expireDay&quot;,
         *         &quot;dataType&quot;: &quot;Integer&quot;,
         *         &quot;required&quot;: true,
         *         &quot;isArray&quot;: false,
         *         &quot;example&quot;: &quot;7&quot;,
         *         &quot;description&quot;: &quot;desc&quot;,
         *         &quot;typeName&quot;: &quot;Integer&quot;,
         *         &quot;dataClass&quot;: &quot;normal&quot;,
         *         &quot;stanchDefaultValue&quot;: &quot;7&quot;
         *     }
         * ]</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;id&quot;: &quot;EndEvent_1fqpq4h&quot;,
         *         &quot;zIndex&quot;: 1,
         *         &quot;data&quot;: {
         *             &quot;nodeType&quot;: &quot;endEvent&quot;,
         *             &quot;appType&quot;: &quot;basic&quot;,
         *             &quot;valueData&quot;: {</p>
         * <pre><code>        },
         *         &quot;icon&quot;: &quot;icon-radio-off-full&quot;
         *     },
         *     &quot;position&quot;: {
         *         &quot;x&quot;: 1369,
         *         &quot;y&quot;: 174
         *     }
         * }
         * </code></pre>
         * <p>]</p>
         */
        @NameInMap("Flow")
        public String flow;

        public static ListDetectionRulesResponseBodyDetectionRulesPlaybook build(java.util.Map<String, ?> map) throws Exception {
            ListDetectionRulesResponseBodyDetectionRulesPlaybook self = new ListDetectionRulesResponseBodyDetectionRulesPlaybook();
            return TeaModel.build(map, self);
        }

        public ListDetectionRulesResponseBodyDetectionRulesPlaybook setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListDetectionRulesResponseBodyDetectionRulesPlaybook setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

    }

    public static class ListDetectionRulesResponseBodyDetectionRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Discovery</p>
         */
        @NameInMap("AlertAttCk")
        public String alertAttCk;

        @NameInMap("AlertDescription")
        public String alertDescription;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlertLevel")
        public String alertLevel;

        @NameInMap("AlertName")
        public String alertName;

        /**
         * <strong>example:</strong>
         * <p>ALERT_ACTIVITY</p>
         */
        @NameInMap("AlertSchemaId")
        public String alertSchemaId;

        /**
         * <strong>example:</strong>
         * <p>TA0042</p>
         */
        @NameInMap("AlertTacticId")
        public String alertTacticId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AlertThresholdCount")
        public Integer alertThresholdCount;

        /**
         * <strong>example:</strong>
         * <p>alert_type,ip</p>
         */
        @NameInMap("AlertThresholdGroup")
        public String alertThresholdGroup;

        /**
         * <strong>example:</strong>
         * <p>5m</p>
         */
        @NameInMap("AlertThresholdPeriod")
        public String alertThresholdPeriod;

        /**
         * <strong>example:</strong>
         * <p>WebShell</p>
         */
        @NameInMap("AlertType")
        public String alertType;

        /**
         * <strong>example:</strong>
         * <p>2023-03-21 13:47:01</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
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
         * <strong>example:</strong>
         * <p>playbook</p>
         */
        @NameInMap("DetectionExpressionType")
        public String detectionExpressionType;

        /**
         * <strong>example:</strong>
         * <p>Check the enumeration behavior of local system groups. An attacker may attempt to find the Local Systems group and its permission settings.</p>
         */
        @NameInMap("DetectionRuleDescription")
        public String detectionRuleDescription;

        /**
         * <strong>example:</strong>
         * <p>jndi-attack-success_http_netstat</p>
         */
        @NameInMap("DetectionRuleId")
        public String detectionRuleId;

        /**
         * <strong>example:</strong>
         * <p>Detect Discovery Behavior for Local Systems Groups</p>
         */
        @NameInMap("DetectionRuleName")
        public String detectionRuleName;

        /**
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("DetectionRuleStatus")
        public String detectionRuleStatus;

        /**
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("DetectionRuleType")
        public String detectionRuleType;

        @NameInMap("EntityMappings")
        public java.util.List<ListDetectionRulesResponseBodyDetectionRulesEntityMappings> entityMappings;

        /**
         * <strong>example:</strong>
         * <p>5m</p>
         */
        @NameInMap("IncidentAggregationExpression")
        public String incidentAggregationExpression;

        /**
         * <strong>example:</strong>
         * <p>passthrough</p>
         */
        @NameInMap("IncidentAggregationType")
        public String incidentAggregationType;

        /**
         * <strong>example:</strong>
         * <p>NETWORK_CATEGORY</p>
         */
        @NameInMap("LogCategoryId")
        public String logCategoryId;

        /**
         * <strong>example:</strong>
         * <p>API_RISK_ACTIVITY</p>
         */
        @NameInMap("LogSchemaId")
        public String logSchemaId;

        @NameInMap("Playbook")
        public ListDetectionRulesResponseBodyDetectionRulesPlaybook playbook;

        /**
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
         * <strong>example:</strong>
         * <p>dde983ed-eb56-45ea-ac2e-3b12b2a9****</p>
         */
        @NameInMap("PlaybookUuid")
        public String playbookUuid;

        /**
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        @NameInMap("ScheduleBeginTime")
        public Long scheduleBeginTime;

        /**
         * <strong>example:</strong>
         * <p>5m</p>
         */
        @NameInMap("ScheduleExpression")
        public String scheduleExpression;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScheduleMaxRetries")
        public Integer scheduleMaxRetries;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("ScheduleMaxTimeout")
        public Integer scheduleMaxTimeout;

        /**
         * <strong>example:</strong>
         * <p>fixed_rate</p>
         */
        @NameInMap("ScheduleType")
        public String scheduleType;

        /**
         * <strong>example:</strong>
         * <p>5m</p>
         */
        @NameInMap("ScheduleWindow")
        public String scheduleWindow;

        /**
         * <strong>example:</strong>
         * <p>2023-04-16 10:51:00</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListDetectionRulesResponseBodyDetectionRules build(java.util.Map<String, ?> map) throws Exception {
            ListDetectionRulesResponseBodyDetectionRules self = new ListDetectionRulesResponseBodyDetectionRules();
            return TeaModel.build(map, self);
        }

        public ListDetectionRulesResponseBodyDetectionRules setAlertAttCk(String alertAttCk) {
            this.alertAttCk = alertAttCk;
            return this;
        }
        public String getAlertAttCk() {
            return this.alertAttCk;
        }

        public ListDetectionRulesResponseBodyDetectionRules setAlertDescription(String alertDescription) {
            this.alertDescription = alertDescription;
            return this;
        }
        public String getAlertDescription() {
            return this.alertDescription;
        }

        public ListDetectionRulesResponseBodyDetectionRules setAlertLevel(String alertLevel) {
            this.alertLevel = alertLevel;
            return this;
        }
        public String getAlertLevel() {
            return this.alertLevel;
        }

        public ListDetectionRulesResponseBodyDetectionRules setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public ListDetectionRulesResponseBodyDetectionRules setAlertSchemaId(String alertSchemaId) {
            this.alertSchemaId = alertSchemaId;
            return this;
        }
        public String getAlertSchemaId() {
            return this.alertSchemaId;
        }

        public ListDetectionRulesResponseBodyDetectionRules setAlertTacticId(String alertTacticId) {
            this.alertTacticId = alertTacticId;
            return this;
        }
        public String getAlertTacticId() {
            return this.alertTacticId;
        }

        public ListDetectionRulesResponseBodyDetectionRules setAlertThresholdCount(Integer alertThresholdCount) {
            this.alertThresholdCount = alertThresholdCount;
            return this;
        }
        public Integer getAlertThresholdCount() {
            return this.alertThresholdCount;
        }

        public ListDetectionRulesResponseBodyDetectionRules setAlertThresholdGroup(String alertThresholdGroup) {
            this.alertThresholdGroup = alertThresholdGroup;
            return this;
        }
        public String getAlertThresholdGroup() {
            return this.alertThresholdGroup;
        }

        public ListDetectionRulesResponseBodyDetectionRules setAlertThresholdPeriod(String alertThresholdPeriod) {
            this.alertThresholdPeriod = alertThresholdPeriod;
            return this;
        }
        public String getAlertThresholdPeriod() {
            return this.alertThresholdPeriod;
        }

        public ListDetectionRulesResponseBodyDetectionRules setAlertType(String alertType) {
            this.alertType = alertType;
            return this;
        }
        public String getAlertType() {
            return this.alertType;
        }

        public ListDetectionRulesResponseBodyDetectionRules setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDetectionRulesResponseBodyDetectionRules setDetectionExpressionContent(String detectionExpressionContent) {
            this.detectionExpressionContent = detectionExpressionContent;
            return this;
        }
        public String getDetectionExpressionContent() {
            return this.detectionExpressionContent;
        }

        public ListDetectionRulesResponseBodyDetectionRules setDetectionExpressionType(String detectionExpressionType) {
            this.detectionExpressionType = detectionExpressionType;
            return this;
        }
        public String getDetectionExpressionType() {
            return this.detectionExpressionType;
        }

        public ListDetectionRulesResponseBodyDetectionRules setDetectionRuleDescription(String detectionRuleDescription) {
            this.detectionRuleDescription = detectionRuleDescription;
            return this;
        }
        public String getDetectionRuleDescription() {
            return this.detectionRuleDescription;
        }

        public ListDetectionRulesResponseBodyDetectionRules setDetectionRuleId(String detectionRuleId) {
            this.detectionRuleId = detectionRuleId;
            return this;
        }
        public String getDetectionRuleId() {
            return this.detectionRuleId;
        }

        public ListDetectionRulesResponseBodyDetectionRules setDetectionRuleName(String detectionRuleName) {
            this.detectionRuleName = detectionRuleName;
            return this;
        }
        public String getDetectionRuleName() {
            return this.detectionRuleName;
        }

        public ListDetectionRulesResponseBodyDetectionRules setDetectionRuleStatus(String detectionRuleStatus) {
            this.detectionRuleStatus = detectionRuleStatus;
            return this;
        }
        public String getDetectionRuleStatus() {
            return this.detectionRuleStatus;
        }

        public ListDetectionRulesResponseBodyDetectionRules setDetectionRuleType(String detectionRuleType) {
            this.detectionRuleType = detectionRuleType;
            return this;
        }
        public String getDetectionRuleType() {
            return this.detectionRuleType;
        }

        public ListDetectionRulesResponseBodyDetectionRules setEntityMappings(java.util.List<ListDetectionRulesResponseBodyDetectionRulesEntityMappings> entityMappings) {
            this.entityMappings = entityMappings;
            return this;
        }
        public java.util.List<ListDetectionRulesResponseBodyDetectionRulesEntityMappings> getEntityMappings() {
            return this.entityMappings;
        }

        public ListDetectionRulesResponseBodyDetectionRules setIncidentAggregationExpression(String incidentAggregationExpression) {
            this.incidentAggregationExpression = incidentAggregationExpression;
            return this;
        }
        public String getIncidentAggregationExpression() {
            return this.incidentAggregationExpression;
        }

        public ListDetectionRulesResponseBodyDetectionRules setIncidentAggregationType(String incidentAggregationType) {
            this.incidentAggregationType = incidentAggregationType;
            return this;
        }
        public String getIncidentAggregationType() {
            return this.incidentAggregationType;
        }

        public ListDetectionRulesResponseBodyDetectionRules setLogCategoryId(String logCategoryId) {
            this.logCategoryId = logCategoryId;
            return this;
        }
        public String getLogCategoryId() {
            return this.logCategoryId;
        }

        public ListDetectionRulesResponseBodyDetectionRules setLogSchemaId(String logSchemaId) {
            this.logSchemaId = logSchemaId;
            return this;
        }
        public String getLogSchemaId() {
            return this.logSchemaId;
        }

        public ListDetectionRulesResponseBodyDetectionRules setPlaybook(ListDetectionRulesResponseBodyDetectionRulesPlaybook playbook) {
            this.playbook = playbook;
            return this;
        }
        public ListDetectionRulesResponseBodyDetectionRulesPlaybook getPlaybook() {
            return this.playbook;
        }

        public ListDetectionRulesResponseBodyDetectionRules setPlaybookParameters(String playbookParameters) {
            this.playbookParameters = playbookParameters;
            return this;
        }
        public String getPlaybookParameters() {
            return this.playbookParameters;
        }

        public ListDetectionRulesResponseBodyDetectionRules setPlaybookUuid(String playbookUuid) {
            this.playbookUuid = playbookUuid;
            return this;
        }
        public String getPlaybookUuid() {
            return this.playbookUuid;
        }

        public ListDetectionRulesResponseBodyDetectionRules setScheduleBeginTime(Long scheduleBeginTime) {
            this.scheduleBeginTime = scheduleBeginTime;
            return this;
        }
        public Long getScheduleBeginTime() {
            return this.scheduleBeginTime;
        }

        public ListDetectionRulesResponseBodyDetectionRules setScheduleExpression(String scheduleExpression) {
            this.scheduleExpression = scheduleExpression;
            return this;
        }
        public String getScheduleExpression() {
            return this.scheduleExpression;
        }

        public ListDetectionRulesResponseBodyDetectionRules setScheduleMaxRetries(Integer scheduleMaxRetries) {
            this.scheduleMaxRetries = scheduleMaxRetries;
            return this;
        }
        public Integer getScheduleMaxRetries() {
            return this.scheduleMaxRetries;
        }

        public ListDetectionRulesResponseBodyDetectionRules setScheduleMaxTimeout(Integer scheduleMaxTimeout) {
            this.scheduleMaxTimeout = scheduleMaxTimeout;
            return this;
        }
        public Integer getScheduleMaxTimeout() {
            return this.scheduleMaxTimeout;
        }

        public ListDetectionRulesResponseBodyDetectionRules setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public ListDetectionRulesResponseBodyDetectionRules setScheduleWindow(String scheduleWindow) {
            this.scheduleWindow = scheduleWindow;
            return this;
        }
        public String getScheduleWindow() {
            return this.scheduleWindow;
        }

        public ListDetectionRulesResponseBodyDetectionRules setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
