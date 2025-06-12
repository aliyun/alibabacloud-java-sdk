// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class GetTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("appId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5b504f84b69b9a73d3a21a2cff05e190</p>
     */
    @NameInMap("deviceName")
    public String deviceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2a64edd96296880f55aa61987b</p>
     */
    @NameInMap("nonce")
    public String nonce;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1748413148546</p>
     */
    @NameInMap("requestTime")
    public String requestTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5/Smm8gnDSgZY2Blftq9eGYpVnpYCztoLJaJfhlH7id0lNlQxydRLtjUkGPr1qdbQq+oUn6Y1h0KJUdk0rf4am3MzdNr/Uhc47c8bbXnV8SlIC0agGo5skEQZNObzUD+sFxt8uN35/FYf7YRC8R61xY7+NPN2NLJrA/DPhewtVRRgAbb8RjergTcIG6oN1XTzLyC+76Az/3o2dPCxTfMXG3AFQc=</p>
     */
    @NameInMap("signature")
    public String signature;

    /**
     * <strong>example:</strong>
     * <p>sk-4asv136677d2411b876e536bc8xxxxx</p>
     */
    @NameInMap("tokenKey")
    public String tokenKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("tokenType")
    public String tokenType;

    public static GetTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTokenRequest self = new GetTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetTokenRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetTokenRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public GetTokenRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public GetTokenRequest setRequestTime(String requestTime) {
        this.requestTime = requestTime;
        return this;
    }
    public String getRequestTime() {
        return this.requestTime;
    }

    public GetTokenRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public GetTokenRequest setTokenKey(String tokenKey) {
        this.tokenKey = tokenKey;
        return this;
    }
    public String getTokenKey() {
        return this.tokenKey;
    }

    public GetTokenRequest setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }
    public String getTokenType() {
        return this.tokenType;
    }

}
