// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class HealthCheckConfig extends TeaModel {
    @NameInMap("failureThreshold")
    public Integer failureThreshold;

    @NameInMap("httpGetUrl")
    public String httpGetUrl;

    @NameInMap("initialDelaySeconds")
    public Integer initialDelaySeconds;

    @NameInMap("periodSeconds")
    public Integer periodSeconds;

    @NameInMap("successThreshold")
    public Integer successThreshold;

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
