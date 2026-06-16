// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateCodeInterpreterInput extends TeaModel {
    /**
     * <p>The name of the code interpreter. Use this to identify and distinguish code interpreter instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-code-interpreter</p>
     */
    @NameInMap("codeInterpreterName")
    public String codeInterpreterName;

    /**
     * <p>The amount of CPU to allocate, in cores.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p>The credential ID used for authentication.</p>
     * 
     * <strong>example:</strong>
     * <p>cred-1234567890abcdef</p>
     */
    @NameInMap("credentialId")
    public String credentialId;

    /**
     * <p>A description of the code interpreter.</p>
     * 
     * <strong>example:</strong>
     * <p>Python code interpreter for data analysis</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the execution role for the code interpreter.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1760720386195983:role/CodeInterpreterExecutionRole</p>
     */
    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    /**
     * <p>The amount of memory to allocate, in megabytes (MB).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("memory")
    public Integer memory;

    /**
     * <p>Specifies the network configuration for the code interpreter, including VPC and security group settings.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    /**
     * <p>The idle timeout for a session, in seconds. If an instance has no new requests for this duration, its session expires and cannot be reused.</p>
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
