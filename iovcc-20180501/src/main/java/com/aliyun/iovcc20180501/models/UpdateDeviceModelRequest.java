// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateDeviceModelRequest extends TeaModel {
    @NameInMap("InitUsageType")
    public String initUsageType;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("Id")
    public String id;

    @NameInMap("BrandName")
    public String brandName;

    @NameInMap("Description")
    public String description;

    @NameInMap("DeviceType")
    public String deviceType;

    @NameInMap("CanCreateDeviceId")
    public String canCreateDeviceId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("HardwareType")
    public String hardwareType;

    @NameInMap("SecurityChip")
    public String securityChip;

    @NameInMap("OsPlatform")
    public String osPlatform;

    @NameInMap("ObjectKey")
    public String objectKey;

    @NameInMap("DeviceName")
    public String deviceName;

    public static UpdateDeviceModelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceModelRequest self = new UpdateDeviceModelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceModelRequest setInitUsageType(String initUsageType) {
        this.initUsageType = initUsageType;
        return this;
    }
    public String getInitUsageType() {
        return this.initUsageType;
    }

    public UpdateDeviceModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public UpdateDeviceModelRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateDeviceModelRequest setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }
    public String getBrandName() {
        return this.brandName;
    }

    public UpdateDeviceModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDeviceModelRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public UpdateDeviceModelRequest setCanCreateDeviceId(String canCreateDeviceId) {
        this.canCreateDeviceId = canCreateDeviceId;
        return this;
    }
    public String getCanCreateDeviceId() {
        return this.canCreateDeviceId;
    }

    public UpdateDeviceModelRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateDeviceModelRequest setHardwareType(String hardwareType) {
        this.hardwareType = hardwareType;
        return this;
    }
    public String getHardwareType() {
        return this.hardwareType;
    }

    public UpdateDeviceModelRequest setSecurityChip(String securityChip) {
        this.securityChip = securityChip;
        return this;
    }
    public String getSecurityChip() {
        return this.securityChip;
    }

    public UpdateDeviceModelRequest setOsPlatform(String osPlatform) {
        this.osPlatform = osPlatform;
        return this;
    }
    public String getOsPlatform() {
        return this.osPlatform;
    }

    public UpdateDeviceModelRequest setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

    public UpdateDeviceModelRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

}
