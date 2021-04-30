// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class GetHealthCheckTemplateAttributeResponseBody extends TeaModel {
    // 端口
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    // 域名
    @NameInMap("HealthCheckHost")
    public String healthCheckHost;

    // 状态码
    @NameInMap("HealthCheckCodes")
    public java.util.List<String> healthCheckCodes;

    // 版本
    @NameInMap("HealthCheckHttpVersion")
    public String healthCheckHttpVersion;

    // 健康检查模板Id
    @NameInMap("HealthCheckTemplateId")
    public String healthCheckTemplateId;

    // 间隔时间
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    // 方法
    @NameInMap("HealthCheckMethod")
    public String healthCheckMethod;

    // uri
    @NameInMap("HealthCheckPath")
    public String healthCheckPath;

    // 协议
    @NameInMap("HealthCheckProtocol")
    public String healthCheckProtocol;

    // 名称
    @NameInMap("HealthCheckTemplateName")
    public String healthCheckTemplateName;

    // 超时时间
    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    // 健康阈值
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 不健康阈值
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    public static GetHealthCheckTemplateAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHealthCheckTemplateAttributeResponseBody self = new GetHealthCheckTemplateAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckHost(String healthCheckHost) {
        this.healthCheckHost = healthCheckHost;
        return this;
    }
    public String getHealthCheckHost() {
        return this.healthCheckHost;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckCodes(java.util.List<String> healthCheckCodes) {
        this.healthCheckCodes = healthCheckCodes;
        return this;
    }
    public java.util.List<String> getHealthCheckCodes() {
        return this.healthCheckCodes;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckHttpVersion(String healthCheckHttpVersion) {
        this.healthCheckHttpVersion = healthCheckHttpVersion;
        return this;
    }
    public String getHealthCheckHttpVersion() {
        return this.healthCheckHttpVersion;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckTemplateId(String healthCheckTemplateId) {
        this.healthCheckTemplateId = healthCheckTemplateId;
        return this;
    }
    public String getHealthCheckTemplateId() {
        return this.healthCheckTemplateId;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckMethod(String healthCheckMethod) {
        this.healthCheckMethod = healthCheckMethod;
        return this;
    }
    public String getHealthCheckMethod() {
        return this.healthCheckMethod;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
        return this;
    }
    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
        return this;
    }
    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckTemplateName(String healthCheckTemplateName) {
        this.healthCheckTemplateName = healthCheckTemplateName;
        return this;
    }
    public String getHealthCheckTemplateName() {
        return this.healthCheckTemplateName;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    public GetHealthCheckTemplateAttributeResponseBody setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public GetHealthCheckTemplateAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHealthCheckTemplateAttributeResponseBody setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

}
