// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListActivatedAlertsResponseBody extends TeaModel {
    // The struct returned.
    @NameInMap("Page")
    public ListActivatedAlertsResponseBodyPage page;

    // The ID of the request.
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
        // The ID of the notification policy.
        @NameInMap("RuleId")
        public Integer ruleId;

        // The name of the notification policy.
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
        // The ID of the alert rule.
        @NameInMap("AlertId")
        public String alertId;

        // The name of the alert rule.
        @NameInMap("AlertName")
        public String alertName;

        // The type of the alert.
        @NameInMap("AlertType")
        public String alertType;

        // The number of times that the alert event was received.
        @NameInMap("Count")
        public Integer count;

        // The timestamp when the alert rule was created.
        @NameInMap("CreateTime")
        public Long createTime;

        // The notification policies.
        @NameInMap("DispatchRules")
        public java.util.List<ListActivatedAlertsResponseBodyPageAlertsDispatchRules> dispatchRules;

        // The timestamp when the alert was ended.
        @NameInMap("EndsAt")
        public Long endsAt;

        // The extended fields that indicate the following tags:
        // 
        // *   The tags that are carried in the metrics of the alert rule expression.
        // *   The tags that are created based on the alert rule.
        // *   The default tags of Application Real-Time Monitoring Service (ARMS).
        @NameInMap("ExpandFields")
        public java.util.Map<String, ?> expandFields;

        // The name of the object that is associated with the alert.
        @NameInMap("IntegrationName")
        public String integrationName;

        // The type of the service integration that generated the alert.
        @NameInMap("IntegrationType")
        public String integrationType;

        // The type of the object that is associated with the alert.
        @NameInMap("InvolvedObjectKind")
        public String involvedObjectKind;

        // The name of the service integration that generated the alert.
        @NameInMap("InvolvedObjectName")
        public String involvedObjectName;

        // The description of the alert.
        @NameInMap("Message")
        public String message;

        // The level of the alert. Valid values:
        // 
        // *   `critical`
        // *   `error`
        // *   `warn`
        // *   `page`
        @NameInMap("Severity")
        public String severity;

        // The timestamp when the alert was generated.
        @NameInMap("StartsAt")
        public Long startsAt;

        // The status of the alert. Valid values:
        // 
        // *   `Active`
        // *   `Inhibited`
        // *   `Silenced`
        // *   `Resolved`
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
        // The alerts that have been triggered.
        @NameInMap("Alerts")
        public java.util.List<ListActivatedAlertsResponseBodyPageAlerts> alerts;

        // The page number of the returned page.
        @NameInMap("Page")
        public Integer page;

        // The number of entries returned per page.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of entries returned.
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
