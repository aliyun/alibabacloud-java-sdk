// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopSpecRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically complete the payment. Valid values:</p>
     * <br>
     * <p>*   `true`: automatically completes the payment. Make sure that your Alibaba Cloud account has sufficient balance. If your Alibaba Cloud account does not have sufficient balance, abnormal orders are generated.</p>
     * <p>*   `false`: does not automatically complete the payment. In this case, an order is generated, but no payment is made. You can log on to the EDS console and complete the payment based on the order ID on the **Orders** page.</p>
     * <br>
     * <p>Default value: `true`.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The ID of the cloud desktop.</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The desktop type. You can call the [DescribeDesktopTypes](~~188882~~) operation to query the IDs of supported desktop types.</p>
     */
    @NameInMap("DesktopType")
    public String desktopType;

    /**
     * <p>The ID of the sales promotion.</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The size of the new system disk. Unit: GiB. Valid values: 80 to 500 GiB. The value must be a multiple of 10.</p>
     */
    @NameInMap("RootDiskSizeGib")
    public Integer rootDiskSizeGib;

    /**
     * <p>The performance level (PL) of the data disk. Valid values:</p>
     * <br>
     * <p>*   PL0</p>
     * <p>*   PL1</p>
     * <p>*   PL2</p>
     * <p>*   PL3</p>
     * <br>
     * <p>Default value: PL0.</p>
     */
    @NameInMap("UserDiskPerformanceLevel")
    public String userDiskPerformanceLevel;

    /**
     * <p>The size of the new data disk. Unit: GiB.</p>
     * <br>
     * <p>*   The data disk size of a non-Graphics cloud desktop can be within the range of 20 to 1,020 GiB. The value must be a multiple of 10.</p>
     * <p>*   The data disk size of the Graphics cloud desktop can be within the range of 40 to 1,020 GiB. The value must be a multiple of 10.</p>
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

}
