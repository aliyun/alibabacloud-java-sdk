// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class HealthCheckConfiguration extends TeaModel {
    /**
     * <p>The number of consecutive failed health checks after which the container is considered unhealthy.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("failureThreshold")
    public Integer failureThreshold;

    /**
     * <p>The URL path for the HTTP GET health check.</p>
     * 
     * <strong>example:</strong>
     * <p>/ready</p>
     */
    @NameInMap("httpGetUrl")
    public String httpGetUrl;

    /**
     * <p>The delay in seconds after the container starts before the first health check runs.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("initialDelaySeconds")
    public Integer initialDelaySeconds;

    /**
     * <p>The interval in seconds between health checks.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("periodSeconds")
    public Integer periodSeconds;

    /**
     * <p>The number of consecutive successful health checks after which an unhealthy container is considered healthy.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("successThreshold")
    public Integer successThreshold;

    /**
     * <p>The duration in seconds before a health check times out.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("timeoutSeconds")
    public Integer timeoutSeconds;

    public static HealthCheckConfiguration build(java.util.Map<String, ?> map) throws Exception {
        HealthCheckConfiguration self = new HealthCheckConfiguration();
        return TeaModel.build(map, self);
    }

    public HealthCheckConfiguration setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }
    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }

    public HealthCheckConfiguration setHttpGetUrl(String httpGetUrl) {
        this.httpGetUrl = httpGetUrl;
        return this;
    }
    public String getHttpGetUrl() {
        return this.httpGetUrl;
    }

    public HealthCheckConfiguration setInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }
    public Integer getInitialDelaySeconds() {
        return this.initialDelaySeconds;
    }

    public HealthCheckConfiguration setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }
    public Integer getPeriodSeconds() {
        return this.periodSeconds;
    }

    public HealthCheckConfiguration setSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
        return this;
    }
    public Integer getSuccessThreshold() {
        return this.successThreshold;
    }

    public HealthCheckConfiguration setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

}
