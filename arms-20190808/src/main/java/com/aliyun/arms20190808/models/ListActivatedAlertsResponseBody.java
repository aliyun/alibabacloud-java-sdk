// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListActivatedAlertsResponseBody extends TeaModel {
    /**
     * <p>The struct returned.</p>
     */
    @NameInMap("Page")
    public ListActivatedAlertsResponseBodyPage page;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BDB74B8F-4123-482A-ABB7-7F440349****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListActivatedAlertsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListActivatedAlertsResponseBody self = new ListActivatedAlertsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListActivatedAlertsResponseBody setPage(ListActivatedAlertsResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public ListActivatedAlertsResponseBodyPage getPage() {
        return this.page;
    }

    public ListActivatedAlertsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListActivatedAlertsResponseBodyPageAlertsDispatchRules extends TeaModel {
        /**
         * <p>The ID of the notification policy.</p>
         * 
         * <strong>example:</strong>
         * <p>7021</p>
         */
        @NameInMap("RuleId")
        public Integer ruleId;

        /**
         * <p>The name of the notification policy.</p>
         * 
         * <strong>example:</strong>
         * <p>NotificationPolicy1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        public static ListActivatedAlertsResponseBodyPageAlertsDispatchRules build(java.util.Map<String, ?> map) throws Exception {
            ListActivatedAlertsResponseBodyPageAlertsDispatchRules self = new ListActivatedAlertsResponseBodyPageAlertsDispatchRules();
            return TeaModel.build(map, self);
        }

        public ListActivatedAlertsResponseBodyPageAlertsDispatchRules setRuleId(Integer ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Integer getRuleId() {
            return this.ruleId;
        }

        public ListActivatedAlertsResponseBodyPageAlertsDispatchRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class ListActivatedAlertsResponseBodyPageAlerts extends TeaModel {
        /**
         * <p>The ID of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>3888704</p>
         */
        @NameInMap("AlertId")
        public String alertId;

        /**
         * <p>The name of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Container CPU usage is greater than 80%</p>
         */
        @NameInMap("AlertName")
        public String alertName;

        /**
         * <p>The type of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>PROMETHEUS_MONITORING_ALERT_RULE</p>
         */
        @NameInMap("AlertType")
        public String alertType;

        /**
         * <p>The number of times that the alert event was received.</p>
         * 
         * <strong>example:</strong>
         * <p>598</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The timestamp when the alert rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1616466300000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The notification policies.</p>
         */
        @NameInMap("DispatchRules")
        public java.util.List<ListActivatedAlertsResponseBodyPageAlertsDispatchRules> dispatchRules;

        /**
         * <p>The timestamp when the alert was ended.</p>
         * 
         * <strong>example:</strong>
         * <p>1616502540000</p>
         */
        @NameInMap("EndsAt")
        public Long endsAt;

        /**
         * <p>The extended fields that indicate the following tags:</p>
         * <ul>
         * <li>The tags that are carried in the metrics of the alert rule expression.</li>
         * <li>The tags that are created based on the alert rule.</li>
         * <li>The default tags of Application Real-Time Monitoring Service (ARMS).</li>
         * </ul>
         */
        @NameInMap("ExpandFields")
        public java.util.Map<String, ?> expandFields;

        /**
         * <p>The name of the object that is associated with the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>testphp2</p>
         */
        @NameInMap("IntegrationName")
        public String integrationName;

        /**
         * <p>The type of the service integration that generated the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>PROMETHEUS</p>
         */
        @NameInMap("IntegrationType")
        public String integrationType;

        /**
         * <p>The type of the object that is associated with the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("InvolvedObjectKind")
        public String involvedObjectKind;

        /**
         * <p>The name of the service integration that generated the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>Test integration-prometheus</p>
         */
        @NameInMap("InvolvedObjectName")
        public String involvedObjectName;

        /**
         * <p>The description of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>Alarm name: PodRestart_testphp2,\n Pod night-test-group-1-1-5f5d6f4d84-pszns is restart, Value: 133.33%, 1.33%</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The level of the alert. Valid values:</p>
         * <ul>
         * <li><code>critical</code></li>
         * <li><code>error</code></li>
         * <li><code>warn</code></li>
         * <li><code>page</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>critical</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The timestamp when the alert was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>1616466300000</p>
         */
        @NameInMap("StartsAt")
        public Long startsAt;

        /**
         * <p>The status of the alert. Valid values:</p>
         * <ul>
         * <li><code>Active</code></li>
         * <li><code>Inhibited</code></li>
         * <li><code>Silenced</code></li>
         * <li><code>Resolved</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListActivatedAlertsResponseBodyPageAlerts build(java.util.Map<String, ?> map) throws Exception {
            ListActivatedAlertsResponseBodyPageAlerts self = new ListActivatedAlertsResponseBodyPageAlerts();
            return TeaModel.build(map, self);
        }

        public ListActivatedAlertsResponseBodyPageAlerts setAlertId(String alertId) {
            this.alertId = alertId;
            return this;
        }
        public String getAlertId() {
            return this.alertId;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setAlertType(String alertType) {
            this.alertType = alertType;
            return this;
        }
        public String getAlertType() {
            return this.alertType;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setDispatchRules(java.util.List<ListActivatedAlertsResponseBodyPageAlertsDispatchRules> dispatchRules) {
            this.dispatchRules = dispatchRules;
            return this;
        }
        public java.util.List<ListActivatedAlertsResponseBodyPageAlertsDispatchRules> getDispatchRules() {
            return this.dispatchRules;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setEndsAt(Long endsAt) {
            this.endsAt = endsAt;
            return this;
        }
        public Long getEndsAt() {
            return this.endsAt;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setExpandFields(java.util.Map<String, ?> expandFields) {
            this.expandFields = expandFields;
            return this;
        }
        public java.util.Map<String, ?> getExpandFields() {
            return this.expandFields;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setIntegrationName(String integrationName) {
            this.integrationName = integrationName;
            return this;
        }
        public String getIntegrationName() {
            return this.integrationName;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setIntegrationType(String integrationType) {
            this.integrationType = integrationType;
            return this;
        }
        public String getIntegrationType() {
            return this.integrationType;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setInvolvedObjectKind(String involvedObjectKind) {
            this.involvedObjectKind = involvedObjectKind;
            return this;
        }
        public String getInvolvedObjectKind() {
            return this.involvedObjectKind;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setInvolvedObjectName(String involvedObjectName) {
            this.involvedObjectName = involvedObjectName;
            return this;
        }
        public String getInvolvedObjectName() {
            return this.involvedObjectName;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setStartsAt(Long startsAt) {
            this.startsAt = startsAt;
            return this;
        }
        public Long getStartsAt() {
            return this.startsAt;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListActivatedAlertsResponseBodyPage extends TeaModel {
        /**
         * <p>The alerts that have been triggered.</p>
         */
        @NameInMap("Alerts")
        public java.util.List<ListActivatedAlertsResponseBodyPageAlerts> alerts;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListActivatedAlertsResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            ListActivatedAlertsResponseBodyPage self = new ListActivatedAlertsResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public ListActivatedAlertsResponseBodyPage setAlerts(java.util.List<ListActivatedAlertsResponseBodyPageAlerts> alerts) {
            this.alerts = alerts;
            return this;
        }
        public java.util.List<ListActivatedAlertsResponseBodyPageAlerts> getAlerts() {
            return this.alerts;
        }

        public ListActivatedAlertsResponseBodyPage setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListActivatedAlertsResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListActivatedAlertsResponseBodyPage setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
