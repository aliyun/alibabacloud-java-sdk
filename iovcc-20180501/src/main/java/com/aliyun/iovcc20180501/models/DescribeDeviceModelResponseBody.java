// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDeviceModelResponseBody extends TeaModel {
    @NameInMap("DeviceModel")
    public DescribeDeviceModelResponseBodyDeviceModel deviceModel;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDeviceModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceModelResponseBody self = new DescribeDeviceModelResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceModelResponseBody setDeviceModel(DescribeDeviceModelResponseBodyDeviceModel deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public DescribeDeviceModelResponseBodyDeviceModel getDeviceModel() {
        return this.deviceModel;
    }

    public DescribeDeviceModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDeviceModelResponseBodyDeviceModel extends TeaModel {
        @NameInMap("DeviceModelId")
        public Long deviceModelId;

        @NameInMap("HardwareType")
        public String hardwareType;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("CanCreateDeviceId")
        public Integer canCreateDeviceId;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("OsPlatform")
        public String osPlatform;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("SecurityChip")
        public String securityChip;

        @NameInMap("DeviceLogoUrl")
        public String deviceLogoUrl;

        @NameInMap("Description")
        public String description;

        @NameInMap("ObjectKey")
        public String objectKey;

        @NameInMap("InitUsageTypeDesc")
        public String initUsageTypeDesc;

        @NameInMap("InitUsageType")
        public Integer initUsageType;

        @NameInMap("DeviceBrand")
        public String deviceBrand;

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

        public DescribeDeviceModelResponseBodyDeviceModel setHardwareType(String hardwareType) {
            this.hardwareType = hardwareType;
            return this;
        }
        public String getHardwareType() {
            return this.hardwareType;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setCanCreateDeviceId(Integer canCreateDeviceId) {
            this.canCreateDeviceId = canCreateDeviceId;
            return this;
        }
        public Integer getCanCreateDeviceId() {
            return this.canCreateDeviceId;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setOsPlatform(String osPlatform) {
            this.osPlatform = osPlatform;
            return this;
        }
        public String getOsPlatform() {
            return this.osPlatform;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setSecurityChip(String securityChip) {
            this.securityChip = securityChip;
            return this;
        }
        public String getSecurityChip() {
            return this.securityChip;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setDeviceLogoUrl(String deviceLogoUrl) {
            this.deviceLogoUrl = deviceLogoUrl;
            return this;
        }
        public String getDeviceLogoUrl() {
            return this.deviceLogoUrl;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setInitUsageTypeDesc(String initUsageTypeDesc) {
            this.initUsageTypeDesc = initUsageTypeDesc;
            return this;
        }
        public String getInitUsageTypeDesc() {
            return this.initUsageTypeDesc;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setInitUsageType(Integer initUsageType) {
            this.initUsageType = initUsageType;
            return this;
        }
        public Integer getInitUsageType() {
            return this.initUsageType;
        }

        public DescribeDeviceModelResponseBodyDeviceModel setDeviceBrand(String deviceBrand) {
            this.deviceBrand = deviceBrand;
            return this;
        }
        public String getDeviceBrand() {
            return this.deviceBrand;
        }

    }

}
