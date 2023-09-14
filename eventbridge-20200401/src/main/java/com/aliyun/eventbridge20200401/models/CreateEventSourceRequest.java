// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateEventSourceRequest extends TeaModel {
    /**
     * <p>The description of the event source.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the event bus with which the event source is associated.</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>Then name of the event source.</p>
     */
    @NameInMap("EventSourceName")
    public String eventSourceName;

    /**
     * <p>The parameters that are configured if the event source is HTTP events.</p>
     */
    @NameInMap("SourceHttpEventParameters")
    public CreateEventSourceRequestSourceHttpEventParameters sourceHttpEventParameters;

    /**
     * <p>The parameters that are configured if the event source is Message Queue for Apache Kafka.</p>
     */
    @NameInMap("SourceKafkaParameters")
    public CreateEventSourceRequestSourceKafkaParameters sourceKafkaParameters;

    /**
     * <p>The parameters that are configured if the event source is Message Service (MNS).</p>
     */
    @NameInMap("SourceMNSParameters")
    public CreateEventSourceRequestSourceMNSParameters sourceMNSParameters;

    /**
     * <p>The parameters that are configured if the event source is Message Queue for RabbitMQ.</p>
     */
    @NameInMap("SourceRabbitMQParameters")
    public CreateEventSourceRequestSourceRabbitMQParameters sourceRabbitMQParameters;

    /**
     * <p>The parameters that are configured if the event source is Message Queue for Apache RocketMQ.</p>
     */
    @NameInMap("SourceRocketMQParameters")
    public CreateEventSourceRequestSourceRocketMQParameters sourceRocketMQParameters;

    /**
     * <p>The parameters that are configured if the event source is Log Service.</p>
     */
    @NameInMap("SourceSLSParameters")
    public CreateEventSourceRequestSourceSLSParameters sourceSLSParameters;

    /**
     * <p>The parameters that are configured if the event source is scheduled events.</p>
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
         * <p>The CIDR blocks that are used for security settings. This parameter is required only if you set SecurityConfig to ip. You can enter CIDR blocks or IP addresses.</p>
         */
        @NameInMap("Ip")
        public java.util.List<String> ip;

        /**
         * <p>The HTTP request method that is supported by the generated webhook URL. You can select multiple values. Valid values: GET GET, POST, PUT, PATCH, DELETE, HEAD, OPTIONS, TRACE, and CONNECT.</p>
         */
        @NameInMap("Method")
        public java.util.List<String> method;

        /**
         * <p>The security domain names. This parameter is required only if you set SecurityConfig to referer. You can enter domain names.</p>
         */
        @NameInMap("Referer")
        public java.util.List<String> referer;

        /**
         * <p>The security settings. Valid values: none: No configuration is required. ip: CIDR blocks. referer: security domain names.</p>
         */
        @NameInMap("SecurityConfig")
        public String securityConfig;

        /**
         * <p>The protocol type that is supported by the generated webhook URL. Valid values: HTTP, HTTPS, and HTTP\&HTTPS.</p>
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
         * <p>The ID of the consumer group that subscribes to the topic.</p>
         */
        @NameInMap("ConsumerGroup")
        public String consumerGroup;

        /**
         * <p>The ID of the Message Queue for Apache Kafka instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The maximum number of consumers.</p>
         */
        @NameInMap("MaximumTasks")
        public Integer maximumTasks;

        /**
         * <p>The network. Valid values: Default and PublicNetwork.</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>The consumer offset.</p>
         */
        @NameInMap("OffsetReset")
        public String offsetReset;

        /**
         * <p>The ID of the region where the Message Queue for Apache Kafka instance resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the security group to which the Message Queue for Apache Kafka instance belongs. This parameter is required if you set Network to PublicNetwork.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The name of the topic in the Message Queue for Apache Kafka instance.</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The ID of the vSwitch with which the Message Queue for Apache Kafka instance is associated. This parameter is required if you set Network to PublicNetwork.</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <p>The ID of the VPC in which the Message Queue for Apache Kafka instance resides. This parameter is required if you set Network to PublicNetwork.</p>
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
         * <p>Specifies whether to enable Base64 decoding. Default value: true.</p>
         */
        @NameInMap("IsBase64Decode")
        public Boolean isBase64Decode;

        /**
         * <p>The name of the MNS queue.</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The region where the MNS queue resides.</p>
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

    public static class CreateEventSourceRequestSourceRabbitMQParameters extends TeaModel {
        /**
         * <p>The ID of the Message Queue for RabbitMQ instance. For more information, see Limits.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the queue in the Message Queue for RabbitMQ instance. For more information, see Limits.</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The ID of the region where the Message Queue for RabbitMQ instance resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The vhost name of the Message Queue for RabbitMQ instance. For more information, see Limits.</p>
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
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The ID of the consumer group in the Message Queue for Apache RocketMQ instance.</p>
         */
        @NameInMap("GroupID")
        public String groupID;

        @NameInMap("InstanceEndpoint")
        public String instanceEndpoint;

        /**
         * <p>The ID of the Message Queue for Apache RocketMQ instance. For more information, see Limits.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>None.</p>
         */
        @NameInMap("InstanceNetwork")
        public String instanceNetwork;

        @NameInMap("InstancePassword")
        public String instancePassword;

        /**
         * <p>The ID of the security group to which the Message Queue for Apache RocketMQ instance belongs.</p>
         */
        @NameInMap("InstanceSecurityGroupId")
        public String instanceSecurityGroupId;

        /**
         * <p>The type of the Message Queue for Apache RocketMQ instance. Valid values:</p>
         * <br>
         * <br>
         * <p>- Cloud\_4: Message Queue for Apache RocketMQ 4.0 instances.</p>
         * <br>
         * <p> - Cloud\_5: Message Queue for Apache RocketMQ 5.0 instances.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceUsername")
        public String instanceUsername;

        /**
         * <p>The ID of the vSwitch with which the Message Queue for Apache RocketMQ instance is associated.</p>
         */
        @NameInMap("InstanceVSwitchIds")
        public String instanceVSwitchIds;

        /**
         * <p>The ID of the virtual private cloud (VPC) in which the Message Queue for Apache RocketMQ instance resides.</p>
         */
        @NameInMap("InstanceVpcId")
        public String instanceVpcId;

        /**
         * <p>The offset from which messages are consumed. Valid values: CONSUME_FROM_LAST_OFFSET: Messages are consumed from the latest offset. CONSUME_FROM_FIRST_OFFSET: Messages are consumed from the earliest offset. CONSUME_FROM_TIMESTAMP: Messages are consumed from the offset at the specified point in time. Default value: CONSUME_FROM_LAST_OFFSET.</p>
         */
        @NameInMap("Offset")
        public String offset;

        /**
         * <p>The region in which the Message Queue for Apache RocketMQ instance resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The tags that are used to filter messages.</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The timestamp that specifies the time from which messages are consumed. This parameter is valid only if you set Offset to CONSUME_FROM_TIMESTAMP.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The name of the topic in the Message Queue for Apache RocketMQ instance. For more information, see Limits.</p>
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
         * <p>The starting consumer offset. The value begin specifies the earliest offset, and the value end specifies the latest offset. You can also specify a time in seconds to start consumption.</p>
         */
        @NameInMap("ConsumePosition")
        public String consumePosition;

        /**
         * <p>The Log Service Logstore.</p>
         */
        @NameInMap("LogStore")
        public String logStore;

        /**
         * <p>The Log Service project.</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The role name. If you want to authorize EventBridge to use this role to read logs in Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the Resource Access Management (RAM) console. For information about the permission policy of this role, see Create a custom event source of the Log Service type.</p>
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
         * <p>The Cron expression.</p>
         */
        @NameInMap("Schedule")
        public String schedule;

        /**
         * <p>The time zone in which the Cron expression is executed.</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

        @NameInMap("UserData")
        public java.util.Map<String, ?> userData;

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

        public CreateEventSourceRequestSourceScheduledEventParameters setUserData(java.util.Map<String, ?> userData) {
            this.userData = userData;
            return this;
        }
        public java.util.Map<String, ?> getUserData() {
            return this.userData;
        }

    }

}
