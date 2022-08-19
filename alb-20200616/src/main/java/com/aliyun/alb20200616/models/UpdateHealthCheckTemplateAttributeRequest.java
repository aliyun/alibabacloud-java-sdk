// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateHealthCheckTemplateAttributeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("HealthCheckCodes")
    public java.util.List<String> healthCheckCodes;

    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    @NameInMap("HealthCheckHost")
    public String healthCheckHost;

    @NameInMap("HealthCheckHttpVersion")
    public String healthCheckHttpVersion;

    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    @NameInMap("HealthCheckMethod")
    public String healthCheckMethod;

    @NameInMap("HealthCheckPath")
    public String healthCheckPath;

    @NameInMap("HealthCheckProtocol")
    public String healthCheckProtocol;

    @NameInMap("HealthCheckTemplateId")
    public String healthCheckTemplateId;

    @NameInMap("HealthCheckTemplateName")
    public String healthCheckTemplateName;

    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

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

    public UpdateHealthCheckTemplateAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckCodes(java.util.List<String> healthCheckCodes) {
        this.healthCheckCodes = healthCheckCodes;
        return this;
    }
    public java.util.List<String> getHealthCheckCodes() {
        return this.healthCheckCodes;
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

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckHttpVersion(String healthCheckHttpVersion) {
        this.healthCheckHttpVersion = healthCheckHttpVersion;
        return this;
    }
    public String getHealthCheckHttpVersion() {
        return this.healthCheckHttpVersion;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckMethod(String healthCheckMethod) {
        this.healthCheckMethod = healthCheckMethod;
        return this;
    }
    public String getHealthCheckMethod() {
        return this.healthCheckMethod;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
        return this;
    }
    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
        return this;
    }
    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckTemplateId(String healthCheckTemplateId) {
        this.healthCheckTemplateId = healthCheckTemplateId;
        return this;
    }
    public String getHealthCheckTemplateId() {
        return this.healthCheckTemplateId;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckTemplateName(String healthCheckTemplateName) {
        this.healthCheckTemplateName = healthCheckTemplateName;
        return this;
    }
    public String getHealthCheckTemplateName() {
        return this.healthCheckTemplateName;
    }

    public UpdateHealthCheckTemplateAttributeRequest setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
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

}
