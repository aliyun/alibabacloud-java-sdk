// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListDeviceModelsResponseBody extends TeaModel {
    @NameInMap("DeviceModels")
    public java.util.List<ListDeviceModelsResponseBodyDeviceModels> deviceModels;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDeviceModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceModelsResponseBody self = new ListDeviceModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceModelsResponseBody setDeviceModels(java.util.List<ListDeviceModelsResponseBodyDeviceModels> deviceModels) {
        this.deviceModels = deviceModels;
        return this;
    }
    public java.util.List<ListDeviceModelsResponseBodyDeviceModels> getDeviceModels() {
        return this.deviceModels;
    }

    public ListDeviceModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDeviceModelsResponseBodyDeviceModels extends TeaModel {
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

        public ListDeviceModelsResponseBodyDeviceModels setHardwareType(String hardwareType) {
            this.hardwareType = hardwareType;
            return this;
        }
        public String getHardwareType() {
            return this.hardwareType;
        }

        public ListDeviceModelsResponseBodyDeviceModels setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListDeviceModelsResponseBodyDeviceModels setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListDeviceModelsResponseBodyDeviceModels setCanCreateDeviceId(Integer canCreateDeviceId) {
            this.canCreateDeviceId = canCreateDeviceId;
            return this;
        }
        public Integer getCanCreateDeviceId() {
            return this.canCreateDeviceId;
        }

        public ListDeviceModelsResponseBodyDeviceModels setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListDeviceModelsResponseBodyDeviceModels setOsPlatform(String osPlatform) {
            this.osPlatform = osPlatform;
            return this;
        }
        public String getOsPlatform() {
            return this.osPlatform;
        }

        public ListDeviceModelsResponseBodyDeviceModels setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public ListDeviceModelsResponseBodyDeviceModels setSecurityChip(String securityChip) {
            this.securityChip = securityChip;
            return this;
        }
        public String getSecurityChip() {
            return this.securityChip;
        }

        public ListDeviceModelsResponseBodyDeviceModels setDeviceLogoUrl(String deviceLogoUrl) {
            this.deviceLogoUrl = deviceLogoUrl;
            return this;
        }
        public String getDeviceLogoUrl() {
            return this.deviceLogoUrl;
        }

        public ListDeviceModelsResponseBodyDeviceModels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDeviceModelsResponseBodyDeviceModels setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public ListDeviceModelsResponseBodyDeviceModels setInitUsageTypeDesc(String initUsageTypeDesc) {
            this.initUsageTypeDesc = initUsageTypeDesc;
            return this;
        }
        public String getInitUsageTypeDesc() {
            return this.initUsageTypeDesc;
        }

        public ListDeviceModelsResponseBodyDeviceModels setInitUsageType(Integer initUsageType) {
            this.initUsageType = initUsageType;
            return this;
        }
        public Integer getInitUsageType() {
            return this.initUsageType;
        }

        public ListDeviceModelsResponseBodyDeviceModels setDeviceBrand(String deviceBrand) {
            this.deviceBrand = deviceBrand;
            return this;
        }
        public String getDeviceBrand() {
            return this.deviceBrand;
        }

    }

}
