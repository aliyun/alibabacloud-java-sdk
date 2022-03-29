// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class ApplyWatermarkLicenseRequest extends TeaModel {
    @NameInMap("Body")
    public String body;

    @NameInMap("FileType")
    public String fileType;

    @NameInMap("Input")
    public String input;

    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("Nonce")
    public String nonce;

    @NameInMap("SecretKey")
    public String secretKey;

    @NameInMap("Sign")
    public String sign;

    @NameInMap("Time")
    public String time;

    public static ApplyWatermarkLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyWatermarkLicenseRequest self = new ApplyWatermarkLicenseRequest();
        return TeaModel.build(map, self);
    }

    public ApplyWatermarkLicenseRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public ApplyWatermarkLicenseRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public ApplyWatermarkLicenseRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public ApplyWatermarkLicenseRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public ApplyWatermarkLicenseRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public ApplyWatermarkLicenseRequest setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public ApplyWatermarkLicenseRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

    public ApplyWatermarkLicenseRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
