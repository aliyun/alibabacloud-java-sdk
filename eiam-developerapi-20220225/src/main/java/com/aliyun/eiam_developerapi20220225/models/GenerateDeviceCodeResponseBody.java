// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GenerateDeviceCodeResponseBody extends TeaModel {
    /**
     * <p>The device code.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("device_code")
    public String deviceCode;

    /**
     * <p>The time when the token expires. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1653288641</p>
     */
    @NameInMap("expires_at")
    public Long expiresAt;

    /**
     * <p>The remaining validity period of the device code. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1200</p>
     */
    @NameInMap("expires_in")
    public Long expiresIn;

    /**
     * <p>The timeout period of the request token. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("interval")
    public Long interval;

    /**
     * <p>The user authorization code.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("user_code")
    public String userCode;

    /**
     * <p>The verification URI.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/authorize/device">https://example.com/authorize/device</a></p>
     */
    @NameInMap("verification_uri")
    public String verificationUri;

    /**
     * <p>The complete verification URI.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/authorize/device?user_code=">https://example.com/authorize/device?user_code=</a>
     * xxxx</p>
     */
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
