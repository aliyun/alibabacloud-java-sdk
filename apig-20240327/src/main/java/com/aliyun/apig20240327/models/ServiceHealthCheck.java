// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ServiceHealthCheck extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    @NameInMap("healthyThreshold")
    public Integer healthyThreshold;

    @NameInMap("httpHost")
    public String httpHost;

    @NameInMap("httpPath")
    public String httpPath;

    @NameInMap("interval")
    public Integer interval;

    /**
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    @NameInMap("timeout")
    public Integer timeout;

    @NameInMap("unhealthyThreshold")
    public Integer unhealthyThreshold;

    public static ServiceHealthCheck build(java.util.Map<String, ?> map) throws Exception {
        ServiceHealthCheck self = new ServiceHealthCheck();
        return TeaModel.build(map, self);
    }

    public ServiceHealthCheck setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ServiceHealthCheck setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public ServiceHealthCheck setHttpHost(String httpHost) {
        this.httpHost = httpHost;
        return this;
    }
    public String getHttpHost() {
        return this.httpHost;
    }

    public ServiceHealthCheck setHttpPath(String httpPath) {
        this.httpPath = httpPath;
        return this;
    }
    public String getHttpPath() {
        return this.httpPath;
    }

    public ServiceHealthCheck setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public ServiceHealthCheck setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public ServiceHealthCheck setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public ServiceHealthCheck setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

}
