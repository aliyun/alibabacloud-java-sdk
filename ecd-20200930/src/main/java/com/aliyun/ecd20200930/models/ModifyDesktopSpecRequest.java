// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopSpecRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The ID of the cloud desktop.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-4543qyik164a4****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The new desktop type. You can call the <a href="~~DescribeDesktopTypes~~">DescribeDesktopTypes</a> operation to query the supported desktop types.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eds.general.2c4g</p>
     */
    @NameInMap("DesktopType")
    public String desktopType;

    /**
     * <p>The promotion ID.</p>
     * 
     * <strong>example:</strong>
     * <p>50003308011****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The ID of the region. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to obtain a list of regions that Elastic Desktop Service supports.</p>
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
     * <p>A list of resource specification templates.</p>
     */
    @NameInMap("ResourceSpecs")
    public java.util.List<ModifyDesktopSpecRequestResourceSpecs> resourceSpecs;

    /**
     * <p>The resource type.</p>
     * <blockquote>
     * <p>This parameter is required only for cloud desktops that use the subscription billing method.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DesktopMonthPackage</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The new size of the system disk, in GiB. The value must be a multiple of 10 in the range of 80 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("RootDiskSizeGib")
    public Integer rootDiskSizeGib;

    /**
     * <p>The performance level of the data disk.</p>
     * 
     * <strong>example:</strong>
     * <p>PL0</p>
     */
    @NameInMap("UserDiskPerformanceLevel")
    public String userDiskPerformanceLevel;

    /**
     * <p>The new size of the data disk, in GiB.</p>
     * <ul>
     * <li><p>For non-graphics-accelerated desktop types, the value must be a multiple of 10 in the range of 20 to 1,020.</p>
     * </li>
     * <li><p>For graphics-accelerated desktop types, the value must be a multiple of 10 in the range of 40 to 1,020.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("UserDiskSizeGib")
    public Integer userDiskSizeGib;

    public static ModifyDesktopSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopSpecRequest self = new ModifyDesktopSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopSpecRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyDesktopSpecRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public ModifyDesktopSpecRequest setDesktopType(String desktopType) {
        this.desktopType = desktopType;
        return this;
    }
    public String getDesktopType() {
        return this.desktopType;
    }

    public ModifyDesktopSpecRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public ModifyDesktopSpecRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDesktopSpecRequest setResellerOwnerUid(Long resellerOwnerUid) {
        this.resellerOwnerUid = resellerOwnerUid;
        return this;
    }
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

    public ModifyDesktopSpecRequest setResourceSpecs(java.util.List<ModifyDesktopSpecRequestResourceSpecs> resourceSpecs) {
        this.resourceSpecs = resourceSpecs;
        return this;
    }
    public java.util.List<ModifyDesktopSpecRequestResourceSpecs> getResourceSpecs() {
        return this.resourceSpecs;
    }

    public ModifyDesktopSpecRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ModifyDesktopSpecRequest setRootDiskSizeGib(Integer rootDiskSizeGib) {
        this.rootDiskSizeGib = rootDiskSizeGib;
        return this;
    }
    public Integer getRootDiskSizeGib() {
        return this.rootDiskSizeGib;
    }

    public ModifyDesktopSpecRequest setUserDiskPerformanceLevel(String userDiskPerformanceLevel) {
        this.userDiskPerformanceLevel = userDiskPerformanceLevel;
        return this;
    }
    public String getUserDiskPerformanceLevel() {
        return this.userDiskPerformanceLevel;
    }

    public ModifyDesktopSpecRequest setUserDiskSizeGib(Integer userDiskSizeGib) {
        this.userDiskSizeGib = userDiskSizeGib;
        return this;
    }
    public Integer getUserDiskSizeGib() {
        return this.userDiskSizeGib;
    }

    public static class ModifyDesktopSpecRequestResourceSpecs extends TeaModel {
        /**
         * <p>The ID of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-4543qyik164a4****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The new size of the system disk, in GiB. The value must be a multiple of 10 in the range of 80 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("RootDiskSizeGib")
        public Integer rootDiskSizeGib;

        /**
         * <p>The new size of the data disk, in GiB. The value must be a multiple of 10 in the range of 20 to 2,040.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("UserDiskSizeGib")
        public Integer userDiskSizeGib;

        public static ModifyDesktopSpecRequestResourceSpecs build(java.util.Map<String, ?> map) throws Exception {
            ModifyDesktopSpecRequestResourceSpecs self = new ModifyDesktopSpecRequestResourceSpecs();
            return TeaModel.build(map, self);
        }

        public ModifyDesktopSpecRequestResourceSpecs setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public ModifyDesktopSpecRequestResourceSpecs setRootDiskSizeGib(Integer rootDiskSizeGib) {
            this.rootDiskSizeGib = rootDiskSizeGib;
            return this;
        }
        public Integer getRootDiskSizeGib() {
            return this.rootDiskSizeGib;
        }

        public ModifyDesktopSpecRequestResourceSpecs setUserDiskSizeGib(Integer userDiskSizeGib) {
            this.userDiskSizeGib = userDiskSizeGib;
            return this;
        }
        public Integer getUserDiskSizeGib() {
            return this.userDiskSizeGib;
        }

    }

}
