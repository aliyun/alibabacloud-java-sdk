// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ServiceHealthCheck extends TeaModel {
    /**
     * <p>Specifies whether to enable the health check.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The healthy threshold for the health check.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("healthyThreshold")
    public Integer healthyThreshold;

    /**
     * <p>The health check domain name. This parameter is optional when the health check protocol is HTTP.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("httpHost")
    public String httpHost;

    /**
     * <p>The health check path. This parameter is required when the health check protocol is HTTP.</p>
     * 
     * <strong>example:</strong>
     * <p>/health</p>
     */
    @NameInMap("httpPath")
    public String httpPath;

    /**
     * <p>The health check interval.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("interval")
    public Integer interval;

    /**
     * <p>The health check protocol. Valid values: TCP, HTTP, and GRPC.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <p>The health check response timeout period.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    /**
     * <p>The unhealthy threshold for the health check.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
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
