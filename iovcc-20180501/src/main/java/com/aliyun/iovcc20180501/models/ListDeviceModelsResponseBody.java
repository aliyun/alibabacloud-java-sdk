// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListDeviceModelsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceModels")
    public java.util.List<ListDeviceModelsResponseBodyDeviceModels> deviceModels;

    public static ListDeviceModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceModelsResponseBody self = new ListDeviceModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceModelsResponseBody setDeviceModels(java.util.List<ListDeviceModelsResponseBodyDeviceModels> deviceModels) {
        this.deviceModels = deviceModels;
        return this;
    }
    public java.util.List<ListDeviceModelsResponseBodyDeviceModels> getDeviceModels() {
        return this.deviceModels;
    }

    public static class ListDeviceModelsResponseBodyDeviceModels extends TeaModel {
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

        public static ListDeviceModelsResponseBodyDeviceModels build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceModelsResponseBodyDeviceModels self = new ListDeviceModelsResponseBodyDeviceModels();
            return TeaModel.build(map, self);
        }

        public ListDeviceModelsResponseBodyDeviceModels setDeviceModelId(Long deviceModelId) {
            this.deviceModelId = deviceModelId;
            return this;
        }
        public Long getDeviceModelId() {
            return this.deviceModelId;
        }

        public ListDeviceModelsResponseBodyDeviceModels setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListDeviceModelsResponseBodyDeviceModels setHardwareType(String hardwareType) {
            this.hardwareType = hardwareType;
            return this;
        }
        public String getHardwareType() {
            return this.hardwareType;
        }

        public ListDeviceModelsResponseBodyDeviceModels setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public ListDeviceModelsResponseBodyDeviceModels setDeviceBrand(String deviceBrand) {
            this.deviceBrand = deviceBrand;
            return this;
        }
        public String getDeviceBrand() {
            return this.deviceBrand;
        }

        public ListDeviceModelsResponseBodyDeviceModels setCanCreateDeviceId(Integer canCreateDeviceId) {
            this.canCreateDeviceId = canCreateDeviceId;
            return this;
        }
        public Integer getCanCreateDeviceId() {
            return this.canCreateDeviceId;
        }

        public ListDeviceModelsResponseBodyDeviceModels setInitUsageType(Integer initUsageType) {
            this.initUsageType = initUsageType;
            return this;
        }
        public Integer getInitUsageType() {
            return this.initUsageType;
        }

        public ListDeviceModelsResponseBodyDeviceModels setInitUsageTypeDesc(String initUsageTypeDesc) {
            this.initUsageTypeDesc = initUsageTypeDesc;
            return this;
        }
        public String getInitUsageTypeDesc() {
            return this.initUsageTypeDesc;
        }

        public ListDeviceModelsResponseBodyDeviceModels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDeviceModelsResponseBodyDeviceModels setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListDeviceModelsResponseBodyDeviceModels setSecurityChip(String securityChip) {
            this.securityChip = securityChip;
            return this;
        }
        public String getSecurityChip() {
            return this.securityChip;
        }

        public ListDeviceModelsResponseBodyDeviceModels setOsPlatform(String osPlatform) {
            this.osPlatform = osPlatform;
            return this;
        }
        public String getOsPlatform() {
            return this.osPlatform;
        }

        public ListDeviceModelsResponseBodyDeviceModels setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public ListDeviceModelsResponseBodyDeviceModels setDeviceLogoUrl(String deviceLogoUrl) {
            this.deviceLogoUrl = deviceLogoUrl;
            return this;
        }
        public String getDeviceLogoUrl() {
            return this.deviceLogoUrl;
        }

        public ListDeviceModelsResponseBodyDeviceModels setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

    }

}
