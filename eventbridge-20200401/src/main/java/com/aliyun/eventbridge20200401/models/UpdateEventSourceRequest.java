// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateEventSourceRequest extends TeaModel {
    /**
     * <p>The description of the event source.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The event bus with which the event source is associated.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>The name of the event source.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventSourceName")
    public String eventSourceName;

    /**
     * <p>The parameters that are configured if the event source is HTTP events.</p>
     */
    @NameInMap("SourceHttpEventParameters")
    public UpdateEventSourceRequestSourceHttpEventParameters sourceHttpEventParameters;

    /**
     * <p>The parameters that are configured if the event source is Message Queue for Apache Kafka.</p>
     */
    @NameInMap("SourceKafkaParameters")
    public UpdateEventSourceRequestSourceKafkaParameters sourceKafkaParameters;

    /**
     * <p>The parameters that are configured if the event source is Message Service (MNS).</p>
     */
    @NameInMap("SourceMNSParameters")
    public UpdateEventSourceRequestSourceMNSParameters sourceMNSParameters;

    /**
     * <p>The parameters that are configured if the event source is Message Queue for RabbitMQ.</p>
     */
    @NameInMap("SourceRabbitMQParameters")
    public UpdateEventSourceRequestSourceRabbitMQParameters sourceRabbitMQParameters;

    /**
     * <p>The parameters that are configured if the event source is Message Queue for Apache RocketMQ.</p>
     */
    @NameInMap("SourceRocketMQParameters")
    public UpdateEventSourceRequestSourceRocketMQParameters sourceRocketMQParameters;

    /**
     * <p>SourceSLSParameters</p>
     */
    @NameInMap("SourceSLSParameters")
    public UpdateEventSourceRequestSourceSLSParameters sourceSLSParameters;

    /**
     * <p>The parameters that are configured if you specify scheduled events as the event source.</p>
     */
    @NameInMap("SourceScheduledEventParameters")
    public UpdateEventSourceRequestSourceScheduledEventParameters sourceScheduledEventParameters;

    public static UpdateEventSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventSourceRequest self = new UpdateEventSourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEventSourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEventSourceRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public UpdateEventSourceRequest setEventSourceName(String eventSourceName) {
        this.eventSourceName = eventSourceName;
        return this;
    }
    public String getEventSourceName() {
        return this.eventSourceName;
    }

    public UpdateEventSourceRequest setSourceHttpEventParameters(UpdateEventSourceRequestSourceHttpEventParameters sourceHttpEventParameters) {
        this.sourceHttpEventParameters = sourceHttpEventParameters;
        return this;
    }
    public UpdateEventSourceRequestSourceHttpEventParameters getSourceHttpEventParameters() {
        return this.sourceHttpEventParameters;
    }

    public UpdateEventSourceRequest setSourceKafkaParameters(UpdateEventSourceRequestSourceKafkaParameters sourceKafkaParameters) {
        this.sourceKafkaParameters = sourceKafkaParameters;
        return this;
    }
    public UpdateEventSourceRequestSourceKafkaParameters getSourceKafkaParameters() {
        return this.sourceKafkaParameters;
    }

    public UpdateEventSourceRequest setSourceMNSParameters(UpdateEventSourceRequestSourceMNSParameters sourceMNSParameters) {
        this.sourceMNSParameters = sourceMNSParameters;
        return this;
    }
    public UpdateEventSourceRequestSourceMNSParameters getSourceMNSParameters() {
        return this.sourceMNSParameters;
    }

    public UpdateEventSourceRequest setSourceRabbitMQParameters(UpdateEventSourceRequestSourceRabbitMQParameters sourceRabbitMQParameters) {
        this.sourceRabbitMQParameters = sourceRabbitMQParameters;
        return this;
    }
    public UpdateEventSourceRequestSourceRabbitMQParameters getSourceRabbitMQParameters() {
        return this.sourceRabbitMQParameters;
    }

    public UpdateEventSourceRequest setSourceRocketMQParameters(UpdateEventSourceRequestSourceRocketMQParameters sourceRocketMQParameters) {
        this.sourceRocketMQParameters = sourceRocketMQParameters;
        return this;
    }
    public UpdateEventSourceRequestSourceRocketMQParameters getSourceRocketMQParameters() {
        return this.sourceRocketMQParameters;
    }

    public UpdateEventSourceRequest setSourceSLSParameters(UpdateEventSourceRequestSourceSLSParameters sourceSLSParameters) {
        this.sourceSLSParameters = sourceSLSParameters;
        return this;
    }
    public UpdateEventSourceRequestSourceSLSParameters getSourceSLSParameters() {
        return this.sourceSLSParameters;
    }

    public UpdateEventSourceRequest setSourceScheduledEventParameters(UpdateEventSourceRequestSourceScheduledEventParameters sourceScheduledEventParameters) {
        this.sourceScheduledEventParameters = sourceScheduledEventParameters;
        return this;
    }
    public UpdateEventSourceRequestSourceScheduledEventParameters getSourceScheduledEventParameters() {
        return this.sourceScheduledEventParameters;
    }

    public static class UpdateEventSourceRequestSourceHttpEventParameters extends TeaModel {
        /**
         * <p>The CIDR block that is used for security settings. This parameter is required only if SecurityConfig is set to ip. You can enter a CIDR block or an IP address.</p>
         */
        @NameInMap("Ip")
        public java.util.List<String> ip;

        /**
         * <p>The HTTP request method supported by the generated webhook URL. You can select multiple values. Valid values:</p>
         * <br>
         * <p>*   GET</p>
         * <p>*   POST</p>
         * <p>*   PUT</p>
         * <p>*   PATCH</p>
         * <p>*   DELETE</p>
         * <p>*   HEAD</p>
         * <p>*   OPTIONS</p>
         * <p>*   TRACE</p>
         * <p>*   CONNECT</p>
         */
        @NameInMap("Method")
        public java.util.List<String> method;

        /**
         * <p>The security domain name. This parameter is required only if SecurityConfig is set to referer. You can enter a domain name.</p>
         */
        @NameInMap("Referer")
        public java.util.List<String> referer;

        /**
         * <p>The type of security settings. Valid values:</p>
         * <br>
         * <p>*   none: No configuration is required.</p>
         * <p>*   ip: CIDR block.</p>
         * <p>*   referer: security domain name.</p>
         */
        @NameInMap("SecurityConfig")
        public String securityConfig;

        /**
         * <p>The protocol type that is supported by the generated webhook URL. Valid values:</p>
         * <br>
         * <p>*   HTTP</p>
         * <p>*   HTTPS</p>
         * <p>*   HTTP\\&HTTPS</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateEventSourceRequestSourceHttpEventParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventSourceRequestSourceHttpEventParameters self = new UpdateEventSourceRequestSourceHttpEventParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventSourceRequestSourceHttpEventParameters setIp(java.util.List<String> ip) {
            this.ip = ip;
            return this;
        }
        public java.util.List<String> getIp() {
            return this.ip;
        }

        public UpdateEventSourceRequestSourceHttpEventParameters setMethod(java.util.List<String> method) {
            this.method = method;
            return this;
        }
        public java.util.List<String> getMethod() {
            return this.method;
        }

        public UpdateEventSourceRequestSourceHttpEventParameters setReferer(java.util.List<String> referer) {
            this.referer = referer;
            return this;
        }
        public java.util.List<String> getReferer() {
            return this.referer;
        }

        public UpdateEventSourceRequestSourceHttpEventParameters setSecurityConfig(String securityConfig) {
            this.securityConfig = securityConfig;
            return this;
        }
        public String getSecurityConfig() {
            return this.securityConfig;
        }

        public UpdateEventSourceRequestSourceHttpEventParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateEventSourceRequestSourceKafkaParameters extends TeaModel {
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
         * <p>The network. Valid values: Default and PublicNetwork. Default value: Default. The value PublicNetwork indicates a self-managed network.</p>
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
         * <p>The ID of the security group to which the Message Queue for Apache Kafka instance belongs. This parameter is required only if you set Network to PublicNetwork.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The name of the topic on the Message Queue for Apache Kafka instance.</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The ID of the vSwitch with which the Message Queue for Apache Kafka instance is associated. This parameter is required only if you set Network to PublicNetwork.</p>
         */
        @NameInMap("VSwitchIds")
        public String vSwitchIds;

        /**
         * <p>The ID of the VPC in which the Message Queue for Apache Kafka instance resides. This parameter is required only if you set Network to PublicNetwork.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static UpdateEventSourceRequestSourceKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventSourceRequestSourceKafkaParameters self = new UpdateEventSourceRequestSourceKafkaParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventSourceRequestSourceKafkaParameters setConsumerGroup(String consumerGroup) {
            this.consumerGroup = consumerGroup;
            return this;
        }
        public String getConsumerGroup() {
            return this.consumerGroup;
        }

        public UpdateEventSourceRequestSourceKafkaParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateEventSourceRequestSourceKafkaParameters setMaximumTasks(Integer maximumTasks) {
            this.maximumTasks = maximumTasks;
            return this;
        }
        public Integer getMaximumTasks() {
            return this.maximumTasks;
        }

        public UpdateEventSourceRequestSourceKafkaParameters setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public UpdateEventSourceRequestSourceKafkaParameters setOffsetReset(String offsetReset) {
            this.offsetReset = offsetReset;
            return this;
        }
        public String getOffsetReset() {
            return this.offsetReset;
        }

        public UpdateEventSourceRequestSourceKafkaParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateEventSourceRequestSourceKafkaParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateEventSourceRequestSourceKafkaParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public UpdateEventSourceRequestSourceKafkaParameters setVSwitchIds(String vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public String getVSwitchIds() {
            return this.vSwitchIds;
        }

        public UpdateEventSourceRequestSourceKafkaParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class UpdateEventSourceRequestSourceMNSParameters extends TeaModel {
        /**
         * <p>Indicates whether Base64 decoding is enabled. By default, Base64 decoding is enabled.</p>
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

        public static UpdateEventSourceRequestSourceMNSParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventSourceRequestSourceMNSParameters self = new UpdateEventSourceRequestSourceMNSParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventSourceRequestSourceMNSParameters setIsBase64Decode(Boolean isBase64Decode) {
            this.isBase64Decode = isBase64Decode;
            return this;
        }
        public Boolean getIsBase64Decode() {
            return this.isBase64Decode;
        }

        public UpdateEventSourceRequestSourceMNSParameters setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public UpdateEventSourceRequestSourceMNSParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class UpdateEventSourceRequestSourceRabbitMQParameters extends TeaModel {
        /**
         * <p>The ID of the Message Queue for RabbitMQ instance. For more information, see [Limits](https://help.aliyun.com/document_detail/163289.html).</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the queue on the Message Queue for RabbitMQ instance. For more information, see [Limits](https://help.aliyun.com/document_detail/163289.html).</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The ID of the region where the Message Queue for RabbitMQ instance resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the vhost of the Message Queue for RabbitMQ instance. For more information, see [Limits](https://help.aliyun.com/document_detail/163289.html).</p>
         */
        @NameInMap("VirtualHostName")
        public String virtualHostName;

        public static UpdateEventSourceRequestSourceRabbitMQParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventSourceRequestSourceRabbitMQParameters self = new UpdateEventSourceRequestSourceRabbitMQParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventSourceRequestSourceRabbitMQParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateEventSourceRequestSourceRabbitMQParameters setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public UpdateEventSourceRequestSourceRabbitMQParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateEventSourceRequestSourceRabbitMQParameters setVirtualHostName(String virtualHostName) {
            this.virtualHostName = virtualHostName;
            return this;
        }
        public String getVirtualHostName() {
            return this.virtualHostName;
        }

    }

    public static class UpdateEventSourceRequestSourceRocketMQParameters extends TeaModel {
        /**
         * <p>The authentication type. You can set this parameter to ACL or leave this parameter empty.</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The ID of the consumer group on the Message Queue for Apache RocketMQ instance.</p>
         */
        @NameInMap("GroupID")
        public String groupID;

        /**
         * <p>The endpoint that is used to access the Message Queue for Apache RocketMQ instance.</p>
         */
        @NameInMap("InstanceEndpoint")
        public String instanceEndpoint;

        /**
         * <p>The ID of the Message Queue for Apache RocketMQ instance. For more information, see [Limits](https://help.aliyun.com/document_detail/163289.html).</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>None.</p>
         */
        @NameInMap("InstanceNetwork")
        public String instanceNetwork;

        /**
         * <p>The password that is used to access the Message Queue for Apache RocketMQ instance.</p>
         */
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
         * <p>*   Cloud_4: Message Queue for Apache RocketMQ 4.0 instance.</p>
         * <p>*   Cloud_5: Message Queue for Apache RocketMQ 5.0 instance.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The username that is used to access the Message Queue for Apache RocketMQ instance.</p>
         */
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
         * <p>The offset from which message consumption starts. Valid values:</p>
         * <br>
         * <p>*   CONSUME_FROM_LAST_OFFSET: Start message consumption from the latest offset.</p>
         * <p>*   CONSUME_FROM_FIRST_OFFSET: Start message consumption from the earliest offset.</p>
         * <p>*   CONSUME_FROM_TIMESTAMP: Start message consumption from the offset at the specified point in time.</p>
         * <br>
         * <p>Default value: CONSUME_FROM_LAST_OFFSET.</p>
         */
        @NameInMap("Offset")
        public String offset;

        /**
         * <p>The region where the Message Queue for Apache RocketMQ instance resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The tag that is used to filter messages.</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The timestamp that specifies the time from which messages are consumed. This parameter is valid only if you set Offset to CONSUME_FROM_TIMESTAMP.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The name of the topic on the Message Queue for Apache RocketMQ instance. For more information, see [Limits](https://help.aliyun.com/document_detail/163289.html).</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static UpdateEventSourceRequestSourceRocketMQParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventSourceRequestSourceRocketMQParameters self = new UpdateEventSourceRequestSourceRocketMQParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventSourceRequestSourceRocketMQParameters setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public UpdateEventSourceRequestSourceRocketMQParameters setGroupID(String groupID) {
            this.groupID = groupID;
            return this;
        }
        public String getGroupID() {
            return this.groupID;
        }

        public UpdateEventSourceRequestSourceRocketMQParameters setInstanceEndpoint(String instanceEndpoint) {
            this.instanceEndpoint = instanceEndpoint;
            return this;
        }
        public String getInstanceEndpoint() {
            return this.instanceEndpoint;
        }

        public UpdateEventSourceRequestSourceRocketMQParameters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateEventSourceRequestSourceRocketMQParameters setInstanceNetwork(String instanceNetwork) {
            this.instanceNetwork = instanceNetwork;
            return this;
        }
        public String getInstanceNetwork() {
            return this.instanceNetwork;
        }

        public UpdateEventSourceRequestSourceRocketMQParameters setInstancePassword(String instancePassword) {
            this.instancePassword = instancePassword;
            return this;
        }
        public String getInstancePassword() {
            return this.instancePassword;
        }

        public UpdateEventSourceRequestSourceRocketMQParameters setInstanceSecurityGroupId(String instanceSecurityGroupId) {
            this.instanceSecurityGroupId = instanceSecurityGroupId;
            return this;
        }
        public String getInstanceSecurityGroupId() {
            return this.instanceSecurityGroupId;
        }

        public UpdateEventSourceRequestSourceRocketMQParameters setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public UpdateEventSourceRequestSourceRocketMQParameters setInstanceUsername(String instanceUsername) {
            this.instanceUsername = instanceUsername;
            return this;
        }
        public String getInstanceUsername() {
            return this.instanceUsername;
        }

        public UpdateEventSourceRequestSourceRocketMQParameters setInstanceVSwitchIds(String instanceVSwitchIds) {
            this.instanceVSwitchIds = instanceVSwitchIds;
            return this;
        }
        public String getInstanceVSwitchIds() {
            return this.instanceVSwitchIds;
        }

        public UpdateEventSourceRequestSourceRocketMQParameters setInstanceVpcId(String instanceVpcId) {
            this.instanceVpcId = instanceVpcId;
            return this;
        }
        public String getInstanceVpcId() {
            return this.instanceVpcId;
        }

        public UpdateEventSourceRequestSourceRocketMQParameters setOffset(String offset) {
            this.offset = offset;
            return this;
        }
        public String getOffset() {
            return this.offset;
        }

        public UpdateEventSourceRequestSourceRocketMQParameters setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateEventSourceRequestSourceRocketMQParameters setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public UpdateEventSourceRequestSourceRocketMQParameters setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public UpdateEventSourceRequestSourceRocketMQParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class UpdateEventSourceRequestSourceSLSParameters extends TeaModel {
        /**
         * <p>The starting consumer offset. The value begin indicates the earliest offset, and the value end indicates the latest offset. You can also specify a time in seconds to start consumption.</p>
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
         * <p>The role name. If you want to authorize EventBridge to use this role to read logs in Log Service, you must select Alibaba Cloud Service for Selected Trusted Entity and EventBridge for Select Trusted Service when you create the role in the RAM console. For information about the permission policy of this role, see Create a custom event source of the Log Service type.</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        public static UpdateEventSourceRequestSourceSLSParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventSourceRequestSourceSLSParameters self = new UpdateEventSourceRequestSourceSLSParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventSourceRequestSourceSLSParameters setConsumePosition(String consumePosition) {
            this.consumePosition = consumePosition;
            return this;
        }
        public String getConsumePosition() {
            return this.consumePosition;
        }

        public UpdateEventSourceRequestSourceSLSParameters setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

        public UpdateEventSourceRequestSourceSLSParameters setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public UpdateEventSourceRequestSourceSLSParameters setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class UpdateEventSourceRequestSourceScheduledEventParameters extends TeaModel {
        /**
         * <p>The cron expression.</p>
         */
        @NameInMap("Schedule")
        public String schedule;

        /**
         * <p>The time zone in which the cron expression is executed.</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

        @NameInMap("UserData")
        public String userData;

        public static UpdateEventSourceRequestSourceScheduledEventParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventSourceRequestSourceScheduledEventParameters self = new UpdateEventSourceRequestSourceScheduledEventParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventSourceRequestSourceScheduledEventParameters setSchedule(String schedule) {
            this.schedule = schedule;
            return this;
        }
        public String getSchedule() {
            return this.schedule;
        }

        public UpdateEventSourceRequestSourceScheduledEventParameters setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public UpdateEventSourceRequestSourceScheduledEventParameters setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
