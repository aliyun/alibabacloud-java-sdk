// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeModificationPriceRequest extends TeaModel {
    /**
     * <p>The maximum public bandwidth. Unit: Mbit/s.</p>
     * <blockquote>
     * <p> Valid values when PayByTraffic is set to PayByBandwidth: 10 to 1000.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The ID of either the monthly subscription cloud computer with unlimited hours or the premium bandwidth plan.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-0gfv2z3sf95zvt****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The specifications.</p>
     * <ul>
     * <li><p>Valid values when you set <code>ResourceType</code> to <code>Desktop</code>:</p>
     * <ul>
     * <li>ecd.basic.small</li>
     * <li>ecd.basic.large</li>
     * <li>ecd.advanced.large</li>
     * <li>ecd.advanced.xlarge</li>
     * <li>ecd.performance.2xlarge</li>
     * <li>ecd.graphics.xlarge</li>
     * <li>ecd.graphics.2xlarge</li>
     * <li>ecd.advanced.xlarge_s8d2</li>
     * <li>ecd.advanced.xlarge_s8d7</li>
     * <li>ecd.graphics.1g72c</li>
     * <li>eds.general.2c2g</li>
     * <li>eds.general.2c4g</li>
     * <li>eds.general.2c8g</li>
     * <li>eds.general.4c8g</li>
     * <li>eds.general.4c16g</li>
     * <li>eds.general.8c16g</li>
     * <li>eds.general.8c32g</li>
     * <li>eds.general.16c32g</li>
     * </ul>
     * </li>
     * <li><p>You can skip this parameter if <code>ResourceType</code> is set to <code>NetworkPackage</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>eds.enterprise_office.8c16g</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResellerOwnerUid")
    public Long resellerOwnerUid;

    /**
     * <p>The resource type. The required parameters depend on the resource type.</p>
     * <ul>
     * <li>When <code>ResourceType</code> is set to <code>Desktop</code>, the required parameters are <code>InstanceType</code>, <code>RootDiskSizeGib</code>, and <code>UserDiskSizeGib</code>.</li>
     * <li>When <code>ResourceType</code> is set to <code>NetworkPackage</code>, the required parameter is <code>Bandwidth</code>.</li>
     * </ul>
     * <p>Valid values:</p>
     * <ul>
     * <li>Desktop (default): cloud computers.</li>
     * <li>NetworkPackage: premium bandwidth plans.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Desktop</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The size of the system disk. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("RootDiskSizeGib")
    public Integer rootDiskSizeGib;

    /**
     * <p>The size of the data disk. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("UserDiskSizeGib")
    public Integer userDiskSizeGib;

    public static DescribeModificationPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeModificationPriceRequest self = new DescribeModificationPriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeModificationPriceRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribeModificationPriceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeModificationPriceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeModificationPriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeModificationPriceRequest setResellerOwnerUid(Long resellerOwnerUid) {
        this.resellerOwnerUid = resellerOwnerUid;
        return this;
    }
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

    public DescribeModificationPriceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeModificationPriceRequest setRootDiskSizeGib(Integer rootDiskSizeGib) {
        this.rootDiskSizeGib = rootDiskSizeGib;
        return this;
    }
    public Integer getRootDiskSizeGib() {
        return this.rootDiskSizeGib;
    }

    public DescribeModificationPriceRequest setUserDiskSizeGib(Integer userDiskSizeGib) {
        this.userDiskSizeGib = userDiskSizeGib;
        return this;
    }
    public Integer getUserDiskSizeGib() {
        return this.userDiskSizeGib;
    }

}
