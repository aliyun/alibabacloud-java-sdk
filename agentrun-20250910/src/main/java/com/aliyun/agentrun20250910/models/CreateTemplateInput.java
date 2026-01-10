// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateTemplateInput extends TeaModel {
    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("allowAnonymousManage")
    public Boolean allowAnonymousManage;

    @NameInMap("armsConfiguration")
    public ArmsConfiguration armsConfiguration;

    /**
     * <p>容器配置，只允许基于 Browser/Code Interpreter 基础镜像的 image</p>
     */
    @NameInMap("containerConfiguration")
    public ContainerConfiguration containerConfiguration;

    /**
     * <p>CPU资源配置（单位：核心）</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("cpu")
    public Float cpu;

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

    @NameInMap("logConfiguration")
    public LogConfiguration logConfiguration;

    /**
     * <p>内存资源配置（单位：MB）</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("memory")
    public Integer memory;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    @NameInMap("ossConfiguration")
    public java.util.List<OssConfiguration> ossConfiguration;

    /**
     * <p>沙箱空闲超时时间（秒）</p>
     */
    @NameInMap("sandboxIdleTimeoutInSeconds")
    public Integer sandboxIdleTimeoutInSeconds;

    /**
     * <p>沙箱存活时间（秒）</p>
     */
    @NameInMap("sandboxTTLInSeconds")
    @Deprecated
    public Integer sandboxTTLInSeconds;

    /**
     * <p>模板配置（灵活的对象结构，根据 templateType 不同而不同）</p>
     */
    @NameInMap("templateConfiguration")
    public java.util.Map<String, ?> templateConfiguration;

    /**
     * <p>模板名称（要求账号唯一的）</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("templateName")
    public String templateName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("templateType")
    public String templateType;

    public static CreateTemplateInput build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateInput self = new CreateTemplateInput();
        return TeaModel.build(map, self);
    }

    public CreateTemplateInput setAllowAnonymousManage(Boolean allowAnonymousManage) {
        this.allowAnonymousManage = allowAnonymousManage;
        return this;
    }
    public Boolean getAllowAnonymousManage() {
        return this.allowAnonymousManage;
    }

    public CreateTemplateInput setArmsConfiguration(ArmsConfiguration armsConfiguration) {
        this.armsConfiguration = armsConfiguration;
        return this;
    }
    public ArmsConfiguration getArmsConfiguration() {
        return this.armsConfiguration;
    }

    public CreateTemplateInput setContainerConfiguration(ContainerConfiguration containerConfiguration) {
        this.containerConfiguration = containerConfiguration;
        return this;
    }
    public ContainerConfiguration getContainerConfiguration() {
        return this.containerConfiguration;
    }

    public CreateTemplateInput setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public CreateTemplateInput setCredentialConfiguration(CredentialConfiguration credentialConfiguration) {
        this.credentialConfiguration = credentialConfiguration;
        return this;
    }
    public CredentialConfiguration getCredentialConfiguration() {
        return this.credentialConfiguration;
    }

    public CreateTemplateInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTemplateInput setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public CreateTemplateInput setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    public CreateTemplateInput setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public CreateTemplateInput setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    public CreateTemplateInput setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public CreateTemplateInput setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public CreateTemplateInput setOssConfiguration(java.util.List<OssConfiguration> ossConfiguration) {
        this.ossConfiguration = ossConfiguration;
        return this;
    }
    public java.util.List<OssConfiguration> getOssConfiguration() {
        return this.ossConfiguration;
    }

    public CreateTemplateInput setSandboxIdleTimeoutInSeconds(Integer sandboxIdleTimeoutInSeconds) {
        this.sandboxIdleTimeoutInSeconds = sandboxIdleTimeoutInSeconds;
        return this;
    }
    public Integer getSandboxIdleTimeoutInSeconds() {
        return this.sandboxIdleTimeoutInSeconds;
    }

    @Deprecated
    public CreateTemplateInput setSandboxTTLInSeconds(Integer sandboxTTLInSeconds) {
        this.sandboxTTLInSeconds = sandboxTTLInSeconds;
        return this;
    }
    public Integer getSandboxTTLInSeconds() {
        return this.sandboxTTLInSeconds;
    }

    public CreateTemplateInput setTemplateConfiguration(java.util.Map<String, ?> templateConfiguration) {
        this.templateConfiguration = templateConfiguration;
        return this;
    }
    public java.util.Map<String, ?> getTemplateConfiguration() {
        return this.templateConfiguration;
    }

    public CreateTemplateInput setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateTemplateInput setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
