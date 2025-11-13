// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ActiveAiRtcLicenseRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iU1IeJech7***</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <strong>example:</strong>
     * <p>device-***</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <strong>example:</strong>
     * <p>17712***</p>
     */
    @NameInMap("LicenseItemId")
    public String licenseItemId;

    public static ActiveAiRtcLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        ActiveAiRtcLicenseRequest self = new ActiveAiRtcLicenseRequest();
        return TeaModel.build(map, self);
    }

    public ActiveAiRtcLicenseRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public ActiveAiRtcLicenseRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ActiveAiRtcLicenseRequest setLicenseItemId(String licenseItemId) {
        this.licenseItemId = licenseItemId;
        return this;
    }
    public String getLicenseItemId() {
        return this.licenseItemId;
    }

}
