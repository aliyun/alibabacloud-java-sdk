// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopTypesRequest extends TeaModel {
    @NameInMap("AppliedScope")
    public String appliedScope;

    // The number of vCPUs.
    @NameInMap("CpuCount")
    public Integer cpuCount;

    @NameInMap("DesktopIdForModify")
    public String desktopIdForModify;

    // The ID of the cloud desktop type. Valid values:
    // 
    // *   eds.graphics.16c1t4
    // *   eds.graphics.24c1t4
    // *   eds.hf.12c24g
    // *   eds.hf.8c16g
    // *   eds.hf.4c8g
    // *   eds.general.8c32g
    // *   eds.general.16c32g
    // *   eds.general.8c16g
    // *   eds.general.4c16g
    // *   eds.general.4c8g
    // *   eds.general.2c8g
    // *   eds.general.2c4g
    // *   eds.general.2c2g
    // *   ecd.graphics.xlarge
    // *   ecd.graphics.2xlarge
    // *   ecd.performance.2xlarge
    // *   ecd.advanced.xlarge
    // *   ecd.advanced.large
    // *   ecd.basic.large
    // *   ecd.basic.small
    @NameInMap("DesktopTypeId")
    public String desktopTypeId;

    // The number of GPUs.
    @NameInMap("GpuCount")
    public Float gpuCount;

    // The family of the cloud desktop type. Valid values:
    // 
    // *   eds.graphics
    // *   eds.hf
    // *   eds.general
    // *   ecd.graphics
    // *   ecd.performance
    // *   ecd.advanced
    // *   ecd.basic
    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    // The memory size. Unit: GiB.
    @NameInMap("MemorySize")
    public Integer memorySize;

    @NameInMap("OrderType")
    public String orderType;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDesktopTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopTypesRequest self = new DescribeDesktopTypesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopTypesRequest setAppliedScope(String appliedScope) {
        this.appliedScope = appliedScope;
        return this;
    }
    public String getAppliedScope() {
        return this.appliedScope;
    }

    public DescribeDesktopTypesRequest setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public DescribeDesktopTypesRequest setDesktopIdForModify(String desktopIdForModify) {
        this.desktopIdForModify = desktopIdForModify;
        return this;
    }
    public String getDesktopIdForModify() {
        return this.desktopIdForModify;
    }

    public DescribeDesktopTypesRequest setDesktopTypeId(String desktopTypeId) {
        this.desktopTypeId = desktopTypeId;
        return this;
    }
    public String getDesktopTypeId() {
        return this.desktopTypeId;
    }

    public DescribeDesktopTypesRequest setGpuCount(Float gpuCount) {
        this.gpuCount = gpuCount;
        return this;
    }
    public Float getGpuCount() {
        return this.gpuCount;
    }

    public DescribeDesktopTypesRequest setInstanceTypeFamily(String instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
        return this;
    }
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    public DescribeDesktopTypesRequest setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Integer getMemorySize() {
        return this.memorySize;
    }

    public DescribeDesktopTypesRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribeDesktopTypesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
