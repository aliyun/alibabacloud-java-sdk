// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GenerateDeviceCodeResponseBody extends TeaModel {
    // 设备验证码
    @NameInMap("device_code")
    public String deviceCode;

    // 过期时间
    @NameInMap("expires_at")
    public Long expiresAt;

    // device_code和user_code的有效时长，单位秒
    @NameInMap("expires_in")
    public Long expiresIn;

    // 请求token节点的超时时间，单位秒
    @NameInMap("interval")
    public Long interval;

    // 终端用户验证码
    @NameInMap("user_code")
    public String userCode;

    // 验证URI
    @NameInMap("verification_uri")
    public String verificationUri;

    // 包含user_code的完整验证URI
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
