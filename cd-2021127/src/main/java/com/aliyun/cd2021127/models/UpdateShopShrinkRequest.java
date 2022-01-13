// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class UpdateShopShrinkRequest extends TeaModel {
    // 地理纬度-选填
    @NameInMap("Latitude")
    public String latitude;

    // 门店地址-选填
    @NameInMap("Location")
    public String location;

    // 地理经度-选填
    @NameInMap("Longitude")
    public String longitude;

    // 区域地址-省市区(查询结果)
    @NameInMap("RegionAddress")
    public String regionAddress;

    // 区域编码(查询结果)
    @NameInMap("RegionCode")
    public String regionCode;

    // 备注(可空)-选填
    @NameInMap("Remark")
    public String remark;

    // 门店组自定义ID-选填
    @NameInMap("ShopGroupIds")
    public String shopGroupIdsShrink;

    // 自定义门店编号(ID)-必填
    @NameInMap("ShopId")
    public String shopId;

    // 门店名称-必填
    @NameInMap("ShopName")
    public String shopName;

    // 工作日结束营业时间-选填，格式：HH:mm:ss
    @NameInMap("WeekdaysEndTime")
    public String weekdaysEndTime;

    // 工作日开始营业时间-选填，格式：HH:mm:ss
    @NameInMap("WeekdaysStartTime")
    public String weekdaysStartTime;

    // 周末结束营业时间-选填，格式：HH:mm:ss
    @NameInMap("WeekendEndTime")
    public String weekendEndTime;

    // 周末开始营业时间-选填，格式：HH:mm:ss
    @NameInMap("WeekendStartTime")
    public String weekendStartTime;

    public static UpdateShopShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateShopShrinkRequest self = new UpdateShopShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateShopShrinkRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public UpdateShopShrinkRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public UpdateShopShrinkRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public UpdateShopShrinkRequest setRegionAddress(String regionAddress) {
        this.regionAddress = regionAddress;
        return this;
    }
    public String getRegionAddress() {
        return this.regionAddress;
    }

    public UpdateShopShrinkRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

    public UpdateShopShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateShopShrinkRequest setShopGroupIdsShrink(String shopGroupIdsShrink) {
        this.shopGroupIdsShrink = shopGroupIdsShrink;
        return this;
    }
    public String getShopGroupIdsShrink() {
        return this.shopGroupIdsShrink;
    }

    public UpdateShopShrinkRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public UpdateShopShrinkRequest setShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }
    public String getShopName() {
        return this.shopName;
    }

    public UpdateShopShrinkRequest setWeekdaysEndTime(String weekdaysEndTime) {
        this.weekdaysEndTime = weekdaysEndTime;
        return this;
    }
    public String getWeekdaysEndTime() {
        return this.weekdaysEndTime;
    }

    public UpdateShopShrinkRequest setWeekdaysStartTime(String weekdaysStartTime) {
        this.weekdaysStartTime = weekdaysStartTime;
        return this;
    }
    public String getWeekdaysStartTime() {
        return this.weekdaysStartTime;
    }

    public UpdateShopShrinkRequest setWeekendEndTime(String weekendEndTime) {
        this.weekendEndTime = weekendEndTime;
        return this;
    }
    public String getWeekendEndTime() {
        return this.weekendEndTime;
    }

    public UpdateShopShrinkRequest setWeekendStartTime(String weekendStartTime) {
        this.weekendStartTime = weekendStartTime;
        return this;
    }
    public String getWeekendStartTime() {
        return this.weekendStartTime;
    }

}
