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
     * 
     * <strong>example:</strong>
     * <p>2FC13182-B9AF-4E6B-BE51-72669B7C****</p>
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
         * 
         * <strong>example:</strong>
         * <p>[Notification policy: Send notifications to DingTalk groups] Host monitoring. Host IP address: 10.76.XX.XX. Average memory usage of the host in the last 1 minute ≥ 1.0%. Current value: 84.7454%.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The description of the activity.</p>
         * 
         * <strong>example:</strong>
         * <p>[Alert Claimed] The alert is claimed</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the handler.</p>
         * 
         * <strong>example:</strong>
         * <p>O\&amp;M Engineer A</p>
         */
        @NameInMap("HandlerName")
        public String handlerName;

        /**
         * <p>The operation time of the activity.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-20 19:08:57</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The type of the activity. Valid values:</p>
         * <ul>
         * <li>1: The alert is claimed.</li>
         * <li>2: The alert is disclaimed.</li>
         * <li>3: A comment is added for the alert.</li>
         * <li>4: The alert is disabled.</li>
         * <li>5: An alert notification is sent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>Test-triggered alert</p>
         */
        @NameInMap("AlertName")
        public String alertName;

        /**
         * <p>The annotations.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;_aliyun_arms_alert_value&quot;:&quot;4.0&quot; &quot;_aliyun_arms_alert_traceId&quot;:&quot;ac10c43116421327442277073d5461-105075299&quot;}</p>
         */
        @NameInMap("Annotations")
        public String annotations;

        /**
         * <p>The description of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Host monitoring. Host IP address: 10.76.XX.XX. Average memory usage of the host in the last 1 minute ≥ 1.0%. Current value: 84.7454%.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the event ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-19 17:10:31</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The URL of the event.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://arms.console.aliyun.com">http://arms.console.aliyun.com</a></p>
         */
        @NameInMap("GeneratorURL")
        public String generatorURL;

        /**
         * <p>The name of the integration that corresponds to the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>ARMS</p>
         */
        @NameInMap("IntegrationName")
        public String integrationName;

        /**
         * <p>The type of the integration that corresponds to the alert event. Valid values:</p>
         * <ul>
         * <li>ARMS</li>
         * <li>CLOUD_MONITOR</li>
         * <li>MSE</li>
         * <li>ARMS_CLOUD_DIALTEST</li>
         * <li>PROMETHEUS</li>
         * <li>LOG_SERVICE</li>
         * <li>CUSTOM</li>
         * <li>ARMS_PROMETHEUS</li>
         * <li>ARMS_APP_MON</li>
         * <li>ARMS_FRONT_MON</li>
         * <li>ARMS_CUSTOM</li>
         * <li>XTRACE</li>
         * <li>GRAFANA</li>
         * <li>ZABBIX</li>
         * <li>SKYWALKING</li>
         * <li>EVENT_BRIDGE</li>
         * <li>NAGIOS</li>
         * <li>OPENFALCON</li>
         * <li>ARMS_INSIGHTS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ARMS_APP_MON</p>
         */
        @NameInMap("IntegrationType")
        public String integrationType;

        /**
         * <p>The tags.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;severity&quot;:&quot;warning&quot; &quot;_aliyun_arms_alert_level&quot;:&quot;ERROR&quot; &quot;_aliyun_arms_entropy&quot;:&quot;0.30170457417889235&quot;}</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <p>The time when the event was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-19 17:05:42</p>
         */
        @NameInMap("ReceiveTime")
        public String receiveTime;

        /**
         * <p>The severity level of the event. Valid values:</p>
         * <ul>
         * <li>critical</li>
         * <li>error</li>
         * <li>warning</li>
         * <li>info</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>warning</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The time when the event started.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-18 00:14:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the event. Valid values:</p>
         * <ul>
         * <li>Active: The event is not cleared.</li>
         * <li>Silenced: The event is silenced.</li>
         * <li>Resolved: The event is cleared.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
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
        @NameInMap("AcknowledgeTime")
        public Long acknowledgeTime;

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
         * 
         * <strong>example:</strong>
         * <p>2279</p>
         */
        @NameInMap("AlertId")
        public Long alertId;

        /**
         * <p>The name of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Test alert</p>
         */
        @NameInMap("AlertName")
        public String alertName;

        /**
         * <p>The time when the alert was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-18 00:21:35</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Describe")
        public String describe;

        /**
         * <p>The ID of the notification policy.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("DispatchRuleId")
        public Float dispatchRuleId;

        /**
         * <p>The name of the notification policy.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk Notification</p>
         */
        @NameInMap("DispatchRuleName")
        public String dispatchRuleName;

        @NameInMap("Handler")
        public String handler;

        @NameInMap("NotifyRobots")
        public String notifyRobots;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("RecoverTime")
        public Long recoverTime;

        /**
         * <p>The severity level of the alert. Valid values: P6, P5, P4, P3, P2, and P1. The preceding values are listed in ascending order of severity.</p>
         * 
         * <strong>example:</strong>
         * <p>P6</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The Alert solution.</p>
         * 
         * <strong>example:</strong>
         * <p>--</p>
         */
        @NameInMap("Solution")
        public String solution;

        /**
         * <p>The status of the alert. Valid values:</p>
         * <ul>
         * <li>0: The alert is pending.</li>
         * <li>1: The alert is being handled.</li>
         * <li>2: The alert is handled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("State")
        public Long state;

        public static ListAlertsResponseBodyPageBeanListAlerts build(java.util.Map<String, ?> map) throws Exception {
            ListAlertsResponseBodyPageBeanListAlerts self = new ListAlertsResponseBodyPageBeanListAlerts();
            return TeaModel.build(map, self);
        }

        public ListAlertsResponseBodyPageBeanListAlerts setAcknowledgeTime(Long acknowledgeTime) {
            this.acknowledgeTime = acknowledgeTime;
            return this;
        }
        public Long getAcknowledgeTime() {
            return this.acknowledgeTime;
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

        public ListAlertsResponseBodyPageBeanListAlerts setDescribe(String describe) {
            this.describe = describe;
            return this;
        }
        public String getDescribe() {
            return this.describe;
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

        public ListAlertsResponseBodyPageBeanListAlerts setHandler(String handler) {
            this.handler = handler;
            return this;
        }
        public String getHandler() {
            return this.handler;
        }

        public ListAlertsResponseBodyPageBeanListAlerts setNotifyRobots(String notifyRobots) {
            this.notifyRobots = notifyRobots;
            return this;
        }
        public String getNotifyRobots() {
            return this.notifyRobots;
        }

        public ListAlertsResponseBodyPageBeanListAlerts setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListAlertsResponseBodyPageBeanListAlerts setRecoverTime(Long recoverTime) {
            this.recoverTime = recoverTime;
            return this;
        }
        public Long getRecoverTime() {
            return this.recoverTime;
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Long page;

        /**
         * <p>The number of alerts returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The total number of queried alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
