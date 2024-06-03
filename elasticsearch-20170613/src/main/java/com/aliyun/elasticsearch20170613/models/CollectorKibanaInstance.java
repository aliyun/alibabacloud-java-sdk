// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CollectorKibanaInstance extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("configType")
    public String configType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("host")
    public String host;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("kibanaHost")
    public String kibanaHost;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("password")
    public String password;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("userName")
    public String userName;

    public static CollectorKibanaInstance build(java.util.Map<String, ?> map) throws Exception {
        CollectorKibanaInstance self = new CollectorKibanaInstance();
        return TeaModel.build(map, self);
    }

    public CollectorKibanaInstance setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public CollectorKibanaInstance setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public CollectorKibanaInstance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CollectorKibanaInstance setKibanaHost(String kibanaHost) {
        this.kibanaHost = kibanaHost;
        return this;
    }
    public String getKibanaHost() {
        return this.kibanaHost;
    }

    public CollectorKibanaInstance setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CollectorKibanaInstance setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CollectorKibanaInstance setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
