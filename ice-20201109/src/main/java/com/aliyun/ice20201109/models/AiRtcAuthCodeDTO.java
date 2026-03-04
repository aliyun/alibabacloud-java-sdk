// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AiRtcAuthCodeDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2024-01-01 06:57:43</p>
     */
    @NameInMap("ActivatedTime")
    public String activatedTime;

    /**
     * <strong>example:</strong>
     * <p>iU1IeJech7***</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <strong>example:</strong>
     * <p>2023-12-23T13:33:49Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <strong>example:</strong>
     * <p>device-***</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>license。</p>
     * 
     * <strong>example:</strong>
     * <p>a659a06659a***</p>
     */
    @NameInMap("License")
    public String license;

    /**
     * <strong>example:</strong>
     * <p>11096067***</p>
     */
    @NameInMap("LicenseItemId")
    public String licenseItemId;

    /**
     * <strong>example:</strong>
     * <p>2023-12-23T13:33:49Z</p>
     */
    @NameInMap("ModificationTime")
    public String modificationTime;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
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
