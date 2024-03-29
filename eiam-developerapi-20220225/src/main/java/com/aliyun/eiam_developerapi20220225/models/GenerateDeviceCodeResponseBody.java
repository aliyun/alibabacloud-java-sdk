// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GenerateDeviceCodeResponseBody extends TeaModel {
    @NameInMap("device_code")
    public String deviceCode;

    @NameInMap("expires_at")
    public Long expiresAt;

    @NameInMap("expires_in")
    public Long expiresIn;

    @NameInMap("interval")
    public Long interval;

    @NameInMap("user_code")
    public String userCode;

    @NameInMap("verification_uri")
    public String verificationUri;

    @NameInMap("verification_uri_complete")
    public String verificationUriComplete;

    public static GenerateDeviceCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateDeviceCodeResponseBody self = new GenerateDeviceCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateDeviceCodeResponseBody setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
        return this;
    }
    public String getDeviceCode() {
        return this.deviceCode;
    }

    public GenerateDeviceCodeResponseBody setExpiresAt(Long expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public Long getExpiresAt() {
        return this.expiresAt;
    }

    public GenerateDeviceCodeResponseBody setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
    public Long getExpiresIn() {
        return this.expiresIn;
    }

    public GenerateDeviceCodeResponseBody setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public GenerateDeviceCodeResponseBody setUserCode(String userCode) {
        this.userCode = userCode;
        return this;
    }
    public String getUserCode() {
        return this.userCode;
    }

    public GenerateDeviceCodeResponseBody setVerificationUri(String verificationUri) {
        this.verificationUri = verificationUri;
        return this;
    }
    public String getVerificationUri() {
        return this.verificationUri;
    }

    public GenerateDeviceCodeResponseBody setVerificationUriComplete(String verificationUriComplete) {
        this.verificationUriComplete = verificationUriComplete;
        return this;
    }
    public String getVerificationUriComplete() {
        return this.verificationUriComplete;
    }

}
