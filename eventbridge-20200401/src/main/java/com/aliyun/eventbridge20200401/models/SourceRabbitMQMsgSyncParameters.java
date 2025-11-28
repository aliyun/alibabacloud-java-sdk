// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SourceRabbitMQMsgSyncParameters extends TeaModel {
    @NameInMap("BodyDataType")
    public String bodyDataType;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OrderConsume")
    public String orderConsume;

    @NameInMap("Password")
    public String password;

    @NameInMap("PrefetchCount")
    public String prefetchCount;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("Username")
    public String username;

    @NameInMap("VSwitchIds")
    public String vSwitchIds;

    @NameInMap("VirtualHostName")
    public String virtualHostName;

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

    public SourceRabbitMQMsgSyncParameters setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
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
