// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SinkRabbitMQMetaParameters extends TeaModel {
    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("Password")
    public String password;

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
