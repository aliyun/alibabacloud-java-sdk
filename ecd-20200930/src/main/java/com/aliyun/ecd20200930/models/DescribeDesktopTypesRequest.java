// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopTypesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DesktopTypeId")
    public String desktopTypeId;

    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    @NameInMap("CpuCount")
    public Integer cpuCount;

    @NameInMap("MemorySize")
    public Integer memorySize;

    @NameInMap("GpuCount")
    public Float gpuCount;

    public static DescribeDesktopTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopTypesRequest self = new DescribeDesktopTypesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopTypesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDesktopTypesRequest setDesktopTypeId(String desktopTypeId) {
        this.desktopTypeId = desktopTypeId;
        return this;
    }
    public String getDesktopTypeId() {
        return this.desktopTypeId;
    }

    public DescribeDesktopTypesRequest setInstanceTypeFamily(String instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
        return this;
    }
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    public DescribeDesktopTypesRequest setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public DescribeDesktopTypesRequest setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Integer getMemorySize() {
        return this.memorySize;
    }

    public DescribeDesktopTypesRequest setGpuCount(Float gpuCount) {
        this.gpuCount = gpuCount;
        return this;
    }
    public Float getGpuCount() {
        return this.gpuCount;
    }

}
