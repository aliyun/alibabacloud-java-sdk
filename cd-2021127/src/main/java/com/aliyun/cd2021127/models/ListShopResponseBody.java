// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class ListShopResponseBody extends TeaModel {
    // 状态码
    @NameInMap("Code")
    public String code;

    // 数据
    @NameInMap("Data")
    public java.util.List<ListShopResponseBodyData> data;

    // http状态码
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // 说明
    @NameInMap("Message")
    public String message;

    // 页码序号
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 页码大小
    @NameInMap("PageSize")
    public Integer pageSize;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 成功标志
    @NameInMap("Success")
    public Boolean success;

    // 数据总数
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListShopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListShopResponseBody self = new ListShopResponseBody();
        return TeaModel.build(map, self);
    }

    public ListShopResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListShopResponseBody setData(java.util.List<ListShopResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListShopResponseBodyData> getData() {
        return this.data;
    }

    public ListShopResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListShopResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListShopResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListShopResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListShopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListShopResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListShopResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListShopResponseBodyData extends TeaModel {
        // 设备列表(查询结果)
        @NameInMap("DeviceMacList")
        public java.util.List<String> deviceMacList;

        // 设备总数(查询结果)
        @NameInMap("DeviceNum")
        public Integer deviceNum;

        // 添加时间(查询结果)
        @NameInMap("GmtCreateTime")
        public Long gmtCreateTime;

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

        public static ListShopResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListShopResponseBodyData self = new ListShopResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListShopResponseBodyData setDeviceMacList(java.util.List<String> deviceMacList) {
            this.deviceMacList = deviceMacList;
            return this;
        }
        public java.util.List<String> getDeviceMacList() {
            return this.deviceMacList;
        }

        public ListShopResponseBodyData setDeviceNum(Integer deviceNum) {
            this.deviceNum = deviceNum;
            return this;
        }
        public Integer getDeviceNum() {
            return this.deviceNum;
        }

        public ListShopResponseBodyData setGmtCreateTime(Long gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public Long getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListShopResponseBodyData setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public ListShopResponseBodyData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListShopResponseBodyData setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public ListShopResponseBodyData setRegionAddress(String regionAddress) {
            this.regionAddress = regionAddress;
            return this;
        }
        public String getRegionAddress() {
            return this.regionAddress;
        }

        public ListShopResponseBodyData setRegionCode(String regionCode) {
            this.regionCode = regionCode;
            return this;
        }
        public String getRegionCode() {
            return this.regionCode;
        }

        public ListShopResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListShopResponseBodyData setShopGroupIds(java.util.List<String> shopGroupIds) {
            this.shopGroupIds = shopGroupIds;
            return this;
        }
        public java.util.List<String> getShopGroupIds() {
            return this.shopGroupIds;
        }

        public ListShopResponseBodyData setShopId(String shopId) {
            this.shopId = shopId;
            return this;
        }
        public String getShopId() {
            return this.shopId;
        }

        public ListShopResponseBodyData setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }
        public String getShopName() {
            return this.shopName;
        }

        public ListShopResponseBodyData setWeekdaysEndTime(String weekdaysEndTime) {
            this.weekdaysEndTime = weekdaysEndTime;
            return this;
        }
        public String getWeekdaysEndTime() {
            return this.weekdaysEndTime;
        }

        public ListShopResponseBodyData setWeekdaysStartTime(String weekdaysStartTime) {
            this.weekdaysStartTime = weekdaysStartTime;
            return this;
        }
        public String getWeekdaysStartTime() {
            return this.weekdaysStartTime;
        }

        public ListShopResponseBodyData setWeekendEndTime(String weekendEndTime) {
            this.weekendEndTime = weekendEndTime;
            return this;
        }
        public String getWeekendEndTime() {
            return this.weekendEndTime;
        }

        public ListShopResponseBodyData setWeekendStartTime(String weekendStartTime) {
            this.weekendStartTime = weekendStartTime;
            return this;
        }
        public String getWeekendStartTime() {
            return this.weekendStartTime;
        }

    }

}
