// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListAlertsResponseBody extends TeaModel {
    // The struct returned.
    @NameInMap("PageBean")
    public ListAlertsResponseBodyPageBean pageBean;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ListAlertsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertsResponseBody self = new ListAlertsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertsResponseBody setPageBean(ListAlertsResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public ListAlertsResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public ListAlertsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAlertsResponseBodyPageBeanListAlertsActivities extends TeaModel {
        // The content of the alert notification.
        @NameInMap("Content")
        public String content;

        // The description of the activity.
        @NameInMap("Description")
        public String description;

        // The name of the handler.
        @NameInMap("HandlerName")
        public String handlerName;

        // The operation time of the activity.
        @NameInMap("Time")
        public String time;

        // The type of the activity. Valid values:
        // 
        // *   1: The alert is claimed.
        // *   2: The alert is disclaimed.
        // *   3: A comment is added for the alert.
        // *   4: The alert is disabled.
        // *   5: An alert notification is sent.
        @NameInMap("Type")
        public Long type;

        public static ListAlertsResponseBodyPageBeanListAlertsActivities build(java.util.Map<String, ?> map) throws Exception {
            ListAlertsResponseBodyPageBeanListAlertsActivities self = new ListAlertsResponseBodyPageBeanListAlertsActivities();
            return TeaModel.build(map, self);
        }

        public ListAlertsResponseBodyPageBeanListAlertsActivities setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListAlertsResponseBodyPageBeanListAlertsActivities setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAlertsResponseBodyPageBeanListAlertsActivities setHandlerName(String handlerName) {
            this.handlerName = handlerName;
            return this;
        }
        public String getHandlerName() {
            return this.handlerName;
        }

        public ListAlertsResponseBodyPageBeanListAlertsActivities setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public ListAlertsResponseBodyPageBeanListAlertsActivities setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

    public static class ListAlertsResponseBodyPageBeanListAlertsAlertEvents extends TeaModel {
        // The name of the event.
        @NameInMap("AlertName")
        public String alertName;

        // The list of annotations.
        @NameInMap("Annotations")
        public String annotations;

        // The description of the event.
        @NameInMap("Description")
        public String description;

        // The time when the event ended.
        @NameInMap("EndTime")
        public String endTime;

        // The URL of the event.
        @NameInMap("GeneratorURL")
        public String generatorURL;

        // The name of the integration that corresponds to the alert event.
        @NameInMap("IntegrationName")
        public String integrationName;

        // The type of the integration that corresponds to the alert event. Valid values:
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

        // The list of tags.
        @NameInMap("Labels")
        public String labels;

        // The time when the event was created.
        @NameInMap("ReceiveTime")
        public String receiveTime;

        // The severity level of the event. Valid values:
        // 
        // *   critical
        // *   error
        // *   warning
        // *   info
        @NameInMap("Severity")
        public String severity;

        // The time when the event started.
        @NameInMap("StartTime")
        public String startTime;

        // The status of the event. Valid values:
        // 
        // *   Active: The event is not cleared.
        // *   Silenced: The event is silenced.
        // *   Resolved: The event is cleared.
        @NameInMap("State")
        public String state;

        public static ListAlertsResponseBodyPageBeanListAlertsAlertEvents build(java.util.Map<String, ?> map) throws Exception {
            ListAlertsResponseBodyPageBeanListAlertsAlertEvents self = new ListAlertsResponseBodyPageBeanListAlertsAlertEvents();
            return TeaModel.build(map, self);
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setAnnotations(String annotations) {
            this.annotations = annotations;
            return this;
        }
        public String getAnnotations() {
            return this.annotations;
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setGeneratorURL(String generatorURL) {
            this.generatorURL = generatorURL;
            return this;
        }
        public String getGeneratorURL() {
            return this.generatorURL;
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setIntegrationName(String integrationName) {
            this.integrationName = integrationName;
            return this;
        }
        public String getIntegrationName() {
            return this.integrationName;
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setIntegrationType(String integrationType) {
            this.integrationType = integrationType;
            return this;
        }
        public String getIntegrationType() {
            return this.integrationType;
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setReceiveTime(String receiveTime) {
            this.receiveTime = receiveTime;
            return this;
        }
        public String getReceiveTime() {
            return this.receiveTime;
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListAlertsResponseBodyPageBeanListAlertsAlertEvents setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListAlertsResponseBodyPageBeanListAlerts extends TeaModel {
        // The list of activities.
        @NameInMap("Activities")
        public java.util.List<ListAlertsResponseBodyPageBeanListAlertsActivities> activities;

        // The list of events.
        @NameInMap("AlertEvents")
        public java.util.List<ListAlertsResponseBodyPageBeanListAlertsAlertEvents> alertEvents;

        // The ID of the alert.
        @NameInMap("AlertId")
        public Long alertId;

        // The name of the alert.
        @NameInMap("AlertName")
        public String alertName;

        // The time when the alert was created.
        @NameInMap("CreateTime")
        public String createTime;

        // The ID of the notification policy.
        @NameInMap("DispatchRuleId")
        public Float dispatchRuleId;

        // The name of the notification policy.
        @NameInMap("DispatchRuleName")
        public String dispatchRuleName;

        // The severity level of the alert. Valid values: P6, P5, P4, P3, P2, and P1. The preceding values are listed in ascending order of severity.
        @NameInMap("Severity")
        public String severity;

        // The status of the alert. Valid values:
        // 
        // *   0: The alert is waiting to be handled.
        // *   1: The alert is being handled.
        // *   2: The alert is handled.
        @NameInMap("State")
        public Long state;

        public static ListAlertsResponseBodyPageBeanListAlerts build(java.util.Map<String, ?> map) throws Exception {
            ListAlertsResponseBodyPageBeanListAlerts self = new ListAlertsResponseBodyPageBeanListAlerts();
            return TeaModel.build(map, self);
        }

        public ListAlertsResponseBodyPageBeanListAlerts setActivities(java.util.List<ListAlertsResponseBodyPageBeanListAlertsActivities> activities) {
            this.activities = activities;
            return this;
        }
        public java.util.List<ListAlertsResponseBodyPageBeanListAlertsActivities> getActivities() {
            return this.activities;
        }

        public ListAlertsResponseBodyPageBeanListAlerts setAlertEvents(java.util.List<ListAlertsResponseBodyPageBeanListAlertsAlertEvents> alertEvents) {
            this.alertEvents = alertEvents;
            return this;
        }
        public java.util.List<ListAlertsResponseBodyPageBeanListAlertsAlertEvents> getAlertEvents() {
            return this.alertEvents;
        }

        public ListAlertsResponseBodyPageBeanListAlerts setAlertId(Long alertId) {
            this.alertId = alertId;
            return this;
        }
        public Long getAlertId() {
            return this.alertId;
        }

        public ListAlertsResponseBodyPageBeanListAlerts setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public ListAlertsResponseBodyPageBeanListAlerts setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAlertsResponseBodyPageBeanListAlerts setDispatchRuleId(Float dispatchRuleId) {
            this.dispatchRuleId = dispatchRuleId;
            return this;
        }
        public Float getDispatchRuleId() {
            return this.dispatchRuleId;
        }

        public ListAlertsResponseBodyPageBeanListAlerts setDispatchRuleName(String dispatchRuleName) {
            this.dispatchRuleName = dispatchRuleName;
            return this;
        }
        public String getDispatchRuleName() {
            return this.dispatchRuleName;
        }

        public ListAlertsResponseBodyPageBeanListAlerts setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public ListAlertsResponseBodyPageBeanListAlerts setState(Long state) {
            this.state = state;
            return this;
        }
        public Long getState() {
            return this.state;
        }

    }

    public static class ListAlertsResponseBodyPageBean extends TeaModel {
        // The alerts for which the alert sending history is queried.
        @NameInMap("ListAlerts")
        public java.util.List<ListAlertsResponseBodyPageBeanListAlerts> listAlerts;

        // The page number of the returned page.
        @NameInMap("Page")
        public Long page;

        // The number of alerts returned per page.
        @NameInMap("Size")
        public Long size;

        // The total number of queried alerts.
        @NameInMap("Total")
        public Long total;

        public static ListAlertsResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            ListAlertsResponseBodyPageBean self = new ListAlertsResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public ListAlertsResponseBodyPageBean setListAlerts(java.util.List<ListAlertsResponseBodyPageBeanListAlerts> listAlerts) {
            this.listAlerts = listAlerts;
            return this;
        }
        public java.util.List<ListAlertsResponseBodyPageBeanListAlerts> getListAlerts() {
            return this.listAlerts;
        }

        public ListAlertsResponseBodyPageBean setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public ListAlertsResponseBodyPageBean setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListAlertsResponseBodyPageBean setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
