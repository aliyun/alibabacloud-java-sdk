// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CollectorTargetInstance extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>collectorTargetInstance</p>
     */
    @NameInMap("configType")
    public String configType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableMonitoring")
    public Boolean enableMonitoring;

    @NameInMap("hosts")
    public java.util.List<String> hosts;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>es-cn-ks8x****</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>elasticsearch</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>password</p>
     */
    @NameInMap("password")
    public String password;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>username</p>
     */
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
