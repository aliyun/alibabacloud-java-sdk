// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SubscribeRequest extends TeaModel {
    @NameInMap("DlqPolicy")
    public SubscribeRequestDlqPolicy dlqPolicy;

    /**
     * <p>邮箱推送相关属性，当 PushType=dm 时必填。JSON 格式，包含以下字段：</p>
     * <ul>
     * <li><strong>AccountName</strong>：发信地址，即 DirectMail 中配置的发信地址（如 <code>notify@example.com</code>）。</li>
     * <li><strong>Subject</strong>：邮件主题。</li>
     * </ul>
     */
    @NameInMap("DmAttributes")
    public SubscribeRequestDmAttributes dmAttributes;

    /**
     * <p>短信推送相关属性，当 PushType=alisms 时必填。JSON 格式，包含以下字段：</p>
     * <ul>
     * <li><strong>TemplateCode</strong>：短信模板 Code，在短信服务控制台中获取。</li>
     * <li><strong>SignName</strong>：短信签名名称。</li>
     * </ul>
     */
    @NameInMap("DysmsAttributes")
    public SubscribeRequestDysmsAttributes dysmsAttributes;

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
    public SubscribeRequestKafkaAttributes kafkaAttributes;

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
    public SubscribeRequestTenantRateLimitPolicy tenantRateLimitPolicy;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TopicName")
    public String topicName;

    public static SubscribeRequest build(java.util.Map<String, ?> map) throws Exception {
        SubscribeRequest self = new SubscribeRequest();
        return TeaModel.build(map, self);
    }

    public SubscribeRequest setDlqPolicy(SubscribeRequestDlqPolicy dlqPolicy) {
        this.dlqPolicy = dlqPolicy;
        return this;
    }
    public SubscribeRequestDlqPolicy getDlqPolicy() {
        return this.dlqPolicy;
    }

    public SubscribeRequest setDmAttributes(SubscribeRequestDmAttributes dmAttributes) {
        this.dmAttributes = dmAttributes;
        return this;
    }
    public SubscribeRequestDmAttributes getDmAttributes() {
        return this.dmAttributes;
    }

    public SubscribeRequest setDysmsAttributes(SubscribeRequestDysmsAttributes dysmsAttributes) {
        this.dysmsAttributes = dysmsAttributes;
        return this;
    }
    public SubscribeRequestDysmsAttributes getDysmsAttributes() {
        return this.dysmsAttributes;
    }

    public SubscribeRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public SubscribeRequest setKafkaAttributes(SubscribeRequestKafkaAttributes kafkaAttributes) {
        this.kafkaAttributes = kafkaAttributes;
        return this;
    }
    public SubscribeRequestKafkaAttributes getKafkaAttributes() {
        return this.kafkaAttributes;
    }

    public SubscribeRequest setMessageTag(String messageTag) {
        this.messageTag = messageTag;
        return this;
    }
    public String getMessageTag() {
        return this.messageTag;
    }

    public SubscribeRequest setNotifyContentFormat(String notifyContentFormat) {
        this.notifyContentFormat = notifyContentFormat;
        return this;
    }
    public String getNotifyContentFormat() {
        return this.notifyContentFormat;
    }

    public SubscribeRequest setNotifyStrategy(String notifyStrategy) {
        this.notifyStrategy = notifyStrategy;
        return this;
    }
    public String getNotifyStrategy() {
        return this.notifyStrategy;
    }

    public SubscribeRequest setPushType(String pushType) {
        this.pushType = pushType;
        return this;
    }
    public String getPushType() {
        return this.pushType;
    }

    public SubscribeRequest setStsRoleArn(String stsRoleArn) {
        this.stsRoleArn = stsRoleArn;
        return this;
    }
    public String getStsRoleArn() {
        return this.stsRoleArn;
    }

    public SubscribeRequest setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    public SubscribeRequest setTenantRateLimitPolicy(SubscribeRequestTenantRateLimitPolicy tenantRateLimitPolicy) {
        this.tenantRateLimitPolicy = tenantRateLimitPolicy;
        return this;
    }
    public SubscribeRequestTenantRateLimitPolicy getTenantRateLimitPolicy() {
        return this.tenantRateLimitPolicy;
    }

    public SubscribeRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

    public static class SubscribeRequestDlqPolicy extends TeaModel {
        @NameInMap("DeadLetterTargetQueue")
        public String deadLetterTargetQueue;

        @NameInMap("Enabled")
        public Boolean enabled;

        public static SubscribeRequestDlqPolicy build(java.util.Map<String, ?> map) throws Exception {
            SubscribeRequestDlqPolicy self = new SubscribeRequestDlqPolicy();
            return TeaModel.build(map, self);
        }

        public SubscribeRequestDlqPolicy setDeadLetterTargetQueue(String deadLetterTargetQueue) {
            this.deadLetterTargetQueue = deadLetterTargetQueue;
            return this;
        }
        public String getDeadLetterTargetQueue() {
            return this.deadLetterTargetQueue;
        }

        public SubscribeRequestDlqPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class SubscribeRequestDmAttributes extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("Subject")
        public String subject;

        public static SubscribeRequestDmAttributes build(java.util.Map<String, ?> map) throws Exception {
            SubscribeRequestDmAttributes self = new SubscribeRequestDmAttributes();
            return TeaModel.build(map, self);
        }

        public SubscribeRequestDmAttributes setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public SubscribeRequestDmAttributes setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

    }

    public static class SubscribeRequestDysmsAttributes extends TeaModel {
        @NameInMap("SignName")
        public String signName;

        @NameInMap("TemplateCode")
        public String templateCode;

        public static SubscribeRequestDysmsAttributes build(java.util.Map<String, ?> map) throws Exception {
            SubscribeRequestDysmsAttributes self = new SubscribeRequestDysmsAttributes();
            return TeaModel.build(map, self);
        }

        public SubscribeRequestDysmsAttributes setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public SubscribeRequestDysmsAttributes setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class SubscribeRequestKafkaAttributes extends TeaModel {
        @NameInMap("BusinessMode")
        public String businessMode;

        public static SubscribeRequestKafkaAttributes build(java.util.Map<String, ?> map) throws Exception {
            SubscribeRequestKafkaAttributes self = new SubscribeRequestKafkaAttributes();
            return TeaModel.build(map, self);
        }

        public SubscribeRequestKafkaAttributes setBusinessMode(String businessMode) {
            this.businessMode = businessMode;
            return this;
        }
        public String getBusinessMode() {
            return this.businessMode;
        }

    }

    public static class SubscribeRequestTenantRateLimitPolicy extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("MaxReceivesPerSecond")
        public Integer maxReceivesPerSecond;

        public static SubscribeRequestTenantRateLimitPolicy build(java.util.Map<String, ?> map) throws Exception {
            SubscribeRequestTenantRateLimitPolicy self = new SubscribeRequestTenantRateLimitPolicy();
            return TeaModel.build(map, self);
        }

        public SubscribeRequestTenantRateLimitPolicy setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public SubscribeRequestTenantRateLimitPolicy setMaxReceivesPerSecond(Integer maxReceivesPerSecond) {
            this.maxReceivesPerSecond = maxReceivesPerSecond;
            return this;
        }
        public Integer getMaxReceivesPerSecond() {
            return this.maxReceivesPerSecond;
        }

    }

}
