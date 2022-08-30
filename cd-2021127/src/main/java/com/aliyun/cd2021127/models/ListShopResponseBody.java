// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class ListShopResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListShopResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("BusinessStatus")
        public Integer businessStatus;

        @NameInMap("DeviceMacList")
        public java.util.List<String> deviceMacList;

        @NameInMap("DeviceNum")
        public Integer deviceNum;

        @NameInMap("GmtCreateTime")
        public Long gmtCreateTime;

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

        public static ListShopResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListShopResponseBodyData self = new ListShopResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListShopResponseBodyData setBusinessStatus(Integer businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public Integer getBusinessStatus() {
            return this.businessStatus;
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
