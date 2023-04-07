// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopTypesRequest extends TeaModel {
    /**
     * <p>The applicable scope of the desktop type. Default value: `Public`.</p>
     */
    @NameInMap("AppliedScope")
    public String appliedScope;

    /**
     * <p>The number of vCPUs.</p>
     */
    @NameInMap("CpuCount")
    public Integer cpuCount;

    /**
     * <p>The ID of the cloud desktop whose desktop type that you want to modify. If you specify this parameter, the information that is returned includes whether the desktop type is compatible with the cloud desktop.</p>
     */
    @NameInMap("DesktopIdForModify")
    public String desktopIdForModify;

    /**
     * <p>The ID of the desktop type. Valid values:</p>
     * <br>
     * <p>*   eds.graphics.16c1t4</p>
     * <p>*   eds.graphics.24c1t4</p>
     * <p>*   eds.hf.12c24g</p>
     * <p>*   eds.hf.8c16g</p>
     * <p>*   eds.hf.4c8g</p>
     * <p>*   eds.general.8c32g</p>
     * <p>*   eds.general.16c32g</p>
     * <p>*   eds.general.8c16g</p>
     * <p>*   eds.general.4c16g</p>
     * <p>*   eds.general.4c8g</p>
     * <p>*   eds.general.2c8g</p>
     * <p>*   eds.general.2c4g</p>
     * <p>*   eds.general.2c2g</p>
     * <p>*   ecd.graphics.xlarge</p>
     * <p>*   ecd.graphics.2xlarge</p>
     * <p>*   ecd.performance.2xlarge</p>
     * <p>*   ecd.advanced.xlarge</p>
     * <p>*   ecd.advanced.large</p>
     * <p>*   ecd.basic.large</p>
     * <p>*   ecd.basic.small</p>
     * <br>
     * <p>> When no values are specified for the `InstanceTypeFamily` and `DesktopTypeId` parameters for a cloud desktop, all desktop types are queried.</p>
     */
    @NameInMap("DesktopTypeId")
    public String desktopTypeId;

    /**
     * <p>The number of GPUs.</p>
     */
    @NameInMap("GpuCount")
    public Float gpuCount;

    /**
     * <p>The family of the cloud desktop type. Valid values:</p>
     * <br>
     * <p>*   eds.graphics</p>
     * <p>*   eds.hf</p>
     * <p>*   eds.general</p>
     * <p>*   ecd.graphics</p>
     * <p>*   ecd.performance</p>
     * <p>*   ecd.advanced</p>
     * <p>*   ecd.basic</p>
     * <br>
     * <p>> When no values are specified for the `InstanceTypeFamily` and `DesktopTypeId` parameters for a cloud desktop, all desktop types are queried.</p>
     */
    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    /**
     * <p>The size of the memory. Unit: GiB.</p>
     */
    @NameInMap("MemorySize")
    public Integer memorySize;

    /**
     * <p>The type of the order that you want to place.</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
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
