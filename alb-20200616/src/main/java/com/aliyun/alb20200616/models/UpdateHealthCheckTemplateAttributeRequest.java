// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateHealthCheckTemplateAttributeRequest extends TeaModel {
    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    // 名称
    @NameInMap("HealthCheckTemplateName")
    public String healthCheckTemplateName;

    // 端口号
    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    // 域名
    @NameInMap("HealthCheckHost")
    public String healthCheckHost;

    // 状态码
    @NameInMap("HealthCheckCodes")
    public java.util.List<String> healthCheckCodes;

    // 时间间隔
    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    // 超时时间
    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    // uri
    @NameInMap("HealthCheckPath")
    public String healthCheckPath;

    // 方法
    @NameInMap("HealthCheckMethod")
    public String healthCheckMethod;

    // 协议
    @NameInMap("HealthCheckProtocol")
    public String healthCheckProtocol;

    // 版本
    @NameInMap("HealthCheckHttpVersion")
    public String healthCheckHttpVersion;

    // 健康阈值
    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    // 不健康阈值
    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    // dryRun
    @NameInMap("DryRun")
    public Boolean dryRun;

    // 健康检查模板ID
    @NameInMap("HealthCheckTemplateId")
    public String healthCheckTemplateId;

    public static UpdateHealthCheckTemplateAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHealthCheckTemplateAttributeRequest self = new UpdateHealthCheckTemplateAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHealthCheckTemplateAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckTemplateName(String healthCheckTemplateName) {
        this.healthCheckTemplateName = healthCheckTemplateName;
        return this;
    }
    public String getHealthCheckTemplateName() {
        return this.healthCheckTemplateName;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckHost(String healthCheckHost) {
        this.healthCheckHost = healthCheckHost;
        return this;
    }
    public String getHealthCheckHost() {
        return this.healthCheckHost;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckCodes(java.util.List<String> healthCheckCodes) {
        this.healthCheckCodes = healthCheckCodes;
        return this;
    }
    public java.util.List<String> getHealthCheckCodes() {
        return this.healthCheckCodes;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
        return this;
    }
    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckMethod(String healthCheckMethod) {
        this.healthCheckMethod = healthCheckMethod;
        return this;
    }
    public String getHealthCheckMethod() {
        return this.healthCheckMethod;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
        return this;
    }
    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckHttpVersion(String healthCheckHttpVersion) {
        this.healthCheckHttpVersion = healthCheckHttpVersion;
        return this;
    }
    public String getHealthCheckHttpVersion() {
        return this.healthCheckHttpVersion;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public UpdateHealthCheckTemplateAttributeRequest setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public UpdateHealthCheckTemplateAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckTemplateId(String healthCheckTemplateId) {
        this.healthCheckTemplateId = healthCheckTemplateId;
        return this;
    }
    public String getHealthCheckTemplateId() {
        return this.healthCheckTemplateId;
    }

}
