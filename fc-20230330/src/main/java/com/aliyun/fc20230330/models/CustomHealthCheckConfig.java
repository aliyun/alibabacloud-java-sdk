// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CustomHealthCheckConfig extends TeaModel {
    /**
     * <p>The threshold for health check failures. When this value is reached, the system considers the health check failed. Valid values: 1 to 120. Default value: 3.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("failureThreshold")
    public Integer failureThreshold;

    /**
     * <p>The health check URL of the custom container. The URL can be up to 2,048 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>/ready</p>
     */
    @NameInMap("httpGetUrl")
    public String httpGetUrl;

    /**
     * <p>The delay between the container startup and the health check. Valid values: 0 to 120. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("initialDelaySeconds")
    public Integer initialDelaySeconds;

    /**
     * <p>The health check period. Valid values: 1 to 120. Default value: 3.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("periodSeconds")
    public Integer periodSeconds;

    /**
     * <p>The threshold for health check successes. When this value is reached, the system considers the health check successful. Valid values: 1 to 120. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("successThreshold")
    public Integer successThreshold;

    /**
     * <p>The timeout period of the health check. Unit: seconds. Valid values: 1 to 3. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("timeoutSeconds")
    public Integer timeoutSeconds;

    public static CustomHealthCheckConfig build(java.util.Map<String, ?> map) throws Exception {
        CustomHealthCheckConfig self = new CustomHealthCheckConfig();
        return TeaModel.build(map, self);
    }

    public CustomHealthCheckConfig setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }
    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }

    public CustomHealthCheckConfig setHttpGetUrl(String httpGetUrl) {
        this.httpGetUrl = httpGetUrl;
        return this;
    }
    public String getHttpGetUrl() {
        return this.httpGetUrl;
    }

    public CustomHealthCheckConfig setInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }
    public Integer getInitialDelaySeconds() {
        return this.initialDelaySeconds;
    }

    public CustomHealthCheckConfig setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }
    public Integer getPeriodSeconds() {
        return this.periodSeconds;
    }

    public CustomHealthCheckConfig setSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
        return this;
    }
    public Integer getSuccessThreshold() {
        return this.successThreshold;
    }

    public CustomHealthCheckConfig setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

}
