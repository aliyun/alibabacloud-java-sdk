// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListUserNotifyHistoriesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3fa85f64-5717-4562-b3fc-2c963f66afa7</p>
     */
    @NameInMap("batchId")
    public String batchId;

    /**
     * <strong>example:</strong>
     * <p>arms</p>
     */
    @NameInMap("bizSource")
    @Deprecated
    public String bizSource;

    /**
     * <strong>example:</strong>
     * <p>DING</p>
     */
    @NameInMap("channel")
    public String channel;

    /**
     * <strong>example:</strong>
     * <p>WEBHOOK</p>
     */
    @NameInMap("channelCategory")
    public String channelCategory;

    /**
     * <strong>example:</strong>
     * <p>1729400000</p>
     */
    @NameInMap("from")
    public Integer from;

    /**
     * <strong>example:</strong>
     * <p>运维联系人组</p>
     */
    @NameInMap("group")
    public String group;

    /**
     * <strong>example:</strong>
     * <p>5d41402abc4b2a76b9719d911017c592</p>
     */
    @NameInMap("incidentId")
    public String incidentId;

    @NameInMap("includeNoChannel")
    public Boolean includeNoChannel;

    @NameInMap("isDesc")
    public Boolean isDesc;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>2f8aKz3mNq9p****</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>2b3c4d5e6f7a8b9c0d1e2f3a4b5c6d7e</p>
     */
    @NameInMap("notifyStrategyId")
    public String notifyStrategyId;

    /**
     * <strong>example:</strong>
     * <p>默认通知策略</p>
     */
    @NameInMap("notifyStrategyName")
    public String notifyStrategyName;

    /**
     * <strong>example:</strong>
     * <p>1234567890123456</p>
     */
    @NameInMap("partitionKey")
    @Deprecated
    public String partitionKey;

    /**
     * <strong>example:</strong>
     * <p>13800138000</p>
     */
    @NameInMap("receiver")
    public String receiver;

    /**
     * <strong>example:</strong>
     * <p>3fa85f64-5717-4562-b3fc-2c963f66afa6</p>
     */
    @NameInMap("ruleId")
    public String ruleId;

    /**
     * <strong>example:</strong>
     * <p>CPU使用率告警</p>
     */
    @NameInMap("ruleName")
    public String ruleName;

    /**
     * <strong>example:</strong>
     * <p>SUBSCRIBE</p>
     */
    @NameInMap("sendType")
    public String sendType;

    /**
     * <strong>example:</strong>
     * <p>CRITICAL</p>
     */
    @NameInMap("severity")
    public String severity;

    /**
     * <strong>example:</strong>
     * <p>1a2b3c4d5e6f7a8b9c0d1e2f3a4b5c6d</p>
     */
    @NameInMap("subscriptionId")
    public String subscriptionId;

    /**
     * <strong>example:</strong>
     * <p>默认订阅</p>
     */
    @NameInMap("subscriptionName")
    public String subscriptionName;

    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1729421600</p>
     */
    @NameInMap("to")
    public Integer to;

    /**
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
