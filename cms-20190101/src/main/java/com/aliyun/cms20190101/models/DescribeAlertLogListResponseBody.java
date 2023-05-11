// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertLogListResponseBody extends TeaModel {
    /**
     * <p>The status code of the alert callback.</p>
     */
    @NameInMap("AlertLogList")
    public java.util.List<DescribeAlertLogListResponseBodyAlertLogList> alertLogList;

    /**
     * <p>The extended fields.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The end timestamp of the alert logs to be queried. Unit: milliseconds.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The DingTalk chatbots of alert contacts.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The name of the metric.</p>
     * <br>
     * <p>>  For more information about the metrics of different cloud services, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the alert rule.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The timestamp that was generated when the alert was triggered. Unit: milliseconds.</p>
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
         * <p>The list of sending results that are categorized by notification method.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The ID of the blacklist policy.</p>
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
        /**
         * <p>The name of the event.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The method that is used to send alert notifications. Valid values:</p>
         * <br>
         * <p>*   MAIL: email</p>
         * <p>*   SMS: text message</p>
         * <p>*   WEBHOOK: alert callback</p>
         * <p>*   SLS: Log Service</p>
         * <p>*   ONCALL: phone call</p>
         * <p>*   FC: Function Compute</p>
         * <p>*   MNS: Message Service queue</p>
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
         * <p>The severity level and notification methods of the alert. Valid values:</p>
         * <br>
         * <p>*   P4: Alert notifications are sent by using emails and DingTalk chatbots.</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>*   OK: No alert is generated.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The name of the application group.</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The ID of the alert rule.</p>
         * <br>
         * <p>For information about how to obtain the ID of an alert rule, see [DescribeMetricRuleList](~~114941~~).</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <p>The ID of the request.</p>
         */
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
         * <p>The queried resources.</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>The details about the sending results of alert notifications.</p>
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
         * <p>The namespace of the cloud service.</p>
         */
        @NameInMap("ChannelResultList")
        public java.util.List<DescribeAlertLogListResponseBodyAlertLogListSendDetailChannelResultList> channelResultList;

        /**
         * <p>The alert logs.</p>
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
         * <p>For more information about common request parameters, see [Common parameters](~~199331~~).</p>
         */
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
        /**
         * <p>The search keyword that is used to query alert logs.</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The request ID returned when CloudMonitor calls another cloud service.</p>
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
         * <p>The details of the blacklist policy.</p>
         */
        @NameInMap("AlertTime")
        public String alertTime;

        /**
         * <p>The dimension based on which data is aggregated. This parameter is equivalent to the GROUP BY clause in SQL. Valid values:</p>
         * <br>
         * <p>*   `product`: aggregates data by cloud service.</p>
         * <p>*   `level`: aggregates data by alert level.</p>
         * <p>*   `groupId`: aggregates data by application group.</p>
         * <p>*   `contactGroup`: aggregates data by alert contact group.</p>
         * <p>*   `product,metricName`: aggregates data both by cloud service and by metric.</p>
         */
        @NameInMap("BlackListDetail")
        public String blackListDetail;

        /**
         * <p>The number of entries to return on each page. Default value: 10.</p>
         */
        @NameInMap("BlackListName")
        public String blackListName;

        /**
         * <p>The category of the alert notification method. Valid values:</p>
         * <br>
         * <p>*   Mail: email</p>
         * <p>*   ALIIM: TradeManager</p>
         * <p>*   SMS: text message</p>
         * <p>*   CALL: phone call</p>
         * <p>*   DING: DingTalk chatbot</p>
         * <p>*   Merged: alert merging</p>
         */
        @NameInMap("BlackListUUID")
        public String blackListUUID;

        /**
         * <p>The name of the extended field.</p>
         */
        @NameInMap("ContactALIIWWList")
        public java.util.List<String> contactALIIWWList;

        /**
         * <p>The abbreviation of the Alibaba Cloud service name.</p>
         */
        @NameInMap("ContactDingList")
        public java.util.List<String> contactDingList;

        /**
         * <p>The alert notification method.</p>
         */
        @NameInMap("ContactGroups")
        public java.util.List<String> contactGroups;

        /**
         * <p>The callback URL.</p>
         */
        @NameInMap("ContactMailList")
        public java.util.List<String> contactMailList;

        /**
         * <p>The name of the resource.</p>
         */
        @NameInMap("ContactOnCallList")
        public java.util.List<String> contactOnCallList;

        /**
         * <p>The statistical period of alert logs. Unit: minutes.</p>
         */
        @NameInMap("ContactSMSList")
        public java.util.List<String> contactSMSList;

        /**
         * <p>The status of the alert. Valid values:</p>
         * <br>
         * <p>*   0: The alert is triggered or cleared.</p>
         * <p>*   1: The alert is ineffective.</p>
         * <p>*   2: The alert is muted and not triggered in a specified period.</p>
         * <p>*   3: The host is restarting.</p>
         * <p>*   4: No alert notification is sent.</p>
         * <br>
         * <p>If the value of the SendStatus parameter is 0, the value P4 of the Level parameter indicates a triggered alert and the value OK indicates a cleared alert.</p>
         */
        @NameInMap("Dimensions")
        public java.util.List<DescribeAlertLogListResponseBodyAlertLogListDimensions> dimensions;

        /**
         * <p>The ID of the application group.</p>
         */
        @NameInMap("DingdingWebhookList")
        public java.util.List<String> dingdingWebhookList;

        @NameInMap("Escalation")
        public DescribeAlertLogListResponseBodyAlertLogListEscalation escalation;

        /**
         * <p>The number of the page to return. Default value: 1.</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The sending results of alert notifications.</p>
         */
        @NameInMap("ExtendedInfo")
        public java.util.List<DescribeAlertLogListResponseBodyAlertLogListExtendedInfo> extendedInfo;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The ID of the alert rule.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The alert contact group.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The list of callback URLs.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The HTTP status code.</p>
         * <br>
         * <p>*   If the value of the `Channel` parameter is `WEBHOOK`, the status code is 200 or 500.</p>
         * <p>*   If the value of the `Channel` parameter is `MAIL`, `SMS`, `SLS`, `ONCALL`, `FC`, or `MNS`, this parameter is empty or not returned.</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The key of the dimension.</p>
         */
        @NameInMap("LevelChange")
        public String levelChange;

        @NameInMap("LogId")
        public String logId;

        /**
         * <p>The name of the alert rule.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the metric.</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The dimensions of the resource that triggered alerts.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>Indicates whether the alert notifications are sent.</p>
         * <br>
         * <p>*   If the alert notifications are sent, the value "success" is returned.</p>
         * <p>*   If the configuration is invalid, no alert notification is sent and an error code is returned.</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The phone numbers of alert contacts that can receive alert phone calls.</p>
         * <br>
         * <p>>  This parameter can be returned only on the China site (aliyun.com).</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The ID of the resource.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The namespace of the cloud service.</p>
         * <br>
         * <p>>  For more information about the namespaces of different cloud services, see [Appendix 1: Metrics](~~163515~~).</p>
         */
        @NameInMap("SendDetail")
        public DescribeAlertLogListResponseBodyAlertLogListSendDetail sendDetail;

        /**
         * <p>The details of the returned results.</p>
         */
        @NameInMap("SendResultList")
        public java.util.List<DescribeAlertLogListResponseBodyAlertLogListSendResultList> sendResultList;

        /**
         * <p>The value of the dimension.</p>
         */
        @NameInMap("SendStatus")
        public String sendStatus;

        /**
         * <p>The value of the extended field.</p>
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
