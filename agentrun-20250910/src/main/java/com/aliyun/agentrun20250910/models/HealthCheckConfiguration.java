// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class HealthCheckConfiguration extends TeaModel {
    /**
     * <p>在将容器视为不健康之前，连续失败的健康检查次数</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("failureThreshold")
    public Integer failureThreshold;

    /**
     * <p>用于健康检查的HTTP GET请求的URL地址</p>
     * 
     * <strong>example:</strong>
     * <p>/ready</p>
     */
    @NameInMap("httpGetUrl")
    public String httpGetUrl;

    /**
     * <p>在容器启动后，首次执行健康检查前的延迟时间（秒）</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("initialDelaySeconds")
    public Integer initialDelaySeconds;

    /**
     * <p>执行健康检查的时间间隔（秒）</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("periodSeconds")
    public Integer periodSeconds;

    /**
     * <p>在将容器视为健康之前，连续成功的健康检查次数</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("successThreshold")
    public Integer successThreshold;

    /**
     * <p>健康检查的超时时间（秒）</p>
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
