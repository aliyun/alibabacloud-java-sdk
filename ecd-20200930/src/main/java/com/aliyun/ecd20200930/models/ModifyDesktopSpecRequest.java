// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopSpecRequest extends TeaModel {
    // Specifies whether to enable automatic payment. Valid values:
    // 
    // *   true: enables automatic payment. Make sure that your account has sufficient balance. Otherwise, abnormal orders are generated.
    // *   false: disables automatic payment. In this case, an order is generated and no billing is implemented. You can log on to the EDS console and complete payments based on the order ID on the **Orders** page.
    // 
    // Default value: true
    @NameInMap("AutoPay")
    public Boolean autoPay;

    // The ID of the cloud desktop.
    @NameInMap("DesktopId")
    public String desktopId;

    // The new cloud desktop type.
    // 
    // You can call the [DescribeDesktopTypes](~~188882~~) operation to query the IDs of supported cloud desktop types.
    @NameInMap("DesktopType")
    public String desktopType;

    @NameInMap("PromotionId")
    public String promotionId;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The size of the new system disk. Unit: GiB. Valid values: 80 to 500 GiB. The value must be a multiple of 10.
    @NameInMap("RootDiskSizeGib")
    public Integer rootDiskSizeGib;

    @NameInMap("UserDiskPerformanceLevel")
    public String userDiskPerformanceLevel;

    // The size of the new data disk. Unit: GiB.
    // 
    // *   The data disk size of a non-Graphics cloud desktop can be within the range of 20 to 1020 GiB and must be a multiple of 10.
    // *   The data disk size of the Graphics cloud desktop can be within the range of 40 to 1020 GiB and must be a multiple of 10.
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
