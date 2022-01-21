// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertHistoryListResponseBody extends TeaModel {
    @NameInMap("AlarmHistoryList")
    public DescribeAlertHistoryListResponseBodyAlarmHistoryList alarmHistoryList;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public String total;

    public static DescribeAlertHistoryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertHistoryListResponseBody self = new DescribeAlertHistoryListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertHistoryListResponseBody setAlarmHistoryList(DescribeAlertHistoryListResponseBodyAlarmHistoryList alarmHistoryList) {
        this.alarmHistoryList = alarmHistoryList;
        return this;
    }
    public DescribeAlertHistoryListResponseBodyAlarmHistoryList getAlarmHistoryList() {
        return this.alarmHistoryList;
    }

    public DescribeAlertHistoryListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAlertHistoryListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertHistoryListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertHistoryListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeAlertHistoryListResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactALIIMs extends TeaModel {
        @NameInMap("ContactALIIM")
        public java.util.List<String> contactALIIM;

        public static DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactALIIMs build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactALIIMs self = new DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactALIIMs();
            return TeaModel.build(map, self);
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactALIIMs setContactALIIM(java.util.List<String> contactALIIM) {
            this.contactALIIM = contactALIIM;
            return this;
        }
        public java.util.List<String> getContactALIIM() {
            return this.contactALIIM;
        }

    }

    public static class DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactGroups extends TeaModel {
        @NameInMap("ContactGroup")
        public java.util.List<String> contactGroup;

        public static DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactGroups self = new DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactGroups();
            return TeaModel.build(map, self);
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactGroups setContactGroup(java.util.List<String> contactGroup) {
            this.contactGroup = contactGroup;
            return this;
        }
        public java.util.List<String> getContactGroup() {
            return this.contactGroup;
        }

    }

    public static class DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactMails extends TeaModel {
        @NameInMap("ContactMail")
        public java.util.List<String> contactMail;

        public static DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactMails build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactMails self = new DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactMails();
            return TeaModel.build(map, self);
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactMails setContactMail(java.util.List<String> contactMail) {
            this.contactMail = contactMail;
            return this;
        }
        public java.util.List<String> getContactMail() {
            return this.contactMail;
        }

    }

    public static class DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactSmses extends TeaModel {
        @NameInMap("ContactSms")
        public java.util.List<String> contactSms;

        public static DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactSmses build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactSmses self = new DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactSmses();
            return TeaModel.build(map, self);
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactSmses setContactSms(java.util.List<String> contactSms) {
            this.contactSms = contactSms;
            return this;
        }
        public java.util.List<String> getContactSms() {
            return this.contactSms;
        }

    }

    public static class DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContacts extends TeaModel {
        @NameInMap("Contact")
        public java.util.List<String> contact;

        public static DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContacts build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContacts self = new DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContacts();
            return TeaModel.build(map, self);
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContacts setContact(java.util.List<String> contact) {
            this.contact = contact;
            return this;
        }
        public java.util.List<String> getContact() {
            return this.contact;
        }

    }

    public static class DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory extends TeaModel {
        @NameInMap("AlertTime")
        public Long alertTime;

        @NameInMap("ContactALIIMs")
        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactALIIMs contactALIIMs;

        @NameInMap("ContactGroups")
        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactGroups contactGroups;

        @NameInMap("ContactMails")
        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactMails contactMails;

        @NameInMap("ContactSmses")
        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactSmses contactSmses;

        @NameInMap("Contacts")
        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContacts contacts;

        @NameInMap("Dimensions")
        public String dimensions;

        @NameInMap("EvaluationCount")
        public Integer evaluationCount;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("LastTime")
        public Long lastTime;

        @NameInMap("Level")
        public String level;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("State")
        public String state;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Value")
        public String value;

        @NameInMap("Webhooks")
        public String webhooks;

        public static DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory self = new DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory();
            return TeaModel.build(map, self);
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory setAlertTime(Long alertTime) {
            this.alertTime = alertTime;
            return this;
        }
        public Long getAlertTime() {
            return this.alertTime;
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory setContactALIIMs(DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactALIIMs contactALIIMs) {
            this.contactALIIMs = contactALIIMs;
            return this;
        }
        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactALIIMs getContactALIIMs() {
            return this.contactALIIMs;
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory setContactGroups(DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactGroups contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactGroups getContactGroups() {
            return this.contactGroups;
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory setContactMails(DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactMails contactMails) {
            this.contactMails = contactMails;
            return this;
        }
        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactMails getContactMails() {
            return this.contactMails;
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory setContactSmses(DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactSmses contactSmses) {
            this.contactSmses = contactSmses;
            return this;
        }
        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContactSmses getContactSmses() {
            return this.contactSmses;
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory setContacts(DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContacts contacts) {
            this.contacts = contacts;
            return this;
        }
        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistoryContacts getContacts() {
            return this.contacts;
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory setDimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public String getDimensions() {
            return this.dimensions;
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory setEvaluationCount(Integer evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public Integer getEvaluationCount() {
            return this.evaluationCount;
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory setWebhooks(String webhooks) {
            this.webhooks = webhooks;
            return this;
        }
        public String getWebhooks() {
            return this.webhooks;
        }

    }

    public static class DescribeAlertHistoryListResponseBodyAlarmHistoryList extends TeaModel {
        @NameInMap("AlarmHistory")
        public java.util.List<DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory> alarmHistory;

        public static DescribeAlertHistoryListResponseBodyAlarmHistoryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertHistoryListResponseBodyAlarmHistoryList self = new DescribeAlertHistoryListResponseBodyAlarmHistoryList();
            return TeaModel.build(map, self);
        }

        public DescribeAlertHistoryListResponseBodyAlarmHistoryList setAlarmHistory(java.util.List<DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory> alarmHistory) {
            this.alarmHistory = alarmHistory;
            return this;
        }
        public java.util.List<DescribeAlertHistoryListResponseBodyAlarmHistoryListAlarmHistory> getAlarmHistory() {
            return this.alarmHistory;
        }

    }

}
