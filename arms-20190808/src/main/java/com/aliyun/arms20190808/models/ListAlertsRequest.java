// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListAlertsRequest extends TeaModel {
    // The name of the alert rule.
    @NameInMap("AlertName")
    public String alertName;

    // The ID of the notification policy.
    @NameInMap("DispatchRuleId")
    public Long dispatchRuleId;

    // The end time of the alert sending history that you want to query. Specify the time in the `YYYY-MM-DD HH:mm:ss` format.
    @NameInMap("EndTime")
    public String endTime;

    // The type of the integration. Valid values:
    // 
    // *   ARMS
    // *   CLOUD_MONITOR
    // *   MSE
    // *   ARMS_CLOUD_DIALTEST
    // *   PROMETHEUS
    // *   LOG_SERVICE
    // *   CUSTOM
    // *   ARMS_PROMETHEUS
    // *   ARMS_APP_MON
    // *   ARMS_FRONT_MON
    // *   ARMS_CUSTOM
    // *   XTRACE
    // *   GRAFANA
    // *   ZABBIX
    // *   SKYWALKING
    // *   EVENT_BRIDGE
    // *   NAGIOS
    // *   OPENFALCON
    // *   ARMS_INSIGHTS
    @NameInMap("IntegrationType")
    public String integrationType;

    // The number of the page to return.
    @NameInMap("Page")
    public Long page;

    // The severity level of the alert. Valid values: P6, P5, P4, P3, P2, and P1. The preceding values are listed in ascending order of severity.
    @NameInMap("Severity")
    public String severity;

    // Specifies whether to query the activities that correspond to alerts. Valid values:
    // 
    // *   `false` (default value): The activities are not queried.
    // *   `true`: The activities in the last three days are queried.
    @NameInMap("ShowActivities")
    public Boolean showActivities;

    // Specifies whether to query the events that correspond to alerts. Valid values:
    // 
    // *   `false` (default value): The events are not queried.
    // *   `true`: The events are queried.
    @NameInMap("ShowEvents")
    public Boolean showEvents;

    // The number of alerts to return on each page.
    @NameInMap("Size")
    public Long size;

    // The start time of the alert sending history that you want to query. Specify the time in the `YYYY-MM-DD HH:mm:ss` format.
    @NameInMap("StartTime")
    public String startTime;

    // The status of the alert. Valid values:
    // 
    // *   0: The alert is waiting to be handled.
    // *   1: The alert is being handled.
    // *   2: The alert is handled.
    @NameInMap("State")
    public Long state;

    public static ListAlertsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertsRequest self = new ListAlertsRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertsRequest setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public ListAlertsRequest setDispatchRuleId(Long dispatchRuleId) {
        this.dispatchRuleId = dispatchRuleId;
        return this;
    }
    public Long getDispatchRuleId() {
        return this.dispatchRuleId;
    }

    public ListAlertsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListAlertsRequest setIntegrationType(String integrationType) {
        this.integrationType = integrationType;
        return this;
    }
    public String getIntegrationType() {
        return this.integrationType;
    }

    public ListAlertsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListAlertsRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public ListAlertsRequest setShowActivities(Boolean showActivities) {
        this.showActivities = showActivities;
        return this;
    }
    public Boolean getShowActivities() {
        return this.showActivities;
    }

    public ListAlertsRequest setShowEvents(Boolean showEvents) {
        this.showEvents = showEvents;
        return this;
    }
    public Boolean getShowEvents() {
        return this.showEvents;
    }

    public ListAlertsRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ListAlertsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListAlertsRequest setState(Long state) {
        this.state = state;
        return this;
    }
    public Long getState() {
        return this.state;
    }

}
