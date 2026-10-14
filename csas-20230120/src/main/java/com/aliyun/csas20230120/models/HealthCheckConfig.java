// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class HealthCheckConfig extends TeaModel {
    /**
     * <p>The check interval in seconds. Default value: 30 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("CheckInterval")
    public Integer checkInterval;

    /**
     * <p>The failure count. Default value: 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("FailureCount")
    public Integer failureCount;

    /**
     * <p>The port number. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>443</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The protocol type. Valid values: TCP and UDP. This parameter is required only in Continuous mode.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The timeout period for a single check in seconds. Default value: 5 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    public static HealthCheckConfig build(java.util.Map<String, ?> map) throws Exception {
        HealthCheckConfig self = new HealthCheckConfig();
        return TeaModel.build(map, self);
    }

    public HealthCheckConfig setCheckInterval(Integer checkInterval) {
        this.checkInterval = checkInterval;
        return this;
    }
    public Integer getCheckInterval() {
        return this.checkInterval;
    }

    public HealthCheckConfig setFailureCount(Integer failureCount) {
        this.failureCount = failureCount;
        return this;
    }
    public Integer getFailureCount() {
        return this.failureCount;
    }

    public HealthCheckConfig setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public HealthCheckConfig setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public HealthCheckConfig setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

}
