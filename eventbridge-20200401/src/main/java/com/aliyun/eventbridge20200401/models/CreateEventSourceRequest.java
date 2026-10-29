// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateEventSourceRequest extends TeaModel {
    /**
     * <p>The description of the event source.</p>
     * 
     * <strong>example:</strong>
     * <p>Event source of the RabbitMQ type</p>
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
     * <p>The external data source configuration.</p>
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
     * <p>The request parameter SourceHttpEventParameters.</p>
     */
    @NameInMap("SourceHttpEventParameters")
    public CreateEventSourceRequestSourceHttpEventParameters sourceHttpEventParameters;

    /**
     * <p>The request parameter SourceKafkaParameters.</p>
     */
    @NameInMap("SourceKafkaParameters")
    public CreateEventSourceRequestSourceKafkaParameters sourceKafkaParameters;

    /**
     * <p>The parameters for a Simple Message Queue (formerly MNS) event source. If you select Simple Message Queue (formerly MNS) as the event source, the RegionId, IsBase64Decode, and QueueName parameters are required.</p>
     */
    @NameInMap("SourceMNSParameters")
    public CreateEventSourceRequestSourceMNSParameters sourceMNSParameters;

    /**
     * <p>The parameters for an OSS event source.</p>
     */
    @NameInMap("SourceOSSEventParameters")
    public CreateEventSourceRequestSourceOSSEventParameters sourceOSSEventParameters;

    /**
     * <p>The request parameter SourceRabbitMQParameters.</p>
     */
    @NameInMap("SourceRabbitMQParameters")
    public CreateEventSourceRequestSourceRabbitMQParameters sourceRabbitMQParameters;

    /**
     * <p>The request parameter SourceRocketMQParameters.</p>
     */
    @NameInMap("SourceRocketMQParameters")
    public CreateEventSourceRequestSourceRocketMQParameters sourceRocketMQParameters;

    /**
     * <p>The parameters for a Simple Log Service event source.</p>
     */
    @NameInMap("SourceSLSParameters")
    public CreateEventSourceRequestSourceSLSParameters sourceSLSParameters;

    /**
     * <p>The request parameter SourceScheduledEventParameters.</p>
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
         * <p>The CIDR block for security configuration. This parameter is required only when the SecurityConfig parameter is set to ip. You can enter a CIDR block or an IP address.</p>
         */
        @NameInMap("Ip")
        public java.util.List<String> ip;

        /**
         * <p>The HTTP request methods supported by the generated webhook. You can select multiple values. Valid values:</p>
         * <ul>
         * <li>GET</li>
         * <li>POST</li>
         * <li>PUT</li>
         * <li>PATCH</li>
         * <li>DELETE</li>
         * <li>HEAD</li>
         * <li>OPTIONS</li>
         * <li>TRACE</li>
         * <li>CONNECT</li>
         * </ul>
         */
        @NameInMap("Method")
        public java.util.List<String> method;

        /**
         * <p>The secure domain name for security configuration. This parameter is required only when the SecurityConfig parameter is set to referer. You can enter a domain name.</p>
         */
        @NameInMap("Referer")
        public java.util.List<String> referer;

        /**
         * <p>The type of the security configuration. Valid values:</p>
         * <ul>
         * <li>none: No configuration is required.</li>
         * <li>ip: CIDR block.</li>
         * <li>referer: Secure domain name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("SecurityConfig")
        public String securityConfig;

        /**
         * <p>The protocol type supported by the generated webhook. Valid values:</p>
         * <ul>
         * <li>HTTP</li>
         * <li>HTTPS</li>
         * <li>HTTP&amp;HTTPS</li>
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
         * <p>The group ID of the consumer that subscribes to the topic.</p>
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
         * <p>The concurrency quota, which is the number of consumers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaximumTasks")
        public Integer maximumTasks;

        /**
         * <p>The network configuration. Valid values: Default and PublicNetwork.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>The consumption offset.</p>
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
         * <p>The security group ID. Required for self-managed networks.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-8vbf66aoyp0wfzrz****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The name of the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>prod_ma_dispatch_center_call_re****</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The vSwitch ID. Required for self-managed networks.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp127azpeirmwu4q9****</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <p>The VPC ID. Required for self-managed networks.</p>
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
         * <p>Specifies whether to enable Base64 decoding. A value of true indicates that Base64 decoding is enabled. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsBase64Decode")
        public Boolean isBase64Decode;

        /**
         * <p>The name of the Simple Message Queue (formerly MNS) queue.</p>
         * 
         * <strong>example:</strong>
         * <p>MyQueue</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The region where the Simple Message Queue (formerly MNS) queue resides.
         * Valid values: cn-qingdao, cn-beijing, cn-zhangjiakou, cn-huhehaote, cn-wulanchabu, cn-hangzhou, cn-shanghai, cn-shenzhen, cn-guangzhou, cn-chengdu, cn-hongkong, ap-southeast-1, ap-southeast-2, ap-southeast-3, ap-southeast-5, ap-northeast-1, eu-central-1, us-west-1, us-east-1, ap-south-1, me-east-1, and cn-north-2-gov-1.</p>
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
         * 
         * <strong>example:</strong>
         * <p>fun/document/</p>
         */
        @NameInMap("Prefix")
        public String prefix;

        /**
         * <p>The suffix.</p>
         * 
         * <strong>example:</strong>
         * <p>document</p>
         */
        @NameInMap("Suffix")
        public String suffix;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>bucketName</p>
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
         * <p>The matching rules.</p>
         */
        @NameInMap("MatchRules")
        public java.util.List<java.util.List<CreateEventSourceRequestSourceOSSEventParametersMatchRules>> matchRules;

        /**
         * <p>The ARN of the STS role.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:eventbridge:cn-hangzhou:**</p>
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
         * <p>The instance ID of the ApsaraMQ for RabbitMQ instance. For more information, see Limits.</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-cn-nif22u74****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The queue name of the ApsaraMQ for RabbitMQ instance, such as eb-connect. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The region where the ApsaraMQ for RabbitMQ instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The vhost name of the ApsaraMQ for RabbitMQ instance. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
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
         * <p>The authentication type. Valid values: ACL. You can also leave this parameter empty.</p>
         * 
         * <strong>example:</strong>
         * <p>ACL</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The group ID of the ApsaraMQ for RocketMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>GID-test</p>
         */
        @NameInMap("GroupID")
        public String groupID;

        /**
         * <p>The endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc****.aliyuncs.com</p>
         */
        @NameInMap("InstanceEndpoint")
        public String instanceEndpoint;

        /**
         * <p>The instance ID of the ApsaraMQ for RocketMQ instance. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_164901546557****_BAAN****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>PublicNetwork</p>
         */
        @NameInMap("InstanceNetwork")
        public String instanceNetwork;

        /**
         * <p>The password of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>yourPassword</p>
         */
        @NameInMap("InstancePassword")
        public String instancePassword;

        /**
         * <p>The security group ID. Required for VPCs.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-catalog-eventlist****</p>
         */
        @NameInMap("InstanceSecurityGroupId")
        public String instanceSecurityGroupId;

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li>Cloud_4: Version 4.0 instance.</li>
         * <li>Cloud_5: Version 5.0 instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Cloud_4</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The username of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("InstanceUsername")
        public String instanceUsername;

        /**
         * <p>The vSwitch ID. Required for VPCs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp10rbrt6rb6vrd89****</p>
         */
        @NameInMap("InstanceVSwitchIds")
        public String instanceVSwitchIds;

        /**
         * <p>The ID of the virtual private cloud (VPC). Required for VPCs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1a4gmlk31hyg6pt****</p>
         */
        @NameInMap("InstanceVpcId")
        public String instanceVpcId;

        /**
         * <p>The consumption offset of the message. Valid values:</p>
         * <ul>
         * <li>CONSUME_FROM_LAST_OFFSET: Consumes messages from the latest offset.</li>
         * <li>CONSUME_FROM_FIRST_OFFSET: Consumes messages from the earliest offset.</li>
         * <li>CONSUME_FROM_TIMESTAMP: Consumes messages from the offset at a specified point in time.
         * Default value: CONSUME_FROM_LAST_OFFSET.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CONSUME_FROM_LAST_OFFSET</p>
         */
        @NameInMap("Offset")
        public String offset;

        /**
         * <p>The region where the ApsaraMQ for RocketMQ instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The filter tag of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The timestamp. This parameter takes effect only when the Offset parameter is set to CONSUME_FROM_TIMESTAMP.</p>
         * 
         * <strong>example:</strong>
         * <p>1636597951964</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The topic name of the ApsaraMQ for RocketMQ instance. For more information, see <a href="https://help.aliyun.com/document_detail/163289.html">Limits</a>.</p>
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
         * <p>The start consumption offset. You can set this parameter to begin to consume from the earliest offset, end to consume from the latest offset, or a specific timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>end</p>
         */
        @NameInMap("ConsumePosition")
        public String consumePosition;

        /**
         * <p>The Simple Log Service Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>test-logstore</p>
         */
        @NameInMap("LogStore")
        public String logStore;

        /**
         * <p>The Simple Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>When granting authorization to EventBridge to read Simple Log Service logs by using this role, the following conditions must be met: When you create the role in the Resource Access Management (RAM) console, you must select Alibaba Cloud Service as the trusted entity and EventBridge as the trusted service. For more information about the access policy for this role, see Custom event source: Simple Log Service.</p>
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
         * <p>The time zone for cron execution.</p>
         * 
         * <strong>example:</strong>
         * <p>GMT+0:00</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

        /**
         * <p>The JSON string.</p>
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
