// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ResidentResourceAllocation extends TeaModel {
    /**
     * <p>使用该资源池的函数名</p>
     */
    @NameInMap("functionName")
    public String functionName;

    /**
     * <p>实例数</p>
     */
    @NameInMap("instanceCount")
    public Integer instanceCount;

    @NameInMap("instanceType")
    public String instanceType;

    /**
     * <p>函数的别名</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>CPU 占用总核数</p>
     */
    @NameInMap("totalCpuCores")
    public Double totalCpuCores;

    /**
     * <p>占用磁盘大小，单位 GB</p>
     */
    @NameInMap("totalDiskSize")
    public Double totalDiskSize;

    /**
     * <p>占用显存大小，单位 GB</p>
     */
    @NameInMap("totalGpuMemorySize")
    public Double totalGpuMemorySize;

    /**
     * <p>内存占用大小，单位 GB</p>
     */
    @NameInMap("totalMemorySize")
    public Double totalMemorySize;

    public static ResidentResourceAllocation build(java.util.Map<String, ?> map) throws Exception {
        ResidentResourceAllocation self = new ResidentResourceAllocation();
        return TeaModel.build(map, self);
    }

    public ResidentResourceAllocation setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public ResidentResourceAllocation setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public ResidentResourceAllocation setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ResidentResourceAllocation setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public ResidentResourceAllocation setTotalCpuCores(Double totalCpuCores) {
        this.totalCpuCores = totalCpuCores;
        return this;
    }
    public Double getTotalCpuCores() {
        return this.totalCpuCores;
    }

    public ResidentResourceAllocation setTotalDiskSize(Double totalDiskSize) {
        this.totalDiskSize = totalDiskSize;
        return this;
    }
    public Double getTotalDiskSize() {
        return this.totalDiskSize;
    }

    public ResidentResourceAllocation setTotalGpuMemorySize(Double totalGpuMemorySize) {
        this.totalGpuMemorySize = totalGpuMemorySize;
        return this;
    }
    public Double getTotalGpuMemorySize() {
        return this.totalGpuMemorySize;
    }

    public ResidentResourceAllocation setTotalMemorySize(Double totalMemorySize) {
        this.totalMemorySize = totalMemorySize;
        return this;
    }
    public Double getTotalMemorySize() {
        return this.totalMemorySize;
    }

}
