// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateEventSourceRequest extends TeaModel {
    /**
     * <p>事件源描述详情</p>
     */
    @NameInMap("Description")
    public byte[] description;

    @NameInMap("EventBusName")
    public byte[] eventBusName;

    /**
     * <p>事件源英文Code</p>
     */
    @NameInMap("EventSourceName")
    public byte[] eventSourceName;

    @NameInMap("SourceHttpEventParameters")
    public CreateEventSourceRequestSourceHttpEventParameters sourceHttpEventParameters;

    @NameInMap("SourceMNSParameters")
    public CreateEventSourceRequestSourceMNSParameters sourceMNSParameters;

    @NameInMap("SourceRabbitMQParameters")
    public CreateEventSourceRequestSourceRabbitMQParameters sourceRabbitMQParameters;

    @NameInMap("SourceRocketMQParameters")
    public CreateEventSourceRequestSourceRocketMQParameters sourceRocketMQParameters;

    /**
     * <p>SourceSLSParameters</p>
     */
    @NameInMap("SourceSLSParameters")
    public CreateEventSourceRequestSourceSLSParameters sourceSLSParameters;

    public static CreateEventSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEventSourceRequest self = new CreateEventSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateEventSourceRequest setDescription(byte[] description) {
        this.description = description;
        return this;
    }
    public byte[] getDescription() {
        return this.description;
    }

    public CreateEventSourceRequest setEventBusName(byte[] eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public byte[] getEventBusName() {
        return this.eventBusName;
    }

    public CreateEventSourceRequest setEventSourceName(byte[] eventSourceName) {
        this.eventSourceName = eventSourceName;
        return this;
    }
    public byte[] getEventSourceName() {
        return this.eventSourceName;
    }

    public CreateEventSourceRequest setSourceHttpEventParameters(CreateEventSourceRequestSourceHttpEventParameters sourceHttpEventParameters) {
        this.sourceHttpEventParameters = sourceHttpEventParameters;
        return this;
    }
    public CreateEventSourceRequestSourceHttpEventParameters getSourceHttpEventParameters() {
        return this.sourceHttpEventParameters;
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

    public static class CreateEventSourceRequestSourceHttpEventParameters extends TeaModel {
        @NameInMap("Ip")
        public java.util.List<String> ip;

        @NameInMap("Method")
        public java.util.List<String> method;

        @NameInMap("Referer")
        public java.util.List<String> referer;

        @NameInMap("SecurityConfig")
        public String securityConfig;

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

    public static class CreateEventSourceRequestSourceMNSParameters extends TeaModel {
        @NameInMap("IsBase64Decode")
        public String isBase64Decode;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("RegionId")
        public String regionId;

        public static CreateEventSourceRequestSourceMNSParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventSourceRequestSourceMNSParameters self = new CreateEventSourceRequestSourceMNSParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventSourceRequestSourceMNSParameters setIsBase64Decode(String isBase64Decode) {
            this.isBase64Decode = isBase64Decode;
            return this;
        }
        public String getIsBase64Decode() {
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
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("RegionId")
        public String regionId;

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
        @NameInMap("GroupID")
        public String groupID;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceNetwork")
        public String instanceNetwork;

        @NameInMap("InstanceSecurityGroupId")
        public String instanceSecurityGroupId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceVSwitchIds")
        public String instanceVSwitchIds;

        @NameInMap("InstanceVpcId")
        public String instanceVpcId;

        @NameInMap("Offset")
        public String offset;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Timestamp")
        public Float timestamp;

        @NameInMap("Topic")
        public String topic;

        public static CreateEventSourceRequestSourceRocketMQParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateEventSourceRequestSourceRocketMQParameters self = new CreateEventSourceRequestSourceRocketMQParameters();
            return TeaModel.build(map, self);
        }

        public CreateEventSourceRequestSourceRocketMQParameters setGroupID(String groupID) {
            this.groupID = groupID;
            return this;
        }
        public String getGroupID() {
            return this.groupID;
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

        public CreateEventSourceRequestSourceRocketMQParameters setTimestamp(Float timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Float getTimestamp() {
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
        @NameInMap("ConsumePosition")
        public String consumePosition;

        @NameInMap("LogStore")
        public String logStore;

        @NameInMap("Project")
        public String project;

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

}
