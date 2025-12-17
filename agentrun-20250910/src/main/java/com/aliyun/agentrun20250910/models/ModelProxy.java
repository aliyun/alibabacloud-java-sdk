// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ModelProxy extends TeaModel {
    @NameInMap("cpu")
    public Float cpu;

    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("credentialName")
    public String credentialName;

    @NameInMap("description")
    public String description;

    @NameInMap("endpoint")
    public String endpoint;

    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    @NameInMap("functionName")
    public String functionName;

    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    @NameInMap("litellmVersion")
    public String litellmVersion;

    @NameInMap("logConfiguration")
    public LogConfiguration logConfiguration;

    @NameInMap("memory")
    public Integer memory;

    @NameInMap("modelProxyId")
    public String modelProxyId;

    @NameInMap("modelProxyName")
    public String modelProxyName;

    @NameInMap("modelType")
    public String modelType;

    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    @NameInMap("proxyConfig")
    public ProxyConfig proxyConfig;

    @NameInMap("proxyMode")
    public String proxyMode;

    @NameInMap("serviceRegionId")
    public String serviceRegionId;

    @NameInMap("status")
    public String status;

    @NameInMap("statusReason")
    public String statusReason;

    public static ModelProxy build(java.util.Map<String, ?> map) throws Exception {
        ModelProxy self = new ModelProxy();
        return TeaModel.build(map, self);
    }

    public ModelProxy setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public ModelProxy setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public ModelProxy setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public ModelProxy setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModelProxy setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public ModelProxy setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public ModelProxy setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public ModelProxy setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public ModelProxy setLitellmVersion(String litellmVersion) {
        this.litellmVersion = litellmVersion;
        return this;
    }
    public String getLitellmVersion() {
        return this.litellmVersion;
    }

    public ModelProxy setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    public ModelProxy setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public ModelProxy setModelProxyId(String modelProxyId) {
        this.modelProxyId = modelProxyId;
        return this;
    }
    public String getModelProxyId() {
        return this.modelProxyId;
    }

    public ModelProxy setModelProxyName(String modelProxyName) {
        this.modelProxyName = modelProxyName;
        return this;
    }
    public String getModelProxyName() {
        return this.modelProxyName;
    }

    public ModelProxy setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public ModelProxy setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public ModelProxy setProxyConfig(ProxyConfig proxyConfig) {
        this.proxyConfig = proxyConfig;
        return this;
    }
    public ProxyConfig getProxyConfig() {
        return this.proxyConfig;
    }

    public ModelProxy setProxyMode(String proxyMode) {
        this.proxyMode = proxyMode;
        return this;
    }
    public String getProxyMode() {
        return this.proxyMode;
    }

    public ModelProxy setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public ModelProxy setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ModelProxy setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

}
