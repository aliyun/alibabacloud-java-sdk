// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListUserNotifyHistoriesRequest extends TeaModel {
    /**
     * <p>The notification batch ID. Used to filter the notification history for notifications delivered in the same batch.</p>
     * 
     * <strong>example:</strong>
     * <p>3fa85f64-5717-4562-b3fc-2c963f66afa7</p>
     */
    @NameInMap("batchId")
    public String batchId;

    /**
     * <p><strong>[Deprecated]</strong> This is an internal reserved parameter used only for business source filtering in internal platform scenarios. Do not pass this parameter in external calls.</p>
     * 
     * <strong>example:</strong>
     * <p>arms</p>
     */
    @NameInMap("bizSource")
    @Deprecated
    public String bizSource;

    /**
     * <p>The notification channel. Valid values:</p>
     * <ul>
     * <li>ALI_YUNGE_SMS: text message</li>
     * <li>ALI_YUNGE_CALL: voice call</li>
     * <li>ALI_YUNGE_MAIL: email</li>
     * <li>ALI_YUNGE_ALIUID: internal message</li>
     * <li>DING: DingTalk</li>
     * <li>DING_COOL_APP: DingTalk Cool App</li>
     * <li>FEISHU: Lark</li>
     * <li>WEIXIN: WeCom</li>
     * <li>SLACK: Slack</li>
     * <li>TEAMS: Teams</li>
     * <li>PAGERDUTY: PagerDuty</li>
     * <li>WEBHOOK: custom webhook</li>
     * <li>ALIYUN_SLS: Simple Log Service</li>
     * <li>ALIYUN_FC: Function Compute</li>
     * <li>ALIYUN_FC3: Function Compute 3.0</li>
     * <li>ALIYUN_MNS: Message Service</li>
     * <li>ALIYUN_OOS: CloudOps Orchestration Service</li>
     * <li>ALIYUN_ESS: elastic scaling</li>
     * <li>ALIYUN_EB: event bus</li>
     * <li>ALIYUN_OPENAPI: OpenAPI</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DING</p>
     */
    @NameInMap("channel")
    public String channel;

    /**
     * <p>The channel category. Valid values:</p>
     * <ul>
     * <li>WEBHOOK: webhook-based channels, such as DingTalk, Lark, WeCom, Slack, Teams, and custom webhooks</li>
     * <li>YUNGE: Yunge communication channels, such as text messages, voice calls, and emails</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WEBHOOK</p>
     */
    @NameInMap("channelCategory")
    public String channelCategory;

    /**
     * <p>The start time of the query. The value is a UNIX timestamp in seconds. Default value: 6 hours before the <code>to</code> parameter value.</p>
     * 
     * <strong>example:</strong>
     * <p>1729400000</p>
     */
    @NameInMap("from")
    public Integer from;

    /**
     * <p>The contact group. Used to filter the notification history by contact group name.</p>
     * 
     * <strong>example:</strong>
     * <p>O&amp;M contact group</p>
     */
    @NameInMap("group")
    public String group;

    /**
     * <p>The incident ID. Used to filter the notification history associated with a specified incident.</p>
     * 
     * <strong>example:</strong>
     * <p>5d41402abc4b2a76b9719d911017c592</p>
     */
    @NameInMap("incidentId")
    public String incidentId;

    /**
     * <p>Specifies whether to include notification records that have no actual delivery channel. Valid values:</p>
     * <ul>
     * <li>true: The records are included.</li>
     * <li>false: The records are not included. Only records that were actually delivered through a channel are returned.
     * Default value: true.</li>
     * </ul>
     */
    @NameInMap("includeNoChannel")
    public Boolean includeNoChannel;

    /**
     * <p>Specifies whether to sort the results in descending order of time. Valid values:</p>
     * <ul>
     * <li>true: The results are sorted in descending order, with the latest records appearing first.</li>
     * <li>false: The results are sorted in ascending order.
     * Default value: true.</li>
     * </ul>
     */
    @NameInMap("isDesc")
    public Boolean isDesc;

    /**
     * <p>The maximum number of entries to return per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Used to retrieve the next page of data. It is an opaque string generated and encrypted by the server. You do not need to specify this parameter for the first query. For subsequent queries, pass the token returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>2f8aKz3mNq9p****</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The notification policy ID. Used to filter the notification history for a specified notification policy. It is a 32-character string.</p>
     * 
     * <strong>example:</strong>
     * <p>2b3c4d5e6f7a8b9c0d1e2f3a4b5c6d7e</p>
     */
    @NameInMap("notifyStrategyId")
    public String notifyStrategyId;

    /**
     * <p>The notification policy name. Used to filter the notification history by notification policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>Default notification policy</p>
     */
    @NameInMap("notifyStrategyName")
    public String notifyStrategyName;

    /**
     * <p><strong>[Deprecated]</strong> This is an internal reserved parameter used only for dedicated notification history query paths in internal platform scenarios. Do not pass this parameter in external calls.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456</p>
     */
    @NameInMap("partitionKey")
    @Deprecated
    public String partitionKey;

    /**
     * <p>The recipient. Used to filter the notification history by recipient address, such as a phone number, email address, or webhook URL.</p>
     * 
     * <strong>example:</strong>
     * <p>13800138000</p>
     */
    @NameInMap("receiver")
    public String receiver;

    /**
     * <p>The alert rule ID. Used to filter the notification history triggered by a specified alert rule. Exact match is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>3fa85f64-5717-4562-b3fc-2c963f66afa6</p>
     */
    @NameInMap("ruleId")
    public String ruleId;

    /**
     * <p>The alert rule name. Used to filter the notification history by rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>CPU usage alert</p>
     */
    @NameInMap("ruleName")
    public String ruleName;

    /**
     * <p>The notification delivery type. Valid values:</p>
     * <ul>
     * <li>SUBSCRIBE: subscription notifications</li>
     * <li>DIRECT: direct event notifications</li>
     * <li>ITSM: ticket or action notifications</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SUBSCRIBE</p>
     */
    @NameInMap("sendType")
    public String sendType;

    /**
     * <p>The alert severity. Valid values:</p>
     * <ul>
     * <li>CRITICAL: critical</li>
     * <li>ERROR: error</li>
     * <li>WARNING: warning</li>
     * <li>INFO: information</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CRITICAL</p>
     */
    @NameInMap("severity")
    public String severity;

    /**
     * <p>The subscription ID. Used to filter the notification history for a specified subscription. It is a 32-character string.</p>
     * 
     * <strong>example:</strong>
     * <p>1a2b3c4d5e6f7a8b9c0d1e2f3a4b5c6d</p>
     */
    @NameInMap("subscriptionId")
    public String subscriptionId;

    /**
     * <p>The subscription name. Used to filter the notification history by subscription name.</p>
     * 
     * <strong>example:</strong>
     * <p>Default subscription</p>
     */
    @NameInMap("subscriptionName")
    public String subscriptionName;

    /**
     * <p>Specifies whether to filter by delivery result. Valid values:</p>
     * <ul>
     * <li>true: Only successfully delivered records are returned.</li>
     * <li>false: Only failed delivery records are returned.
     * If you do not specify this parameter, the results are not filtered by delivery result.</li>
     * </ul>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The end time of the query. The value is a UNIX timestamp in seconds. Default value: the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>1729421600</p>
     */
    @NameInMap("to")
    public Integer to;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-5884500827389836-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static ListUserNotifyHistoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserNotifyHistoriesRequest self = new ListUserNotifyHistoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListUserNotifyHistoriesRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    @Deprecated
    public ListUserNotifyHistoriesRequest setBizSource(String bizSource) {
        this.bizSource = bizSource;
        return this;
    }
    public String getBizSource() {
        return this.bizSource;
    }

    public ListUserNotifyHistoriesRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ListUserNotifyHistoriesRequest setChannelCategory(String channelCategory) {
        this.channelCategory = channelCategory;
        return this;
    }
    public String getChannelCategory() {
        return this.channelCategory;
    }

    public ListUserNotifyHistoriesRequest setFrom(Integer from) {
        this.from = from;
        return this;
    }
    public Integer getFrom() {
        return this.from;
    }

    public ListUserNotifyHistoriesRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public ListUserNotifyHistoriesRequest setIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public String getIncidentId() {
        return this.incidentId;
    }

    public ListUserNotifyHistoriesRequest setIncludeNoChannel(Boolean includeNoChannel) {
        this.includeNoChannel = includeNoChannel;
        return this;
    }
    public Boolean getIncludeNoChannel() {
        return this.includeNoChannel;
    }

    public ListUserNotifyHistoriesRequest setIsDesc(Boolean isDesc) {
        this.isDesc = isDesc;
        return this;
    }
    public Boolean getIsDesc() {
        return this.isDesc;
    }

    public ListUserNotifyHistoriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserNotifyHistoriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserNotifyHistoriesRequest setNotifyStrategyId(String notifyStrategyId) {
        this.notifyStrategyId = notifyStrategyId;
        return this;
    }
    public String getNotifyStrategyId() {
        return this.notifyStrategyId;
    }

    public ListUserNotifyHistoriesRequest setNotifyStrategyName(String notifyStrategyName) {
        this.notifyStrategyName = notifyStrategyName;
        return this;
    }
    public String getNotifyStrategyName() {
        return this.notifyStrategyName;
    }

    @Deprecated
    public ListUserNotifyHistoriesRequest setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }
    public String getPartitionKey() {
        return this.partitionKey;
    }

    public ListUserNotifyHistoriesRequest setReceiver(String receiver) {
        this.receiver = receiver;
        return this;
    }
    public String getReceiver() {
        return this.receiver;
    }

    public ListUserNotifyHistoriesRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ListUserNotifyHistoriesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListUserNotifyHistoriesRequest setSendType(String sendType) {
        this.sendType = sendType;
        return this;
    }
    public String getSendType() {
        return this.sendType;
    }

    public ListUserNotifyHistoriesRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public ListUserNotifyHistoriesRequest setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public ListUserNotifyHistoriesRequest setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    public ListUserNotifyHistoriesRequest setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListUserNotifyHistoriesRequest setTo(Integer to) {
        this.to = to;
        return this;
    }
    public Integer getTo() {
        return this.to;
    }

    public ListUserNotifyHistoriesRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
