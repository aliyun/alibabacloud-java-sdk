// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class SourceKafkaParameters extends TeaModel {
    /**
     * <p>The group ID of the consumer that subscribes to the topic.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT_GROUP</p>
     */
    @NameInMap("ConsumerGroup")
    public String consumerGroup;

    /**
     * <p>The ID of the EventBridge instance.</p>
     * 
     * <strong>example:</strong>
     * <p>r-8vb64581862c****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The network type. Default value: Default. The value PublicNetwork specifies a virtual private cloud (VPC) network.</p>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("Network")
    public String network;

    /**
     * <p>The offset. earliest: consumes messages from the earliest offset. latest: consumes messages from the latest offset.</p>
     * 
     * <strong>example:</strong>
     * <p>latest</p>
     */
    @NameInMap("OffsetReset")
    public String offsetReset;

    /**
     * <p>The region in which the ApsaraMQ for Kafka instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1iv19sp1msc7zot4****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The name of the topic in the ApsaraMQ for Kafka instance.</p>
     * 
     * <strong>example:</strong>
     * <p>popvip_center_robot_order</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <p>The ID of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp179l3llg3jjxwrq72****</p>
     */
    @NameInMap("VSwitchIds")
    public String vSwitchIds;

    /**
     * <p>The ID of the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-8vblalsi0vbhizr77****</p>
     */
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
