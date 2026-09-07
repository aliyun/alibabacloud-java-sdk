// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateAlertRuleResponseBody extends TeaModel {
    /**
     * <p>The alert rule object.</p>
     */
    @NameInMap("AlertRule")
    public CreateOrUpdateAlertRuleResponseBodyAlertRule alertRule;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>337B8F7E-0A64-5768-9225-E9B3CF******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOrUpdateAlertRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateAlertRuleResponseBody self = new CreateOrUpdateAlertRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateAlertRuleResponseBody setAlertRule(CreateOrUpdateAlertRuleResponseBodyAlertRule alertRule) {
        this.alertRule = alertRule;
        return this;
    }
    public CreateOrUpdateAlertRuleResponseBodyAlertRule getAlertRule() {
        return this.alertRule;
    }

    public CreateOrUpdateAlertRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems extends TeaModel {
        /**
         * <p>The aggregation method for the alert condition.</p>
         * <ul>
         * <li><p><code>AVG</code>: average</p>
         * </li>
         * <li><p><code>SUM</code>: sum</p>
         * </li>
         * <li><p><code>MAX</code>: maximum</p>
         * </li>
         * <li><p><code>MIN</code>: minimum</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AVG</p>
         */
        @NameInMap("Aggregate")
        public String aggregate;

        /**
         * <p>The metric that is evaluated by the alert condition.</p>
         * 
         * <strong>example:</strong>
         * <p>JVM非堆总使用内存量</p>
         */
        @NameInMap("MetricKey")
        public String metricKey;

        /**
         * <p>The duration of the time window, in minutes, for evaluating the alert condition.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("N")
        public Float n;

        /**
         * <p>The operator used to compare the aggregated metric value with the threshold.</p>
         * <ul>
         * <li><p><code>CURRENT_GTE</code>: greater than or equal to</p>
         * </li>
         * <li><p><code>CURRENT_LTE</code>: less than or equal to</p>
         * </li>
         * <li><p><code>PREVIOUS_UP</code>: period-over-period increase percentage</p>
         * </li>
         * <li><p><code>PREVIOUS_DOWN</code>: period-over-period decrease percentage</p>
         * </li>
         * <li><p><code>HOH_UP</code>: hour-over-hour increase percentage</p>
         * </li>
         * <li><p><code>HOH_DOWN</code>: hour-over-hour decrease percentage</p>
         * </li>
         * <li><p><code>DOD_UP</code>: day-over-day increase percentage</p>
         * </li>
         * <li><p><code>DOD_DOWN</code>: day-over-day decrease percentage</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CURRENT_GTE</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The threshold for the alert condition.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems self = new CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems setAggregate(String aggregate) {
            this.aggregate = aggregate;
            return this;
        }
        public String getAggregate() {
            return this.aggregate;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems setMetricKey(String metricKey) {
            this.metricKey = metricKey;
            return this;
        }
        public String getMetricKey() {
            return this.metricKey;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems setN(Float n) {
            this.n = n;
            return this;
        }
        public Float getN() {
            return this.n;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContent extends TeaModel {
        /**
         * <p>The alert conditions. This applies to application monitoring and browser monitoring alert rules.</p>
         */
        @NameInMap("AlertRuleItems")
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems> alertRuleItems;

        /**
         * <p>The logical operator for combining multiple alert conditions. This applies to application monitoring and browser monitoring.</p>
         * <ul>
         * <li><p><code>OR</code>: The alert is triggered if any condition is met.</p>
         * </li>
         * <li><p><code>AND</code>: The alert is triggered only if all conditions are met.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OR</p>
         */
        @NameInMap("Condition")
        public String condition;

        public static CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContent build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContent self = new CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContent();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContent setAlertRuleItems(java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems> alertRuleItems) {
            this.alertRuleItems = alertRuleItems;
            return this;
        }
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContentAlertRuleItems> getAlertRuleItems() {
            return this.alertRuleItems;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContent setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

    }

    public static class CreateOrUpdateAlertRuleResponseBodyAlertRuleAnnotations extends TeaModel {
        /**
         * <p>The annotation key.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The annotation value.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateOrUpdateAlertRuleResponseBodyAlertRuleAnnotations build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateAlertRuleResponseBodyAlertRuleAnnotations self = new CreateOrUpdateAlertRuleResponseBodyAlertRuleAnnotations();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAnnotations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters extends TeaModel {
        /**
         * <p>The key of the filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The operator for the filter condition.</p>
         * <ul>
         * <li><p><code>=</code>: equals</p>
         * </li>
         * <li><p><code>not</code>: not equal to</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>=</p>
         */
        @NameInMap("Opt")
        public String opt;

        /**
         * <p>Indicates whether the filter condition is displayed on the console.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Show")
        public Boolean show;

        /**
         * <p>Used exclusively to distinguish between log types in browser monitoring. This parameter does not apply to other filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("T")
        public String t;

        /**
         * <p>The value for the filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters self = new CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters setOpt(String opt) {
            this.opt = opt;
            return this;
        }
        public String getOpt() {
            return this.opt;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters setT(String t) {
            this.t = t;
            return this;
        }
        public String getT() {
            return this.t;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersDimFilters extends TeaModel {
        /**
         * <p>The key of the filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>rootIp</p>
         */
        @NameInMap("FilterKey")
        public String filterKey;

        /**
         * <p>The operator for the filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("FilterOpt")
        public String filterOpt;

        /**
         * <p>The values for the filter condition.</p>
         */
        @NameInMap("FilterValues")
        public java.util.List<String> filterValues;

        public static CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersDimFilters build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersDimFilters self = new CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersDimFilters();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersDimFilters setFilterKey(String filterKey) {
            this.filterKey = filterKey;
            return this;
        }
        public String getFilterKey() {
            return this.filterKey;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersDimFilters setFilterOpt(String filterOpt) {
            this.filterOpt = filterOpt;
            return this;
        }
        public String getFilterOpt() {
            return this.filterOpt;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersDimFilters setFilterValues(java.util.List<String> filterValues) {
            this.filterValues = filterValues;
            return this;
        }
        public java.util.List<String> getFilterValues() {
            return this.filterValues;
        }

    }

    public static class CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters extends TeaModel {
        /**
         * <p>The custom filter conditions for the browser monitoring alert rule.</p>
         */
        @NameInMap("CustomSLSFilters")
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters> customSLSFilters;

        /**
         * <p>The aggregation dimensions.</p>
         */
        @NameInMap("CustomSLSGroupByDimensions")
        public java.util.List<String> customSLSGroupByDimensions;

        /**
         * <p>The configured filter conditions.</p>
         */
        @NameInMap("CustomSLSWheres")
        public java.util.List<String> customSLSWheres;

        /**
         * <p>The filter conditions of the alert rule. This applies to application monitoring or browser monitoring.</p>
         */
        @NameInMap("DimFilters")
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersDimFilters> dimFilters;

        public static CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters self = new CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters setCustomSLSFilters(java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters> customSLSFilters) {
            this.customSLSFilters = customSLSFilters;
            return this;
        }
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersCustomSLSFilters> getCustomSLSFilters() {
            return this.customSLSFilters;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters setCustomSLSGroupByDimensions(java.util.List<String> customSLSGroupByDimensions) {
            this.customSLSGroupByDimensions = customSLSGroupByDimensions;
            return this;
        }
        public java.util.List<String> getCustomSLSGroupByDimensions() {
            return this.customSLSGroupByDimensions;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters setCustomSLSWheres(java.util.List<String> customSLSWheres) {
            this.customSLSWheres = customSLSWheres;
            return this;
        }
        public java.util.List<String> getCustomSLSWheres() {
            return this.customSLSWheres;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters setDimFilters(java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersDimFilters> dimFilters) {
            this.dimFilters = dimFilters;
            return this;
        }
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleFiltersDimFilters> getDimFilters() {
            return this.dimFilters;
        }

    }

    public static class CreateOrUpdateAlertRuleResponseBodyAlertRuleLabels extends TeaModel {
        /**
         * <p>The label key.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The label value.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateOrUpdateAlertRuleResponseBodyAlertRuleLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateAlertRuleResponseBodyAlertRuleLabels self = new CreateOrUpdateAlertRuleResponseBodyAlertRuleLabels();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateOrUpdateAlertRuleResponseBodyAlertRuleTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>owner</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateOrUpdateAlertRuleResponseBodyAlertRuleTags build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateAlertRuleResponseBodyAlertRuleTags self = new CreateOrUpdateAlertRuleResponseBodyAlertRuleTags();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRuleTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateOrUpdateAlertRuleResponseBodyAlertRule extends TeaModel {
        /**
         * <p>The check type of the Prometheus alert rule.</p>
         * <ul>
         * <li><p><code>STATIC</code>: The alert is triggered based on a static threshold.</p>
         * </li>
         * <li><p><code>CUSTOM</code>: The alert is triggered based on a custom PromQL expression.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STATIC</p>
         */
        @NameInMap("AlertCheckType")
        public String alertCheckType;

        /**
         * <p>The alert group for the Prometheus alert rule.</p>
         * <ul>
         * <li><p><code>-1</code>: Custom PromQL</p>
         * </li>
         * <li><p><code>1</code>: Kubernetes Workloads</p>
         * </li>
         * <li><p><code>15</code>: Kubernetes Nodes</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("AlertGroup")
        public Long alertGroup;

        /**
         * <p>The ID of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>5510445</p>
         */
        @NameInMap("AlertId")
        public Long alertId;

        /**
         * <p>The name of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>arms-test</p>
         */
        @NameInMap("AlertName")
        public String alertName;

        /**
         * <p>The content of the alert rule. This applies to application monitoring and browser monitoring.</p>
         */
        @NameInMap("AlertRuleContent")
        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContent alertRuleContent;

        /**
         * <p>The status of the alert rule.</p>
         * <ul>
         * <li><p><code>RUNNING</code>: The alert rule is running.</p>
         * </li>
         * <li><p><code>STOPPED</code>: The alert rule is stopped.</p>
         * </li>
         * <li><p><code>PAUSED</code>: The alert rule is paused.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The <code>PAUSED</code> status indicates that the system has automatically suspended the alert rule due to an abnormality. This can happen if the alert rule generates too many distinct time series or its associated cluster is deleted.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("AlertStatus")
        public String alertStatus;

        /**
         * <p>The type of the alert rule. Valid values:</p>
         * <ul>
         * <li><p><code>APPLICATION_MONITORING_ALERT_RULE</code>: an alert rule for application monitoring.</p>
         * </li>
         * <li><p><code>BROWSER_MONITORING_ALERT_RULE</code>: an alert rule for browser monitoring.</p>
         * </li>
         * <li><p><code>PROMETHEUS_MONITORING_ALERT_RULE</code>: an alert rule for Prometheus monitoring.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>APPLICATION_MONITORING_ALERT_RULE</p>
         */
        @NameInMap("AlertType")
        public String alertType;

        /**
         * <p>The annotations of the Prometheus alert rule.</p>
         */
        @NameInMap("Annotations")
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleAnnotations> annotations;

        /**
         * <p>Indicates whether newly created applications are automatically added to the alert rule. This applies to application monitoring and browser monitoring rules.</p>
         * <ul>
         * <li><p><code>true</code>: Enabled</p>
         * </li>
         * <li><p><code>false</code>: Disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoAddNewApplication")
        public Boolean autoAddNewApplication;

        /**
         * <p>The ID of the cluster that is associated with the Prometheus alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ceba9b9ea5b924dd0b6726d2de6******</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The UNIX timestamp, in milliseconds, when the alert rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1641438611000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The duration, in minutes, for which a condition must be true before an alert is triggered. This applies only to Prometheus alert rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The extended fields, returned as a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;alarmContext\&quot;:\&quot;{\\\&quot;content\\\&quot;:\\\&quot;报警名称:$报警名称\\\\n筛选条件: $筛选\\\\n报警时间: $报警时间\\\\n报警内容: $报警内容\\\\n注意！：该报警未收到恢复邮件之前，正在持续报警中，24小时后会再次提醒您！\\\&quot;,\\\&quot;subTitle\\\&quot;:\\\&quot;\\\&quot;}\&quot;,\&quot;alertWays\&quot;:\&quot;[0,1]\&quot;,\&quot;contactGroupIds\&quot;:\&quot;381,5075\&quot;,\&quot;notice\&quot;:\&quot;{\\\&quot;endTime\\\&quot;:1480607940000,\\\&quot;noticeEndTime\\\&quot;:1480607940000,\\\&quot;noticeStartTime\\\&quot;:1480521600000,\\\&quot;startTime\\\&quot;:1480521600000}\&quot;}</p>
         */
        @NameInMap("Extend")
        public String extend;

        /**
         * <p>The filters of the alert rule. This applies to application monitoring or browser monitoring.</p>
         */
        @NameInMap("Filters")
        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters filters;

        /**
         * <p>The labels of the Prometheus alert rule.</p>
         */
        @NameInMap("Labels")
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleLabels> labels;

        /**
         * <p>The severity level of the Prometheus alert rule.</p>
         * <ul>
         * <li><p><code>P1</code>: Critical. Indicates major issues that affect core business availability and can have severe consequences.</p>
         * </li>
         * <li><p><code>P2</code>: Warning. Indicates issues that impact system availability but have a limited scope.</p>
         * </li>
         * <li><p><code>P3</code>: Info. Indicates potential issues or alerts from less critical services.</p>
         * </li>
         * <li><p><code>P4</code>: Low priority. Indicates informational alerts that do not affect services.</p>
         * </li>
         * <li><p><code>Default</code>: The default level used when no specific severity is required.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>P2</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The message of the Prometheus alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>命名空间: {{$labels.namespace}} / Pod: {{$labels.pod_name}} / 容器: {{$labels.container}} 内存使用率超过80%, 当前值{{ printf \\\&quot;%.2f\\\&quot; $value }}%</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The metric type of the alert rule. This applies to application monitoring and browser monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p>JVM</p>
         */
        @NameInMap("MetricsType")
        public String metricsType;

        /**
         * <p>The notification mode.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL_MODE</p>
         */
        @NameInMap("NotifyMode")
        public String notifyMode;

        /**
         * <p>The notification policy.</p>
         * 
         * <strong>example:</strong>
         * <p>ALERT_MANAGER</p>
         */
        @NameInMap("NotifyStrategy")
        public String notifyStrategy;

        /**
         * <p>The PIDs of the applications associated with the alert rule. This applies to application monitoring and browser monitoring rules.</p>
         */
        @NameInMap("Pids")
        public java.util.List<String> pids;

        /**
         * <p>The PromQL expression for the Prometheus alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>node_memory_MemAvailable_bytes{} / node_memory_MemTotal_bytes{} * 100</p>
         */
        @NameInMap("PromQL")
        public String promQL;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The tags that are added to the alert rule.</p>
         */
        @NameInMap("Tags")
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleTags> tags;

        /**
         * <p>The UNIX timestamp, in milliseconds, when the alert rule was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1641438611000</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1131971649******</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static CreateOrUpdateAlertRuleResponseBodyAlertRule build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateAlertRuleResponseBodyAlertRule self = new CreateOrUpdateAlertRuleResponseBodyAlertRule();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setAlertCheckType(String alertCheckType) {
            this.alertCheckType = alertCheckType;
            return this;
        }
        public String getAlertCheckType() {
            return this.alertCheckType;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setAlertGroup(Long alertGroup) {
            this.alertGroup = alertGroup;
            return this;
        }
        public Long getAlertGroup() {
            return this.alertGroup;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setAlertId(Long alertId) {
            this.alertId = alertId;
            return this;
        }
        public Long getAlertId() {
            return this.alertId;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setAlertRuleContent(CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContent alertRuleContent) {
            this.alertRuleContent = alertRuleContent;
            return this;
        }
        public CreateOrUpdateAlertRuleResponseBodyAlertRuleAlertRuleContent getAlertRuleContent() {
            return this.alertRuleContent;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setAlertStatus(String alertStatus) {
            this.alertStatus = alertStatus;
            return this;
        }
        public String getAlertStatus() {
            return this.alertStatus;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setAlertType(String alertType) {
            this.alertType = alertType;
            return this;
        }
        public String getAlertType() {
            return this.alertType;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setAnnotations(java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleAnnotations> getAnnotations() {
            return this.annotations;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setAutoAddNewApplication(Boolean autoAddNewApplication) {
            this.autoAddNewApplication = autoAddNewApplication;
            return this;
        }
        public Boolean getAutoAddNewApplication() {
            return this.autoAddNewApplication;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setFilters(CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters filters) {
            this.filters = filters;
            return this;
        }
        public CreateOrUpdateAlertRuleResponseBodyAlertRuleFilters getFilters() {
            return this.filters;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setLabels(java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleLabels> getLabels() {
            return this.labels;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setMetricsType(String metricsType) {
            this.metricsType = metricsType;
            return this;
        }
        public String getMetricsType() {
            return this.metricsType;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setNotifyMode(String notifyMode) {
            this.notifyMode = notifyMode;
            return this;
        }
        public String getNotifyMode() {
            return this.notifyMode;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setNotifyStrategy(String notifyStrategy) {
            this.notifyStrategy = notifyStrategy;
            return this;
        }
        public String getNotifyStrategy() {
            return this.notifyStrategy;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setPids(java.util.List<String> pids) {
            this.pids = pids;
            return this;
        }
        public java.util.List<String> getPids() {
            return this.pids;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setPromQL(String promQL) {
            this.promQL = promQL;
            return this;
        }
        public String getPromQL() {
            return this.promQL;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setTags(java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<CreateOrUpdateAlertRuleResponseBodyAlertRuleTags> getTags() {
            return this.tags;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public CreateOrUpdateAlertRuleResponseBodyAlertRule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
