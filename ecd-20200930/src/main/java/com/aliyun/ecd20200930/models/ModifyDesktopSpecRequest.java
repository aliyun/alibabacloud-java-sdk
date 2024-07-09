// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopSpecRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the auto-payment feature.</p>
     * <p>Default value: true. Valid values:</p>
     * <ul>
     * <li><p>true: enables the auto-payment feature.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <p>Make sure that you have sufficient balance in your Alibaba Cloud account. Otherwise, an exception occurs on your order.</p>
     * <!-- -->
     * </li>
     * <li><p>false: disables the auto-payment feature. In this case, an order is generated, and no payment is automatically made.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <p>You can log on to the Elastic Desktop Service console and complete the payment based on the order ID on the Orders page.</p>
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The ID of a cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-4543qyik164a4****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The destination instance type. You can call the <a href="https://help.aliyun.com/document_detail/188882.html">DescribeDesktopTypes</a> operation to query the instance types supported by cloud computers.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eds.general.2c8g</p>
     */
    @NameInMap("DesktopType")
    public String desktopType;

    /**
     * <p>The ID of the promotional activity.</p>
     * 
     * <strong>example:</strong>
     * <p>500033080110596</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceSpecs")
    public java.util.List<ModifyDesktopSpecRequestResourceSpecs> resourceSpecs;

    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The size of the new system disk. Unit: GiB. Valid values: 80 to 500 GiB. The value must be a multiple of 10.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("RootDiskSizeGib")
    public Integer rootDiskSizeGib;

    /**
     * <p>The performance level (PL) of the data disk. Default value: PL0.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>PL1</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>PL0</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>PL3</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>PL2</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PL0</p>
     */
    @NameInMap("UserDiskPerformanceLevel")
    public String userDiskPerformanceLevel;

    /**
     * <p>The destination data disk size. Unit: GiB.</p>
     * <ul>
     * <li>The data disk size of a non-graphical cloud computer ranges from 20 to 1020 GiB and must be a multiple of 10.</li>
     * <li>The data disk size of a graphical cloud computer ranges from 40 to 1020 GiB and must be a multiple of 10.</li>
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
        @NameInMap("DesktopId")
        public String desktopId;

        @NameInMap("RootDiskSizeGib")
        public Integer rootDiskSizeGib;

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
