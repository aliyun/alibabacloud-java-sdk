// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopTypesRequest extends TeaModel {
    @NameInMap("AppliedScope")
    public String appliedScope;

    @NameInMap("CpuCount")
    public Integer cpuCount;

    @NameInMap("DesktopGroupIdForModify")
    public String desktopGroupIdForModify;

    @NameInMap("DesktopIdForModify")
    public String desktopIdForModify;

    @NameInMap("DesktopTypeId")
    public String desktopTypeId;

    @NameInMap("GpuCount")
    public Float gpuCount;

    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    @NameInMap("MemorySize")
    public Integer memorySize;

    @NameInMap("OrderType")
    public String orderType;

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

    public DescribeDesktopTypesRequest setDesktopGroupIdForModify(String desktopGroupIdForModify) {
        this.desktopGroupIdForModify = desktopGroupIdForModify;
        return this;
    }
    public String getDesktopGroupIdForModify() {
        return this.desktopGroupIdForModify;
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
