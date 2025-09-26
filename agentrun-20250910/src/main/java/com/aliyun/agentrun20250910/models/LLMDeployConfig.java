// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class LLMDeployConfig extends TeaModel {
    @NameInMap("autoDeploy")
    public Boolean autoDeploy;

    @NameInMap("backendScene")
    public String backendScene;

    @NameInMap("customDomainIds")
    public java.util.List<String> customDomainIds;

    @NameInMap("gatewayType")
    public String gatewayType;

    @NameInMap("policyConfigs")
    public java.util.List<PolicyConfig> policyConfigs;

    @NameInMap("serviceConfigs")
    public java.util.List<TargetServiceConfig> serviceConfigs;

    public static LLMDeployConfig build(java.util.Map<String, ?> map) throws Exception {
        LLMDeployConfig self = new LLMDeployConfig();
        return TeaModel.build(map, self);
    }

    public LLMDeployConfig setAutoDeploy(Boolean autoDeploy) {
        this.autoDeploy = autoDeploy;
        return this;
    }
    public Boolean getAutoDeploy() {
        return this.autoDeploy;
    }

    public LLMDeployConfig setBackendScene(String backendScene) {
        this.backendScene = backendScene;
        return this;
    }
    public String getBackendScene() {
        return this.backendScene;
    }

    public LLMDeployConfig setCustomDomainIds(java.util.List<String> customDomainIds) {
        this.customDomainIds = customDomainIds;
        return this;
    }
    public java.util.List<String> getCustomDomainIds() {
        return this.customDomainIds;
    }

    public LLMDeployConfig setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public LLMDeployConfig setPolicyConfigs(java.util.List<PolicyConfig> policyConfigs) {
        this.policyConfigs = policyConfigs;
        return this;
    }
    public java.util.List<PolicyConfig> getPolicyConfigs() {
        return this.policyConfigs;
    }

    public LLMDeployConfig setServiceConfigs(java.util.List<TargetServiceConfig> serviceConfigs) {
        this.serviceConfigs = serviceConfigs;
        return this;
    }
    public java.util.List<TargetServiceConfig> getServiceConfigs() {
        return this.serviceConfigs;
    }

}
