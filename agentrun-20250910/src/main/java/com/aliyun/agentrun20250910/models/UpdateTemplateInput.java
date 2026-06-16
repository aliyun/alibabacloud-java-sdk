// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateTemplateInput extends TeaModel {
    /**
     * <p>Specifies whether the data link is allowed to invoke APIs to create, stop, or delete sandboxes</p>
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
     * <p>Configuration information for Application Real-Time Monitoring Service (ARMS)</p>
     */
    @NameInMap("armsConfiguration")
    public ArmsConfiguration armsConfiguration;

    /**
     * <p>Container configuration (built-in and immutable)</p>
     */
    @NameInMap("containerConfiguration")
    public ContainerConfiguration containerConfiguration;

    /**
     * <p>CPU resource configuration (unit: core)</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p>Credential configuration</p>
     */
    @NameInMap("credentialConfiguration")
    public CredentialConfiguration credentialConfiguration;

    /**
     * <p>Template description</p>
     * 
     * <strong>example:</strong>
     * <p>demo description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Sandbox Agent toggle</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAgent")
    public Boolean enableAgent;

    @NameInMap("enablePreStop")
    public Boolean enablePreStop;

    /**
     * <p>Environment variables</p>
     */
    @NameInMap("environmentVariables")
    public java.util.Map<String, String> environmentVariables;

    /**
     * <p>Execution role ARN</p>
     * 
     * <strong>example:</strong>
     * <p>arn:acs:agentrun:cn-hangzhou:123456789:xxx/test</p>
     */
    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    /**
     * <p>Log configuration</p>
     */
    @NameInMap("logConfiguration")
    public LogConfiguration logConfiguration;

    /**
     * <p>Memory resource configuration (unit: MB)</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("memory")
    public Integer memory;

    /**
     * <p>NAS mount configuration item</p>
     */
    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    /**
     * <p>Network configuration</p>
     */
    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    /**
     * <p>OSS mount configuration</p>
     */
    @NameInMap("ossConfiguration")
    public java.util.List<OssConfiguration> ossConfiguration;

    @NameInMap("preStopTimeoutInSeconds")
    public Integer preStopTimeoutInSeconds;

    /**
     * <p>Sandbox idle timeout (seconds)</p>
     * 
     * <strong>example:</strong>
     * <p>21600</p>
     */
    @NameInMap("sandboxIdleTimeoutInSeconds")
    public Integer sandboxIdleTimeoutInSeconds;

    /**
     * <p>Sandbox time to live (seconds)</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("sandboxTTLInSeconds")
    public Integer sandboxTTLInSeconds;

    /**
     * <p>Elasticity configuration</p>
     */
    @NameInMap("scalingConfig")
    public ScalingConfig scalingConfig;

    /**
     * <p>Template configuration (a flexible object structure that varies based on templateType)</p>
     */
    @NameInMap("templateConfiguration")
    public java.util.Map<String, ?> templateConfiguration;

    /**
     * <p>Associated Space ID</p>
     * 
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

    public UpdateTemplateInput setEnablePreStop(Boolean enablePreStop) {
        this.enablePreStop = enablePreStop;
        return this;
    }
    public Boolean getEnablePreStop() {
        return this.enablePreStop;
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

    public UpdateTemplateInput setPreStopTimeoutInSeconds(Integer preStopTimeoutInSeconds) {
        this.preStopTimeoutInSeconds = preStopTimeoutInSeconds;
        return this;
    }
    public Integer getPreStopTimeoutInSeconds() {
        return this.preStopTimeoutInSeconds;
    }

    public UpdateTemplateInput setSandboxIdleTimeoutInSeconds(Integer sandboxIdleTimeoutInSeconds) {
        this.sandboxIdleTimeoutInSeconds = sandboxIdleTimeoutInSeconds;
        return this;
    }
    public Integer getSandboxIdleTimeoutInSeconds() {
        return this.sandboxIdleTimeoutInSeconds;
    }

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
