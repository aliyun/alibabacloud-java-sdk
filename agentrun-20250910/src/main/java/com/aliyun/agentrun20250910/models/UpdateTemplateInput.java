// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateTemplateInput extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("allowAnonymousManage")
    public Boolean allowAnonymousManage;

    @NameInMap("armsConfiguration")
    public ArmsConfiguration armsConfiguration;

    /**
     * <p>容器配置（内置的不可改）</p>
     */
    @NameInMap("containerConfiguration")
    public ContainerConfiguration containerConfiguration;

    /**
     * <p>CPU资源配置（单位：核心）</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    @NameInMap("credentialConfiguration")
    public CredentialConfiguration credentialConfiguration;

    /**
     * <strong>example:</strong>
     * <p>demo description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAgent")
    public Boolean enableAgent;

    @NameInMap("environmentVariables")
    public java.util.Map<String, String> environmentVariables;

    /**
     * <strong>example:</strong>
     * <p>arn:acs:agentrun:cn-hangzhou:123456789:xxx/test</p>
     */
    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    @NameInMap("logConfiguration")
    public LogConfiguration logConfiguration;

    /**
     * <p>内存资源配置（单位：MB）</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("memory")
    public Integer memory;

    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    @NameInMap("ossConfiguration")
    public java.util.List<OssConfiguration> ossConfiguration;

    /**
     * <p>沙箱空闲超时时间（秒）</p>
     * 
     * <strong>example:</strong>
     * <p>21600</p>
     */
    @NameInMap("sandboxIdleTimeoutInSeconds")
    public Integer sandboxIdleTimeoutInSeconds;

    /**
     * <p>沙箱存活时间（秒）</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("sandboxTTLInSeconds")
    @Deprecated
    public Integer sandboxTTLInSeconds;

    @NameInMap("scalingConfig")
    public ScalingConfig scalingConfig;

    /**
     * <p>模板配置（灵活的对象结构，根据 templateType 不同而不同）</p>
     */
    @NameInMap("templateConfiguration")
    public java.util.Map<String, ?> templateConfiguration;

    /**
     * <strong>example:</strong>
     * <p>ws-1234567890abcdef</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static UpdateTemplateInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateInput self = new UpdateTemplateInput();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateInput setAllowAnonymousManage(Boolean allowAnonymousManage) {
        this.allowAnonymousManage = allowAnonymousManage;
        return this;
    }
    public Boolean getAllowAnonymousManage() {
        return this.allowAnonymousManage;
    }

    public UpdateTemplateInput setArmsConfiguration(ArmsConfiguration armsConfiguration) {
        this.armsConfiguration = armsConfiguration;
        return this;
    }
    public ArmsConfiguration getArmsConfiguration() {
        return this.armsConfiguration;
    }

    public UpdateTemplateInput setContainerConfiguration(ContainerConfiguration containerConfiguration) {
        this.containerConfiguration = containerConfiguration;
        return this;
    }
    public ContainerConfiguration getContainerConfiguration() {
        return this.containerConfiguration;
    }

    public UpdateTemplateInput setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public UpdateTemplateInput setCredentialConfiguration(CredentialConfiguration credentialConfiguration) {
        this.credentialConfiguration = credentialConfiguration;
        return this;
    }
    public CredentialConfiguration getCredentialConfiguration() {
        return this.credentialConfiguration;
    }

    public UpdateTemplateInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTemplateInput setEnableAgent(Boolean enableAgent) {
        this.enableAgent = enableAgent;
        return this;
    }
    public Boolean getEnableAgent() {
        return this.enableAgent;
    }

    public UpdateTemplateInput setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public UpdateTemplateInput setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public UpdateTemplateInput setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    public UpdateTemplateInput setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public UpdateTemplateInput setNasConfig(NASConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    public UpdateTemplateInput setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public UpdateTemplateInput setOssConfiguration(java.util.List<OssConfiguration> ossConfiguration) {
        this.ossConfiguration = ossConfiguration;
        return this;
    }
    public java.util.List<OssConfiguration> getOssConfiguration() {
        return this.ossConfiguration;
    }

    public UpdateTemplateInput setSandboxIdleTimeoutInSeconds(Integer sandboxIdleTimeoutInSeconds) {
        this.sandboxIdleTimeoutInSeconds = sandboxIdleTimeoutInSeconds;
        return this;
    }
    public Integer getSandboxIdleTimeoutInSeconds() {
        return this.sandboxIdleTimeoutInSeconds;
    }

    @Deprecated
    public UpdateTemplateInput setSandboxTTLInSeconds(Integer sandboxTTLInSeconds) {
        this.sandboxTTLInSeconds = sandboxTTLInSeconds;
        return this;
    }
    public Integer getSandboxTTLInSeconds() {
        return this.sandboxTTLInSeconds;
    }

    public UpdateTemplateInput setScalingConfig(ScalingConfig scalingConfig) {
        this.scalingConfig = scalingConfig;
        return this;
    }
    public ScalingConfig getScalingConfig() {
        return this.scalingConfig;
    }

    public UpdateTemplateInput setTemplateConfiguration(java.util.Map<String, ?> templateConfiguration) {
        this.templateConfiguration = templateConfiguration;
        return this;
    }
    public java.util.Map<String, ?> getTemplateConfiguration() {
        return this.templateConfiguration;
    }

    public UpdateTemplateInput setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
