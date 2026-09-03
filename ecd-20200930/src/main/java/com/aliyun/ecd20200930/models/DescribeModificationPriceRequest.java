// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeModificationPriceRequest extends TeaModel {
    /**
     * <p>The peak Internet bandwidth. Unit: Mbit/s.</p>
     * <blockquote>
     * <p>If you use the pay-by-fixed-bandwidth billing method, valid values are 10 to 1000.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The instance ID. The value can be the ID of a monthly subscription (unlimited duration) cloud computer or the ID of a premium Internet bandwidth instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-0gfv2z3sf95zvt****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The resource specification.</p>
     * <ul>
     * <li><p>If ResourceType is set to Desktop, valid values include:</p>
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
     * <li><p>If ResourceType is set to NetworkPackage, you do not need to specify this parameter.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>eds.enterprise_office.8c16g</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The promotion ID.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the list of regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource ownership user ID in the reseller pattern. You do not need to specify this parameter in non-reseller pattern.</p>
     * 
     * <strong>example:</strong>
     * <p>1422724566551XXX</p>
     */
    @NameInMap("ResellerOwnerUid")
    public Long resellerOwnerUid;

    /**
     * <p>The list of resource specification templates.</p>
     */
    @NameInMap("ResourceSpecs")
    public java.util.List<DescribeModificationPriceRequestResourceSpecs> resourceSpecs;

    /**
     * <p>The resource type. The required parameters vary based on the resource type for which you want to query the upgrade/downgrade price:</p>
     * <ul>
     * <li>If ResourceType is set to Desktop, you must specify the InstanceType, RootDiskSizeGib, and UserDiskSizeGib parameters.</li>
     * <li>If ResourceType is set to NetworkPackage, you must specify the Bandwidth parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Desktop</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The performance level (PL) of the system cloud disk. You can set the disk performance level when the cloud computer specification in Settings is Graphics or High Frequency. For more information about the differences between disk performance levels, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>. standard SSD and ESSD have different performance levels.</p>
     * 
     * <strong>example:</strong>
     * <p>PL0</p>
     */
    @NameInMap("RootDiskPerformanceLevel")
    public String rootDiskPerformanceLevel;

    /**
     * <p>The size of the system cloud disk. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("RootDiskSizeGib")
    public Integer rootDiskSizeGib;

    /**
     * <p>The performance level (PL) of the data cloud disk. You can set the disk performance level when the cloud computer specification in Settings is Graphics or High Frequency. For more information about the differences between disk performance levels, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>. standard SSD and ESSD have different performance levels.</p>
     * 
     * <strong>example:</strong>
     * <p>PL0</p>
     */
    @NameInMap("UserDiskPerformanceLevel")
    public String userDiskPerformanceLevel;

    /**
     * <p>The size of the data cloud disk. Unit: GiB.</p>
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
         * <p>The cloud computer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-6ghhzivgmnzgeyXXX</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The size of the system cloud disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("RootDiskSizeGib")
        public Integer rootDiskSizeGib;

        /**
         * <p>The size of the data cloud disk. Unit: GiB.</p>
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
