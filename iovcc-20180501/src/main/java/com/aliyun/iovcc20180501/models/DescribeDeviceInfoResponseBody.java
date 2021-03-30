// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDeviceInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceInfo")
    public DescribeDeviceInfoResponseBodyDeviceInfo deviceInfo;

    public static DescribeDeviceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceInfoResponseBody self = new DescribeDeviceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceInfoResponseBody setDeviceInfo(DescribeDeviceInfoResponseBodyDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public DescribeDeviceInfoResponseBodyDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public static class DescribeDeviceInfoResponseBodyDeviceInfo extends TeaModel {
        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("Status")
        public String status;

        @NameInMap("DeviceModelId")
        public Long deviceModelId;

        @NameInMap("MacAddress")
        public String macAddress;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("UsageType")
        public Integer usageType;

        @NameInMap("Vin")
        public String vin;

        @NameInMap("UsageTypeDesc")
        public String usageTypeDesc;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("HardwareId")
        public String hardwareId;

        @NameInMap("Region")
        public String region;

        @NameInMap("SoftwareId")
        public String softwareId;

        @NameInMap("Name")
        public String name;

        @NameInMap("DeviceBrand")
        public String deviceBrand;

        public static DescribeDeviceInfoResponseBodyDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceInfoResponseBodyDeviceInfo self = new DescribeDeviceInfoResponseBodyDeviceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceInfoResponseBodyDeviceInfo setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeDeviceInfoResponseBodyDeviceInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDeviceInfoResponseBodyDeviceInfo setDeviceModelId(Long deviceModelId) {
            this.deviceModelId = deviceModelId;
            return this;
        }
        public Long getDeviceModelId() {
            return this.deviceModelId;
        }

        public DescribeDeviceInfoResponseBodyDeviceInfo setMacAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }
        public String getMacAddress() {
            return this.macAddress;
        }

        public DescribeDeviceInfoResponseBodyDeviceInfo setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DescribeDeviceInfoResponseBodyDeviceInfo setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeDeviceInfoResponseBodyDeviceInfo setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeDeviceInfoResponseBodyDeviceInfo setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public DescribeDeviceInfoResponseBodyDeviceInfo setUsageType(Integer usageType) {
            this.usageType = usageType;
            return this;
        }
        public Integer getUsageType() {
            return this.usageType;
        }

        public DescribeDeviceInfoResponseBodyDeviceInfo setVin(String vin) {
            this.vin = vin;
            return this;
        }
        public String getVin() {
            return this.vin;
        }

        public DescribeDeviceInfoResponseBodyDeviceInfo setUsageTypeDesc(String usageTypeDesc) {
            this.usageTypeDesc = usageTypeDesc;
            return this;
        }
        public String getUsageTypeDesc() {
            return this.usageTypeDesc;
        }

        public DescribeDeviceInfoResponseBodyDeviceInfo setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeDeviceInfoResponseBodyDeviceInfo setHardwareId(String hardwareId) {
            this.hardwareId = hardwareId;
            return this;
        }
        public String getHardwareId() {
            return this.hardwareId;
        }

        public DescribeDeviceInfoResponseBodyDeviceInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDeviceInfoResponseBodyDeviceInfo setSoftwareId(String softwareId) {
            this.softwareId = softwareId;
            return this;
        }
        public String getSoftwareId() {
            return this.softwareId;
        }

        public DescribeDeviceInfoResponseBodyDeviceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDeviceInfoResponseBodyDeviceInfo setDeviceBrand(String deviceBrand) {
            this.deviceBrand = deviceBrand;
            return this;
        }
        public String getDeviceBrand() {
            return this.deviceBrand;
        }

    }

}
