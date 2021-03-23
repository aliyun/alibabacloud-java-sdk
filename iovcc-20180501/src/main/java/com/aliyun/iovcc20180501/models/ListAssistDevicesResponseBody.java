// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListAssistDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PerPage")
    public Integer perPage;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Devices")
    public java.util.List<ListAssistDevicesResponseBodyDevices> devices;

    public static ListAssistDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAssistDevicesResponseBody self = new ListAssistDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAssistDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAssistDevicesResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListAssistDevicesResponseBody setPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }
    public Integer getPerPage() {
        return this.perPage;
    }

    public ListAssistDevicesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListAssistDevicesResponseBody setDevices(java.util.List<ListAssistDevicesResponseBodyDevices> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<ListAssistDevicesResponseBodyDevices> getDevices() {
        return this.devices;
    }

    public static class ListAssistDevicesResponseBodyDevices extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("HardwareId")
        public String hardwareId;

        @NameInMap("UUID")
        public String UUID;

        @NameInMap("VIN")
        public String VIN;

        @NameInMap("AccessTime")
        public Long accessTime;

        public static ListAssistDevicesResponseBodyDevices build(java.util.Map<String, ?> map) throws Exception {
            ListAssistDevicesResponseBodyDevices self = new ListAssistDevicesResponseBodyDevices();
            return TeaModel.build(map, self);
        }

        public ListAssistDevicesResponseBodyDevices setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListAssistDevicesResponseBodyDevices setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListAssistDevicesResponseBodyDevices setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListAssistDevicesResponseBodyDevices setHardwareId(String hardwareId) {
            this.hardwareId = hardwareId;
            return this;
        }
        public String getHardwareId() {
            return this.hardwareId;
        }

        public ListAssistDevicesResponseBodyDevices setUUID(String UUID) {
            this.UUID = UUID;
            return this;
        }
        public String getUUID() {
            return this.UUID;
        }

        public ListAssistDevicesResponseBodyDevices setVIN(String VIN) {
            this.VIN = VIN;
            return this;
        }
        public String getVIN() {
            return this.VIN;
        }

        public ListAssistDevicesResponseBodyDevices setAccessTime(Long accessTime) {
            this.accessTime = accessTime;
            return this;
        }
        public Long getAccessTime() {
            return this.accessTime;
        }

    }

}
