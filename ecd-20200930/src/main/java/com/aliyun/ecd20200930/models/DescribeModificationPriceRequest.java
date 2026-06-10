// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeModificationPriceRequest extends TeaModel {
    /**
     * <p>The maximum public bandwidth. Unit: Mbit/s.</p>
     * <blockquote>
     * <p>Valid values when PayByTraffic is set to PayByBandwidth: 10 to 1000.</p>
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
     * <li><p>ecd.basic.small</p>
     * </li>
     * <li><p>ecd.basic.large</p>
     * </li>
     * <li><p>ecd.advanced.large</p>
     * </li>
     * <li><p>ecd.advanced.xlarge</p>
     * </li>
     * <li><p>ecd.performance.2xlarge</p>
     * </li>
     * <li><p>ecd.graphics.xlarge</p>
     * </li>
     * <li><p>ecd.graphics.2xlarge</p>
     * </li>
     * <li><p>ecd.advanced.xlarge_s8d2</p>
     * </li>
     * <li><p>ecd.advanced.xlarge_s8d7</p>
     * </li>
     * <li><p>ecd.graphics.1g72c</p>
     * </li>
     * <li><p>eds.general.2c2g</p>
     * </li>
     * <li><p>eds.general.2c4g</p>
     * </li>
     * <li><p>eds.general.2c8g</p>
     * </li>
     * <li><p>eds.general.4c8g</p>
     * </li>
     * <li><p>eds.general.4c16g</p>
     * </li>
     * <li><p>eds.general.8c16g</p>
     * </li>
     * <li><p>eds.general.8c32g</p>
     * </li>
     * <li><p>eds.general.16c32g</p>
     * </li>
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
     * <p>Promotion activity ID.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The region ID. You can call the <a href="t2167755.xdita#"></a>operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>User ID for resource ownership in resale mode. You do not need to specify this parameter if resale mode is not used.</p>
     * 
     * <strong>example:</strong>
     * <p>1422724566551XXX</p>
     */
    @NameInMap("ResellerOwnerUid")
    public Long resellerOwnerUid;

    /**
     * <p>List of resource specification templates.</p>
     */
    @NameInMap("ResourceSpecs")
    public java.util.List<DescribeModificationPriceRequestResourceSpecs> resourceSpecs;

    /**
     * <p>The resource type. The required parameters depend on the resource type.</p>
     * <ul>
     * <li><p>When <code>ResourceType</code> is set to <code>Desktop</code>, the required parameters are <code>InstanceType</code>, <code>RootDiskSizeGib</code>, and <code>UserDiskSizeGib</code>.</p>
     * </li>
     * <li><p>When <code>ResourceType</code> is set to <code>NetworkPackage</code>, the required parameter is <code>Bandwidth</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Desktop</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>Performance level of the system disk. When the WUYING Workspace instance type is set to graphics-optimized or high clock speed, you can specify the disk performance level. For differences between performance levels, see <a href="t583241.xdita#"></a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PL0</p>
     */
    @NameInMap("RootDiskPerformanceLevel")
    public String rootDiskPerformanceLevel;

    /**
     * <p>The size of the system disk. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("RootDiskSizeGib")
    public Integer rootDiskSizeGib;

    /**
     * <p>Performance level of the data disk. When the WUYING Workspace instance type is set to graphics-optimized or high clock speed, you can specify the disk performance level. For differences between performance levels, see <a href="t583241.xdita#"></a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PL0</p>
     */
    @NameInMap("UserDiskPerformanceLevel")
    public String userDiskPerformanceLevel;

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

    public DescribeModificationPriceRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
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

    public DescribeModificationPriceRequest setResourceSpecs(java.util.List<DescribeModificationPriceRequestResourceSpecs> resourceSpecs) {
        this.resourceSpecs = resourceSpecs;
        return this;
    }
    public java.util.List<DescribeModificationPriceRequestResourceSpecs> getResourceSpecs() {
        return this.resourceSpecs;
    }

    public DescribeModificationPriceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeModificationPriceRequest setRootDiskPerformanceLevel(String rootDiskPerformanceLevel) {
        this.rootDiskPerformanceLevel = rootDiskPerformanceLevel;
        return this;
    }
    public String getRootDiskPerformanceLevel() {
        return this.rootDiskPerformanceLevel;
    }

    public DescribeModificationPriceRequest setRootDiskSizeGib(Integer rootDiskSizeGib) {
        this.rootDiskSizeGib = rootDiskSizeGib;
        return this;
    }
    public Integer getRootDiskSizeGib() {
        return this.rootDiskSizeGib;
    }

    public DescribeModificationPriceRequest setUserDiskPerformanceLevel(String userDiskPerformanceLevel) {
        this.userDiskPerformanceLevel = userDiskPerformanceLevel;
        return this;
    }
    public String getUserDiskPerformanceLevel() {
        return this.userDiskPerformanceLevel;
    }

    public DescribeModificationPriceRequest setUserDiskSizeGib(Integer userDiskSizeGib) {
        this.userDiskSizeGib = userDiskSizeGib;
        return this;
    }
    public Integer getUserDiskSizeGib() {
        return this.userDiskSizeGib;
    }

    public static class DescribeModificationPriceRequestResourceSpecs extends TeaModel {
        /**
         * <p>Cloud computer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-6ghhzivgmnzgeyXXX</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>System disk size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("RootDiskSizeGib")
        public Integer rootDiskSizeGib;

        /**
         * <p>Data disk size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("UserDiskSizeGib")
        public Integer userDiskSizeGib;

        public static DescribeModificationPriceRequestResourceSpecs build(java.util.Map<String, ?> map) throws Exception {
            DescribeModificationPriceRequestResourceSpecs self = new DescribeModificationPriceRequestResourceSpecs();
            return TeaModel.build(map, self);
        }

        public DescribeModificationPriceRequestResourceSpecs setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeModificationPriceRequestResourceSpecs setRootDiskSizeGib(Integer rootDiskSizeGib) {
            this.rootDiskSizeGib = rootDiskSizeGib;
            return this;
        }
        public Integer getRootDiskSizeGib() {
            return this.rootDiskSizeGib;
        }

        public DescribeModificationPriceRequestResourceSpecs setUserDiskSizeGib(Integer userDiskSizeGib) {
            this.userDiskSizeGib = userDiskSizeGib;
            return this;
        }
        public Integer getUserDiskSizeGib() {
            return this.userDiskSizeGib;
        }

    }

}
