// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SourceRabbitMQMetaParameters extends TeaModel {
    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("InnerNameSuffix")
    public String innerNameSuffix;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("MaxHops")
    public String maxHops;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OrderConsume")
    public String orderConsume;

    @NameInMap("Password")
    public String password;

    @NameInMap("Regex")
    public String regex;

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
