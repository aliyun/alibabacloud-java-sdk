// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateAlertRuleRequest extends TeaModel {
    // The alert check type of the Prometheus alert rule.
    // 
    // *   STATIC: a static threshold value. If you set the parameter to STATIC, you must specify the **MetricsKey** parameter. For more information, see the **Correspondence between AlertGroup and MetricsKey for Prometheus Service** table.
    // *   CUSTOM: a custom PromQL statement. If you set the parameter to CUSTOM, you must specify the **PromQL**, **Duration**, and **Message** parameters to create a Prometheus alert rule.
    @NameInMap("AlertCheckType")
    public String alertCheckType;

    // The alert contact group ID of the Prometheus alert rule.
    // 
    // *   \-1: custom PromQL
    // *   1: Kubernetes load
    // *   15: Kubernetes node
    @NameInMap("AlertGroup")
    public Long alertGroup;

    // The ID of the alert rule.
    // 
    // *   If you do not specify this parameter, a new alert rule is created.
    // *   If you specify this parameter, the specified alert rule is modified.
    @NameInMap("AlertId")
    public Long alertId;

    // The name of the alert rule.
    @NameInMap("AlertName")
    public String alertName;

    // The content of the Application Monitoring or Browser Monitoring alert rule. The following code provides an example of the **AlertRuleContent** parameter. For more information about the meaning of each field, see the supplementary description.
    // 
    // `{ "Condition": "OR", "AlertRuleItems": [ { "Operator": "CURRENT_LTE", "MetricKey": "appstat.jvm.threadcount", "Value": 1000, "Aggregate": "AVG", "N": 1 } ] }`
    // 
    // >  The conditional fields vary depending on the values of the **MetricsType** and **AlertRuleItems.MetricKey** parameters. For more information about the types of metrics supported by Application Monitoring and Browser Monitoring and the alert rule fields corresponding to each metric, see the supplementary description.
    @NameInMap("AlertRuleContent")
    public String alertRuleContent;

    // The status of the alert rule.
    // 
    // *   RUNNING (default)
    // *   STOPPED
    @NameInMap("AlertStatus")
    public String alertStatus;

    // The type of the alert rule. Valid values:
    // 
    // *   APPLICATION_MONITORING_ALERT_RULE: alert rule for Application Monitoring
    // *   BROWSER_MONITORING_ALERT_RULE: alert rule for Browser Monitoring
    // *   PROMETHEUS_MONITORING_ALERT_RULE: alert rule for Prometheus Service
    @NameInMap("AlertType")
    public String alertType;

    // The annotations of the Prometheus alert rule.
    @NameInMap("Annotations")
    public String annotations;

    // Specifies whether to apply the alert rule to new applications that are created in Application Monitoring or Browser Monitoring.
    // 
    // *   `true`: yes
    // *   `false`: no
    @NameInMap("AutoAddNewApplication")
    public Boolean autoAddNewApplication;

    // The cluster ID of the Prometheus alert rule.
    @NameInMap("ClusterId")
    public String clusterId;

    // The duration of the Prometheus alert rule. Unit: minutes.
    @NameInMap("Duration")
    public Long duration;

    // The filter conditions of the Application Monitoring or Browser Monitoring alert rule.
    // 
    // Format:
    // 
    // ```
    // 
    // "DimFilters": [ 
    // { 
    //  "FilterOpt": "ALL",
    //  "FilterValues": [],         //The value of the filter condition. 
    //  "FilterKey": "rootIp"     //The Key of the filter condition. 
    // }
    // ]
    //                                 
    // ```
    // 
    // Valid values of **FilterOpt**:
    // 
    // *   STATIC: matches the value of the specified dimension.
    // *   ALL: matches the values of all dimensions.
    // *   DISABLE: aggregates the values of all dimensions.
    @NameInMap("Filters")
    public String filters;

    // The tags of the Prometheus alert rule.
    @NameInMap("Labels")
    public String labels;

    // The level of the Prometheus alert rule.
    // 
    // *   P1: Alert notifications are sent for major issues that affect the availability of core business, have huge impact, and may lead to serious consequences.
    // *   P2: Alert notifications are sent for service errors that affect the system availability with relatively limited impact.
    // *   P3: Alert notifications are sent for issues that may cause service errors or negative effects, or alert notifications for services that are relatively less important.
    // *   P4: Alert notifications are sent for low-priority issues that do not affect your business.
    // *   Default: Alert notifications are sent without distinguishing between alert levels.
    @NameInMap("Level")
    public String level;

    // The alert message of the Prometheus alert rule.
    @NameInMap("Message")
    public String message;

    // The alert metrics. If you set the **AlertCheckType** parameter to **STATIC** when you create a Prometheus alert rule, you must specify the **MetricsKey** parameter.
    // 
    // >  Alert metrics vary depending on the value of the **AlertGroup** parameter. For more information about the correspondence between **AlertGroup** and **MetricsKey**, see the supplementary description.
    @NameInMap("MetricsKey")
    public String metricsKey;

    // The metric type of the Application Monitoring or Browser Monitoring alert rule. For more information, see the following tables.
    @NameInMap("MetricsType")
    public String metricsType;

    // The notification policy.
    // 
    // *   If you set this parameter to null, no notification policy is specified. After you create an alert rule, you can create a notification policy and specify match rules and match conditions. For example, you can specify an alert rule name as the match condition. When the alert rule is triggered, an alert event is generated and an alert notification is sent to the contacts or contact groups that are specified in the notification policy.
    // *   To specify a notification policy, set this parameter to the ID of the notification policy. Application Real-Time Monitoring Service (ARMS) automatically adds a match rule to the notification policy and specifies the ID of the alert rule as the match condition. The name of the alert rule is also displayed. This way, the alert events that are generated based on the alert rule can be matched by the specified notification policy.
    @NameInMap("NotifyStrategy")
    public String notifyStrategy;

    // The process ID (PID) that is associated with the Application Monitoring or Browser Monitoring alert rule.
    @NameInMap("Pids")
    public String pids;

    // The PromQL statement of the Prometheus alert rule.
    @NameInMap("PromQL")
    public String promQL;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static CreateOrUpdateAlertRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateAlertRuleRequest self = new CreateOrUpdateAlertRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateAlertRuleRequest setAlertCheckType(String alertCheckType) {
        this.alertCheckType = alertCheckType;
        return this;
    }
    public String getAlertCheckType() {
        return this.alertCheckType;
    }

    public CreateOrUpdateAlertRuleRequest setAlertGroup(Long alertGroup) {
        this.alertGroup = alertGroup;
        return this;
    }
    public Long getAlertGroup() {
        return this.alertGroup;
    }

    public CreateOrUpdateAlertRuleRequest setAlertId(Long alertId) {
        this.alertId = alertId;
        return this;
    }
    public Long getAlertId() {
        return this.alertId;
    }

    public CreateOrUpdateAlertRuleRequest setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public CreateOrUpdateAlertRuleRequest setAlertRuleContent(String alertRuleContent) {
        this.alertRuleContent = alertRuleContent;
        return this;
    }
    public String getAlertRuleContent() {
        return this.alertRuleContent;
    }

    public CreateOrUpdateAlertRuleRequest setAlertStatus(String alertStatus) {
        this.alertStatus = alertStatus;
        return this;
    }
    public String getAlertStatus() {
        return this.alertStatus;
    }

    public CreateOrUpdateAlertRuleRequest setAlertType(String alertType) {
        this.alertType = alertType;
        return this;
    }
    public String getAlertType() {
        return this.alertType;
    }

    public CreateOrUpdateAlertRuleRequest setAnnotations(String annotations) {
        this.annotations = annotations;
        return this;
    }
    public String getAnnotations() {
        return this.annotations;
    }

    public CreateOrUpdateAlertRuleRequest setAutoAddNewApplication(Boolean autoAddNewApplication) {
        this.autoAddNewApplication = autoAddNewApplication;
        return this;
    }
    public Boolean getAutoAddNewApplication() {
        return this.autoAddNewApplication;
    }

    public CreateOrUpdateAlertRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateOrUpdateAlertRuleRequest setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public CreateOrUpdateAlertRuleRequest setFilters(String filters) {
        this.filters = filters;
        return this;
    }
    public String getFilters() {
        return this.filters;
    }

    public CreateOrUpdateAlertRuleRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public CreateOrUpdateAlertRuleRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public CreateOrUpdateAlertRuleRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateOrUpdateAlertRuleRequest setMetricsKey(String metricsKey) {
        this.metricsKey = metricsKey;
        return this;
    }
    public String getMetricsKey() {
        return this.metricsKey;
    }

    public CreateOrUpdateAlertRuleRequest setMetricsType(String metricsType) {
        this.metricsType = metricsType;
        return this;
    }
    public String getMetricsType() {
        return this.metricsType;
    }

    public CreateOrUpdateAlertRuleRequest setNotifyStrategy(String notifyStrategy) {
        this.notifyStrategy = notifyStrategy;
        return this;
    }
    public String getNotifyStrategy() {
        return this.notifyStrategy;
    }

    public CreateOrUpdateAlertRuleRequest setPids(String pids) {
        this.pids = pids;
        return this;
    }
    public String getPids() {
        return this.pids;
    }

    public CreateOrUpdateAlertRuleRequest setPromQL(String promQL) {
        this.promQL = promQL;
        return this;
    }
    public String getPromQL() {
        return this.promQL;
    }

    public CreateOrUpdateAlertRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
