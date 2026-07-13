// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SubscribeShrinkRequest extends TeaModel {
    @NameInMap("DlqPolicy")
    public String dlqPolicyShrink;

    /**
     * <p>邮箱推送相关属性，当 PushType=dm 时必填。JSON 格式，包含以下字段：</p>
     * <ul>
     * <li><strong>AccountName</strong>：发信地址，即 DirectMail 中配置的发信地址（如 <code>notify@example.com</code>）。</li>
     * <li><strong>Subject</strong>：邮件主题。</li>
     * </ul>
     */
    @NameInMap("DmAttributes")
    public String dmAttributesShrink;

    /**
     * <p>短信推送相关属性，当 PushType=alisms 时必填。JSON 格式，包含以下字段：</p>
     * <ul>
     * <li><strong>TemplateCode</strong>：短信模板 Code，在短信服务控制台中获取。</li>
     * <li><strong>SignName</strong>：短信签名名称。</li>
     * </ul>
     */
    @NameInMap("DysmsAttributes")
    public String dysmsAttributesShrink;

    /**
     * <p>接收消息的终端地址，格式根据 PushType 不同而不同：</p>
     * <ul>
     * <li><strong>PushType=http</strong>：HTTP/HTTPS 回调 URL，如 <code>http://example.com/callback</code> 或 <code>https://example.com/callback</code>。</li>
     * <li><strong>PushType=queue</strong>：目标队列 ARN，格式为 <code>acs:mns:{RegionId}:{主账号UID}:queues/{QueueName}</code>。</li>
     * <li><strong>PushType=dm</strong>：邮箱推送终端，格式固定为 <code>smq-ep:dm:{主账号UID}:__dynamic</code>，其中 <code>{主账号UID}</code> 替换为您的阿里云主账号 UID。</li>
     * <li><strong>PushType=dysms</strong>：短信推送终端，格式为 <code>smq-ep:dysms:{主账号UID}:{手机号码}</code>。</li>
     * <li><strong>PushType=kafka</strong>：Kafka 推送终端，格式为 <code>smq-ep:kafka:{主账号UID}:{InstanceId}</code>。</li>
     * <li><strong>PushType=fc</strong>：函数计算终端，格式为 <code>acs:fc:{RegionId}:{主账号UID}:services/{ServiceName}/functions/{FunctionName}</code>。</li>
     * <li><strong>PushType=eventbus</strong>：事件总线终端，格式为 <code>acs:eventbridge:{RegionId}:{主账号UID}:eventbus/{EventBusName}</code>。</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:mns:cn-hangzhou:1234567890:queues/MyQueue</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>Kafka 推送相关属性。JSON 格式，包含以下字段：</p>
     * <ul>
     * <li><strong>BusinessMode</strong>：业务模式。</li>
     * </ul>
     */
    @NameInMap("KafkaAttributes")
    public String kafkaAttributesShrink;

    /**
     * <p>消息过滤标签（不超过 16 个字符），仅当消息带有相同标签时才会被推送到该订阅。不设置则表示不过滤，所有消息均推送。</p>
     * 
     * <strong>example:</strong>
     * <p>important</p>
     */
    @NameInMap("MessageTag")
    public String messageTag;

    /**
     * <p>推送的消息内容格式。取值：</p>
     * <ul>
     * <li><strong>XML</strong>：消息体以 XML 格式推送（默认）。</li>
     * <li><strong>JSON</strong>：消息体以 JSON 格式推送。</li>
     * <li><strong>SIMPLIFIED</strong>：仅推送消息体原始内容，不包含 SMQ 的元信息包装。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SIMPLIFIED</p>
     */
    @NameInMap("NotifyContentFormat")
    public String notifyContentFormat;

    /**
     * <p>推送消息出现错误时的重试策略。取值：</p>
     * <ul>
     * <li><strong>BACKOFF_RETRY</strong>：退避重试策略，重试间隔逐渐递增（推荐）。</li>
     * <li><strong>EXPONENTIAL_DECAY_RETRY</strong>：指数衰减重试策略。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BACKOFF_RETRY</p>
     */
    @NameInMap("NotifyStrategy")
    public String notifyStrategy;

    /**
     * <p>订阅的推送类型。取值：</p>
     * <ul>
     * <li><strong>http</strong>：HTTP/HTTPS 推送，将消息推送到指定的 HTTP 或 HTTPS 回调地址。</li>
     * <li><strong>queue</strong>：队列推送，将消息推送到指定的 SMQ 队列。</li>
     * <li><strong>dm</strong>：邮箱推送，通过邮件服务（DirectMail）发送通知。需同时设置 DmAttributes 和 StsRoleArn 参数。</li>
     * <li><strong>dysms</strong>：短信推送，通过阿里云短信服务发送通知。需同时设置 DysmsAttributes 参数。</li>
     * <li><strong>kafka</strong>：Kafka 推送。需同时设置 KafkaAttributes 参数。</li>
     * <li><strong>fc</strong>：函数计算推送，将消息推送到阿里云函数计算（FC）。</li>
     * <li><strong>eventbus</strong>：事件总线推送，将消息推送到 EventBridge 事件总线。</li>
     * </ul>
     * <blockquote>
     * <p>以下值已废弃，仅用于兼容旧订阅：mpush（移动推送）、alisms（旧版短信）、email（旧版邮箱，请使用 dm）。</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>queue</p>
     */
    @NameInMap("PushType")
    public String pushType;

    /**
     * <p>SMQ 服务扮演的 RAM 角色 ARN。格式为 <code>acs:ram::{主账号UID}:role/{RoleName}</code>，其中 <code>{主账号UID}</code> 必须替换为调用 OpenAPI 的阿里云主账号 UID。</p>
     * <p>使用场景：</p>
     * <ul>
     * <li>当 PushType=dm（邮箱推送）时<strong>必填</strong>，RoleName 通常为 <code>AliyunMNSNotificationRole</code>。</li>
     * <li>当 PushType=queue 且目标队列与当前主题不在同一账号下时必填。</li>
     * </ul>
     * <blockquote>
     * <p><strong>注意</strong>：ARN 中的 UID 必须与调用 OpenAPI 的主账号一致，否则将报跨账号错误（InvalidParameter: Cross account is not allowed）。</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1234567890:role/AliyunMNSNotificationRole</p>
     */
    @NameInMap("StsRoleArn")
    public String stsRoleArn;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubscriptionName")
    public String subscriptionName;

    @NameInMap("TenantRateLimitPolicy")
    public String tenantRateLimitPolicyShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TopicName")
    public String topicName;

    public static SubscribeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubscribeShrinkRequest self = new SubscribeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubscribeShrinkRequest setDlqPolicyShrink(String dlqPolicyShrink) {
        this.dlqPolicyShrink = dlqPolicyShrink;
        return this;
    }
    public String getDlqPolicyShrink() {
        return this.dlqPolicyShrink;
    }

    public SubscribeShrinkRequest setDmAttributesShrink(String dmAttributesShrink) {
        this.dmAttributesShrink = dmAttributesShrink;
        return this;
    }
    public String getDmAttributesShrink() {
        return this.dmAttributesShrink;
    }

    public SubscribeShrinkRequest setDysmsAttributesShrink(String dysmsAttributesShrink) {
        this.dysmsAttributesShrink = dysmsAttributesShrink;
        return this;
    }
    public String getDysmsAttributesShrink() {
        return this.dysmsAttributesShrink;
    }

    public SubscribeShrinkRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public SubscribeShrinkRequest setKafkaAttributesShrink(String kafkaAttributesShrink) {
        this.kafkaAttributesShrink = kafkaAttributesShrink;
        return this;
    }
    public String getKafkaAttributesShrink() {
        return this.kafkaAttributesShrink;
    }

    public SubscribeShrinkRequest setMessageTag(String messageTag) {
        this.messageTag = messageTag;
        return this;
    }
    public String getMessageTag() {
        return this.messageTag;
    }

    public SubscribeShrinkRequest setNotifyContentFormat(String notifyContentFormat) {
        this.notifyContentFormat = notifyContentFormat;
        return this;
    }
    public String getNotifyContentFormat() {
        return this.notifyContentFormat;
    }

    public SubscribeShrinkRequest setNotifyStrategy(String notifyStrategy) {
        this.notifyStrategy = notifyStrategy;
        return this;
    }
    public String getNotifyStrategy() {
        return this.notifyStrategy;
    }

    public SubscribeShrinkRequest setPushType(String pushType) {
        this.pushType = pushType;
        return this;
    }
    public String getPushType() {
        return this.pushType;
    }

    public SubscribeShrinkRequest setStsRoleArn(String stsRoleArn) {
        this.stsRoleArn = stsRoleArn;
        return this;
    }
    public String getStsRoleArn() {
        return this.stsRoleArn;
    }

    public SubscribeShrinkRequest setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    public SubscribeShrinkRequest setTenantRateLimitPolicyShrink(String tenantRateLimitPolicyShrink) {
        this.tenantRateLimitPolicyShrink = tenantRateLimitPolicyShrink;
        return this;
    }
    public String getTenantRateLimitPolicyShrink() {
        return this.tenantRateLimitPolicyShrink;
    }

    public SubscribeShrinkRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
