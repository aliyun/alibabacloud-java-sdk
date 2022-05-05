// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListNotificationPoliciesResponseBody extends TeaModel {
    // 分页对象
    @NameInMap("PageBean")
    public ListNotificationPoliciesResponseBodyPageBean pageBean;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static ListNotificationPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNotificationPoliciesResponseBody self = new ListNotificationPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNotificationPoliciesResponseBody setPageBean(ListNotificationPoliciesResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public ListNotificationPoliciesResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public ListNotificationPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesGroupRule extends TeaModel {
        // 分组间隔时间，选填，默认是30s
        @NameInMap("GroupInterval")
        public Long groupInterval;

        // 分组等待时间，选填，默认是5秒
        @NameInMap("GroupWait")
        public Long groupWait;

        // 分组字段,为空则不分组，默认按照alertname分组
        @NameInMap("GroupingFields")
        public java.util.List<String> groupingFields;

        public static ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesGroupRule build(java.util.Map<String, ?> map) throws Exception {
            ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesGroupRule self = new ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesGroupRule();
            return TeaModel.build(map, self);
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesGroupRule setGroupInterval(Long groupInterval) {
            this.groupInterval = groupInterval;
            return this;
        }
        public Long getGroupInterval() {
            return this.groupInterval;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesGroupRule setGroupWait(Long groupWait) {
            this.groupWait = groupWait;
            return this;
        }
        public Long getGroupWait() {
            return this.groupWait;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesGroupRule setGroupingFields(java.util.List<String> groupingFields) {
            this.groupingFields = groupingFields;
            return this;
        }
        public java.util.List<String> getGroupingFields() {
            return this.groupingFields;
        }

    }

    public static class ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRulesMatchingConditions extends TeaModel {
        // 条件字段
        @NameInMap("Key")
        public String key;

        // 对应关系
        @NameInMap("Operator")
        public String operator;

        // 条件字段值
        @NameInMap("Value")
        public String value;

        public static ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRulesMatchingConditions build(java.util.Map<String, ?> map) throws Exception {
            ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRulesMatchingConditions self = new ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRulesMatchingConditions();
            return TeaModel.build(map, self);
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRulesMatchingConditions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRulesMatchingConditions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRulesMatchingConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRules extends TeaModel {
        // 匹配条件
        @NameInMap("MatchingConditions")
        public java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRulesMatchingConditions> matchingConditions;

        public static ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRules build(java.util.Map<String, ?> map) throws Exception {
            ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRules self = new ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRules();
            return TeaModel.build(map, self);
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRules setMatchingConditions(java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRulesMatchingConditions> matchingConditions) {
            this.matchingConditions = matchingConditions;
            return this;
        }
        public java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRulesMatchingConditions> getMatchingConditions() {
            return this.matchingConditions;
        }

    }

    public static class ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRuleNotifyObjects extends TeaModel {
        // 通知对象ID
        @NameInMap("NotifyObjectId")
        public Long notifyObjectId;

        // 通知对象名称
        @NameInMap("NotifyObjectName")
        public String notifyObjectName;

        // 通知对象类型，CONTACT, CONTACT_GROUP, ARMS_CONTACT, DING_ROBOT
        @NameInMap("NotifyObjectType")
        public String notifyObjectType;

        public static ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRuleNotifyObjects build(java.util.Map<String, ?> map) throws Exception {
            ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRuleNotifyObjects self = new ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRuleNotifyObjects();
            return TeaModel.build(map, self);
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRuleNotifyObjects setNotifyObjectId(Long notifyObjectId) {
            this.notifyObjectId = notifyObjectId;
            return this;
        }
        public Long getNotifyObjectId() {
            return this.notifyObjectId;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRuleNotifyObjects setNotifyObjectName(String notifyObjectName) {
            this.notifyObjectName = notifyObjectName;
            return this;
        }
        public String getNotifyObjectName() {
            return this.notifyObjectName;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRuleNotifyObjects setNotifyObjectType(String notifyObjectType) {
            this.notifyObjectType = notifyObjectType;
            return this;
        }
        public String getNotifyObjectType() {
            return this.notifyObjectType;
        }

    }

    public static class ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRule extends TeaModel {
        // 通知渠道
        @NameInMap("NotifyChannels")
        public java.util.List<String> notifyChannels;

        // 通知时间段结束时间
        @NameInMap("NotifyEndTime")
        public String notifyEndTime;

        // 通知对象
        @NameInMap("NotifyObjects")
        public java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRuleNotifyObjects> notifyObjects;

        // 通知时间段开始时间
        @NameInMap("NotifyStartTime")
        public String notifyStartTime;

        public static ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRule build(java.util.Map<String, ?> map) throws Exception {
            ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRule self = new ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRule();
            return TeaModel.build(map, self);
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRule setNotifyChannels(java.util.List<String> notifyChannels) {
            this.notifyChannels = notifyChannels;
            return this;
        }
        public java.util.List<String> getNotifyChannels() {
            return this.notifyChannels;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRule setNotifyEndTime(String notifyEndTime) {
            this.notifyEndTime = notifyEndTime;
            return this;
        }
        public String getNotifyEndTime() {
            return this.notifyEndTime;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRule setNotifyObjects(java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRuleNotifyObjects> notifyObjects) {
            this.notifyObjects = notifyObjects;
            return this;
        }
        public java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRuleNotifyObjects> getNotifyObjects() {
            return this.notifyObjects;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRule setNotifyStartTime(String notifyStartTime) {
            this.notifyStartTime = notifyStartTime;
            return this;
        }
        public String getNotifyStartTime() {
            return this.notifyStartTime;
        }

    }

    public static class ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate extends TeaModel {
        // 邮件内容
        @NameInMap("EmailContent")
        public String emailContent;

        // 恢复告警邮件内容
        @NameInMap("EmailRecoverContent")
        public String emailRecoverContent;

        // 恢复告警邮件标题
        @NameInMap("EmailRecoverTitle")
        public String emailRecoverTitle;

        // 邮件标题
        @NameInMap("EmailTitle")
        public String emailTitle;

        // 机器人告警内容
        @NameInMap("RobotContent")
        public String robotContent;

        // 短信内容
        @NameInMap("SmsContent")
        public String smsContent;

        // 恢复告警短信内容
        @NameInMap("SmsRecoverContent")
        public String smsRecoverContent;

        // 智能语音告警内容
        @NameInMap("TtsContent")
        public String ttsContent;

        // 智能语音恢复告警内容
        @NameInMap("TtsRecoverContent")
        public String ttsRecoverContent;

        public static ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate build(java.util.Map<String, ?> map) throws Exception {
            ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate self = new ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate();
            return TeaModel.build(map, self);
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate setEmailContent(String emailContent) {
            this.emailContent = emailContent;
            return this;
        }
        public String getEmailContent() {
            return this.emailContent;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate setEmailRecoverContent(String emailRecoverContent) {
            this.emailRecoverContent = emailRecoverContent;
            return this;
        }
        public String getEmailRecoverContent() {
            return this.emailRecoverContent;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate setEmailRecoverTitle(String emailRecoverTitle) {
            this.emailRecoverTitle = emailRecoverTitle;
            return this;
        }
        public String getEmailRecoverTitle() {
            return this.emailRecoverTitle;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate setEmailTitle(String emailTitle) {
            this.emailTitle = emailTitle;
            return this;
        }
        public String getEmailTitle() {
            return this.emailTitle;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate setRobotContent(String robotContent) {
            this.robotContent = robotContent;
            return this;
        }
        public String getRobotContent() {
            return this.robotContent;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate setSmsContent(String smsContent) {
            this.smsContent = smsContent;
            return this;
        }
        public String getSmsContent() {
            return this.smsContent;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate setSmsRecoverContent(String smsRecoverContent) {
            this.smsRecoverContent = smsRecoverContent;
            return this;
        }
        public String getSmsRecoverContent() {
            return this.smsRecoverContent;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate setTtsContent(String ttsContent) {
            this.ttsContent = ttsContent;
            return this;
        }
        public String getTtsContent() {
            return this.ttsContent;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate setTtsRecoverContent(String ttsRecoverContent) {
            this.ttsRecoverContent = ttsRecoverContent;
            return this;
        }
        public String getTtsRecoverContent() {
            return this.ttsRecoverContent;
        }

    }

    public static class ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies extends TeaModel {
        // 升级规则ID
        @NameInMap("EscalationPolicyId")
        public Long escalationPolicyId;

        // 分组规则
        @NameInMap("GroupRule")
        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesGroupRule groupRule;

        // 通知策略ID
        @NameInMap("Id")
        public Long id;

        // 集成ID
        @NameInMap("IntegrationId")
        public Long integrationId;

        // 事件匹配规则列表
        @NameInMap("MatchingRules")
        public java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRules> matchingRules;

        // 通知策略名称
        @NameInMap("Name")
        public String name;

        // 通知规则
        @NameInMap("NotifyRule")
        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRule notifyRule;

        // 通知模板
        @NameInMap("NotifyTemplate")
        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate notifyTemplate;

        // 是否重复通知
        @NameInMap("Repeat")
        public Boolean repeat;

        // 重复通知时间间隔
        @NameInMap("RepeatInterval")
        public Long repeatInterval;

        // 是否发送恢复通知
        @NameInMap("SendRecoverMessage")
        public Boolean sendRecoverMessage;

        public static ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies self = new ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies();
            return TeaModel.build(map, self);
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setEscalationPolicyId(Long escalationPolicyId) {
            this.escalationPolicyId = escalationPolicyId;
            return this;
        }
        public Long getEscalationPolicyId() {
            return this.escalationPolicyId;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setGroupRule(ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesGroupRule groupRule) {
            this.groupRule = groupRule;
            return this;
        }
        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesGroupRule getGroupRule() {
            return this.groupRule;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setIntegrationId(Long integrationId) {
            this.integrationId = integrationId;
            return this;
        }
        public Long getIntegrationId() {
            return this.integrationId;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setMatchingRules(java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRules> matchingRules) {
            this.matchingRules = matchingRules;
            return this;
        }
        public java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesMatchingRules> getMatchingRules() {
            return this.matchingRules;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setNotifyRule(ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRule notifyRule) {
            this.notifyRule = notifyRule;
            return this;
        }
        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyRule getNotifyRule() {
            return this.notifyRule;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setNotifyTemplate(ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate notifyTemplate) {
            this.notifyTemplate = notifyTemplate;
            return this;
        }
        public ListNotificationPoliciesResponseBodyPageBeanNotificationPoliciesNotifyTemplate getNotifyTemplate() {
            return this.notifyTemplate;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setRepeat(Boolean repeat) {
            this.repeat = repeat;
            return this;
        }
        public Boolean getRepeat() {
            return this.repeat;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setRepeatInterval(Long repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public Long getRepeatInterval() {
            return this.repeatInterval;
        }

        public ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies setSendRecoverMessage(Boolean sendRecoverMessage) {
            this.sendRecoverMessage = sendRecoverMessage;
            return this;
        }
        public Boolean getSendRecoverMessage() {
            return this.sendRecoverMessage;
        }

    }

    public static class ListNotificationPoliciesResponseBodyPageBean extends TeaModel {
        // 通知策略对象
        @NameInMap("NotificationPolicies")
        public java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies> notificationPolicies;

        // 页数
        @NameInMap("Page")
        public Long page;

        // 每页展示数目
        @NameInMap("Size")
        public Long size;

        // 总数
        @NameInMap("Total")
        public Long total;

        public static ListNotificationPoliciesResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            ListNotificationPoliciesResponseBodyPageBean self = new ListNotificationPoliciesResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public ListNotificationPoliciesResponseBodyPageBean setNotificationPolicies(java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies> notificationPolicies) {
            this.notificationPolicies = notificationPolicies;
            return this;
        }
        public java.util.List<ListNotificationPoliciesResponseBodyPageBeanNotificationPolicies> getNotificationPolicies() {
            return this.notificationPolicies;
        }

        public ListNotificationPoliciesResponseBodyPageBean setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public ListNotificationPoliciesResponseBodyPageBean setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListNotificationPoliciesResponseBodyPageBean setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
