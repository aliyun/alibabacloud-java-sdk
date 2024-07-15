// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CustomHealthCheckConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("failureThreshold")
    public Integer failureThreshold;

    /**
     * <strong>example:</strong>
     * <p>/ready</p>
     */
    @NameInMap("httpGetUrl")
    public String httpGetUrl;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("initialDelaySeconds")
    public Integer initialDelaySeconds;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("periodSeconds")
    public Integer periodSeconds;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("successThreshold")
    public Integer successThreshold;

    /**
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
