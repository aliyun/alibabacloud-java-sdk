// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiPolicyRedisConfig extends TeaModel {
    /**
     * <p>The Redis database number.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("databaseNumber")
    public Integer databaseNumber;

    /**
     * <p>The Redis host address.</p>
     * 
     * <strong>example:</strong>
     * <p>r-xxx.redis.rds.aliyuncs.com</p>
     */
    @NameInMap("host")
    public String host;

    /**
     * <p>The Redis password.</p>
     * 
     * <strong>example:</strong>
     * <p>pass</p>
     */
    @NameInMap("password")
    public String password;

    /**
     * <p>The Redis port.</p>
     * 
     * <strong>example:</strong>
     * <p>6379</p>
     */
    @NameInMap("port")
    public Integer port;

    /**
     * <p>The timeout period, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    /**
     * <p>The Redis username.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
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
