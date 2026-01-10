// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class Template extends TeaModel {
    @NameInMap("allowAnonymousManage")
    public Boolean allowAnonymousManage;

    @NameInMap("containerConfiguration")
    public ContainerConfiguration containerConfiguration;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("credentialConfiguration")
    public CredentialConfiguration credentialConfiguration;

    @NameInMap("description")
    public String description;

    @NameInMap("diskSize")
    public Integer diskSize;

    @NameInMap("environmentVariables")
    public java.util.Map<String, String> environmentVariables;

    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    @NameInMap("logConfiguration")
    public LogConfiguration logConfiguration;

    @NameInMap("mcpOptions")
    public TemplateMcpOptions mcpOptions;

    @NameInMap("mcpState")
    public TemplateMcpState mcpState;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("memory")
    public Integer memory;

    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    @NameInMap("ossConfiguration")
    public java.util.List<OssConfiguration> ossConfiguration;

    @NameInMap("resourceName")
    public String resourceName;

    @NameInMap("sandboxIdleTimeoutInSeconds")
    public String sandboxIdleTimeoutInSeconds;

    @NameInMap("sandboxTTLInSeconds")
    @Deprecated
    public String sandboxTTLInSeconds;

    @NameInMap("status")
    public String status;

    @NameInMap("statusReason")
    public String statusReason;

    @NameInMap("templateArn")
    public String templateArn;

    @NameInMap("templateConfiguration")
    public java.util.Map<String, ?> templateConfiguration;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("templateId")
    public String templateId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("templateName")
    public String templateName;

    @NameInMap("templateType")
    public String templateType;

    @NameInMap("templateVersion")
    public String templateVersion;

    public static Template build(java.util.Map<String, ?> map) throws Exception {
        Template self = new Template();
        return TeaModel.build(map, self);
    }

    public Template setAllowAnonymousManage(Boolean allowAnonymousManage) {
        this.allowAnonymousManage = allowAnonymousManage;
        return this;
    }
    public Boolean getAllowAnonymousManage() {
        return this.allowAnonymousManage;
    }

    public Template setContainerConfiguration(ContainerConfiguration containerConfiguration) {
        this.containerConfiguration = containerConfiguration;
        return this;
    }
    public ContainerConfiguration getContainerConfiguration() {
        return this.containerConfiguration;
    }

    public Template setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public Template setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public Template setCredentialConfiguration(CredentialConfiguration credentialConfiguration) {
        this.credentialConfiguration = credentialConfiguration;
        return this;
    }
    public CredentialConfiguration getCredentialConfiguration() {
        return this.credentialConfiguration;
    }

    public Template setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Template setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public Template setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public Template setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public Template setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public Template setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    public Template setMcpOptions(TemplateMcpOptions mcpOptions) {
        this.mcpOptions = mcpOptions;
        return this;
    }
    public TemplateMcpOptions getMcpOptions() {
        return this.mcpOptions;
    }

    public Template setMcpState(TemplateMcpState mcpState) {
        this.mcpState = mcpState;
        return this;
    }
    public TemplateMcpState getMcpState() {
        return this.mcpState;
    }

    public Template setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public Template setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public Template setOssConfiguration(java.util.List<OssConfiguration> ossConfiguration) {
        this.ossConfiguration = ossConfiguration;
        return this;
    }
    public java.util.List<OssConfiguration> getOssConfiguration() {
        return this.ossConfiguration;
    }

    public Template setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public Template setSandboxIdleTimeoutInSeconds(String sandboxIdleTimeoutInSeconds) {
        this.sandboxIdleTimeoutInSeconds = sandboxIdleTimeoutInSeconds;
        return this;
    }
    public String getSandboxIdleTimeoutInSeconds() {
        return this.sandboxIdleTimeoutInSeconds;
    }

    @Deprecated
    public Template setSandboxTTLInSeconds(String sandboxTTLInSeconds) {
        this.sandboxTTLInSeconds = sandboxTTLInSeconds;
        return this;
    }
    public String getSandboxTTLInSeconds() {
        return this.sandboxTTLInSeconds;
    }

    public Template setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Template setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public Template setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
        return this;
    }
    public String getTemplateArn() {
        return this.templateArn;
    }

    public Template setTemplateConfiguration(java.util.Map<String, ?> templateConfiguration) {
        this.templateConfiguration = templateConfiguration;
        return this;
    }
    public java.util.Map<String, ?> getTemplateConfiguration() {
        return this.templateConfiguration;
    }

    public Template setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public Template setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public Template setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public Template setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static class TemplateMcpOptions extends TeaModel {
        @NameInMap("enabledTools")
        public java.util.List<String> enabledTools;

        /**
         * <strong>example:</strong>
         * <p>streamable-http</p>
         */
        @NameInMap("transport")
        public String transport;

        public static TemplateMcpOptions build(java.util.Map<String, ?> map) throws Exception {
            TemplateMcpOptions self = new TemplateMcpOptions();
            return TeaModel.build(map, self);
        }

        public TemplateMcpOptions setEnabledTools(java.util.List<String> enabledTools) {
            this.enabledTools = enabledTools;
            return this;
        }
        public java.util.List<String> getEnabledTools() {
            return this.enabledTools;
        }

        public TemplateMcpOptions setTransport(String transport) {
            this.transport = transport;
            return this;
        }
        public String getTransport() {
            return this.transport;
        }

    }

    public static class TemplateMcpState extends TeaModel {
        @NameInMap("accessEndpoint")
        public String accessEndpoint;

        @NameInMap("status")
        public String status;

        @NameInMap("statusReason")
        public String statusReason;

        public static TemplateMcpState build(java.util.Map<String, ?> map) throws Exception {
            TemplateMcpState self = new TemplateMcpState();
            return TeaModel.build(map, self);
        }

        public TemplateMcpState setAccessEndpoint(String accessEndpoint) {
            this.accessEndpoint = accessEndpoint;
            return this;
        }
        public String getAccessEndpoint() {
            return this.accessEndpoint;
        }

        public TemplateMcpState setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public TemplateMcpState setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

    }

}
