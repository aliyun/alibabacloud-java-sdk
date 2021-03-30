// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListAssistHistoriesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PerPage")
    public Integer perPage;

    @NameInMap("Histories")
    public java.util.List<ListAssistHistoriesResponseBodyHistories> histories;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    public static ListAssistHistoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAssistHistoriesResponseBody self = new ListAssistHistoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAssistHistoriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListAssistHistoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAssistHistoriesResponseBody setPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }
    public Integer getPerPage() {
        return this.perPage;
    }

    public ListAssistHistoriesResponseBody setHistories(java.util.List<ListAssistHistoriesResponseBodyHistories> histories) {
        this.histories = histories;
        return this;
    }
    public java.util.List<ListAssistHistoriesResponseBodyHistories> getHistories() {
        return this.histories;
    }

    public ListAssistHistoriesResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public static class ListAssistHistoriesResponseBodyHistories extends TeaModel {
        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("UNAME")
        public String UNAME;

        @NameInMap("HardwareId")
        public String hardwareId;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("UUID")
        public String UUID;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("VIN")
        public String VIN;

        @NameInMap("UID")
        public String UID;

        @NameInMap("ID")
        public String ID;

        public static ListAssistHistoriesResponseBodyHistories build(java.util.Map<String, ?> map) throws Exception {
            ListAssistHistoriesResponseBodyHistories self = new ListAssistHistoriesResponseBodyHistories();
            return TeaModel.build(map, self);
        }

        public ListAssistHistoriesResponseBodyHistories setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListAssistHistoriesResponseBodyHistories setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListAssistHistoriesResponseBodyHistories setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListAssistHistoriesResponseBodyHistories setUNAME(String UNAME) {
            this.UNAME = UNAME;
            return this;
        }
        public String getUNAME() {
            return this.UNAME;
        }

        public ListAssistHistoriesResponseBodyHistories setHardwareId(String hardwareId) {
            this.hardwareId = hardwareId;
            return this;
        }
        public String getHardwareId() {
            return this.hardwareId;
        }

        public ListAssistHistoriesResponseBodyHistories setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListAssistHistoriesResponseBodyHistories setUUID(String UUID) {
            this.UUID = UUID;
            return this;
        }
        public String getUUID() {
            return this.UUID;
        }

        public ListAssistHistoriesResponseBodyHistories setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListAssistHistoriesResponseBodyHistories setVIN(String VIN) {
            this.VIN = VIN;
            return this;
        }
        public String getVIN() {
            return this.VIN;
        }

        public ListAssistHistoriesResponseBodyHistories setUID(String UID) {
            this.UID = UID;
            return this;
        }
        public String getUID() {
            return this.UID;
        }

        public ListAssistHistoriesResponseBodyHistories setID(String ID) {
            this.ID = ID;
            return this;
        }
        public String getID() {
            return this.ID;
        }

    }

}
