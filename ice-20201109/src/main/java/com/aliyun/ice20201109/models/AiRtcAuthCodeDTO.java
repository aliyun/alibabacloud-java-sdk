// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AiRtcAuthCodeDTO extends TeaModel {
    @NameInMap("ActivatedTime")
    public String activatedTime;

    @NameInMap("AuthCode")
    public String authCode;

    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("License")
    public String license;

    @NameInMap("LicenseItemId")
    public String licenseItemId;

    @NameInMap("ModificationTime")
    public String modificationTime;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Type")
    public Integer type;

    public static AiRtcAuthCodeDTO build(java.util.Map<String, ?> map) throws Exception {
        AiRtcAuthCodeDTO self = new AiRtcAuthCodeDTO();
        return TeaModel.build(map, self);
    }

    public AiRtcAuthCodeDTO setActivatedTime(String activatedTime) {
        this.activatedTime = activatedTime;
        return this;
    }
    public String getActivatedTime() {
        return this.activatedTime;
    }

    public AiRtcAuthCodeDTO setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public AiRtcAuthCodeDTO setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public AiRtcAuthCodeDTO setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public AiRtcAuthCodeDTO setLicense(String license) {
        this.license = license;
        return this;
    }
    public String getLicense() {
        return this.license;
    }

    public AiRtcAuthCodeDTO setLicenseItemId(String licenseItemId) {
        this.licenseItemId = licenseItemId;
        return this;
    }
    public String getLicenseItemId() {
        return this.licenseItemId;
    }

    public AiRtcAuthCodeDTO setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
        return this;
    }
    public String getModificationTime() {
        return this.modificationTime;
    }

    public AiRtcAuthCodeDTO setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public AiRtcAuthCodeDTO setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
