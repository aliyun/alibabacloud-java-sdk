// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListAlertsResponseBody extends TeaModel {
    /**
     * <p>The information about the array object.</p>
     */
    @NameInMap("PageBean")
    public ListAlertsResponseBodyPageBean pageBean;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The content of the alert notification.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The description of the activity.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the handler.</p>
         */
        @NameInMap("HandlerName")
        public String handlerName;

        /**
         * <p>The operation time of the activity.</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The type of the activity. Valid values:</p>
         * <br>
         * <p>*   1: The alert is claimed.</p>
         * <p>*   2: The alert is disclaimed.</p>
         * <p>*   3: A comment is added for the alert.</p>
         * <p>*   4: The alert is disabled.</p>
         * <p>*   5: An alert notification is sent.</p>
         */
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
        /**
         * <p>The name of the event.</p>
         */
        @NameInMap("AlertName")
        public String alertName;

        /**
         * <p>The annotations.</p>
         */
        @NameInMap("Annotations")
        public String annotations;

        /**
         * <p>The description of the event.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the event ended.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The URL of the event.</p>
         */
        @NameInMap("GeneratorURL")
        public String generatorURL;

        /**
         * <p>The name of the integration that corresponds to the alert event.</p>
         */
        @NameInMap("IntegrationName")
        public String integrationName;

        /**
         * <p>The type of the integration that corresponds to the alert event. Valid values:</p>
         * <br>
         * <p>*   ARMS</p>
         * <p>*   CLOUD_MONITOR</p>
         * <p>*   MSE</p>
         * <p>*   ARMS_CLOUD_DIALTEST</p>
         * <p>*   PROMETHEUS</p>
         * <p>*   LOG_SERVICE</p>
         * <p>*   CUSTOM</p>
         * <p>*   ARMS_PROMETHEUS</p>
         * <p>*   ARMS_APP_MON</p>
         * <p>*   ARMS_FRONT_MON</p>
         * <p>*   ARMS_CUSTOM</p>
         * <p>*   XTRACE</p>
         * <p>*   GRAFANA</p>
         * <p>*   ZABBIX</p>
         * <p>*   SKYWALKING</p>
         * <p>*   EVENT_BRIDGE</p>
         * <p>*   NAGIOS</p>
         * <p>*   OPENFALCON</p>
         * <p>*   ARMS_INSIGHTS</p>
         */
        @NameInMap("IntegrationType")
        public String integrationType;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <p>The time when the event was created.</p>
         */
        @NameInMap("ReceiveTime")
        public String receiveTime;

        /**
         * <p>The severity level of the event. Valid values:</p>
         * <br>
         * <p>*   critical</p>
         * <p>*   error</p>
         * <p>*   warning</p>
         * <p>*   info</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The time when the event started.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the event. Valid values:</p>
         * <br>
         * <p>*   Active: The event is not cleared.</p>
         * <p>*   Silenced: The event is silenced.</p>
         * <p>*   Resolved: The event is cleared.</p>
         */
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
        /**
         * <p>The list of activities.</p>
         */
        @NameInMap("Activities")
        public java.util.List<ListAlertsResponseBodyPageBeanListAlertsActivities> activities;

        /**
         * <p>The list of events.</p>
         */
        @NameInMap("AlertEvents")
        public java.util.List<ListAlertsResponseBodyPageBeanListAlertsAlertEvents> alertEvents;

        /**
         * <p>The alert ID.</p>
         */
        @NameInMap("AlertId")
        public Long alertId;

        /**
         * <p>The name of the alert rule.</p>
         */
        @NameInMap("AlertName")
        public String alertName;

        /**
         * <p>The time when the alert was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the notification policy.</p>
         */
        @NameInMap("DispatchRuleId")
        public Float dispatchRuleId;

        /**
         * <p>The name of the notification policy.</p>
         */
        @NameInMap("DispatchRuleName")
        public String dispatchRuleName;

        /**
         * <p>The severity level of the alert. Valid values: P6, P5, P4, P3, P2, and P1. The preceding values are listed in ascending order of severity.</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The Alert solution.</p>
         */
        @NameInMap("Solution")
        public String solution;

        /**
         * <p>The status of the alert. Valid values:</p>
         * <br>
         * <p>*   0: The alert is pending.</p>
         * <p>*   1: The alert is being handled.</p>
         * <p>*   2: The alert is handled.</p>
         */
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

        public ListAlertsResponseBodyPageBeanListAlerts setSolution(String solution) {
            this.solution = solution;
            return this;
        }
        public String getSolution() {
            return this.solution;
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
        /**
         * <p>The alerts for which the alert sending history is queried.</p>
         */
        @NameInMap("ListAlerts")
        public java.util.List<ListAlertsResponseBodyPageBeanListAlerts> listAlerts;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("Page")
        public Long page;

        /**
         * <p>The number of alerts returned per page.</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The total number of queried alerts.</p>
         */
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
