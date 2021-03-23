// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDeviceModelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceModel")
    public DescribeDeviceModelResponseBodyDeviceModel deviceModel;

    public static DescribeDeviceModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceModelResponseBody self = new DescribeDeviceModelResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceModelResponseBody setDeviceModel(DescribeDeviceModelResponseBodyDeviceModel deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public DescribeDeviceModelResponseBodyDeviceModel getDeviceModel() {
        return this.deviceModel;
    }

    public static class DescribeDeviceModelResponseBodyDeviceModel extends TeaModel {
        @NameInMap("DeviceModelId")
        public Long deviceModelId;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("HardwareType")
        public String hardwareType;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("DeviceBrand")
        public String deviceBrand;

        @NameInMap("CanCreateDeviceId")
        public Integer canCreateDeviceId;

        @NameInMap("InitUsageType")
        public Integer initUsageType;

        @NameInMap("InitUsageTypeDesc")
        public String initUsageTypeDesc;

        @NameInMap("Description")
        public String description;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("SecurityChip")
        public String securityChip;

        @NameInMap("OsPlatform")
        public String osPlatform;

        @NameInMap("ObjectKey")
        public String objectKey;

        @NameInMap("DeviceLogoUrl")
        public String deviceLogoUrl;

        @NameInMap("DeviceName")
        public String deviceName;

        public static DescribeDeviceModelResponseBodyDeviceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceModelResponseBodyDeviceModel self = new DescribeDeviceModelResponseBodyDeviceModel();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceModelResponseBodyDeviceModel setDeviceModelId(Long deviceModelId) {
            this.deviceModelId = deviceModelId;
            return this;
        }
        public Long getDeviceModelId() {
            return this.deviceModelId;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setHardwareType(String hardwareType) {
            this.hardwareType = hardwareType;
            return this;
        }
        public String getHardwareType() {
            return this.hardwareType;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setDeviceBrand(String deviceBrand) {
            this.deviceBrand = deviceBrand;
            return this;
        }
        public String getDeviceBrand() {
            return this.deviceBrand;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setCanCreateDeviceId(Integer canCreateDeviceId) {
            this.canCreateDeviceId = canCreateDeviceId;
            return this;
        }
        public Integer getCanCreateDeviceId() {
            return this.canCreateDeviceId;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setInitUsageType(Integer initUsageType) {
            this.initUsageType = initUsageType;
            return this;
        }
        public Integer getInitUsageType() {
            return this.initUsageType;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setInitUsageTypeDesc(String initUsageTypeDesc) {
            this.initUsageTypeDesc = initUsageTypeDesc;
            return this;
        }
        public String getInitUsageTypeDesc() {
            return this.initUsageTypeDesc;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setSecurityChip(String securityChip) {
            this.securityChip = securityChip;
            return this;
        }
        public String getSecurityChip() {
            return this.securityChip;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setOsPlatform(String osPlatform) {
            this.osPlatform = osPlatform;
            return this;
        }
        public String getOsPlatform() {
            return this.osPlatform;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setDeviceLogoUrl(String deviceLogoUrl) {
            this.deviceLogoUrl = deviceLogoUrl;
            return this;
        }
        public String getDeviceLogoUrl() {
            return this.deviceLogoUrl;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

    }

}
