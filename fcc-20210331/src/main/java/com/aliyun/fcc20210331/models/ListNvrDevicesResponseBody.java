// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class ListNvrDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListNvrDevicesResponseBodyData data;

    public static ListNvrDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNvrDevicesResponseBody self = new ListNvrDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNvrDevicesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListNvrDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNvrDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNvrDevicesResponseBody setData(ListNvrDevicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListNvrDevicesResponseBodyData getData() {
        return this.data;
    }

    public static class ListNvrDevicesResponseBodyDataRecords extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("DeviceStatus")
        public String deviceStatus;

        @NameInMap("ComptureStatus")
        public String comptureStatus;

        @NameInMap("StreamStatus")
        public String streamStatus;

        @NameInMap("RegistrationTime")
        public String registrationTime;

        @NameInMap("DeviceSn")
        public String deviceSn;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("Channel")
        public String channel;

        @NameInMap("DatasourceType")
        public String datasourceType;

        @NameInMap("AccessQuota")
        public String accessQuota;

        @NameInMap("DeviceCode")
        public String deviceCode;

        public static ListNvrDevicesResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListNvrDevicesResponseBodyDataRecords self = new ListNvrDevicesResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListNvrDevicesResponseBodyDataRecords setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListNvrDevicesResponseBodyDataRecords setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListNvrDevicesResponseBodyDataRecords setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListNvrDevicesResponseBodyDataRecords setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListNvrDevicesResponseBodyDataRecords setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public ListNvrDevicesResponseBodyDataRecords setComptureStatus(String comptureStatus) {
            this.comptureStatus = comptureStatus;
            return this;
        }
        public String getComptureStatus() {
            return this.comptureStatus;
        }

        public ListNvrDevicesResponseBodyDataRecords setStreamStatus(String streamStatus) {
            this.streamStatus = streamStatus;
            return this;
        }
        public String getStreamStatus() {
            return this.streamStatus;
        }

        public ListNvrDevicesResponseBodyDataRecords setRegistrationTime(String registrationTime) {
            this.registrationTime = registrationTime;
            return this;
        }
        public String getRegistrationTime() {
            return this.registrationTime;
        }

        public ListNvrDevicesResponseBodyDataRecords setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public ListNvrDevicesResponseBodyDataRecords setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public ListNvrDevicesResponseBodyDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListNvrDevicesResponseBodyDataRecords setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ListNvrDevicesResponseBodyDataRecords setDatasourceType(String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public String getDatasourceType() {
            return this.datasourceType;
        }

        public ListNvrDevicesResponseBodyDataRecords setAccessQuota(String accessQuota) {
            this.accessQuota = accessQuota;
            return this;
        }
        public String getAccessQuota() {
            return this.accessQuota;
        }

        public ListNvrDevicesResponseBodyDataRecords setDeviceCode(String deviceCode) {
            this.deviceCode = deviceCode;
            return this;
        }
        public String getDeviceCode() {
            return this.deviceCode;
        }

    }

    public static class ListNvrDevicesResponseBodyData extends TeaModel {
        @NameInMap("TotalPage")
        public Long totalPage;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Records")
        public java.util.List<ListNvrDevicesResponseBodyDataRecords> records;

        public static ListNvrDevicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNvrDevicesResponseBodyData self = new ListNvrDevicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNvrDevicesResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

        public ListNvrDevicesResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListNvrDevicesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListNvrDevicesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListNvrDevicesResponseBodyData setRecords(java.util.List<ListNvrDevicesResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListNvrDevicesResponseBodyDataRecords> getRecords() {
            return this.records;
        }

    }

}
