// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopSpecRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("DesktopId")
    public String desktopId;

    @NameInMap("DesktopType")
    public String desktopType;

    @NameInMap("PromotionId")
    public String promotionId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RootDiskSizeGib")
    public Integer rootDiskSizeGib;

    @NameInMap("UserDiskPerformanceLevel")
    public String userDiskPerformanceLevel;

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
