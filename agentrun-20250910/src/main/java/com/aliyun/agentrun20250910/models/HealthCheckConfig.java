// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class HealthCheckConfig extends TeaModel {
    /**
     * <p>The number of consecutive failed health checks before the container is considered unhealthy</p>
     */
    @NameInMap("failureThreshold")
    public Integer failureThreshold;

    /**
     * <p>The URL address for the HTTP GET request used in health checks</p>
     */
    @NameInMap("httpGetUrl")
    public String httpGetUrl;

    /**
     * <p>The delay time (in seconds) after the container starts before the first health check is executed</p>
     */
    @NameInMap("initialDelaySeconds")
    public Integer initialDelaySeconds;

    /**
     * <p>The time interval (in seconds) between health checks</p>
     */
    @NameInMap("periodSeconds")
    public Integer periodSeconds;

    /**
     * <p>The number of consecutive successful health checks required before the container is considered healthy</p>
     */
    @NameInMap("successThreshold")
    public Integer successThreshold;

    /**
     * <p>The timeout duration (in seconds) for health checks</p>
     */
    @NameInMap("timeoutSeconds")
    public Integer timeoutSeconds;

    public static HealthCheckConfig build(java.util.Map<String, ?> map) throws Exception {
        HealthCheckConfig self = new HealthCheckConfig();
        return TeaModel.build(map, self);
    }

    public HealthCheckConfig setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }
    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }

    public HealthCheckConfig setHttpGetUrl(String httpGetUrl) {
        this.httpGetUrl = httpGetUrl;
        return this;
    }
    public String getHttpGetUrl() {
        return this.httpGetUrl;
    }

    public HealthCheckConfig setInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }
    public Integer getInitialDelaySeconds() {
        return this.initialDelaySeconds;
    }

    public HealthCheckConfig setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }
    public Integer getPeriodSeconds() {
        return this.periodSeconds;
    }

    public HealthCheckConfig setSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
        return this;
    }
    public Integer getSuccessThreshold() {
        return this.successThreshold;
    }

    public HealthCheckConfig setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

}
