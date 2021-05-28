// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class ListActivatedAlertsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Page")
    public ListActivatedAlertsResponseBodyPage page;

    public static ListActivatedAlertsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListActivatedAlertsResponseBody self = new ListActivatedAlertsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListActivatedAlertsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListActivatedAlertsResponseBody setPage(ListActivatedAlertsResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public ListActivatedAlertsResponseBodyPage getPage() {
        return this.page;
    }

    public static class ListActivatedAlertsResponseBodyPageAlertsDispatchRules extends TeaModel {
        @NameInMap("RuleId")
        public Integer ruleId;

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
        @NameInMap("Status")
        public String status;

        @NameInMap("Severity")
        public String severity;

        @NameInMap("IntegrationName")
        public String integrationName;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Message")
        public String message;

        @NameInMap("AlertType")
        public String alertType;

        @NameInMap("InvolvedObjectName")
        public String involvedObjectName;

        @NameInMap("AlertName")
        public String alertName;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("ExpandFields")
        public java.util.Map<String, ?> expandFields;

        @NameInMap("EndsAt")
        public Long endsAt;

        @NameInMap("InvolvedObjectKind")
        public String involvedObjectKind;

        @NameInMap("IntegrationType")
        public String integrationType;

        @NameInMap("StartsAt")
        public Long startsAt;

        @NameInMap("AlertId")
        public String alertId;

        @NameInMap("DispatchRules")
        public java.util.List<ListActivatedAlertsResponseBodyPageAlertsDispatchRules> dispatchRules;

        public static ListActivatedAlertsResponseBodyPageAlerts build(java.util.Map<String, ?> map) throws Exception {
            ListActivatedAlertsResponseBodyPageAlerts self = new ListActivatedAlertsResponseBodyPageAlerts();
            return TeaModel.build(map, self);
        }

        public ListActivatedAlertsResponseBodyPageAlerts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setIntegrationName(String integrationName) {
            this.integrationName = integrationName;
            return this;
        }
        public String getIntegrationName() {
            return this.integrationName;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setAlertType(String alertType) {
            this.alertType = alertType;
            return this;
        }
        public String getAlertType() {
            return this.alertType;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setInvolvedObjectName(String involvedObjectName) {
            this.involvedObjectName = involvedObjectName;
            return this;
        }
        public String getInvolvedObjectName() {
            return this.involvedObjectName;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setExpandFields(java.util.Map<String, ?> expandFields) {
            this.expandFields = expandFields;
            return this;
        }
        public java.util.Map<String, ?> getExpandFields() {
            return this.expandFields;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setEndsAt(Long endsAt) {
            this.endsAt = endsAt;
            return this;
        }
        public Long getEndsAt() {
            return this.endsAt;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setInvolvedObjectKind(String involvedObjectKind) {
            this.involvedObjectKind = involvedObjectKind;
            return this;
        }
        public String getInvolvedObjectKind() {
            return this.involvedObjectKind;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setIntegrationType(String integrationType) {
            this.integrationType = integrationType;
            return this;
        }
        public String getIntegrationType() {
            return this.integrationType;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setStartsAt(Long startsAt) {
            this.startsAt = startsAt;
            return this;
        }
        public Long getStartsAt() {
            return this.startsAt;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setAlertId(String alertId) {
            this.alertId = alertId;
            return this;
        }
        public String getAlertId() {
            return this.alertId;
        }

        public ListActivatedAlertsResponseBodyPageAlerts setDispatchRules(java.util.List<ListActivatedAlertsResponseBodyPageAlertsDispatchRules> dispatchRules) {
            this.dispatchRules = dispatchRules;
            return this;
        }
        public java.util.List<ListActivatedAlertsResponseBodyPageAlertsDispatchRules> getDispatchRules() {
            return this.dispatchRules;
        }

    }

    public static class ListActivatedAlertsResponseBodyPage extends TeaModel {
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("Page")
        public Integer page;

        @NameInMap("Alerts")
        public java.util.List<ListActivatedAlertsResponseBodyPageAlerts> alerts;

        public static ListActivatedAlertsResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            ListActivatedAlertsResponseBodyPage self = new ListActivatedAlertsResponseBodyPage();
            return TeaModel.build(map, self);
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

        public ListActivatedAlertsResponseBodyPage setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListActivatedAlertsResponseBodyPage setAlerts(java.util.List<ListActivatedAlertsResponseBodyPageAlerts> alerts) {
            this.alerts = alerts;
            return this;
        }
        public java.util.List<ListActivatedAlertsResponseBodyPageAlerts> getAlerts() {
            return this.alerts;
        }

    }

}
