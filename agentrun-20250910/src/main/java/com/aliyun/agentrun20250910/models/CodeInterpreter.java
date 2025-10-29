// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CodeInterpreter extends TeaModel {
    /**
     * <p>代码解释器的唯一标识符</p>
     * 
     * <strong>example:</strong>
     * <p>ci-1234567890abcdef</p>
     */
    @NameInMap("codeInterpreterId")
    public String codeInterpreterId;

    /**
     * <p>代码解释器的名称，用于标识和区分不同的代码解释器实例</p>
     * 
     * <strong>example:</strong>
     * <p>my-code-interpreter</p>
     */
    @NameInMap("codeInterpreterName")
    public String codeInterpreterName;

    /**
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p>代码解释器的创建时间，采用ISO 8601格式</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T10:30:00Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

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
     * <p>代码解释器的最后更新时间，采用ISO 8601格式</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-10T11:45:00Z</p>
     */
    @NameInMap("lastUpdatedAt")
    public String lastUpdatedAt;

    /**
     * <p>内存资源配置（单位：MB）</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("memory")
    public Integer memory;

    /**
     * <p>代码解释器的网络配置信息</p>
     */
    @NameInMap("networkConfiguration")
    public NetworkConfiguration networkConfiguration;

    /**
     * <p>代码解释器的当前状态，如READY（就绪）、TERMINATED（已终止）等</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>当前状态的原因说明（如适用）</p>
     * 
     * <strong>example:</strong>
     * <p>Code interpreter is ready for use</p>
     */
    @NameInMap("statusReason")
    public String statusReason;

    /**
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
