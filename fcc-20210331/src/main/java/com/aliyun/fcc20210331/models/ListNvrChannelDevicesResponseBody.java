// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class ListNvrChannelDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListNvrChannelDevicesResponseBodyData data;

    public static ListNvrChannelDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNvrChannelDevicesResponseBody self = new ListNvrChannelDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNvrChannelDevicesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListNvrChannelDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNvrChannelDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNvrChannelDevicesResponseBody setData(ListNvrChannelDevicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListNvrChannelDevicesResponseBodyData getData() {
        return this.data;
    }

    public static class ListNvrChannelDevicesResponseBodyDataRecords extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("SampleName")
        public String sampleName;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("Vap")
        public String vap;

        @NameInMap("DeviceStatus")
        public String deviceStatus;

        @NameInMap("ComptureStatus")
        public String comptureStatus;

        @NameInMap("StreamStatus")
        public String streamStatus;

        @NameInMap("DeviceSn")
        public String deviceSn;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("DatasourceType")
        public String datasourceType;

        @NameInMap("DeviceCode")
        public String deviceCode;

        public static ListNvrChannelDevicesResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListNvrChannelDevicesResponseBodyDataRecords self = new ListNvrChannelDevicesResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListNvrChannelDevicesResponseBodyDataRecords setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListNvrChannelDevicesResponseBodyDataRecords setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListNvrChannelDevicesResponseBodyDataRecords setSampleName(String sampleName) {
            this.sampleName = sampleName;
            return this;
        }
        public String getSampleName() {
            return this.sampleName;
        }

        public ListNvrChannelDevicesResponseBodyDataRecords setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListNvrChannelDevicesResponseBodyDataRecords setVap(String vap) {
            this.vap = vap;
            return this;
        }
        public String getVap() {
            return this.vap;
        }

        public ListNvrChannelDevicesResponseBodyDataRecords setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public ListNvrChannelDevicesResponseBodyDataRecords setComptureStatus(String comptureStatus) {
            this.comptureStatus = comptureStatus;
            return this;
        }
        public String getComptureStatus() {
            return this.comptureStatus;
        }

        public ListNvrChannelDevicesResponseBodyDataRecords setStreamStatus(String streamStatus) {
            this.streamStatus = streamStatus;
            return this;
        }
        public String getStreamStatus() {
            return this.streamStatus;
        }

        public ListNvrChannelDevicesResponseBodyDataRecords setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public ListNvrChannelDevicesResponseBodyDataRecords setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public ListNvrChannelDevicesResponseBodyDataRecords setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListNvrChannelDevicesResponseBodyDataRecords setDatasourceType(String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public String getDatasourceType() {
            return this.datasourceType;
        }

        public ListNvrChannelDevicesResponseBodyDataRecords setDeviceCode(String deviceCode) {
            this.deviceCode = deviceCode;
            return this;
        }
        public String getDeviceCode() {
            return this.deviceCode;
        }

    }

    public static class ListNvrChannelDevicesResponseBodyData extends TeaModel {
        @NameInMap("TotalPage")
        public Long totalPage;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Records")
        public java.util.List<ListNvrChannelDevicesResponseBodyDataRecords> records;

        public static ListNvrChannelDevicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNvrChannelDevicesResponseBodyData self = new ListNvrChannelDevicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNvrChannelDevicesResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

        public ListNvrChannelDevicesResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListNvrChannelDevicesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListNvrChannelDevicesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListNvrChannelDevicesResponseBodyData setRecords(java.util.List<ListNvrChannelDevicesResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListNvrChannelDevicesResponseBodyDataRecords> getRecords() {
            return this.records;
        }

    }

}
