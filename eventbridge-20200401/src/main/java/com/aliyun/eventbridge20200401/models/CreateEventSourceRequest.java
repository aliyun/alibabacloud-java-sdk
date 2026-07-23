// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateEventSourceRequest extends TeaModel {
    /**
     * <p>The description of the event source.</p>
     * 
     * <strong>example:</strong>
     * <p>RabbitMQ event source</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the event bus associated with the event source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-event-bus</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>The name of the event source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myrabbitmq.sourc</p>
     */
    @NameInMap("EventSourceName")
    public String eventSourceName;

    /**
     * <p>The configuration of the external data source.</p>
     */
    @NameInMap("ExternalSourceConfig")
    public java.util.Map<String, ?> externalSourceConfig;

    /**
     * <p>The type of the external data source.</p>
     * 
     * <strong>example:</strong>
     * <p>RabbitMQ</p>
     */
    @NameInMap("ExternalSourceType")
    public byte[] externalSourceType;

    /**
     * <p>Specifies whether to connect to an external data source.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("LinkedExternalSource")
    public Boolean linkedExternalSource;

    /**
     * <p>Parameters for an HTTP endpoint event source.</p>
     */
    @NameInMap("SourceHttpEventParameters")
    public CreateEventSourceRequestSourceHttpEventParameters sourceHttpEventParameters;

    /**
     * <p>Parameters for the Message Queue for Apache Kafka event source.</p>
     */
    @NameInMap("SourceKafkaParameters")
    public CreateEventSourceRequestSourceKafkaParameters sourceKafkaParameters;

    /**
     * <p>Parameters for the Message Service (MNS) event source. The <code>RegionId</code>, <code>IsBase64Decode</code>, and <code>QueueName</code> parameters are required for this type.</p>
     */
    @NameInMap("SourceMNSParameters")
    public CreateEventSourceRequestSourceMNSParameters sourceMNSParameters;

    /**
     * <p>Parameters for the Object Storage Service (OSS) event source.</p>
     */
    @NameInMap("SourceOSSEventParameters")
    public CreateEventSourceRequestSourceOSSEventParameters sourceOSSEventParameters;

    /**
     * <p>Parameters for the Message Queue for RabbitMQ event source.</p>
     */
    @NameInMap("SourceRabbitMQParameters")
    public CreateEventSourceRequestSourceRabbitMQParameters sourceRabbitMQParameters;

    /**
     * <p>Parameters for the Message Queue for Apache RocketMQ event source.</p>
     */
    @NameInMap("SourceRocketMQParameters")
    public CreateEventSourceRequestSourceRocketMQParameters sourceRocketMQParameters;

    /**
     * <p>Parameters for the Simple Log Service (SLS) event source.</p>
     */
    @NameInMap("SourceSLSParameters")
    public CreateEventSourceRequestSourceSLSParameters sourceSLSParameters;

    /**
     * <p>Parameters for a scheduled event source.</p>
     */
    @NameInMap("SourceScheduledEventParameters")
    public CreateEventSourceRequestSourceScheduledEventParameters sourceScheduledEventParameters;

    public static CreateEventSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEventSourceRequest self = new CreateEventSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateEventSourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEventSourceRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public CreateEventSourceRequest setEventSourceName(String eventSourceName) {
        this.eventSourceName = eventSourceName;
        return this;
    }
    public String getEventSourceName() {
        return this.eventSourceName;
    }

    public CreateEventSourceRequest setExternalSourceConfig(java.util.Map<String, ?> externalSourceConfig) {
        this.externalSourceConfig = externalSourceConfig;
        return this;
    }
    public java.util.Map<String, ?> getExternalSourceConfig() {
        return this.externalSourceConfig;
    }

    public CreateEventSourceRequest setExternalSourceType(byte[] externalSourceType) {
        this.externalSourceType = externalSourceType;
        return this;
    }
    public byte[] getExternalSourceType() {
        return this.externalSourceType;
    }

    public CreateEventSourceRequest setLinkedExternalSource(Boolean linkedExternalSource) {
        this.linkedExternalSource = linkedExternalSource;
        return this;
    }
    public Boolean getLinkedExternalSource() {
        return this.linkedExternalSource;
    }

    public CreateEventSourceRequest setSourceHttpEventParameters(CreateEventSourceRequestSourceHttpEventParameters sourceHttpEventParameters) {
        this.sourceHttpEventParameters = sourceHttpEventParameters;
        return this;
    }
    public CreateEventSourceRequestSourceHttpEventParameters getSourceHttpEventParameters() {
        return this.sourceHttpEventParameters;
    }

    public CreateEventSourceRequest setSourceKafkaParameters(CreateEventSourceRequestSourceKafkaParameters sourceKafkaParameters) {
        this.sourceKafkaParameters = sourceKafkaParameters;
        return this;
    }
    public CreateEventSourceRequestSourceKafkaParameters getSourceKafkaParameters() {
        return this.sourceKafkaParameters;
    }

    public CreateEventSourceRequest setSourceMNSParameters(CreateEventSourceRequestSourceMNSParameters sourceMNSParameters) {
        this.sourceMNSParameters = sourceMNSParameters;
        return this;
    }
    public CreateEventSourceRequestSourceMNSParameters getSourceMNSParameters() {
        return this.sourceMNSParameters;
    }

    public CreateEventSourceRequest setSourceOSSEventParameters(CreateEventSourceRequestSourceOSSEventParameters sourceOSSEventParameters) {
        this.sourceOSSEventParameters = sourceOSSEventParameters;
        return this;
    }
    public CreateEventSourceRequestSourceOSSEventParameters getSourceOSSEventParameters() {
        return this.sourceOSSEventParameters;
    }

    public CreateEventSourceRequest setSourceRabbitMQParameters(CreateEventSourceRequestSourceRabbitMQParameters sourceRabbitMQParameters) {
        this.sourceRabbitMQParameters = sourceRabbitMQParameters;
        return this;
    }
    public CreateEventSourceRequestSourceRabbitMQParameters getSourceRabbitMQParameters() {
        return this.sourceRabbitMQParameters;
    }

    public CreateEventSourceRequest setSourceRocketMQParameters(CreateEventSourceRequestSourceRocketMQParameters sourceRocketMQParameters) {
        this.sourceRocketMQParameters = sourceRocketMQParameters;
        return this;
    }
    public CreateEventSourceRequestSourceRocketMQParameters getSourceRocketMQParameters() {
        return this.sourceRocketMQParameters;
    }

    public CreateEventSourceRequest setSourceSLSParameters(CreateEventSourceRequestSourceSLSParameters sourceSLSParameters) {
        this.sourceSLSParameters = sourceSLSParameters;
        return this;
    }
    public CreateEventSourceRequestSourceSLSParameters getSourceSLSParameters() {
        return this.sourceSLSParameters;
    }

    public CreateEventSourceRequest setSourceScheduledEventParameters(CreateEventSourceRequestSourceScheduledEventParameters sourceScheduledEventParameters) {
        this.sourceScheduledEventParameters = sourceScheduledEventParameters;
        return this;
    }
    public CreateEventSourceRequestSourceScheduledEventParameters getSourceScheduledEventParameters() {
        return this.sourceScheduledEventParameters;
    }

    public static class CreateEventSourceRequestSourceHttpEventParameters extends TeaModel {
        /**
         * <p>The IP address range for security settings. This parameter is required only if you set <code>SecurityConfig</code> to <code>ip</code>. You can specify a single IP address or a CIDR block.</p>
         */
        @NameInMap("Ip")
        public java.util.List<String> ip;

        /**
         * <p>The HTTP request methods supported by the webhook. You can specify more than one method. Valid values:</p>
         * <ul>
         * <li><p><code>GET</code></p>
         * </li>
         * <li><p><code>POST</code></p>
         * </li>
         * <li><p><code>PUT</code></p>
         * </li>
         * <li><p><code>PATCH</code></p>
         * </li>
         * <li><p><code>DELETE</code></p>
         * </li>
         * <li><p><code>HEAD</code></p>
         * </li>
         * <li><p><code>OPTIONS</code></p>
         * </li>
         * <li><p><code>TRACE</code></p>
         * </li>
         * <li><p><code>CONNECT</code></p>
         * </li>
         * </ul>
         */
        @NameInMap("Method")
        public java.util.List<String> method;

        /**
         * <p>The security domain names. This parameter is required only if you set <code>SecurityConfig</code> to <code>referer</code>. You can specify one or more domain names.</p>
         */
        @NameInMap("Referer")
        public java.util.List<String> referer;

        /**
         * <p>The type of security configuration. Valid values:</p>
         * <ul>
         * <li><p><code>none</code>: No configuration is required.</p>
         * </li>
         * <li><p><code>ip</code>: IP address range.</p>
         * </li>
         * <li><p><code>referer</code>: Security domain name.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("SecurityConfig")
        public String securityConfig;

        /**
         * <p>The supported protocol for the webhook. Valid values:</p>
         * <ul>
         * <li><p><code>HTTP</code></p>
         * </li>
         * <li><p><code>HTTPS</code></p>
         * </li>
         * <li><p><code>HTTP&amp;HTTPS</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTPS</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateEventSourceRequestSourceHttpEventParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventSourceRequestSourceHttpEventParameters self = new CreateEventSourceRequestSourceHttpEventParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventSourceRequestSourceHttpEventParameters setIp(java.util.List<String> ip) {
            this.ip = ip;
            return this;
        }
        public java.util.List<String> getIp() {
            return this.ip;
        }

        public CreateEventSourceRequestSourceHttpEventParameters setMethod(java.util.List<String> method) {
            this.method = method;
            return this;
        }
        public java.util.List<String> getMethod() {
            return this.method;
        }

        public CreateEventSourceRequestSourceHttpEventParameters setReferer(java.util.List<String> referer) {
            this.referer = referer;
            return this;
        }
        public java.util.List<String> getReferer() {
            return this.referer;
        }

        public CreateEventSourceRequestSourceHttpEventParameters setSecurityConfig(String securityConfig) {
            this.securityConfig = securityConfig;
            return this;
        }
        public String getSecurityConfig() {
            return this.securityConfig;
        }

        public CreateEventSourceRequestSourceHttpEventParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateEventSourceRequestSourceKafkaParameters extends TeaModel {
        /**
         * <p>The consumer group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>wechat_peer_****</p>
         */
        @NameInMap("ConsumerGroup")
        public String consumerGroup;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2zehmg67txzuyuuwl****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The concurrent consumption quota (number of consumers).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaximumTasks")
        public Integer maximumTasks;

        /**
         * <p>The network type. Valid values are <code>Default</code> and <code>PublicNetwork</code>. Specify <code>PublicNetwork</code> if the instance is in a VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>The consumer offset reset policy.</p>
         * 
         * <strong>example:</strong>
         * <p>latest</p>
         */
        @NameInMap("OffsetReset")
        public String offsetReset;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The security group ID. This parameter is required if <code>Network</code> is set to <code>PublicNetwork</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-8vbf66aoyp0wfzrz****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The topic name.</p>
         * 
         * <strong>example:</strong>
         * <p>prod_ma_dispatch_center_call_re****</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The vSwitch ID. This parameter is required if <code>Network</code> is set to <code>PublicNetwork</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp127azpeirmwu4q9****</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <p>The VPC ID. This parameter is required if <code>Network</code> is set to <code>PublicNetwork</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze5ejm986a73qq3v****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static CreateEventSourceRequestSourceKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventSourceRequestSourceKafkaParameters self = new CreateEventSourceRequestSourceKafkaParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventSourceRequestSourceKafkaParameters setConsumerGroup(String consumerGroup) {
            this.consumerGroup = consumerGroup;
            return this;
        }
        public String getConsumerGroup() {
            return this.consumerGroup;
        }

        public CreateEventSourceRequestSourceKafkaParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateEventSourceRequestSourceKafkaParameters setMaximumTasks(Integer maximumTasks) {
            this.maximumTasks = maximumTasks;
            return this;
        }
        public Integer getMaximumTasks() {
            return this.maximumTasks;
        }

        public CreateEventSourceRequestSourceKafkaParameters setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public CreateEventSourceRequestSourceKafkaParameters setOffsetReset(String offsetReset) {
            this.offsetReset = offsetReset;
            return this;
        }
        public String getOffsetReset() {
            return this.offsetReset;
        }

        public CreateEventSourceRequestSourceKafkaParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateEventSourceRequestSourceKafkaParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateEventSourceRequestSourceKafkaParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public CreateEventSourceRequestSourceKafkaParameters setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public CreateEventSourceRequestSourceKafkaParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class CreateEventSourceRequestSourceMNSParameters extends TeaModel {
        /**
         * <p>Specifies whether to enable Base64 decoding. Valid values: <code>true</code> and <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsBase64Decode")
        public Boolean isBase64Decode;

        /**
         * <p>The name of the queue in Message Service (MNS).</p>
         * 
         * <strong>example:</strong>
         * <p>MyQueue</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The region where the Message Service (MNS) queue is located.
         * You can specify the following regions: <code>cn-qingdao</code>, <code>cn-beijing</code>, <code>cn-zhangjiakou</code>, <code>cn-huhehaote</code>, <code>cn-wulanchabu</code>, <code>cn-hangzhou</code>, <code>cn-shanghai</code>, <code>cn-shenzhen</code>, <code>cn-guangzhou</code>, <code>cn-chengdu</code>, <code>cn-hongkong</code>, <code>ap-southeast-1</code>, <code>ap-southeast-2</code>, <code>ap-southeast-3</code>, <code>ap-southeast-5</code>, <code>ap-northeast-1</code>, <code>eu-central-1</code>, <code>us-west-1</code>, <code>us-east-1</code>, <code>ap-south-1</code>, <code>me-east-1</code>, and <code>cn-north-2-gov-1</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static CreateEventSourceRequestSourceMNSParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventSourceRequestSourceMNSParameters self = new CreateEventSourceRequestSourceMNSParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventSourceRequestSourceMNSParameters setIsBase64Decode(Boolean isBase64Decode) {
            this.isBase64Decode = isBase64Decode;
            return this;
        }
        public Boolean getIsBase64Decode() {
            return this.isBase64Decode;
        }

        public CreateEventSourceRequestSourceMNSParameters setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public CreateEventSourceRequestSourceMNSParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class CreateEventSourceRequestSourceOSSEventParametersMatchRules extends TeaModel {
        /**
         * <p>The prefix.</p>
         */
        @NameInMap("Prefix")
        public String prefix;

        /**
         * <p>The suffix.</p>
         */
        @NameInMap("Suffix")
        public String suffix;

        /**
         * <p>The name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The match state.</p>
         */
        @NameInMap("MatchState")
        public Boolean matchState;

        public static CreateEventSourceRequestSourceOSSEventParametersMatchRules build(java.util.Map<String, ?> map) throws Exception {
            CreateEventSourceRequestSourceOSSEventParametersMatchRules self = new CreateEventSourceRequestSourceOSSEventParametersMatchRules();
            return TeaModel.build(map, self);
        }

        public CreateEventSourceRequestSourceOSSEventParametersMatchRules setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public CreateEventSourceRequestSourceOSSEventParametersMatchRules setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }
        public String getSuffix() {
            return this.suffix;
        }

        public CreateEventSourceRequestSourceOSSEventParametersMatchRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateEventSourceRequestSourceOSSEventParametersMatchRules setMatchState(Boolean matchState) {
            this.matchState = matchState;
            return this;
        }
        public Boolean getMatchState() {
            return this.matchState;
        }

    }

    public static class CreateEventSourceRequestSourceOSSEventParameters extends TeaModel {
        /**
         * <p>The list of event types.</p>
         */
        @NameInMap("EventTypes")
        public java.util.List<String> eventTypes;

        /**
         * <p>The match rules.</p>
         */
        @NameInMap("MatchRules")
        public java.util.List<java.util.List<CreateEventSourceRequestSourceOSSEventParametersMatchRules>> matchRules;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the Security Token Service (STS) role.</p>
         */
        @NameInMap("StsRoleArn")
        public String stsRoleArn;

        public static CreateEventSourceRequestSourceOSSEventParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventSourceRequestSourceOSSEventParameters self = new CreateEventSourceRequestSourceOSSEventParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventSourceRequestSourceOSSEventParameters setEventTypes(java.util.List<String> eventTypes) {
            this.eventTypes = eventTypes;
            return this;
        }
        public java.util.List<String> getEventTypes() {
            return this.eventTypes;
        }

        public CreateEventSourceRequestSourceOSSEventParameters setMatchRules(java.util.List<java.util.List<CreateEventSourceRequestSourceOSSEventParametersMatchRules>> matchRules) {
            this.matchRules = matchRules;
            return this;
        }
        public java.util.List<java.util.List<CreateEventSourceRequestSourceOSSEventParametersMatchRules>> getMatchRules() {
            return this.matchRules;
        }

        public CreateEventSourceRequestSourceOSSEventParameters setStsRoleArn(String stsRoleArn) {
            this.stsRoleArn = stsRoleArn;
            return this;
        }
        public String getStsRoleArn() {
            return this.stsRoleArn;
        }

    }

    public static class CreateEventSourceRequestSourceRabbitMQParameters extends TeaModel {
        /**
         * <p>The ID of the Message Queue for RabbitMQ instance. For more information, see Limits.</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-cn-nif22u74****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the queue on the Message Queue for RabbitMQ instance. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The region where the Message Queue for RabbitMQ instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the virtual host (vhost) of the Message Queue for RabbitMQ instance. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>eb-connect</p>
         */
        @NameInMap("VirtualHostName")
        public String virtualHostName;

        public static CreateEventSourceRequestSourceRabbitMQParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventSourceRequestSourceRabbitMQParameters self = new CreateEventSourceRequestSourceRabbitMQParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventSourceRequestSourceRabbitMQParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateEventSourceRequestSourceRabbitMQParameters setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public CreateEventSourceRequestSourceRabbitMQParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateEventSourceRequestSourceRabbitMQParameters setVirtualHostName(String virtualHostName) {
            this.virtualHostName = virtualHostName;
            return this;
        }
        public String getVirtualHostName() {
            return this.virtualHostName;
        }

    }

    public static class CreateEventSourceRequestSourceRocketMQParameters extends TeaModel {
        /**
         * <p>The authentication type. You can set this parameter to <code>ACL</code> or leave it empty.</p>
         * 
         * <strong>example:</strong>
         * <p>ACL</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The consumer group ID on the Message Queue for Apache RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>GID-test</p>
         */
        @NameInMap("GroupID")
        public String groupID;

        /**
         * <p>The instance endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc****.aliyuncs.com</p>
         */
        @NameInMap("InstanceEndpoint")
        public String instanceEndpoint;

        /**
         * <p>The ID of the Message Queue for Apache RocketMQ instance. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_164901546557****_BAAN****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>This parameter is not in use.</p>
         */
        @NameInMap("InstanceNetwork")
        public String instanceNetwork;

        /**
         * <p>The password for the instance.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("InstancePassword")
        public String instancePassword;

        /**
         * <p>The security group ID. This parameter is required if the instance is deployed in a VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-catalog-eventlist****</p>
         */
        @NameInMap("InstanceSecurityGroupId")
        public String instanceSecurityGroupId;

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li><p><code>Cloud_4</code>: For v4.0 instances.</p>
         * </li>
         * <li><p><code>Cloud_5</code>: For v5.0 instances.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Cloud_4</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The username for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("InstanceUsername")
        public String instanceUsername;

        /**
         * <p>The vSwitch ID. This parameter is required if the instance is deployed in a VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp10rbrt6rb6vrd89****</p>
         */
        @NameInMap("InstanceVSwitchIds")
        public String instanceVSwitchIds;

        /**
         * <p>The ID of the virtual private cloud (VPC). This parameter is required if the instance is deployed in a VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1a4gmlk31hyg6pt****</p>
         */
        @NameInMap("InstanceVpcId")
        public String instanceVpcId;

        /**
         * <p>The consumer offset from which message consumption starts. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>CONSUME_FROM_LAST_OFFSET</p>
         */
        @NameInMap("Offset")
        public String offset;

        /**
         * <p>The region where the Message Queue for Apache RocketMQ instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The tag used to filter messages.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The point in time to start consumption, specified as a timestamp. This parameter is valid only if you set the <code>Offset</code> parameter to <code>CONSUME_FROM_TIMESTAMP</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1636597951964</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The name of the topic on the Message Queue for Apache RocketMQ instance. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>mytopic</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static CreateEventSourceRequestSourceRocketMQParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventSourceRequestSourceRocketMQParameters self = new CreateEventSourceRequestSourceRocketMQParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventSourceRequestSourceRocketMQParameters setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public CreateEventSourceRequestSourceRocketMQParameters setGroupID(String groupID) {
            this.groupID = groupID;
            return this;
        }
        public String getGroupID() {
            return this.groupID;
        }

        public CreateEventSourceRequestSourceRocketMQParameters setInstanceEndpoint(String instanceEndpoint) {
            this.instanceEndpoint = instanceEndpoint;
            return this;
        }
        public String getInstanceEndpoint() {
            return this.instanceEndpoint;
        }

        public CreateEventSourceRequestSourceRocketMQParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateEventSourceRequestSourceRocketMQParameters setInstanceNetwork(String instanceNetwork) {
            this.instanceNetwork = instanceNetwork;
            return this;
        }
        public String getInstanceNetwork() {
            return this.instanceNetwork;
        }

        public CreateEventSourceRequestSourceRocketMQParameters setInstancePassword(String instancePassword) {
            this.instancePassword = instancePassword;
            return this;
        }
        public String getInstancePassword() {
            return this.instancePassword;
        }

        public CreateEventSourceRequestSourceRocketMQParameters setInstanceSecurityGroupId(String instanceSecurityGroupId) {
            this.instanceSecurityGroupId = instanceSecurityGroupId;
            return this;
        }
        public String getInstanceSecurityGroupId() {
            return this.instanceSecurityGroupId;
        }

        public CreateEventSourceRequestSourceRocketMQParameters setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateEventSourceRequestSourceRocketMQParameters setInstanceUsername(String instanceUsername) {
            this.instanceUsername = instanceUsername;
            return this;
        }
        public String getInstanceUsername() {
            return this.instanceUsername;
        }

        public CreateEventSourceRequestSourceRocketMQParameters setInstanceVSwitchIds(String instanceVSwitchIds) {
            this.instanceVSwitchIds = instanceVSwitchIds;
            return this;
        }
        public String getInstanceVSwitchIds() {
            return this.instanceVSwitchIds;
        }

        public CreateEventSourceRequestSourceRocketMQParameters setInstanceVpcId(String instanceVpcId) {
            this.instanceVpcId = instanceVpcId;
            return this;
        }
        public String getInstanceVpcId() {
            return this.instanceVpcId;
        }

        public CreateEventSourceRequestSourceRocketMQParameters setOffset(String offset) {
            this.offset = offset;
            return this;
        }
        public String getOffset() {
            return this.offset;
        }

        public CreateEventSourceRequestSourceRocketMQParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateEventSourceRequestSourceRocketMQParameters setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public CreateEventSourceRequestSourceRocketMQParameters setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public CreateEventSourceRequestSourceRocketMQParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class CreateEventSourceRequestSourceSLSParameters extends TeaModel {
        /**
         * <p>The consumer offset. Specifies where to start consumption. Valid values are <code>begin</code> (earliest offset), <code>end</code> (latest offset), or a specific UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>end</p>
         */
        @NameInMap("ConsumePosition")
        public String consumePosition;

        /**
         * <p>The Logstore in Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>test-logstore</p>
         */
        @NameInMap("LogStore")
        public String logStore;

        /**
         * <p>The Log Project in Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The RAM role that EventBridge assumes to read logs from Simple Log Service. When you create this role in the RAM console, select <strong>Alibaba Cloud Service</strong> as the trusted entity and <strong>EventBridge</strong> as the trusted service. For more information about the permissions for this role, see Custom event sources for Simple Log Service (SLS).</p>
         * 
         * <strong>example:</strong>
         * <p>testRole</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        public static CreateEventSourceRequestSourceSLSParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventSourceRequestSourceSLSParameters self = new CreateEventSourceRequestSourceSLSParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventSourceRequestSourceSLSParameters setConsumePosition(String consumePosition) {
            this.consumePosition = consumePosition;
            return this;
        }
        public String getConsumePosition() {
            return this.consumePosition;
        }

        public CreateEventSourceRequestSourceSLSParameters setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

        public CreateEventSourceRequestSourceSLSParameters setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public CreateEventSourceRequestSourceSLSParameters setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class CreateEventSourceRequestSourceScheduledEventParameters extends TeaModel {
        /**
         * <p>The cron expression.</p>
         * 
         * <strong>example:</strong>
         * <p>10 * * * * *</p>
         */
        @NameInMap("Schedule")
        public String schedule;

        /**
         * <p>The time zone in which the cron expression is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>GMT+0:00</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

        /**
         * <p>A user-defined JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;a&quot;: &quot;b&quot;}</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static CreateEventSourceRequestSourceScheduledEventParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventSourceRequestSourceScheduledEventParameters self = new CreateEventSourceRequestSourceScheduledEventParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventSourceRequestSourceScheduledEventParameters setSchedule(String schedule) {
            this.schedule = schedule;
            return this;
        }
        public String getSchedule() {
            return this.schedule;
        }

        public CreateEventSourceRequestSourceScheduledEventParameters setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public CreateEventSourceRequestSourceScheduledEventParameters setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
