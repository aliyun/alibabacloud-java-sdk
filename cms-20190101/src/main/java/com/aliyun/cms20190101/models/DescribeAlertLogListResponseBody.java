// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertLogListResponseBody extends TeaModel {
    /**
     * <p>The queried alert logs.</p>
     */
    @NameInMap("AlertLogList")
    public java.util.List<DescribeAlertLogListResponseBodyAlertLogList> alertLogList;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>> The status code 200 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
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
        /**
         * <p>The key of the dimension.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the dimension.</p>
         */
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
        /**
         * <p>The description of the alert rule.</p>
         * <br>
         * <p>>  The content of the alert rule. This parameter indicates the conditions that trigger an alert.</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The alert level and the methods that are used to send alert notifications. Valid values:</p>
         * <br>
         * <p>*   P4: Alert notifications are sent by using emails and DingTalk chatbots.</p>
         * <p>*   OK: No alert is generated.</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The consecutive number of times for which the metric value meets the alert condition before an alert is triggered.</p>
         */
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
        /**
         * <p>The name of the extended field.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the extended field.</p>
         */
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
        /**
         * <p>The HTTP status code.</p>
         * <br>
         * <p>*   If the value of the `Channel` parameter is `WEBHOOK`, the status code is 200 or 500.</p>
         * <p>*   If the value of the `Channel` parameter is `MAIL`, `SMS`, `SLS`, `ONCALL`, `FC`, or `MNS`, this parameter is empty or not returned.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The details of the returned results.</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The request ID returned when CloudMonitor calls another cloud service.</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
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
        /**
         * <p>The method that is used to send alert notifications. Valid values:</p>
         * <br>
         * <p>*   MAIL: email</p>
         * <p>*   SMS: text message</p>
         * <p>*   WEBHOOK: alert callback</p>
         * <p>*   SLS: Simple Log Service</p>
         * <p>*   ONCALL: phone call</p>
         * <p>*   FC: Function Compute</p>
         * <p>*   MNS: Message Service queue</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>The sending results of alert notifications.</p>
         */
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
        /**
         * <p>The list of sending results that are categorized by notification method.</p>
         */
        @NameInMap("ChannelResultList")
        public java.util.List<DescribeAlertLogListResponseBodyAlertLogListSendDetailChannelResultList> channelResultList;

        /**
         * <p>Indicates whether the alert notifications are sent.</p>
         * <br>
         * <p>*   If the alert notifications are sent, the value "success" is returned.</p>
         * <p>*   If the configuration is invalid, no alert notification is sent and an error code is returned.</p>
         */
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
        /**
         * <p>The category of the alert notification method. Valid values:</p>
         * <br>
         * <p>*   MAIL: email</p>
         * <p>*   ALIIM: TradeManager</p>
         * <p>*   SMS: text message</p>
         * <p>*   CALL: phone call</p>
         * <p>*   DING: DingTalk chatbot</p>
         * <p>*   Merged: alert merging</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The notification object corresponding to the alert notification method.</p>
         */
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
        /**
         * <p>The status code of the alert callback.</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The message returned for the alert callback.</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The callback URL.</p>
         */
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
        /**
         * <p>The timestamp that was generated when the alert was triggered.</p>
         * <br>
         * <p>Unit: milliseconds.</p>
         */
        @NameInMap("AlertTime")
        public String alertTime;

        /**
         * <p>The details of the blacklist policy.</p>
         */
        @NameInMap("BlackListDetail")
        public String blackListDetail;

        /**
         * <p>The name of the blacklist policy.</p>
         */
        @NameInMap("BlackListName")
        public String blackListName;

        /**
         * <p>The ID of the blacklist policy.</p>
         */
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

        /**
         * <p>The dimensions of the resource that triggered alerts.</p>
         */
        @NameInMap("Dimensions")
        public java.util.List<DescribeAlertLogListResponseBodyAlertLogListDimensions> dimensions;

        @NameInMap("DingdingWebhookList")
        public java.util.List<String> dingdingWebhookList;

        /**
         * <p>The alert rule based on which the alert is triggered.</p>
         */
        @NameInMap("Escalation")
        public DescribeAlertLogListResponseBodyAlertLogListEscalation escalation;

        /**
         * <p>The event name.</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The extended fields.</p>
         */
        @NameInMap("ExtendedInfo")
        public java.util.List<DescribeAlertLogListResponseBodyAlertLogListExtendedInfo> extendedInfo;

        /**
         * <p>The ID of the application group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the application group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The resource ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The resource name.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The alert level and the methods that are used to send alert notifications. Valid values:</p>
         * <br>
         * <p>*   P4: Alert notifications are sent by using emails and DingTalk chatbots.</p>
         * <p>*   OK: No alert is generated.</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>Indicates whether the alert level was changed. Valid values:</p>
         * <br>
         * <p>*   `P4->OK`: The alert level was changed from P4 to OK.</p>
         * <p>*   `P4->P4`: The alert level was still P4.</p>
         */
        @NameInMap("LevelChange")
        public String levelChange;

        /**
         * <p>The log ID.</p>
         */
        @NameInMap("LogId")
        public String logId;

        /**
         * <p>The alert information in a JSON string.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The metric name.</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The namespace of the cloud service.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The identifier of the cloud service. Valid values:</p>
         * <br>
         * <p>*   If the cloud service is provided by Alibaba Cloud, the abbreviation of the service name is returned. Example: ECS.</p>
         * <p>*   If the cloud service is not provided by Alibaba Cloud, a value in the `acs_Service keyword` format is returned. Example: acs_networkmonitor.</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The ID of the alert rule.</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The name of the alert rule.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The details about the sending results of alert notifications.</p>
         */
        @NameInMap("SendDetail")
        public DescribeAlertLogListResponseBodyAlertLogListSendDetail sendDetail;

        /**
         * <p>The sending results of alert notifications.</p>
         */
        @NameInMap("SendResultList")
        public java.util.List<DescribeAlertLogListResponseBodyAlertLogListSendResultList> sendResultList;

        /**
         * <p>The status of the alert. Valid values:</p>
         * <br>
         * <p>*   0: The alert is triggered or cleared.</p>
         * <p>*   1: The alert is ineffective.</p>
         * <p>*   2: The alert is muted.</p>
         * <p>*   3: The host is restarting.</p>
         * <p>*   4: No alert notification is sent.</p>
         * <br>
         * <p>If the value of the SendStatus parameter is 0, the value P4 of the Level parameter indicates a triggered alert and the value OK indicates a cleared alert.</p>
         */
        @NameInMap("SendStatus")
        public String sendStatus;

        /**
         * <p>The callback URLs.</p>
         */
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

        public DescribeAlertLogListResponseBodyAlertLogList setLogId(String logId) {
            this.logId = logId;
            return this;
        }
        public String getLogId() {
            return this.logId;
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
