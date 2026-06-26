// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateTimedResidentResourcePoolApplicationInput extends TeaModel {
    @NameInMap("associatedPoolId")
    public String associatedPoolId;

    @NameInMap("diskSizeInGB")
    public Long diskSizeInGB;

    @NameInMap("gpuType")
    public String gpuType;

    @NameInMap("memorySizeInGB")
    public Long memorySizeInGB;

    @NameInMap("operationType")
    public String operationType;

    @NameInMap("poolName")
    public String poolName;

    @NameInMap("reason")
    public String reason;

    @NameInMap("timedConfig")
    public TimedPoolConfig timedConfig;

    @NameInMap("timedPoolId")
    public String timedPoolId;

    @NameInMap("totalGPUCards")
    public Long totalGPUCards;

    @NameInMap("vCpuCores")
    public Long vCpuCores;

    public static CreateTimedResidentResourcePoolApplicationInput build(java.util.Map<String, ?> map) throws Exception {
        CreateTimedResidentResourcePoolApplicationInput self = new CreateTimedResidentResourcePoolApplicationInput();
        return TeaModel.build(map, self);
    }

    public CreateTimedResidentResourcePoolApplicationInput setAssociatedPoolId(String associatedPoolId) {
        this.associatedPoolId = associatedPoolId;
        return this;
    }
    public String getAssociatedPoolId() {
        return this.associatedPoolId;
    }

    public CreateTimedResidentResourcePoolApplicationInput setDiskSizeInGB(Long diskSizeInGB) {
        this.diskSizeInGB = diskSizeInGB;
        return this;
    }
    public Long getDiskSizeInGB() {
        return this.diskSizeInGB;
    }

    public CreateTimedResidentResourcePoolApplicationInput setGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }
    public String getGpuType() {
        return this.gpuType;
    }

    public CreateTimedResidentResourcePoolApplicationInput setMemorySizeInGB(Long memorySizeInGB) {
        this.memorySizeInGB = memorySizeInGB;
        return this;
    }
    public Long getMemorySizeInGB() {
        return this.memorySizeInGB;
    }

    public CreateTimedResidentResourcePoolApplicationInput setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public CreateTimedResidentResourcePoolApplicationInput setPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }
    public String getPoolName() {
        return this.poolName;
    }

    public CreateTimedResidentResourcePoolApplicationInput setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public CreateTimedResidentResourcePoolApplicationInput setTimedConfig(TimedPoolConfig timedConfig) {
        this.timedConfig = timedConfig;
        return this;
    }
    public TimedPoolConfig getTimedConfig() {
        return this.timedConfig;
    }

    public CreateTimedResidentResourcePoolApplicationInput setTimedPoolId(String timedPoolId) {
        this.timedPoolId = timedPoolId;
        return this;
    }
    public String getTimedPoolId() {
        return this.timedPoolId;
    }

    public CreateTimedResidentResourcePoolApplicationInput setTotalGPUCards(Long totalGPUCards) {
        this.totalGPUCards = totalGPUCards;
        return this;
    }
    public Long getTotalGPUCards() {
        return this.totalGPUCards;
    }

    public CreateTimedResidentResourcePoolApplicationInput setVCpuCores(Long vCpuCores) {
        this.vCpuCores = vCpuCores;
        return this;
    }
    public Long getVCpuCores() {
        return this.vCpuCores;
    }

}
