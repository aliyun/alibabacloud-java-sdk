// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateTemplateInput extends TeaModel {
    /**
     * <p>Controls whether data plane calls can create, stop, or delete the sandbox.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("allowAnonymousManage")
    public Boolean allowAnonymousManage;

    /**
     * <p>The Application Real-Time Monitoring Service (ARMS) configuration.</p>
     */
    @NameInMap("armsConfiguration")
    public ArmsConfiguration armsConfiguration;

    /**
     * <p>The container configuration. You can only use images based on the Browser or Code Interpreter base images.</p>
     */
    @NameInMap("containerConfiguration")
    public ContainerConfiguration containerConfiguration;

    /**
     * <p>The number of CPU cores.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p>The credential configuration.</p>
     */
    @NameInMap("credentialConfiguration")
    public CredentialConfiguration credentialConfiguration;

    /**
     * <p>The template description.</p>
     * 
     * <strong>example:</strong>
     * <p>模板描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The disk size in MB.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("diskSize")
    public Integer diskSize;

    /**
     * <p>Controls whether to enable the Sandbox Agent.</p>
     */
    @NameInMap("enableAgent")
    public Boolean enableAgent;

    /**
     * <p>Specifies whether to enable the pre-stop hook.</p>
     */
    @NameInMap("enablePreStop")
    public Boolean enablePreStop;

    /**
     * <p>The environment variables for the sandbox.</p>
     */
    @NameInMap("environmentVariables")
    public java.util.Map<String, String> environmentVariables;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the execution role.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789:role/aliyunfcdefaultrole</p>
     */
    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    /**
     * <p>The log configuration.</p>
     */
    @NameInMap("logConfiguration")
    public LogConfiguration logConfiguration;

    /**
     * <p>The memory size in MB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("memory")
    public Integer memory;

    /**
     * <p>The Network Attached Storage (NAS) mount configuration.</p>
     */
    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    /**
     * <p>The network configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    /**
     * <p>A list of Object Storage Service (OSS) configurations.</p>
     */
    @NameInMap("ossConfiguration")
    public java.util.List<OssConfiguration> ossConfiguration;

    /**
     * <p>The timeout for the pre-stop hook, in seconds. This parameter applies only when <code>enablePreStop</code> is set to <code>true</code>.</p>
     */
    @NameInMap("preStopTimeoutInSeconds")
    public Integer preStopTimeoutInSeconds;

    /**
     * <p>The duration in seconds that a sandbox can be idle before it is automatically stopped.</p>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("sandboxIdleTimeoutInSeconds")
    public Integer sandboxIdleTimeoutInSeconds;

    /**
     * <p>The maximum time-to-live (TTL) in seconds for the sandbox. The sandbox is terminated after this duration, regardless of activity.</p>
     * 
     * <strong>example:</strong>
     * <p>26000</p>
     */
    @NameInMap("sandboxTTLInSeconds")
    public Integer sandboxTTLInSeconds;

    /**
     * <p>The scaling configuration.</p>
     */
    @NameInMap("scalingConfig")
    public ScalingConfig scalingConfig;

    /**
     * <p>The template configuration. This is a flexible object whose structure varies depending on the <code>templateType</code>.</p>
     */
    @NameInMap("templateConfiguration")
    public java.util.Map<String, ?> templateConfiguration;

    /**
     * <p>A unique name for the template within your account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>browser-1766687911567</p>
     */
    @NameInMap("templateName")
    public String templateName;

    /**
     * <p>The template type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Browser</p>
     */
    @NameInMap("templateType")
    public String templateType;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

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

    public CreateTemplateInput setEnableAgent(Boolean enableAgent) {
        this.enableAgent = enableAgent;
        return this;
    }
    public Boolean getEnableAgent() {
        return this.enableAgent;
    }

    public CreateTemplateInput setEnablePreStop(Boolean enablePreStop) {
        this.enablePreStop = enablePreStop;
        return this;
    }
    public Boolean getEnablePreStop() {
        return this.enablePreStop;
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

    public CreateTemplateInput setNasConfig(NASConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public NASConfig getNasConfig() {
        return this.nasConfig;
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

    public CreateTemplateInput setPreStopTimeoutInSeconds(Integer preStopTimeoutInSeconds) {
        this.preStopTimeoutInSeconds = preStopTimeoutInSeconds;
        return this;
    }
    public Integer getPreStopTimeoutInSeconds() {
        return this.preStopTimeoutInSeconds;
    }

    public CreateTemplateInput setSandboxIdleTimeoutInSeconds(Integer sandboxIdleTimeoutInSeconds) {
        this.sandboxIdleTimeoutInSeconds = sandboxIdleTimeoutInSeconds;
        return this;
    }
    public Integer getSandboxIdleTimeoutInSeconds() {
        return this.sandboxIdleTimeoutInSeconds;
    }

    public CreateTemplateInput setSandboxTTLInSeconds(Integer sandboxTTLInSeconds) {
        this.sandboxTTLInSeconds = sandboxTTLInSeconds;
        return this;
    }
    public Integer getSandboxTTLInSeconds() {
        return this.sandboxTTLInSeconds;
    }

    public CreateTemplateInput setScalingConfig(ScalingConfig scalingConfig) {
        this.scalingConfig = scalingConfig;
        return this;
    }
    public ScalingConfig getScalingConfig() {
        return this.scalingConfig;
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

    public CreateTemplateInput setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
