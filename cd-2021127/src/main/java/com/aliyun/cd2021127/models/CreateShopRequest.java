// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class CreateShopRequest extends TeaModel {
    @NameInMap("ShopList")
    public java.util.List<CreateShopRequestShopList> shopList;

    public static CreateShopRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateShopRequest self = new CreateShopRequest();
        return TeaModel.build(map, self);
    }

    public CreateShopRequest setShopList(java.util.List<CreateShopRequestShopList> shopList) {
        this.shopList = shopList;
        return this;
    }
    public java.util.List<CreateShopRequestShopList> getShopList() {
        return this.shopList;
    }

    public static class BatchCreateShopRequestShopList extends TeaModel {
        @NameInMap("BusinessStatus")
        public Integer businessStatus;

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

        public static BatchCreateShopRequestShopList build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateShopRequestShopList self = new BatchCreateShopRequestShopList();
            return TeaModel.build(map, self);
        }

        public BatchCreateShopRequestShopList setBusinessStatus(Integer businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public Integer getBusinessStatus() {
            return this.businessStatus;
        }

        public BatchCreateShopRequestShopList setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public BatchCreateShopRequestShopList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public BatchCreateShopRequestShopList setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public BatchCreateShopRequestShopList setRegionAddress(String regionAddress) {
            this.regionAddress = regionAddress;
            return this;
        }
        public String getRegionAddress() {
            return this.regionAddress;
        }

        public BatchCreateShopRequestShopList setRegionCode(String regionCode) {
            this.regionCode = regionCode;
            return this;
        }
        public String getRegionCode() {
            return this.regionCode;
        }

        public BatchCreateShopRequestShopList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public BatchCreateShopRequestShopList setShopGroupIds(java.util.List<String> shopGroupIds) {
            this.shopGroupIds = shopGroupIds;
            return this;
        }
        public java.util.List<String> getShopGroupIds() {
            return this.shopGroupIds;
        }

        public BatchCreateShopRequestShopList setShopId(String shopId) {
            this.shopId = shopId;
            return this;
        }
        public String getShopId() {
            return this.shopId;
        }

        public BatchCreateShopRequestShopList setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }
        public String getShopName() {
            return this.shopName;
        }

        public BatchCreateShopRequestShopList setWeekdaysEndTime(String weekdaysEndTime) {
            this.weekdaysEndTime = weekdaysEndTime;
            return this;
        }
        public String getWeekdaysEndTime() {
            return this.weekdaysEndTime;
        }

        public BatchCreateShopRequestShopList setWeekdaysStartTime(String weekdaysStartTime) {
            this.weekdaysStartTime = weekdaysStartTime;
            return this;
        }
        public String getWeekdaysStartTime() {
            return this.weekdaysStartTime;
        }

        public BatchCreateShopRequestShopList setWeekendEndTime(String weekendEndTime) {
            this.weekendEndTime = weekendEndTime;
            return this;
        }
        public String getWeekendEndTime() {
            return this.weekendEndTime;
        }

        public BatchCreateShopRequestShopList setWeekendStartTime(String weekendStartTime) {
            this.weekendStartTime = weekendStartTime;
            return this;
        }
        public String getWeekendStartTime() {
            return this.weekendStartTime;
        }

    }

    public static class CreateShopRequestShopList extends TeaModel {
        @NameInMap("BusinessStatus")
        public Integer businessStatus;

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

        public static CreateShopRequestShopList build(java.util.Map<String, ?> map) throws Exception {
            CreateShopRequestShopList self = new CreateShopRequestShopList();
            return TeaModel.build(map, self);
        }

        public CreateShopRequestShopList setBusinessStatus(Integer businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public Integer getBusinessStatus() {
            return this.businessStatus;
        }

        public CreateShopRequestShopList setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public CreateShopRequestShopList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public CreateShopRequestShopList setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public CreateShopRequestShopList setRegionAddress(String regionAddress) {
            this.regionAddress = regionAddress;
            return this;
        }
        public String getRegionAddress() {
            return this.regionAddress;
        }

        public CreateShopRequestShopList setRegionCode(String regionCode) {
            this.regionCode = regionCode;
            return this;
        }
        public String getRegionCode() {
            return this.regionCode;
        }

        public CreateShopRequestShopList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public CreateShopRequestShopList setShopGroupIds(java.util.List<String> shopGroupIds) {
            this.shopGroupIds = shopGroupIds;
            return this;
        }
        public java.util.List<String> getShopGroupIds() {
            return this.shopGroupIds;
        }

        public CreateShopRequestShopList setShopId(String shopId) {
            this.shopId = shopId;
            return this;
        }
        public String getShopId() {
            return this.shopId;
        }

        public CreateShopRequestShopList setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }
        public String getShopName() {
            return this.shopName;
        }

        public CreateShopRequestShopList setWeekdaysEndTime(String weekdaysEndTime) {
            this.weekdaysEndTime = weekdaysEndTime;
            return this;
        }
        public String getWeekdaysEndTime() {
            return this.weekdaysEndTime;
        }

        public CreateShopRequestShopList setWeekdaysStartTime(String weekdaysStartTime) {
            this.weekdaysStartTime = weekdaysStartTime;
            return this;
        }
        public String getWeekdaysStartTime() {
            return this.weekdaysStartTime;
        }

        public CreateShopRequestShopList setWeekendEndTime(String weekendEndTime) {
            this.weekendEndTime = weekendEndTime;
            return this;
        }
        public String getWeekendEndTime() {
            return this.weekendEndTime;
        }

        public CreateShopRequestShopList setWeekendStartTime(String weekendStartTime) {
            this.weekendStartTime = weekendStartTime;
            return this;
        }
        public String getWeekendStartTime() {
            return this.weekendStartTime;
        }

    }

}
