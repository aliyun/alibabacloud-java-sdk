// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class BatchCreateShopRequest extends TeaModel {
    @NameInMap("ShopList")
    public java.util.List<BatchCreateShopRequestShopList> shopList;

    public static BatchCreateShopRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateShopRequest self = new BatchCreateShopRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateShopRequest setShopList(java.util.List<BatchCreateShopRequestShopList> shopList) {
        this.shopList = shopList;
        return this;
    }
    public java.util.List<BatchCreateShopRequestShopList> getShopList() {
        return this.shopList;
    }

    public static class BatchCreateShopRequestShopList extends TeaModel {
        // 地理纬度-必填
        @NameInMap("Latitude")
        public String latitude;

        // 门店地址-选填
        @NameInMap("Location")
        public String location;

        // 地理经度-必填
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

        // 门店组ID-选填
        @NameInMap("ShopGroupIds")
        public java.util.List<String> shopGroupIds;

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

        public static BatchCreateShopRequestShopList build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateShopRequestShopList self = new BatchCreateShopRequestShopList();
            return TeaModel.build(map, self);
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

}
