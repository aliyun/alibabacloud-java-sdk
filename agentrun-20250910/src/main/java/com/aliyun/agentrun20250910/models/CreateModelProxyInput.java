// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateModelProxyInput extends TeaModel {
    @NameInMap("armsConfiguration")
    public ArmsConfiguration armsConfiguration;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    @NameInMap("credentialName")
    public String credentialName;

    @NameInMap("description")
    public String description;

    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    @NameInMap("litellmVersion")
    public String litellmVersion;

    @NameInMap("logConfiguration")
    public LogConfiguration logConfiguration;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("memory")
    public Integer memory;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("modelProxyName")
    public String modelProxyName;

    @NameInMap("modelType")
    public String modelType;

    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("proxyConfig")
    public ProxyConfig proxyConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("proxyMode")
    public String proxyMode;

    @NameInMap("serviceRegionId")
    public String serviceRegionId;

    public static CreateModelProxyInput build(java.util.Map<String, ?> map) throws Exception {
        CreateModelProxyInput self = new CreateModelProxyInput();
        return TeaModel.build(map, self);
    }

    public CreateModelProxyInput setArmsConfiguration(ArmsConfiguration armsConfiguration) {
        this.armsConfiguration = armsConfiguration;
        return this;
    }
    public ArmsConfiguration getArmsConfiguration() {
        return this.armsConfiguration;
    }

    public CreateModelProxyInput setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public CreateModelProxyInput setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public CreateModelProxyInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModelProxyInput setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public CreateModelProxyInput setLitellmVersion(String litellmVersion) {
        this.litellmVersion = litellmVersion;
        return this;
    }
    public String getLitellmVersion() {
        return this.litellmVersion;
    }

    public CreateModelProxyInput setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    public CreateModelProxyInput setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public CreateModelProxyInput setModelProxyName(String modelProxyName) {
        this.modelProxyName = modelProxyName;
        return this;
    }
    public String getModelProxyName() {
        return this.modelProxyName;
    }

    public CreateModelProxyInput setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public CreateModelProxyInput setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public CreateModelProxyInput setProxyConfig(ProxyConfig proxyConfig) {
        this.proxyConfig = proxyConfig;
        return this;
    }
    public ProxyConfig getProxyConfig() {
        return this.proxyConfig;
    }

    public CreateModelProxyInput setProxyMode(String proxyMode) {
        this.proxyMode = proxyMode;
        return this;
    }
    public String getProxyMode() {
        return this.proxyMode;
    }

    public CreateModelProxyInput setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

}
