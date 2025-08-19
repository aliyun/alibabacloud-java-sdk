// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ResidentResourceCapacity extends TeaModel {
    /**
     * <p>GPU 卡型</p>
     */
    @NameInMap("gpuType")
    public String gpuType;

    /**
     * <p>CPU 总核数</p>
     */
    @NameInMap("totalCpuCores")
    public Long totalCpuCores;

    /**
     * <p>总磁盘大小，单位 GB</p>
     */
    @NameInMap("totalDiskSize")
    public Long totalDiskSize;

    /**
     * <p>GPU总卡数</p>
     */
    @NameInMap("totalGpuCards")
    public Long totalGpuCards;

    /**
     * <p>总显存大小，单位 GB</p>
     */
    @NameInMap("totalGpuMemorySize")
    public Long totalGpuMemorySize;

    /**
     * <p>总内存大小，单位 GB</p>
     */
    @NameInMap("totalMemorySize")
    public Long totalMemorySize;

    public static ResidentResourceCapacity build(java.util.Map<String, ?> map) throws Exception {
        ResidentResourceCapacity self = new ResidentResourceCapacity();
        return TeaModel.build(map, self);
    }

    public ResidentResourceCapacity setGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }
    public String getGpuType() {
        return this.gpuType;
    }

    public ResidentResourceCapacity setTotalCpuCores(Long totalCpuCores) {
        this.totalCpuCores = totalCpuCores;
        return this;
    }
    public Long getTotalCpuCores() {
        return this.totalCpuCores;
    }

    public ResidentResourceCapacity setTotalDiskSize(Long totalDiskSize) {
        this.totalDiskSize = totalDiskSize;
        return this;
    }
    public Long getTotalDiskSize() {
        return this.totalDiskSize;
    }

    public ResidentResourceCapacity setTotalGpuCards(Long totalGpuCards) {
        this.totalGpuCards = totalGpuCards;
        return this;
    }
    public Long getTotalGpuCards() {
        return this.totalGpuCards;
    }

    public ResidentResourceCapacity setTotalGpuMemorySize(Long totalGpuMemorySize) {
        this.totalGpuMemorySize = totalGpuMemorySize;
        return this;
    }
    public Long getTotalGpuMemorySize() {
        return this.totalGpuMemorySize;
    }

    public ResidentResourceCapacity setTotalMemorySize(Long totalMemorySize) {
        this.totalMemorySize = totalMemorySize;
        return this;
    }
    public Long getTotalMemorySize() {
        return this.totalMemorySize;
    }

}
