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

    public static class CreateShopRequestShopList extends TeaModel {
        // 设备列表(查询结果)
        @NameInMap("DeviceMacList")
        public java.util.List<String> deviceMacList;

        // 设备总数(查询结果)
        @NameInMap("DeviceNum")
        public Integer deviceNum;

        // 添加时间(查询结果)
        @NameInMap("GmtCreateTime")
        public Long gmtCreateTime;

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

        public static CreateShopRequestShopList build(java.util.Map<String, ?> map) throws Exception {
            CreateShopRequestShopList self = new CreateShopRequestShopList();
            return TeaModel.build(map, self);
        }

        public CreateShopRequestShopList setDeviceMacList(java.util.List<String> deviceMacList) {
            this.deviceMacList = deviceMacList;
            return this;
        }
        public java.util.List<String> getDeviceMacList() {
            return this.deviceMacList;
        }

        public CreateShopRequestShopList setDeviceNum(Integer deviceNum) {
            this.deviceNum = deviceNum;
            return this;
        }
        public Integer getDeviceNum() {
            return this.deviceNum;
        }

        public CreateShopRequestShopList setGmtCreateTime(Long gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public Long getGmtCreateTime() {
            return this.gmtCreateTime;
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
