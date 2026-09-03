// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopSpecRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment.</p>
     * <p>Default value: true. Valid values:</p>
     * <ul>
     * <li>true: Automatic payment is enabled. Make sure that your Alibaba Cloud account balance is sufficient. Otherwise, abnormal orders may be generated.</li>
     * <li>false: Only an order is generated. Automatic payment is not enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The cloud computer ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-4543qyik164a4****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The target instance type. You can call <a href="https://help.aliyun.com/document_detail/188882.html">DescribeDesktopTypes</a> to query the instance types supported by cloud computers.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eds.general.2c8g</p>
     */
    @NameInMap("DesktopType")
    public String desktopType;

    /**
     * <p>The promotion ID.</p>
     * 
     * <strong>example:</strong>
     * <p>500033080110596</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the resource ownership in the reseller pattern. This parameter is not required in the non-reseller pattern.</p>
     * 
     * <strong>example:</strong>
     * <p>1422724566551XXX</p>
     */
    @NameInMap("ResellerOwnerUid")
    public Long resellerOwnerUid;

    /**
     * <p>The resource specification templates.</p>
     */
    @NameInMap("ResourceSpecs")
    public java.util.List<ModifyDesktopSpecRequestResourceSpecs> resourceSpecs;

    /**
     * <p>The resource type.</p>
     * <blockquote>
     * <p>This parameter is not required for non-subscription cloud computers.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DesktopMonthPackage</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The system cloud disk size after the change. Unit: GiB. Valid values: 80 to 500. The value must be a multiple of 10.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("RootDiskSizeGib")
    public Integer rootDiskSizeGib;

    /**
     * <p>The performance level (PL) of the data cloud disk. Default value: PL0.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PL0</li>
     * <li>PL1</li>
     * <li>PL2</li>
     * <li>PL3</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PL0</p>
     */
    @NameInMap("UserDiskPerformanceLevel")
    public String userDiskPerformanceLevel;

    /**
     * <p>The data cloud disk size after the change. Unit: GiB.</p>
     * <ul>
     * <li>For non-graphics cloud computers, valid values: 20 to 1020. The value must be a multiple of 10.</li>
     * <li>For graphics cloud computers, valid values: 40 to 1020. The value must be a multiple of 10.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100</p>
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
         * <p>The cloud computer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-4543qyik164a4****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The target system cloud disk size. Valid values: 80 to 500 GiB. The value must be a multiple of 10.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("RootDiskSizeGib")
        public Integer rootDiskSizeGib;

        /**
         * <p>The target data cloud disk size. Valid values: 80 to 500 GiB. The value must be a multiple of 10.</p>
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
