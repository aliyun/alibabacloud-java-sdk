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
     * <p>The ID of the cloud computer pool when you change instance types of cloud computers. If you specify this parameter, the information about whether the instance type is compatible with the cloud computer pool is included in the response.</p>
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
     * <p>The IDs of the instance types of cloud computers.</p>
     * <blockquote>
     * <p> If the values of the <code>InstanceTypeFamily</code> and <code>DesktopTypeId</code> parameters are empty, all instance types of cloud computers are queried.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>eds.hf.4c8g</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>ecd.basic.large</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>ecd.advanced.large</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>ecd.basic.small</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>ecd.graphics.2xlarge</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>eds.hf.8c16g</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>eds.hf.12c24g</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>eds.general.8c16g</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>eds.general.16c32g</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>ecd.advanced.xlarge</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>eds.graphics.16c1t4</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>ecd.graphics.xlarge</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>ecd.performance.2xlarge</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>eds.general.8c32g</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>eds.general.2c2g</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>eds.general.2c4g</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>eds.graphics.24c1t4</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>eds.general.4c8g</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>eds.general.4c16g</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>eds.general.2c8g</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ecd.graphics.xlarge</p>
     */
    @NameInMap("DesktopTypeId")
    public String desktopTypeId;

    /**
     * <p>The number of GPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GpuCount")
    public Float gpuCount;

    /**
     * <p>The name of the instance family.</p>
     * <blockquote>
     * <p> If the values of the <code>InstanceTypeFamily</code> and <code>DesktopTypeId</code> parameters are empty, all instance families of cloud computers are queried.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>ecd.advanced</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>eds.graphics</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>ecd.basic</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>eds.hf</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>ecd.graphics</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>eds.general</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>ecd.performance</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
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

    /**
     * <p>The order type.</p>
     * 
     * <strong>example:</strong>
     * <p>DOWNGRADE</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
