// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CustomHealthCheckConfig extends TeaModel {
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
