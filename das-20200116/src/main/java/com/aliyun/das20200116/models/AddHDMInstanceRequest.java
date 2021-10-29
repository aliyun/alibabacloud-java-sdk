// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class AddHDMInstanceRequest extends TeaModel {
    @NameInMap("Engine")
    public String engine;

    @NameInMap("FlushAccount")
    public String flushAccount;

    @NameInMap("InstanceAlias")
    public String instanceAlias;

    @NameInMap("InstanceArea")
    public String instanceArea;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("Password")
    public String password;

    @NameInMap("Port")
    public String port;

    @NameInMap("Region")
    public String region;

    @NameInMap("Username")
    public String username;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("__context")
    public String context;

    public static AddHDMInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddHDMInstanceRequest self = new AddHDMInstanceRequest();
        return TeaModel.build(map, self);
    }

    public AddHDMInstanceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public AddHDMInstanceRequest setFlushAccount(String flushAccount) {
        this.flushAccount = flushAccount;
        return this;
    }
    public String getFlushAccount() {
        return this.flushAccount;
    }

    public AddHDMInstanceRequest setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
        return this;
    }
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    public AddHDMInstanceRequest setInstanceArea(String instanceArea) {
        this.instanceArea = instanceArea;
        return this;
    }
    public String getInstanceArea() {
        return this.instanceArea;
    }

    public AddHDMInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddHDMInstanceRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public AddHDMInstanceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public AddHDMInstanceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public AddHDMInstanceRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public AddHDMInstanceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AddHDMInstanceRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public AddHDMInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public AddHDMInstanceRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

}
