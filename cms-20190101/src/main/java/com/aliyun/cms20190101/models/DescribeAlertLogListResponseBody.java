// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertLogListResponseBody extends TeaModel {
    @NameInMap("AlertLogList")
    public java.util.List<DescribeAlertLogListResponseBodyAlertLogList> alertLogList;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAlertLogListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertLogListResponseBody self = new DescribeAlertLogListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertLogListResponseBody setAlertLogList(java.util.List<DescribeAlertLogListResponseBodyAlertLogList> alertLogList) {
        this.alertLogList = alertLogList;
        return this;
    }
    public java.util.List<DescribeAlertLogListResponseBodyAlertLogList> getAlertLogList() {
        return this.alertLogList;
    }

    public DescribeAlertLogListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAlertLogListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertLogListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAlertLogListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAlertLogListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertLogListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAlertLogListResponseBodyAlertLogListDimensions extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeAlertLogListResponseBodyAlertLogListDimensions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertLogListResponseBodyAlertLogListDimensions self = new DescribeAlertLogListResponseBodyAlertLogListDimensions();
            return TeaModel.build(map, self);
        }

        public DescribeAlertLogListResponseBodyAlertLogListDimensions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAlertLogListResponseBodyAlertLogListDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAlertLogListResponseBodyAlertLogListEscalation extends TeaModel {
        @NameInMap("Expression")
        public String expression;

        @NameInMap("Level")
        public String level;

        @NameInMap("Times")
        public Integer times;

        public static DescribeAlertLogListResponseBodyAlertLogListEscalation build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertLogListResponseBodyAlertLogListEscalation self = new DescribeAlertLogListResponseBodyAlertLogListEscalation();
            return TeaModel.build(map, self);
        }

        public DescribeAlertLogListResponseBodyAlertLogListEscalation setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public DescribeAlertLogListResponseBodyAlertLogListEscalation setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeAlertLogListResponseBodyAlertLogListEscalation setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class DescribeAlertLogListResponseBodyAlertLogListExtendedInfo extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static DescribeAlertLogListResponseBodyAlertLogListExtendedInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertLogListResponseBodyAlertLogListExtendedInfo self = new DescribeAlertLogListResponseBodyAlertLogListExtendedInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAlertLogListResponseBodyAlertLogListExtendedInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAlertLogListResponseBodyAlertLogListExtendedInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAlertLogListResponseBodyAlertLogListSendDetailChannelResultListResultList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Detail")
        public String detail;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("notifyTargetList")
        public java.util.List<String> notifyTargetList;

        public static DescribeAlertLogListResponseBodyAlertLogListSendDetailChannelResultListResultList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertLogListResponseBodyAlertLogListSendDetailChannelResultListResultList self = new DescribeAlertLogListResponseBodyAlertLogListSendDetailChannelResultListResultList();
            return TeaModel.build(map, self);
        }

        public DescribeAlertLogListResponseBodyAlertLogListSendDetailChannelResultListResultList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeAlertLogListResponseBodyAlertLogListSendDetailChannelResultListResultList setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeAlertLogListResponseBodyAlertLogListSendDetailChannelResultListResultList setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeAlertLogListResponseBodyAlertLogListSendDetailChannelResultListResultList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public DescribeAlertLogListResponseBodyAlertLogListSendDetailChannelResultListResultList setNotifyTargetList(java.util.List<String> notifyTargetList) {
            this.notifyTargetList = notifyTargetList;
            return this;
        }
        public java.util.List<String> getNotifyTargetList() {
            return this.notifyTargetList;
        }

    }

    public static class DescribeAlertLogListResponseBodyAlertLogListSendDetailChannelResultList extends TeaModel {
        @NameInMap("Channel")
        public String channel;

        @NameInMap("ResultList")
        public java.util.List<DescribeAlertLogListResponseBodyAlertLogListSendDetailChannelResultListResultList> resultList;

        public static DescribeAlertLogListResponseBodyAlertLogListSendDetailChannelResultList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertLogListResponseBodyAlertLogListSendDetailChannelResultList self = new DescribeAlertLogListResponseBodyAlertLogListSendDetailChannelResultList();
            return TeaModel.build(map, self);
        }

        public DescribeAlertLogListResponseBodyAlertLogListSendDetailChannelResultList setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public DescribeAlertLogListResponseBodyAlertLogListSendDetailChannelResultList setResultList(java.util.List<DescribeAlertLogListResponseBodyAlertLogListSendDetailChannelResultListResultList> resultList) {
            this.resultList = resultList;
            return this;
        }
        public java.util.List<DescribeAlertLogListResponseBodyAlertLogListSendDetailChannelResultListResultList> getResultList() {
            return this.resultList;
        }

    }

    public static class DescribeAlertLogListResponseBodyAlertLogListSendDetail extends TeaModel {
        @NameInMap("ChannelResultList")
        public java.util.List<DescribeAlertLogListResponseBodyAlertLogListSendDetailChannelResultList> channelResultList;

        @NameInMap("ResultCode")
        public String resultCode;

        public static DescribeAlertLogListResponseBodyAlertLogListSendDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertLogListResponseBodyAlertLogListSendDetail self = new DescribeAlertLogListResponseBodyAlertLogListSendDetail();
            return TeaModel.build(map, self);
        }

        public DescribeAlertLogListResponseBodyAlertLogListSendDetail setChannelResultList(java.util.List<DescribeAlertLogListResponseBodyAlertLogListSendDetailChannelResultList> channelResultList) {
            this.channelResultList = channelResultList;
            return this;
        }
        public java.util.List<DescribeAlertLogListResponseBodyAlertLogListSendDetailChannelResultList> getChannelResultList() {
            return this.channelResultList;
        }

        public DescribeAlertLogListResponseBodyAlertLogListSendDetail setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

    }

    public static class DescribeAlertLogListResponseBodyAlertLogListSendResultList extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeAlertLogListResponseBodyAlertLogListSendResultList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertLogListResponseBodyAlertLogListSendResultList self = new DescribeAlertLogListResponseBodyAlertLogListSendResultList();
            return TeaModel.build(map, self);
        }

        public DescribeAlertLogListResponseBodyAlertLogListSendResultList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAlertLogListResponseBodyAlertLogListSendResultList setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class DescribeAlertLogListResponseBodyAlertLogListWebhookList extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("message")
        public String message;

        @NameInMap("url")
        public String url;

        public static DescribeAlertLogListResponseBodyAlertLogListWebhookList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertLogListResponseBodyAlertLogListWebhookList self = new DescribeAlertLogListResponseBodyAlertLogListWebhookList();
            return TeaModel.build(map, self);
        }

        public DescribeAlertLogListResponseBodyAlertLogListWebhookList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeAlertLogListResponseBodyAlertLogListWebhookList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeAlertLogListResponseBodyAlertLogListWebhookList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeAlertLogListResponseBodyAlertLogList extends TeaModel {
        @NameInMap("AlertTime")
        public String alertTime;

        @NameInMap("BlackListDetail")
        public String blackListDetail;

        @NameInMap("BlackListName")
        public String blackListName;

        @NameInMap("BlackListUUID")
        public String blackListUUID;

        @NameInMap("ContactALIIWWList")
        public java.util.List<String> contactALIIWWList;

        @NameInMap("ContactDingList")
        public java.util.List<String> contactDingList;

        @NameInMap("ContactGroups")
        public java.util.List<String> contactGroups;

        @NameInMap("ContactMailList")
        public java.util.List<String> contactMailList;

        @NameInMap("ContactOnCallList")
        public java.util.List<String> contactOnCallList;

        @NameInMap("ContactSMSList")
        public java.util.List<String> contactSMSList;

        @NameInMap("Dimensions")
        public java.util.List<DescribeAlertLogListResponseBodyAlertLogListDimensions> dimensions;

        @NameInMap("DingdingWebhookList")
        public java.util.List<String> dingdingWebhookList;

        @NameInMap("Escalation")
        public DescribeAlertLogListResponseBodyAlertLogListEscalation escalation;

        @NameInMap("EventName")
        public String eventName;

        @NameInMap("ExtendedInfo")
        public java.util.List<DescribeAlertLogListResponseBodyAlertLogListExtendedInfo> extendedInfo;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Level")
        public String level;

        @NameInMap("LevelChange")
        public String levelChange;

        @NameInMap("Message")
        public String message;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Product")
        public String product;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("SendDetail")
        public DescribeAlertLogListResponseBodyAlertLogListSendDetail sendDetail;

        @NameInMap("SendResultList")
        public java.util.List<DescribeAlertLogListResponseBodyAlertLogListSendResultList> sendResultList;

        @NameInMap("SendStatus")
        public String sendStatus;

        @NameInMap("WebhookList")
        public java.util.List<DescribeAlertLogListResponseBodyAlertLogListWebhookList> webhookList;

        public static DescribeAlertLogListResponseBodyAlertLogList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertLogListResponseBodyAlertLogList self = new DescribeAlertLogListResponseBodyAlertLogList();
            return TeaModel.build(map, self);
        }

        public DescribeAlertLogListResponseBodyAlertLogList setAlertTime(String alertTime) {
            this.alertTime = alertTime;
            return this;
        }
        public String getAlertTime() {
            return this.alertTime;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setBlackListDetail(String blackListDetail) {
            this.blackListDetail = blackListDetail;
            return this;
        }
        public String getBlackListDetail() {
            return this.blackListDetail;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setBlackListName(String blackListName) {
            this.blackListName = blackListName;
            return this;
        }
        public String getBlackListName() {
            return this.blackListName;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setBlackListUUID(String blackListUUID) {
            this.blackListUUID = blackListUUID;
            return this;
        }
        public String getBlackListUUID() {
            return this.blackListUUID;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setContactALIIWWList(java.util.List<String> contactALIIWWList) {
            this.contactALIIWWList = contactALIIWWList;
            return this;
        }
        public java.util.List<String> getContactALIIWWList() {
            return this.contactALIIWWList;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setContactDingList(java.util.List<String> contactDingList) {
            this.contactDingList = contactDingList;
            return this;
        }
        public java.util.List<String> getContactDingList() {
            return this.contactDingList;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setContactGroups(java.util.List<String> contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public java.util.List<String> getContactGroups() {
            return this.contactGroups;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setContactMailList(java.util.List<String> contactMailList) {
            this.contactMailList = contactMailList;
            return this;
        }
        public java.util.List<String> getContactMailList() {
            return this.contactMailList;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setContactOnCallList(java.util.List<String> contactOnCallList) {
            this.contactOnCallList = contactOnCallList;
            return this;
        }
        public java.util.List<String> getContactOnCallList() {
            return this.contactOnCallList;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setContactSMSList(java.util.List<String> contactSMSList) {
            this.contactSMSList = contactSMSList;
            return this;
        }
        public java.util.List<String> getContactSMSList() {
            return this.contactSMSList;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setDimensions(java.util.List<DescribeAlertLogListResponseBodyAlertLogListDimensions> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<DescribeAlertLogListResponseBodyAlertLogListDimensions> getDimensions() {
            return this.dimensions;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setDingdingWebhookList(java.util.List<String> dingdingWebhookList) {
            this.dingdingWebhookList = dingdingWebhookList;
            return this;
        }
        public java.util.List<String> getDingdingWebhookList() {
            return this.dingdingWebhookList;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setEscalation(DescribeAlertLogListResponseBodyAlertLogListEscalation escalation) {
            this.escalation = escalation;
            return this;
        }
        public DescribeAlertLogListResponseBodyAlertLogListEscalation getEscalation() {
            return this.escalation;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setExtendedInfo(java.util.List<DescribeAlertLogListResponseBodyAlertLogListExtendedInfo> extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }
        public java.util.List<DescribeAlertLogListResponseBodyAlertLogListExtendedInfo> getExtendedInfo() {
            return this.extendedInfo;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setLevelChange(String levelChange) {
            this.levelChange = levelChange;
            return this;
        }
        public String getLevelChange() {
            return this.levelChange;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setSendDetail(DescribeAlertLogListResponseBodyAlertLogListSendDetail sendDetail) {
            this.sendDetail = sendDetail;
            return this;
        }
        public DescribeAlertLogListResponseBodyAlertLogListSendDetail getSendDetail() {
            return this.sendDetail;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setSendResultList(java.util.List<DescribeAlertLogListResponseBodyAlertLogListSendResultList> sendResultList) {
            this.sendResultList = sendResultList;
            return this;
        }
        public java.util.List<DescribeAlertLogListResponseBodyAlertLogListSendResultList> getSendResultList() {
            return this.sendResultList;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setSendStatus(String sendStatus) {
            this.sendStatus = sendStatus;
            return this;
        }
        public String getSendStatus() {
            return this.sendStatus;
        }

        public DescribeAlertLogListResponseBodyAlertLogList setWebhookList(java.util.List<DescribeAlertLogListResponseBodyAlertLogListWebhookList> webhookList) {
            this.webhookList = webhookList;
            return this;
        }
        public java.util.List<DescribeAlertLogListResponseBodyAlertLogListWebhookList> getWebhookList() {
            return this.webhookList;
        }

    }

}
