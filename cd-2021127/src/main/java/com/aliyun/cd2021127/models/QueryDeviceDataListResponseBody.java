// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryDeviceDataListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryDeviceDataListResponseBodyData> data;

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

    public static QueryDeviceDataListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceDataListResponseBody self = new QueryDeviceDataListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceDataListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceDataListResponseBody setData(java.util.List<QueryDeviceDataListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryDeviceDataListResponseBodyData> getData() {
        return this.data;
    }

    public QueryDeviceDataListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryDeviceDataListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDeviceDataListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryDeviceDataListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceDataListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceDataListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceDataListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryDeviceDataListResponseBodyData extends TeaModel {
        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("City")
        public String city;

        @NameInMap("DeviceGroupList")
        public String deviceGroupList;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceSpecificModel")
        public String deviceSpecificModel;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("LastOnlineTime")
        public String lastOnlineTime;

        @NameInMap("Mac")
        public String mac;

        @NameInMap("Province")
        public String province;

        @NameInMap("Region")
        public String region;

        @NameInMap("RegionAddress")
        public String regionAddress;

        @NameInMap("ShopId")
        public String shopId;

        @NameInMap("ShopName")
        public String shopName;

        /**
         * <p>SN</p>
         */
        @NameInMap("Sn")
        public String sn;

        @NameInMap("Status")
        public String status;

        public static QueryDeviceDataListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceDataListResponseBodyData self = new QueryDeviceDataListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceDataListResponseBodyData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public QueryDeviceDataListResponseBodyData setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public QueryDeviceDataListResponseBodyData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QueryDeviceDataListResponseBodyData setDeviceGroupList(String deviceGroupList) {
            this.deviceGroupList = deviceGroupList;
            return this;
        }
        public String getDeviceGroupList() {
            return this.deviceGroupList;
        }

        public QueryDeviceDataListResponseBodyData setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public QueryDeviceDataListResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDeviceDataListResponseBodyData setDeviceSpecificModel(String deviceSpecificModel) {
            this.deviceSpecificModel = deviceSpecificModel;
            return this;
        }
        public String getDeviceSpecificModel() {
            return this.deviceSpecificModel;
        }

        public QueryDeviceDataListResponseBodyData setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public QueryDeviceDataListResponseBodyData setLastOnlineTime(String lastOnlineTime) {
            this.lastOnlineTime = lastOnlineTime;
            return this;
        }
        public String getLastOnlineTime() {
            return this.lastOnlineTime;
        }

        public QueryDeviceDataListResponseBodyData setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public QueryDeviceDataListResponseBodyData setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public QueryDeviceDataListResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryDeviceDataListResponseBodyData setRegionAddress(String regionAddress) {
            this.regionAddress = regionAddress;
            return this;
        }
        public String getRegionAddress() {
            return this.regionAddress;
        }

        public QueryDeviceDataListResponseBodyData setShopId(String shopId) {
            this.shopId = shopId;
            return this;
        }
        public String getShopId() {
            return this.shopId;
        }

        public QueryDeviceDataListResponseBodyData setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }
        public String getShopName() {
            return this.shopName;
        }

        public QueryDeviceDataListResponseBodyData setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public QueryDeviceDataListResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
