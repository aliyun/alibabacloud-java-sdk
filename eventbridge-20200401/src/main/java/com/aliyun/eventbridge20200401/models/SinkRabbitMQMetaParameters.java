// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SinkRabbitMQMetaParameters extends TeaModel {
    /**
     * <p>The endpoint of the ApsaraMQ for RabbitMQ cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>rabbitmq-cn-a1b2c3d4e5f-cn-hangzhou-vpc.amqp.aliyuncs.com</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rabbitmq-cn-a1b2c3d4e5f</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the ApsaraMQ for RabbitMQ instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Cloud</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The network type used to connect to the ApsaraMQ for RabbitMQ instance.</p>
     * 
     * <strong>example:</strong>
     * <p>PrivateNetwork</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The password used to connect to the ApsaraMQ for RabbitMQ cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>yourPassword</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The ID of the security group to which the servers of the ApsaraMQ for RabbitMQ cluster belong.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-a1b2c3d4e5f6g7h8i9j0</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The username used to connect to the ApsaraMQ for RabbitMQ cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The IDs of the vSwitches in the VPC where the ApsaraMQ for RabbitMQ cluster is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-a1b2c3d4e5f6g7h8i9j0k</p>
     */
    @NameInMap("VSwitchIds")
    public String vSwitchIds;

    /**
     * <p>The name of the virtual host (vhost) in the ApsaraMQ for RabbitMQ cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>test-001</p>
     */
    @NameInMap("VirtualHostName")
    public String virtualHostName;

    /**
     * <p>The ID of the VPC where the ApsaraMQ for RabbitMQ cluster is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-a1b2c3d4e5f6g7h8i9j0k</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static SinkRabbitMQMetaParameters build(java.util.Map<String, ?> map) throws Exception {
        SinkRabbitMQMetaParameters self = new SinkRabbitMQMetaParameters();
        return TeaModel.build(map, self);
    }

    public SinkRabbitMQMetaParameters setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public SinkRabbitMQMetaParameters setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SinkRabbitMQMetaParameters setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public SinkRabbitMQMetaParameters setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public SinkRabbitMQMetaParameters setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public SinkRabbitMQMetaParameters setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public SinkRabbitMQMetaParameters setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public SinkRabbitMQMetaParameters setVSwitchIds(String vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

    public SinkRabbitMQMetaParameters setVirtualHostName(String virtualHostName) {
        this.virtualHostName = virtualHostName;
        return this;
    }
    public String getVirtualHostName() {
        return this.virtualHostName;
    }

    public SinkRabbitMQMetaParameters setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
