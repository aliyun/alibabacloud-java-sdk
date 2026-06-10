// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopTypesRequest extends TeaModel {
    /**
     * <p>The scope of the instance types to query. Default value: <code>Public</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("AppliedScope")
    public String appliedScope;

    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>The number of vCPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CpuCount")
    public Integer cpuCount;

    /**
     * <p>The ID of the desktop group to reconfigure. If you specify this parameter, the response returns only the instance types that are compatible with the specified group.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-abcdefg****</p>
     */
    @NameInMap("DesktopGroupIdForModify")
    public String desktopGroupIdForModify;

    /**
     * <p>The ID of the WUYING Workspace to reconfigure. If you specify this parameter, the response returns only the instance types that are compatible with the specified workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-gx2x1dhsmucyy****</p>
     */
    @NameInMap("DesktopIdForModify")
    public String desktopIdForModify;

    @NameInMap("DesktopScenario")
    public String desktopScenario;

    /**
     * <p>The ID of the instance type.</p>
     * <blockquote>
     * <p>If you omit both the <code>InstanceTypeFamily</code> and <code>DesktopTypeId</code> parameters, the operation returns all available WUYING Workspace instance types.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecd.graphics.xlarge</p>
     */
    @NameInMap("DesktopTypeId")
    public String desktopTypeId;

    /**
     * <p>An array of instance type IDs.</p>
     */
    @NameInMap("DesktopTypeIdList")
    public java.util.List<String> desktopTypeIdList;

    /**
     * <p>The number of vGPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GpuCount")
    public Float gpuCount;

    /**
     * <p>The GPU driver type.</p>
     * 
     * <strong>example:</strong>
     * <p>A10</p>
     */
    @NameInMap("GpuDriverType")
    public String gpuDriverType;

    @NameInMap("GpuMemory")
    public Integer gpuMemory;

    /**
     * <p>The instance type family.</p>
     * <blockquote>
     * <p>If you omit both the <code>InstanceTypeFamily</code> and <code>DesktopTypeId</code> parameters, the operation returns all available WUYING Workspace instance types.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecd.graphics</p>
     */
    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    /**
     * <p>The memory size, in MiB.</p>
     * 
     * <strong>example:</strong>
     * <p>4096</p>
     */
    @NameInMap("MemorySize")
    public Integer memorySize;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The property by which to sort the results. If you omit this parameter, the results are sorted by creation time in descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>Memory</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The order type.</p>
     * 
     * <strong>example:</strong>
     * <p>DOWNGRADE</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The ID of the region. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the regions that Elastic Desktop Service supports.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The billing method of the instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>FastBuy</p>
     */
    @NameInMap("Scope")
    public String scope;

    @NameInMap("ScopeSet")
    public java.util.List<String> scopeSet;

    /**
     * <p>The sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("SortType")
    public String sortType;

    /**
     * <p>Filters for instance types that support at least the specified number of concurrent sessions. This parameter applies only to multi-session instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SupportMinSessionCount")
    public Integer supportMinSessionCount;

    /**
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

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

    public DescribeDesktopTypesRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
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

    public DescribeDesktopTypesRequest setDesktopScenario(String desktopScenario) {
        this.desktopScenario = desktopScenario;
        return this;
    }
    public String getDesktopScenario() {
        return this.desktopScenario;
    }

    public DescribeDesktopTypesRequest setDesktopTypeId(String desktopTypeId) {
        this.desktopTypeId = desktopTypeId;
        return this;
    }
    public String getDesktopTypeId() {
        return this.desktopTypeId;
    }

    public DescribeDesktopTypesRequest setDesktopTypeIdList(java.util.List<String> desktopTypeIdList) {
        this.desktopTypeIdList = desktopTypeIdList;
        return this;
    }
    public java.util.List<String> getDesktopTypeIdList() {
        return this.desktopTypeIdList;
    }

    public DescribeDesktopTypesRequest setGpuCount(Float gpuCount) {
        this.gpuCount = gpuCount;
        return this;
    }
    public Float getGpuCount() {
        return this.gpuCount;
    }

    public DescribeDesktopTypesRequest setGpuDriverType(String gpuDriverType) {
        this.gpuDriverType = gpuDriverType;
        return this;
    }
    public String getGpuDriverType() {
        return this.gpuDriverType;
    }

    public DescribeDesktopTypesRequest setGpuMemory(Integer gpuMemory) {
        this.gpuMemory = gpuMemory;
        return this;
    }
    public Integer getGpuMemory() {
        return this.gpuMemory;
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

    public DescribeDesktopTypesRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeDesktopTypesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
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

    public DescribeDesktopTypesRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public DescribeDesktopTypesRequest setScopeSet(java.util.List<String> scopeSet) {
        this.scopeSet = scopeSet;
        return this;
    }
    public java.util.List<String> getScopeSet() {
        return this.scopeSet;
    }

    public DescribeDesktopTypesRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public DescribeDesktopTypesRequest setSupportMinSessionCount(Integer supportMinSessionCount) {
        this.supportMinSessionCount = supportMinSessionCount;
        return this;
    }
    public Integer getSupportMinSessionCount() {
        return this.supportMinSessionCount;
    }

    public DescribeDesktopTypesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
