// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CollectorKibanaInstance extends TeaModel {
    @NameInMap("configType")
    public String configType;

    @NameInMap("host")
    public String host;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("kibanaHost")
    public String kibanaHost;

    @NameInMap("password")
    public String password;

    @NameInMap("protocol")
    public String protocol;

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
