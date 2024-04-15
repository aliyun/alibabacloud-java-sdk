// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class SourceKafkaParameters extends TeaModel {
    @NameInMap("ConsumerGroup")
    public String consumerGroup;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Network")
    public String network;

    @NameInMap("OffsetReset")
    public String offsetReset;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("Topic")
    public String topic;

    @NameInMap("VSwitchIds")
    public String vSwitchIds;

    @NameInMap("VpcId")
    public String vpcId;

    public static SourceKafkaParameters build(java.util.Map<String, ?> map) throws Exception {
        SourceKafkaParameters self = new SourceKafkaParameters();
        return TeaModel.build(map, self);
    }

    public SourceKafkaParameters setConsumerGroup(String consumerGroup) {
        this.consumerGroup = consumerGroup;
        return this;
    }
    public String getConsumerGroup() {
        return this.consumerGroup;
    }

    public SourceKafkaParameters setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SourceKafkaParameters setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public SourceKafkaParameters setOffsetReset(String offsetReset) {
        this.offsetReset = offsetReset;
        return this;
    }
    public String getOffsetReset() {
        return this.offsetReset;
    }

    public SourceKafkaParameters setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SourceKafkaParameters setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public SourceKafkaParameters setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public SourceKafkaParameters setVSwitchIds(String vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

    public SourceKafkaParameters setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
