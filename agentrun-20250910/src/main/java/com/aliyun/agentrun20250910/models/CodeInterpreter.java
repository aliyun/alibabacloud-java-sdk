// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CodeInterpreter extends TeaModel {
    /**
     * <p>The unique identifier for the CodeInterpreter.</p>
     * 
     * <strong>example:</strong>
     * <p>ci-1234567890abcdef</p>
     */
    @NameInMap("codeInterpreterId")
    public String codeInterpreterId;

    /**
     * <p>A user-defined name for the CodeInterpreter instance.</p>
     * 
     * <strong>example:</strong>
     * <p>my-code-interpreter</p>
     */
    @NameInMap("codeInterpreterName")
    public String codeInterpreterName;

    /**
     * <p>The number of CPU cores allocated to the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p>The creation timestamp for the CodeInterpreter, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T10:30:00Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>The description of the CodeInterpreter.</p>
     * 
     * <strong>example:</strong>
     * <p>Python code interpreter for data analysis</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The ARN of the execution role for this CodeInterpreter.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1760720386195983:role/CodeInterpreterExecutionRole</p>
     */
    @NameInMap("executionRoleArn")
    public String executionRoleArn;

    /**
     * <p>The last update timestamp for the CodeInterpreter, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T11:45:00Z</p>
     */
    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    /**
     * <p>The memory allocated to the instance, in MB.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("memory")
    public Integer memory;

    /**
     * <p>The network configuration for the CodeInterpreter.</p>
     */
    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    /**
     * <p>The current status of the CodeInterpreter, such as READY or TERMINATED.</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The reason for the current status, if applicable.</p>
     * 
     * <strong>example:</strong>
     * <p>Code interpreter is ready for use</p>
     */
    @NameInMap("statusReason")
    public String statusReason;

    /**
     * <p>The unique identifier for the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>tenant-1234567890abcdef</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CodeInterpreter build(java.util.Map<String, ?> map) throws Exception {
        CodeInterpreter self = new CodeInterpreter();
        return TeaModel.build(map, self);
    }

    public CodeInterpreter setCodeInterpreterId(String codeInterpreterId) {
        this.codeInterpreterId = codeInterpreterId;
        return this;
    }
    public String getCodeInterpreterId() {
        return this.codeInterpreterId;
    }

    public CodeInterpreter setCodeInterpreterName(String codeInterpreterName) {
        this.codeInterpreterName = codeInterpreterName;
        return this;
    }
    public String getCodeInterpreterName() {
        return this.codeInterpreterName;
    }

    public CodeInterpreter setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public CodeInterpreter setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CodeInterpreter setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CodeInterpreter setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
        return this;
    }
    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    public CodeInterpreter setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
        return this;
    }
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public CodeInterpreter setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public CodeInterpreter setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public CodeInterpreter setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CodeInterpreter setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public CodeInterpreter setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
