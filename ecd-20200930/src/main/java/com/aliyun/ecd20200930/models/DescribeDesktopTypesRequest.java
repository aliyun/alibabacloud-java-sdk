// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopTypesRequest extends TeaModel {
    /**
     * <p>Applicable Scope of specifications. Default value: <code>Public</code></p>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("AppliedScope")
    public String appliedScope;

    /**
     * <p>The number of vCPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CpuCount")
    public Integer cpuCount;

    /**
     * <p>The ID of the cloud computer share you want to modify. If this parameter is provided, the response will include compatibility information for the specified specification.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-abcdefg****</p>
     */
    @NameInMap("DesktopGroupIdForModify")
    public String desktopGroupIdForModify;

    /**
     * <p>The ID of the cloud computer when you change instance types of cloud computers. If you specify this parameter, the information about whether the instance type is compatible with the cloud computer is included in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-gx2x1dhsmucyy****</p>
     */
    @NameInMap("DesktopIdForModify")
    public String desktopIdForModify;

    /**
     * <p>The specification ID.</p>
     * <blockquote>
     * <p> If both <code>InstanceTypeFamily</code> and <code>DesktopTypeId</code> are empty, all cloud computer specifications will be queried.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>eds.enterprise_office.4c8g</li>
     * <li>eds.hf.4c8g</li>
     * <li>ecd.basic.large</li>
     * <li>ecd.advanced.large</li>
     * <li>eds.enterprise_office.8c16g</li>
     * <li>ecd.basic.small</li>
     * <li>ecd.graphics.2xlarge</li>
     * <li>eds.hf.8c16g</li>
     * <li>eds.hf.12c24g</li>
     * <li>eds.general.8c16g</li>
     * <li>eds.general.16c32g</li>
     * <li>ecd.advanced.xlarge</li>
     * <li>eds.graphics.16c1t4</li>
     * <li>ecd.graphics.xlarge</li>
     * <li>ecd.performance.2xlarge</li>
     * <li>eds.general.8c32g</li>
     * <li>eds.general.2c2g</li>
     * <li>eds.general.2c4g</li>
     * <li>eds.graphics.24c1t4</li>
     * <li>eds.general.4c8g</li>
     * <li>eds.enterprise_office.2c4g</li>
     * <li>eds.general.4c16g</li>
     * <li>eds.general.2c8g</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ecd.graphics.xlarge</p>
     */
    @NameInMap("DesktopTypeId")
    public String desktopTypeId;

    /**
     * <p>The specification IDs.</p>
     */
    @NameInMap("DesktopTypeIdList")
    public java.util.List<String> desktopTypeIdList;

    /**
     * <p>The number of GPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GpuCount")
    public Float gpuCount;

    /**
     * <p>The GPU driver type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>T4</li>
     * <li>A10</li>
     * <li>G28</li>
     * <li>G39</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>A10</p>
     */
    @NameInMap("GpuDriverType")
    public String gpuDriverType;

    /**
     * <p>The GPU memory size. Unit: MB.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("GpuMemory")
    public Integer gpuMemory;

    /**
     * <p>The name of the specification family.</p>
     * <blockquote>
     * <p> If both <code>InstanceTypeFamily</code> and <code>DesktopTypeId</code> are empty, all specification families will be queried.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>ecd.advanced</li>
     * <li>eds.graphics</li>
     * <li>ecd.basic</li>
     * <li>eds.enterprise_office</li>
     * <li>eds.hf</li>
     * <li>ecd.graphics</li>
     * <li>eds.general</li>
     * <li>ecd.performance</li>
     * </ul>
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
     * <p>4</p>
     */
    @NameInMap("MemorySize")
    public Integer memorySize;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The sorting field. If this parameter is not provided, results are sorted by creation time in descending order.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Memory: sorts by memory size.</li>
     * <li>Cpu: sorts by the number of vCPUs.</li>
     * </ul>
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
     * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The sales mode of the specification.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>MonthPackage: the monthly subscription mode.</li>
     * <li>FastBuy: the quick purchase mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FastBuy</p>
     */
    @NameInMap("Scope")
    public String scope;

    @NameInMap("ScopeSet")
    public java.util.List<String> scopeSet;

    /**
     * <p>The sorting order.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>ASC (default): the ascending order.</li>
     * <li>DESC: the descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("SortType")
    public String sortType;

    /**
     * <p>The number of sessions supported by the specification.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SupportMinSessionCount")
    public Integer supportMinSessionCount;

    /**
     * <blockquote>
     * <p> This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
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
