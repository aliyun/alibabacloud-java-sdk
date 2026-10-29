// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SourceRabbitMQMetaParameters extends TeaModel {
    /**
     * <p>The access endpoint of the RabbitMQ cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>rabbitmq-cn-a1b2c3d4e5f-cn-hangzhou-vpc.amqp.aliyuncs.com</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The added suffix.</p>
     * 
     * <strong>example:</strong>
     * <p>rabbitmq-cn-a1b2c3d4e5f_example_123e4567-e89b-42d3-a456-426614174000</p>
     */
    @NameInMap("InnerNameSuffix")
    public String innerNameSuffix;

    /**
     * <p>The ID of the ApsaraMQ for RabbitMQ (MSMQ message queue) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rabbitmq-cn-a1b2c3d4e5f</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the source RabbitMQ instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Cloud</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The maximum number of hops allowed for message forwarding in a federation task. Messages that exceed this limit are dropped.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxHops")
    public String maxHops;

    /**
     * <p>The network type.</p>
     * 
     * <strong>example:</strong>
     * <p>PrivateNetwork</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>Specifies whether to consume messages in order.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OrderConsume")
    public String orderConsume;

    /**
     * <p>The password used to connect to the RabbitMQ cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>yourPassword</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The regular expression used to filter exchanges.</p>
     * 
     * <strong>example:</strong>
     * <p>^example_.*</p>
     */
    @NameInMap("Regex")
    public String regex;

    /**
     * <p>The ID of the security group to which the machines of the RabbitMQ cluster belong.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The type of synchronized metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>queue</p>
     */
    @NameInMap("SyncMetaType")
    public String syncMetaType;

    /**
     * <p>The username used to connect to the RabbitMQ cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The ID of the vSwitch in the VPC where the RabbitMQ cluster resides.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1****</p>
     */
    @NameInMap("VSwitchIds")
    public String vSwitchIds;

    /**
     * <p>The name of the virtual host (vhost) in the RabbitMQ cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>test-001</p>
     */
    @NameInMap("VirtualHostName")
    public String virtualHostName;

    /**
     * <p>The ID of the VPC where the RabbitMQ cluster resides.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-8vb****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static SourceRabbitMQMetaParameters build(java.util.Map<String, ?> map) throws Exception {
        SourceRabbitMQMetaParameters self = new SourceRabbitMQMetaParameters();
        return TeaModel.build(map, self);
    }

    public SourceRabbitMQMetaParameters setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public SourceRabbitMQMetaParameters setInnerNameSuffix(String innerNameSuffix) {
        this.innerNameSuffix = innerNameSuffix;
        return this;
    }
    public String getInnerNameSuffix() {
        return this.innerNameSuffix;
    }

    public SourceRabbitMQMetaParameters setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SourceRabbitMQMetaParameters setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public SourceRabbitMQMetaParameters setMaxHops(String maxHops) {
        this.maxHops = maxHops;
        return this;
    }
    public String getMaxHops() {
        return this.maxHops;
    }

    public SourceRabbitMQMetaParameters setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public SourceRabbitMQMetaParameters setOrderConsume(String orderConsume) {
        this.orderConsume = orderConsume;
        return this;
    }
    public String getOrderConsume() {
        return this.orderConsume;
    }

    public SourceRabbitMQMetaParameters setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public SourceRabbitMQMetaParameters setRegex(String regex) {
        this.regex = regex;
        return this;
    }
    public String getRegex() {
        return this.regex;
    }

    public SourceRabbitMQMetaParameters setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public SourceRabbitMQMetaParameters setSyncMetaType(String syncMetaType) {
        this.syncMetaType = syncMetaType;
        return this;
    }
    public String getSyncMetaType() {
        return this.syncMetaType;
    }

    public SourceRabbitMQMetaParameters setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public SourceRabbitMQMetaParameters setVSwitchIds(String vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

    public SourceRabbitMQMetaParameters setVirtualHostName(String virtualHostName) {
        this.virtualHostName = virtualHostName;
        return this;
    }
    public String getVirtualHostName() {
        return this.virtualHostName;
    }

    public SourceRabbitMQMetaParameters setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
