// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiPolicyRedisConfig extends TeaModel {
    @NameInMap("databaseNumber")
    public Integer databaseNumber;

    @NameInMap("host")
    public String host;

    @NameInMap("password")
    public String password;

    @NameInMap("port")
    public Integer port;

    @NameInMap("timeout")
    public Integer timeout;

    @NameInMap("username")
    public String username;

    public static AiPolicyRedisConfig build(java.util.Map<String, ?> map) throws Exception {
        AiPolicyRedisConfig self = new AiPolicyRedisConfig();
        return TeaModel.build(map, self);
    }

    public AiPolicyRedisConfig setDatabaseNumber(Integer databaseNumber) {
        this.databaseNumber = databaseNumber;
        return this;
    }
    public Integer getDatabaseNumber() {
        return this.databaseNumber;
    }

    public AiPolicyRedisConfig setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public AiPolicyRedisConfig setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public AiPolicyRedisConfig setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public AiPolicyRedisConfig setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public AiPolicyRedisConfig setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
