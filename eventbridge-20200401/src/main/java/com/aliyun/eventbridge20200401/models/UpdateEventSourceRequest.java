// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateEventSourceRequest extends TeaModel {
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
    public UpdateEventSourceRequestSourceHttpEventParameters sourceHttpEventParameters;

    @NameInMap("SourceMNSParameters")
    public UpdateEventSourceRequestSourceMNSParameters sourceMNSParameters;

    @NameInMap("SourceRabbitMQParameters")
    public UpdateEventSourceRequestSourceRabbitMQParameters sourceRabbitMQParameters;

    @NameInMap("SourceRocketMQParameters")
    public UpdateEventSourceRequestSourceRocketMQParameters sourceRocketMQParameters;

    /**
     * <p>SourceSLSParameters</p>
     */
    @NameInMap("SourceSLSParameters")
    public UpdateEventSourceRequestSourceSLSParameters sourceSLSParameters;

    public static UpdateEventSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventSourceRequest self = new UpdateEventSourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEventSourceRequest setDescription(byte[] description) {
        this.description = description;
        return this;
    }
    public byte[] getDescription() {
        return this.description;
    }

    public UpdateEventSourceRequest setEventBusName(byte[] eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public byte[] getEventBusName() {
        return this.eventBusName;
    }

    public UpdateEventSourceRequest setEventSourceName(byte[] eventSourceName) {
        this.eventSourceName = eventSourceName;
        return this;
    }
    public byte[] getEventSourceName() {
        return this.eventSourceName;
    }

    public UpdateEventSourceRequest setSourceHttpEventParameters(UpdateEventSourceRequestSourceHttpEventParameters sourceHttpEventParameters) {
        this.sourceHttpEventParameters = sourceHttpEventParameters;
        return this;
    }
    public UpdateEventSourceRequestSourceHttpEventParameters getSourceHttpEventParameters() {
        return this.sourceHttpEventParameters;
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

    public static class UpdateEventSourceRequestSourceHttpEventParameters extends TeaModel {
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

    public static class UpdateEventSourceRequestSourceMNSParameters extends TeaModel {
        @NameInMap("IsBase64Decode")
        public String isBase64Decode;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("RegionId")
        public String regionId;

        public static UpdateEventSourceRequestSourceMNSParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventSourceRequestSourceMNSParameters self = new UpdateEventSourceRequestSourceMNSParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventSourceRequestSourceMNSParameters setIsBase64Decode(String isBase64Decode) {
            this.isBase64Decode = isBase64Decode;
            return this;
        }
        public String getIsBase64Decode() {
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
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("RegionId")
        public String regionId;

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

        public static UpdateEventSourceRequestSourceRocketMQParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateEventSourceRequestSourceRocketMQParameters self = new UpdateEventSourceRequestSourceRocketMQParameters();
            return TeaModel.build(map, self);
        }

        public UpdateEventSourceRequestSourceRocketMQParameters setGroupID(String groupID) {
            this.groupID = groupID;
            return this;
        }
        public String getGroupID() {
            return this.groupID;
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

        public UpdateEventSourceRequestSourceRocketMQParameters setTimestamp(Float timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Float getTimestamp() {
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
        @NameInMap("ConsumePosition")
        public String consumePosition;

        @NameInMap("LogStore")
        public String logStore;

        @NameInMap("Project")
        public String project;

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

}
