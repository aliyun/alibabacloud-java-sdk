// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class ListIpcDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListIpcDevicesResponseBodyData data;

    public static ListIpcDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpcDevicesResponseBody self = new ListIpcDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpcDevicesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListIpcDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIpcDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpcDevicesResponseBody setData(ListIpcDevicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListIpcDevicesResponseBodyData getData() {
        return this.data;
    }

    public static class ListIpcDevicesResponseBodyDataRecords extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("SipGBId")
        public String sipGBId;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceDirection")
        public String deviceDirection;

        @NameInMap("DeviceAddress")
        public String deviceAddress;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("SipPassword")
        public String sipPassword;

        @NameInMap("SipServerPort")
        public String sipServerPort;

        @NameInMap("Vendor")
        public String vendor;

        @NameInMap("GbId")
        public String gbId;

        @NameInMap("CoverImageUrl")
        public String coverImageUrl;

        @NameInMap("AccessProtocolType")
        public String accessProtocolType;

        @NameInMap("DeviceSite")
        public String deviceSite;

        @NameInMap("Longitude")
        public String longitude;

        @NameInMap("Latitude")
        public String latitude;

        @NameInMap("Resolution")
        public String resolution;

        @NameInMap("SipServerIp")
        public String sipServerIp;

        @NameInMap("BitRate")
        public String bitRate;

        public static ListIpcDevicesResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListIpcDevicesResponseBodyDataRecords self = new ListIpcDevicesResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListIpcDevicesResponseBodyDataRecords setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListIpcDevicesResponseBodyDataRecords setSipGBId(String sipGBId) {
            this.sipGBId = sipGBId;
            return this;
        }
        public String getSipGBId() {
            return this.sipGBId;
        }

        public ListIpcDevicesResponseBodyDataRecords setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListIpcDevicesResponseBodyDataRecords setDeviceDirection(String deviceDirection) {
            this.deviceDirection = deviceDirection;
            return this;
        }
        public String getDeviceDirection() {
            return this.deviceDirection;
        }

        public ListIpcDevicesResponseBodyDataRecords setDeviceAddress(String deviceAddress) {
            this.deviceAddress = deviceAddress;
            return this;
        }
        public String getDeviceAddress() {
            return this.deviceAddress;
        }

        public ListIpcDevicesResponseBodyDataRecords setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListIpcDevicesResponseBodyDataRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListIpcDevicesResponseBodyDataRecords setSipPassword(String sipPassword) {
            this.sipPassword = sipPassword;
            return this;
        }
        public String getSipPassword() {
            return this.sipPassword;
        }

        public ListIpcDevicesResponseBodyDataRecords setSipServerPort(String sipServerPort) {
            this.sipServerPort = sipServerPort;
            return this;
        }
        public String getSipServerPort() {
            return this.sipServerPort;
        }

        public ListIpcDevicesResponseBodyDataRecords setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public ListIpcDevicesResponseBodyDataRecords setGbId(String gbId) {
            this.gbId = gbId;
            return this;
        }
        public String getGbId() {
            return this.gbId;
        }

        public ListIpcDevicesResponseBodyDataRecords setCoverImageUrl(String coverImageUrl) {
            this.coverImageUrl = coverImageUrl;
            return this;
        }
        public String getCoverImageUrl() {
            return this.coverImageUrl;
        }

        public ListIpcDevicesResponseBodyDataRecords setAccessProtocolType(String accessProtocolType) {
            this.accessProtocolType = accessProtocolType;
            return this;
        }
        public String getAccessProtocolType() {
            return this.accessProtocolType;
        }

        public ListIpcDevicesResponseBodyDataRecords setDeviceSite(String deviceSite) {
            this.deviceSite = deviceSite;
            return this;
        }
        public String getDeviceSite() {
            return this.deviceSite;
        }

        public ListIpcDevicesResponseBodyDataRecords setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public ListIpcDevicesResponseBodyDataRecords setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public ListIpcDevicesResponseBodyDataRecords setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public ListIpcDevicesResponseBodyDataRecords setSipServerIp(String sipServerIp) {
            this.sipServerIp = sipServerIp;
            return this;
        }
        public String getSipServerIp() {
            return this.sipServerIp;
        }

        public ListIpcDevicesResponseBodyDataRecords setBitRate(String bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public String getBitRate() {
            return this.bitRate;
        }

    }

    public static class ListIpcDevicesResponseBodyData extends TeaModel {
        @NameInMap("TotalPage")
        public Integer totalPage;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Records")
        public java.util.List<ListIpcDevicesResponseBodyDataRecords> records;

        public static ListIpcDevicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIpcDevicesResponseBodyData self = new ListIpcDevicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIpcDevicesResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public ListIpcDevicesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListIpcDevicesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListIpcDevicesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListIpcDevicesResponseBodyData setRecords(java.util.List<ListIpcDevicesResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListIpcDevicesResponseBodyDataRecords> getRecords() {
            return this.records;
        }

    }

}
