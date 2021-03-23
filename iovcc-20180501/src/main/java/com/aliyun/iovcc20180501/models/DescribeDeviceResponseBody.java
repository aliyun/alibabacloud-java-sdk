// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceInfo")
    public DescribeDeviceResponseBodyDeviceInfo deviceInfo;

    public static DescribeDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceResponseBody self = new DescribeDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceResponseBody setDeviceInfo(DescribeDeviceResponseBodyDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public DescribeDeviceResponseBodyDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public static class DescribeDeviceResponseBodyDeviceInfo extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("UsageType")
        public Integer usageType;

        @NameInMap("UsageTypeDesc")
        public String usageTypeDesc;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("DeviceModelId")
        public Long deviceModelId;

        @NameInMap("DeviceProduct")
        public String deviceProduct;

        @NameInMap("DeviceBrandId")
        public Long deviceBrandId;

        @NameInMap("DeviceBrand")
        public String deviceBrand;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("Vin")
        public String vin;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("MacAddress")
        public String macAddress;

        @NameInMap("HardwareId")
        public String hardwareId;

        @NameInMap("SoftwareId")
        public String softwareId;

        @NameInMap("Region")
        public String region;

        @NameInMap("Name")
        public String name;

        @NameInMap("Attributes")
        public String attributes;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("OsPlatform")
        public String osPlatform;

        @NameInMap("Status")
        public String status;

        public static DescribeDeviceResponseBodyDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceResponseBodyDeviceInfo self = new DescribeDeviceResponseBodyDeviceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceResponseBodyDeviceInfo setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public DescribeDeviceResponseBodyDeviceInfo setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeDeviceResponseBodyDeviceInfo setUsageType(Integer usageType) {
            this.usageType = usageType;
            return this;
        }
        public Integer getUsageType() {
            return this.usageType;
        }

        public DescribeDeviceResponseBodyDeviceInfo setUsageTypeDesc(String usageTypeDesc) {
            this.usageTypeDesc = usageTypeDesc;
            return this;
        }
        public String getUsageTypeDesc() {
            return this.usageTypeDesc;
        }

        public DescribeDeviceResponseBodyDeviceInfo setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public DescribeDeviceResponseBodyDeviceInfo setDeviceModelId(Long deviceModelId) {
            this.deviceModelId = deviceModelId;
            return this;
        }
        public Long getDeviceModelId() {
            return this.deviceModelId;
        }

        public DescribeDeviceResponseBodyDeviceInfo setDeviceProduct(String deviceProduct) {
            this.deviceProduct = deviceProduct;
            return this;
        }
        public String getDeviceProduct() {
            return this.deviceProduct;
        }

        public DescribeDeviceResponseBodyDeviceInfo setDeviceBrandId(Long deviceBrandId) {
            this.deviceBrandId = deviceBrandId;
            return this;
        }
        public Long getDeviceBrandId() {
            return this.deviceBrandId;
        }

        public DescribeDeviceResponseBodyDeviceInfo setDeviceBrand(String deviceBrand) {
            this.deviceBrand = deviceBrand;
            return this;
        }
        public String getDeviceBrand() {
            return this.deviceBrand;
        }

        public DescribeDeviceResponseBodyDeviceInfo setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeDeviceResponseBodyDeviceInfo setVin(String vin) {
            this.vin = vin;
            return this;
        }
        public String getVin() {
            return this.vin;
        }

        public DescribeDeviceResponseBodyDeviceInfo setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public DescribeDeviceResponseBodyDeviceInfo setMacAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }
        public String getMacAddress() {
            return this.macAddress;
        }

        public DescribeDeviceResponseBodyDeviceInfo setHardwareId(String hardwareId) {
            this.hardwareId = hardwareId;
            return this;
        }
        public String getHardwareId() {
            return this.hardwareId;
        }

        public DescribeDeviceResponseBodyDeviceInfo setSoftwareId(String softwareId) {
            this.softwareId = softwareId;
            return this;
        }
        public String getSoftwareId() {
            return this.softwareId;
        }

        public DescribeDeviceResponseBodyDeviceInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDeviceResponseBodyDeviceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDeviceResponseBodyDeviceInfo setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public DescribeDeviceResponseBodyDeviceInfo setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeDeviceResponseBodyDeviceInfo setOsPlatform(String osPlatform) {
            this.osPlatform = osPlatform;
            return this;
        }
        public String getOsPlatform() {
            return this.osPlatform;
        }

        public DescribeDeviceResponseBodyDeviceInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
