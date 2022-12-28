// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CollectorTargetInstance extends TeaModel {
    @NameInMap("configType")
    public String configType;

    @NameInMap("enableMonitoring")
    public Boolean enableMonitoring;

    @NameInMap("hosts")
    public java.util.List<String> hosts;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("instanceType")
    public String instanceType;

    @NameInMap("password")
    public String password;

    @NameInMap("protocol")
    public String protocol;

    @NameInMap("userName")
    public String userName;

    public static CollectorTargetInstance build(java.util.Map<String, ?> map) throws Exception {
        CollectorTargetInstance self = new CollectorTargetInstance();
        return TeaModel.build(map, self);
    }

    public CollectorTargetInstance setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public CollectorTargetInstance setEnableMonitoring(Boolean enableMonitoring) {
        this.enableMonitoring = enableMonitoring;
        return this;
    }
    public Boolean getEnableMonitoring() {
        return this.enableMonitoring;
    }

    public CollectorTargetInstance setHosts(java.util.List<String> hosts) {
        this.hosts = hosts;
        return this;
    }
    public java.util.List<String> getHosts() {
        return this.hosts;
    }

    public CollectorTargetInstance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CollectorTargetInstance setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CollectorTargetInstance setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CollectorTargetInstance setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CollectorTargetInstance setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
