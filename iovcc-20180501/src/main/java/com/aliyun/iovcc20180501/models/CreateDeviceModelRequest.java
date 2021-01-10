// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateDeviceModelRequest extends TeaModel {
    @NameInMap("InitUsageType")
    public String initUsageType;

    @NameInMap("CanCreateDeviceId")
    public String canCreateDeviceId;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("HardwareType")
    public String hardwareType;

    @NameInMap("BrandName")
    public String brandName;

    @NameInMap("Description")
    public String description;

    @NameInMap("DeviceType")
    public String deviceType;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("SecurityChip")
    public String securityChip;

    @NameInMap("OsPlatform")
    public String osPlatform;

    @NameInMap("ObjectKey")
    public String objectKey;

    @NameInMap("DeviceName")
    public String deviceName;

    public static CreateDeviceModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceModelRequest self = new CreateDeviceModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeviceModelRequest setInitUsageType(String initUsageType) {
        this.initUsageType = initUsageType;
        return this;
    }
    public String getInitUsageType() {
        return this.initUsageType;
    }

    public CreateDeviceModelRequest setCanCreateDeviceId(String canCreateDeviceId) {
        this.canCreateDeviceId = canCreateDeviceId;
        return this;
    }
    public String getCanCreateDeviceId() {
        return this.canCreateDeviceId;
    }

    public CreateDeviceModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateDeviceModelRequest setHardwareType(String hardwareType) {
        this.hardwareType = hardwareType;
        return this;
    }
    public String getHardwareType() {
        return this.hardwareType;
    }

    public CreateDeviceModelRequest setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }
    public String getBrandName() {
        return this.brandName;
    }

    public CreateDeviceModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDeviceModelRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public CreateDeviceModelRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateDeviceModelRequest setSecurityChip(String securityChip) {
        this.securityChip = securityChip;
        return this;
    }
    public String getSecurityChip() {
        return this.securityChip;
    }

    public CreateDeviceModelRequest setOsPlatform(String osPlatform) {
        this.osPlatform = osPlatform;
        return this;
    }
    public String getOsPlatform() {
        return this.osPlatform;
    }

    public CreateDeviceModelRequest setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

    public CreateDeviceModelRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

}
