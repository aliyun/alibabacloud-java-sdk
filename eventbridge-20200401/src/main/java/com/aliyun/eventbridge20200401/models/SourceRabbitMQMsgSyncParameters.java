// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SourceRabbitMQMsgSyncParameters extends TeaModel {
    /**
     * <p>The data type of the message body.</p>
     * 
     * <strong>example:</strong>
     * <p>json</p>
     */
    @NameInMap("BodyDataType")
    public String bodyDataType;

    /**
     * <p>The ID of the RabbitMQ cloud migration task.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-42d3-a456-426614174000</p>
     */
    @NameInMap("CloudMigrationTaskId")
    public String cloudMigrationTaskId;

    /**
     * <p>The address of the destination cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>rabbitmq-cn-hangzhou-2x***.com</p>
     */
    @NameInMap("DstClusterHost")
    public String dstClusterHost;

    /**
     * <p>The type of the destination RabbitMQ cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>Cloud</p>
     */
    @NameInMap("DstClusterType")
    public String dstClusterType;

    /**
     * <p>The endpoint of the RabbitMQ cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.2.10</p>
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
     * <p>The type of the source RabbitMQ instance.</p>
     * 
     * <strong>example:</strong>
     * <p>SelfBuilt</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The network type used to connect to the source RabbitMQ instance.</p>
     * 
     * <strong>example:</strong>
     * <p>PrivateNetwork</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>Specifies whether SAC is enabled. Do not specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Leave empty</p>
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
     * <p>The prefetch count.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PrefetchCount")
    public String prefetchCount;

    /**
     * <p>The regular expression for matching. Do not specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Leave empty</p>
     */
    @NameInMap("Regex")
    public String regex;

    /**
     * <p>The ID of the security group to which the machines of the RabbitMQ cluster belong.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-a1b2c3d4e5f6g7h8i9j0</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The address of the source cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>rabbitmq-cn-hangzhou-2x***.com</p>
     */
    @NameInMap("SrcClusterHost")
    public String srcClusterHost;

    /**
     * <p>The type of the source RabbitMQ cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>SelfBuilt</p>
     */
    @NameInMap("SrcClusterType")
    public String srcClusterType;

    /**
     * <p>The type of metadata to synchronize. Do not specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
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
     * <p>The IDs of the vSwitches in the VPC where the RabbitMQ cluster is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-a1b2c3d4e5f6g7h8i9j0k</p>
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
     * <p>The ID of the VPC where the RabbitMQ cluster is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-a1b2c3d4e5f6g7h8i9j0k</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static SourceRabbitMQMsgSyncParameters build(java.util.Map<String, ?> map) throws Exception {
        SourceRabbitMQMsgSyncParameters self = new SourceRabbitMQMsgSyncParameters();
        return TeaModel.build(map, self);
    }

    public SourceRabbitMQMsgSyncParameters setBodyDataType(String bodyDataType) {
        this.bodyDataType = bodyDataType;
        return this;
    }
    public String getBodyDataType() {
        return this.bodyDataType;
    }

    public SourceRabbitMQMsgSyncParameters setCloudMigrationTaskId(String cloudMigrationTaskId) {
        this.cloudMigrationTaskId = cloudMigrationTaskId;
        return this;
    }
    public String getCloudMigrationTaskId() {
        return this.cloudMigrationTaskId;
    }

    public SourceRabbitMQMsgSyncParameters setDstClusterHost(String dstClusterHost) {
        this.dstClusterHost = dstClusterHost;
        return this;
    }
    public String getDstClusterHost() {
        return this.dstClusterHost;
    }

    public SourceRabbitMQMsgSyncParameters setDstClusterType(String dstClusterType) {
        this.dstClusterType = dstClusterType;
        return this;
    }
    public String getDstClusterType() {
        return this.dstClusterType;
    }

    public SourceRabbitMQMsgSyncParameters setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public SourceRabbitMQMsgSyncParameters setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SourceRabbitMQMsgSyncParameters setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public SourceRabbitMQMsgSyncParameters setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public SourceRabbitMQMsgSyncParameters setOrderConsume(String orderConsume) {
        this.orderConsume = orderConsume;
        return this;
    }
    public String getOrderConsume() {
        return this.orderConsume;
    }

    public SourceRabbitMQMsgSyncParameters setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public SourceRabbitMQMsgSyncParameters setPrefetchCount(String prefetchCount) {
        this.prefetchCount = prefetchCount;
        return this;
    }
    public String getPrefetchCount() {
        return this.prefetchCount;
    }

    public SourceRabbitMQMsgSyncParameters setRegex(String regex) {
        this.regex = regex;
        return this;
    }
    public String getRegex() {
        return this.regex;
    }

    public SourceRabbitMQMsgSyncParameters setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public SourceRabbitMQMsgSyncParameters setSrcClusterHost(String srcClusterHost) {
        this.srcClusterHost = srcClusterHost;
        return this;
    }
    public String getSrcClusterHost() {
        return this.srcClusterHost;
    }

    public SourceRabbitMQMsgSyncParameters setSrcClusterType(String srcClusterType) {
        this.srcClusterType = srcClusterType;
        return this;
    }
    public String getSrcClusterType() {
        return this.srcClusterType;
    }

    public SourceRabbitMQMsgSyncParameters setSyncMetaType(String syncMetaType) {
        this.syncMetaType = syncMetaType;
        return this;
    }
    public String getSyncMetaType() {
        return this.syncMetaType;
    }

    public SourceRabbitMQMsgSyncParameters setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public SourceRabbitMQMsgSyncParameters setVSwitchIds(String vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

    public SourceRabbitMQMsgSyncParameters setVirtualHostName(String virtualHostName) {
        this.virtualHostName = virtualHostName;
        return this;
    }
    public String getVirtualHostName() {
        return this.virtualHostName;
    }

    public SourceRabbitMQMsgSyncParameters setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
