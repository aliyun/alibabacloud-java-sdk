// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class UpdateShopRequest extends TeaModel {
    @NameInMap("BusinessStatus")
    public Integer businessStatus;

    @NameInMap("Country")
    public String country;

    @NameInMap("Latitude")
    public String latitude;

    @NameInMap("Location")
    public String location;

    @NameInMap("Longitude")
    public String longitude;

    @NameInMap("RegionAddress")
    public String regionAddress;

    @NameInMap("RegionCode")
    public String regionCode;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("ShopGroupIds")
    public java.util.List<String> shopGroupIds;

    @NameInMap("ShopId")
    public String shopId;

    @NameInMap("ShopName")
    public String shopName;

    @NameInMap("WeekdaysEndTime")
    public String weekdaysEndTime;

    @NameInMap("WeekdaysStartTime")
    public String weekdaysStartTime;

    @NameInMap("WeekendEndTime")
    public String weekendEndTime;

    @NameInMap("WeekendStartTime")
    public String weekendStartTime;

    public static UpdateShopRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateShopRequest self = new UpdateShopRequest();
        return TeaModel.build(map, self);
    }

    public UpdateShopRequest setBusinessStatus(Integer businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public Integer getBusinessStatus() {
        return this.businessStatus;
    }

    public UpdateShopRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public UpdateShopRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public UpdateShopRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public UpdateShopRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public UpdateShopRequest setRegionAddress(String regionAddress) {
        this.regionAddress = regionAddress;
        return this;
    }
    public String getRegionAddress() {
        return this.regionAddress;
    }

    public UpdateShopRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

    public UpdateShopRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateShopRequest setShopGroupIds(java.util.List<String> shopGroupIds) {
        this.shopGroupIds = shopGroupIds;
        return this;
    }
    public java.util.List<String> getShopGroupIds() {
        return this.shopGroupIds;
    }

    public UpdateShopRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public UpdateShopRequest setShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }
    public String getShopName() {
        return this.shopName;
    }

    public UpdateShopRequest setWeekdaysEndTime(String weekdaysEndTime) {
        this.weekdaysEndTime = weekdaysEndTime;
        return this;
    }
    public String getWeekdaysEndTime() {
        return this.weekdaysEndTime;
    }

    public UpdateShopRequest setWeekdaysStartTime(String weekdaysStartTime) {
        this.weekdaysStartTime = weekdaysStartTime;
        return this;
    }
    public String getWeekdaysStartTime() {
        return this.weekdaysStartTime;
    }

    public UpdateShopRequest setWeekendEndTime(String weekendEndTime) {
        this.weekendEndTime = weekendEndTime;
        return this;
    }
    public String getWeekendEndTime() {
        return this.weekendEndTime;
    }

    public UpdateShopRequest setWeekendStartTime(String weekendStartTime) {
        this.weekendStartTime = weekendStartTime;
        return this;
    }
    public String getWeekendStartTime() {
        return this.weekendStartTime;
    }

}
