// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateCodeInterpreterInput extends TeaModel {
    /**
     * <p>代码解释器的名称，用于标识和区分不同的代码解释器实例</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-code-interpreter</p>
     */
    @NameInMap("codeInterpreterName")
    public String codeInterpreterName;

    /**
     * <p>CPU资源配置（单位：核数）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <strong>example:</strong>
     * <p>cred-1234567890abcdef</p>
     */
    @NameInMap("credentialId")
    public String credentialId;

    /**
     * <p>代码解释器的描述信息，说明该解释器的用途和功能</p>
     * 
     * <strong>example:</strong>
     * <p>Python code interpreter for data analysis</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>此代码解释器的执行角色</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1760720386195983:role/CodeInterpreterExecutionRole</p>
     */
    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    /**
     * <p>内存资源配置（单位：MB）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("memory")
    public Integer memory;

    /**
     * <p>代码解释器的网络配置，包括VPC、安全组等网络访问设置</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    /**
     * <p>会话的空闲超时时间，单位为秒。实例没有会话请求后处于空闲状态，空闲态为闲置计费模式，超过此超时时间后会话自动过期，不可继续使用</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("sessionIdleTimeoutSeconds")
    public Integer sessionIdleTimeoutSeconds;

    public static CreateCodeInterpreterInput build(java.util.Map<String, ?> map) throws Exception {
        CreateCodeInterpreterInput self = new CreateCodeInterpreterInput();
        return TeaModel.build(map, self);
    }

    public CreateCodeInterpreterInput setCodeInterpreterName(String codeInterpreterName) {
        this.codeInterpreterName = codeInterpreterName;
        return this;
    }
    public String getCodeInterpreterName() {
        return this.codeInterpreterName;
    }

    public CreateCodeInterpreterInput setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public CreateCodeInterpreterInput setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public CreateCodeInterpreterInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCodeInterpreterInput setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public CreateCodeInterpreterInput setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public CreateCodeInterpreterInput setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public CreateCodeInterpreterInput setSessionIdleTimeoutSeconds(Integer sessionIdleTimeoutSeconds) {
        this.sessionIdleTimeoutSeconds = sessionIdleTimeoutSeconds;
        return this;
    }
    public Integer getSessionIdleTimeoutSeconds() {
        return this.sessionIdleTimeoutSeconds;
    }

}
