// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertHistoryListResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Total")
    @Validation(required = true)
    public String total;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AlarmHistoryList")
    @Validation(required = true)
    public DescribeAlertHistoryListResponseAlarmHistoryList alarmHistoryList;

    public static DescribeAlertHistoryListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertHistoryListResponse self = new DescribeAlertHistoryListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContactGroups extends TeaModel {
        @NameInMap("ContactGroup")
        @Validation(required = true)
        public java.util.List<String> contactGroup;

        public static DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContactGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContactGroups self = new DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContactGroups();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContacts extends TeaModel {
        @NameInMap("Contact")
        @Validation(required = true)
        public java.util.List<String> contact;

        public static DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContacts build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContacts self = new DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContacts();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContactALIIMs extends TeaModel {
        @NameInMap("ContactALIIM")
        @Validation(required = true)
        public java.util.List<String> contactALIIM;

        public static DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContactALIIMs build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContactALIIMs self = new DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContactALIIMs();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContactSmses extends TeaModel {
        @NameInMap("ContactSms")
        @Validation(required = true)
        public java.util.List<String> contactSms;

        public static DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContactSmses build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContactSmses self = new DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContactSmses();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContactMails extends TeaModel {
        @NameInMap("ContactMail")
        @Validation(required = true)
        public java.util.List<String> contactMail;

        public static DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContactMails build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContactMails self = new DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContactMails();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistory extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public String ruleId;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("Namespace")
        @Validation(required = true)
        public String namespace;

        @NameInMap("MetricName")
        @Validation(required = true)
        public String metricName;

        @NameInMap("Dimensions")
        @Validation(required = true)
        public String dimensions;

        @NameInMap("Expression")
        @Validation(required = true)
        public String expression;

        @NameInMap("EvaluationCount")
        @Validation(required = true)
        public Integer evaluationCount;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("AlertTime")
        @Validation(required = true)
        public Long alertTime;

        @NameInMap("LastTime")
        @Validation(required = true)
        public Long lastTime;

        @NameInMap("Level")
        @Validation(required = true)
        public String level;

        @NameInMap("PreLevel")
        @Validation(required = true)
        public String preLevel;

        @NameInMap("RuleName")
        @Validation(required = true)
        public String ruleName;

        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("Webhooks")
        @Validation(required = true)
        public String webhooks;

        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

        @NameInMap("ContactGroups")
        @Validation(required = true)
        public DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContactGroups contactGroups;

        @NameInMap("Contacts")
        @Validation(required = true)
        public DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContacts contacts;

        @NameInMap("ContactALIIMs")
        @Validation(required = true)
        public DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContactALIIMs contactALIIMs;

        @NameInMap("ContactSmses")
        @Validation(required = true)
        public DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContactSmses contactSmses;

        @NameInMap("ContactMails")
        @Validation(required = true)
        public DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistoryContactMails contactMails;

        public static DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistory build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistory self = new DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistory();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAlertHistoryListResponseAlarmHistoryList extends TeaModel {
        @NameInMap("AlarmHistory")
        @Validation(required = true)
        public java.util.List<DescribeAlertHistoryListResponseAlarmHistoryListAlarmHistory> alarmHistory;

        public static DescribeAlertHistoryListResponseAlarmHistoryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertHistoryListResponseAlarmHistoryList self = new DescribeAlertHistoryListResponseAlarmHistoryList();
            return TeaModel.build(map, self);
        }

    }

}
