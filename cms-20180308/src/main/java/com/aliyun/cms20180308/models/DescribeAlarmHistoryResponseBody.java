// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DescribeAlarmHistoryResponseBody extends TeaModel {
    @NameInMap("AlarmHistoryList")
    public DescribeAlarmHistoryResponseBodyAlarmHistoryList alarmHistoryList;

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

    public static DescribeAlarmHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmHistoryResponseBody self = new DescribeAlarmHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmHistoryResponseBody setAlarmHistoryList(DescribeAlarmHistoryResponseBodyAlarmHistoryList alarmHistoryList) {
        this.alarmHistoryList = alarmHistoryList;
        return this;
    }
    public DescribeAlarmHistoryResponseBodyAlarmHistoryList getAlarmHistoryList() {
        return this.alarmHistoryList;
    }

    public DescribeAlarmHistoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAlarmHistoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlarmHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlarmHistoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeAlarmHistoryResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactALIIMs extends TeaModel {
        @NameInMap("ContactALIIM")
        public java.util.List<String> contactALIIM;

        public static DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactALIIMs build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactALIIMs self = new DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactALIIMs();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactALIIMs setContactALIIM(java.util.List<String> contactALIIM) {
            this.contactALIIM = contactALIIM;
            return this;
        }
        public java.util.List<String> getContactALIIM() {
            return this.contactALIIM;
        }

    }

    public static class DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactGroups extends TeaModel {
        @NameInMap("ContactGroup")
        public java.util.List<String> contactGroup;

        public static DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactGroups self = new DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactGroups();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactGroups setContactGroup(java.util.List<String> contactGroup) {
            this.contactGroup = contactGroup;
            return this;
        }
        public java.util.List<String> getContactGroup() {
            return this.contactGroup;
        }

    }

    public static class DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactMails extends TeaModel {
        @NameInMap("ContactMail")
        public java.util.List<String> contactMail;

        public static DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactMails build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactMails self = new DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactMails();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactMails setContactMail(java.util.List<String> contactMail) {
            this.contactMail = contactMail;
            return this;
        }
        public java.util.List<String> getContactMail() {
            return this.contactMail;
        }

    }

    public static class DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactSmses extends TeaModel {
        @NameInMap("ContactSms")
        public java.util.List<String> contactSms;

        public static DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactSmses build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactSmses self = new DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactSmses();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactSmses setContactSms(java.util.List<String> contactSms) {
            this.contactSms = contactSms;
            return this;
        }
        public java.util.List<String> getContactSms() {
            return this.contactSms;
        }

    }

    public static class DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContacts extends TeaModel {
        @NameInMap("Contact")
        public java.util.List<String> contact;

        public static DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContacts build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContacts self = new DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContacts();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContacts setContact(java.util.List<String> contact) {
            this.contact = contact;
            return this;
        }
        public java.util.List<String> getContact() {
            return this.contact;
        }

    }

    public static class DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory extends TeaModel {
        @NameInMap("AlertName")
        public String alertName;

        @NameInMap("AlertTime")
        public Long alertTime;

        @NameInMap("ContactALIIMs")
        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactALIIMs contactALIIMs;

        @NameInMap("ContactGroups")
        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactGroups contactGroups;

        @NameInMap("ContactMails")
        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactMails contactMails;

        @NameInMap("ContactSmses")
        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactSmses contactSmses;

        @NameInMap("Contacts")
        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContacts contacts;

        @NameInMap("Dimensions")
        public String dimensions;

        @NameInMap("EvaluationCount")
        public Integer evaluationCount;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Id")
        public String id;

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

        @NameInMap("PreLevel")
        public String preLevel;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("State")
        public String state;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Value")
        public String value;

        @NameInMap("Webhooks")
        public String webhooks;

        public static DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory self = new DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setAlertTime(Long alertTime) {
            this.alertTime = alertTime;
            return this;
        }
        public Long getAlertTime() {
            return this.alertTime;
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setContactALIIMs(DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactALIIMs contactALIIMs) {
            this.contactALIIMs = contactALIIMs;
            return this;
        }
        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactALIIMs getContactALIIMs() {
            return this.contactALIIMs;
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setContactGroups(DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactGroups contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactGroups getContactGroups() {
            return this.contactGroups;
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setContactMails(DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactMails contactMails) {
            this.contactMails = contactMails;
            return this;
        }
        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactMails getContactMails() {
            return this.contactMails;
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setContactSmses(DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactSmses contactSmses) {
            this.contactSmses = contactSmses;
            return this;
        }
        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContactSmses getContactSmses() {
            return this.contactSmses;
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setContacts(DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContacts contacts) {
            this.contacts = contacts;
            return this;
        }
        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistoryContacts getContacts() {
            return this.contacts;
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setDimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public String getDimensions() {
            return this.dimensions;
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setEvaluationCount(Integer evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public Integer getEvaluationCount() {
            return this.evaluationCount;
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setPreLevel(String preLevel) {
            this.preLevel = preLevel;
            return this;
        }
        public String getPreLevel() {
            return this.preLevel;
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory setWebhooks(String webhooks) {
            this.webhooks = webhooks;
            return this;
        }
        public String getWebhooks() {
            return this.webhooks;
        }

    }

    public static class DescribeAlarmHistoryResponseBodyAlarmHistoryList extends TeaModel {
        @NameInMap("AlarmHistory")
        public java.util.List<DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory> alarmHistory;

        public static DescribeAlarmHistoryResponseBodyAlarmHistoryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmHistoryResponseBodyAlarmHistoryList self = new DescribeAlarmHistoryResponseBodyAlarmHistoryList();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmHistoryResponseBodyAlarmHistoryList setAlarmHistory(java.util.List<DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory> alarmHistory) {
            this.alarmHistory = alarmHistory;
            return this;
        }
        public java.util.List<DescribeAlarmHistoryResponseBodyAlarmHistoryListAlarmHistory> getAlarmHistory() {
            return this.alarmHistory;
        }

    }

}
