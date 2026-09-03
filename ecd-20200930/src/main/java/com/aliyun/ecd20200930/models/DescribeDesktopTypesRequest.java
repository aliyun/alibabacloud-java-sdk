// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopTypesRequest extends TeaModel {
    /**
     * <p>The applicable scope of the specification. Default value: <code>Public</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("AppliedScope")
    public String appliedScope;

    /**
     * <p>The business channel. Valid values:
     * Enterprise: Enterprise Edition.
     * Business: Business Edition.</p>
     * 
     * <strong>example:</strong>
     * <p>Enterprise</p>
     */
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
     * <p>The ID of the shared cloud computer for which you want to change the specification. If this parameter is specified, the response includes compatibility information between the specification and the shared cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-abcdefg****</p>
     */
    @NameInMap("DesktopGroupIdForModify")
    public String desktopGroupIdForModify;

    /**
     * <p>The ID of the cloud computer for which you want to change the specification. If this parameter is specified, the response includes compatibility information between the specification and the cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-gx2x1dhsmucyy****</p>
     */
    @NameInMap("DesktopIdForModify")
    public String desktopIdForModify;

    /**
     * <p>The scenarios of the cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>office</p>
     */
    @NameInMap("DesktopScenario")
    public String desktopScenario;

    /**
     * <p>The specification ID.</p>
     * <blockquote>
     * <p>If both <code>InstanceTypeFamily</code> and <code>DesktopTypeId</code> are left empty, information about all cloud computer specifications is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecd.graphics.xlarge</p>
     */
    @NameInMap("DesktopTypeId")
    public String desktopTypeId;

    /**
     * <p>The list of specification IDs.</p>
     */
    @NameInMap("DesktopTypeIdList")
    public java.util.List<String> desktopTypeIdList;

    /**
     * <p>The number of GPU cores.</p>
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

    /**
     * <p>The GPU memory size. This parameter is meaningful only for GPU-accelerated cloud computers. Unit: MB.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("GpuMemory")
    public Integer gpuMemory;

    /**
     * <p>The instance family name.</p>
     * <blockquote>
     * <p>If both <code>InstanceTypeFamily</code> and <code>DesktopTypeId</code> are left empty, information about all cloud computer specifications is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecd.graphics</p>
     */
    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    /**
     * <p>The memory size. Unit: MiB.</p>
     * 
     * <strong>example:</strong>
     * <p>4096</p>
     */
    @NameInMap("MemorySize")
    public Integer memorySize;

    /**
     * <p>The ID of the office network to which the shared cloud computer belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+os-c5cy7q578s8jc****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The field by which to sort the results. If this parameter is not specified, results are sorted by creation time in descending order.</p>
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
     * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by WUYING Workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The billing method of the specification.</p>
     * 
     * <strong>example:</strong>
     * <p>FastBuy</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The list of applicable scopes.</p>
     */
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
     * <p>The minimum number of multi-sessions supported by the specification.</p>
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
     * <p>cn-hangzhou-j</p>
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
