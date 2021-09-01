// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class DescribeDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DescribeDevicesResponseBodyData data;

    public static DescribeDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDevicesResponseBody self = new DescribeDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDevicesResponseBody setData(DescribeDevicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDevicesResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeDevicesResponseBodyDataRecords extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceId")
        public Long deviceId;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("DeviceAddress")
        public String deviceAddress;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CapturedPictureId")
        public String capturedPictureId;

        @NameInMap("Vendor")
        public String vendor;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("InProtocol")
        public String inProtocol;

        @NameInMap("Longitude")
        public String longitude;

        @NameInMap("Latitude")
        public String latitude;

        public static DescribeDevicesResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeDevicesResponseBodyDataRecords self = new DescribeDevicesResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public DescribeDevicesResponseBodyDataRecords setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDevicesResponseBodyDataRecords setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public DescribeDevicesResponseBodyDataRecords setDeviceId(Long deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public Long getDeviceId() {
            return this.deviceId;
        }

        public DescribeDevicesResponseBodyDataRecords setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeDevicesResponseBodyDataRecords setDeviceAddress(String deviceAddress) {
            this.deviceAddress = deviceAddress;
            return this;
        }
        public String getDeviceAddress() {
            return this.deviceAddress;
        }

        public DescribeDevicesResponseBodyDataRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDevicesResponseBodyDataRecords setCapturedPictureId(String capturedPictureId) {
            this.capturedPictureId = capturedPictureId;
            return this;
        }
        public String getCapturedPictureId() {
            return this.capturedPictureId;
        }

        public DescribeDevicesResponseBodyDataRecords setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public DescribeDevicesResponseBodyDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public DescribeDevicesResponseBodyDataRecords setInProtocol(String inProtocol) {
            this.inProtocol = inProtocol;
            return this;
        }
        public String getInProtocol() {
            return this.inProtocol;
        }

        public DescribeDevicesResponseBodyDataRecords setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public DescribeDevicesResponseBodyDataRecords setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

    }

    public static class DescribeDevicesResponseBodyData extends TeaModel {
        @NameInMap("TotalPage")
        public Long totalPage;

        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Records")
        public java.util.List<DescribeDevicesResponseBodyDataRecords> records;

        public static DescribeDevicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDevicesResponseBodyData self = new DescribeDevicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDevicesResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

        public DescribeDevicesResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public DescribeDevicesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeDevicesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeDevicesResponseBodyData setRecords(java.util.List<DescribeDevicesResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<DescribeDevicesResponseBodyDataRecords> getRecords() {
            return this.records;
        }

    }

}
