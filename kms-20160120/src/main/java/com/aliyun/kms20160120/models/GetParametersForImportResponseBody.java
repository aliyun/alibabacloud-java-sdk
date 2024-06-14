// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetParametersForImportResponseBody extends TeaModel {
    /**
     * <p>The token that is used to import key material.</p>
     * <br>
     * <p>The token is valid for 24 hours. The value of this parameter is required when you call the [ImportKeyMaterial](https://help.aliyun.com/document_detail/68622.html) operation.</p>
     */
    @NameInMap("ImportToken")
    public String importToken;

    /**
     * <p>The globally unique ID of the CMK.</p>
     * <br>
     * <p>The value of this parameter is required when you call the [ImportKeyMaterial](https://help.aliyun.com/document_detail/68622.html) operation.</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The public key that is used to encrypt key material.</p>
     * <br>
     * <p>The public key is Base64-encoded.</p>
     */
    @NameInMap("PublicKey")
    public String publicKey;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the token expires.</p>
     */
    @NameInMap("TokenExpireTime")
    public String tokenExpireTime;

    public static GetParametersForImportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetParametersForImportResponseBody self = new GetParametersForImportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetParametersForImportResponseBody setImportToken(String importToken) {
        this.importToken = importToken;
        return this;
    }
    public String getImportToken() {
        return this.importToken;
    }

    public GetParametersForImportResponseBody setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GetParametersForImportResponseBody setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public GetParametersForImportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetParametersForImportResponseBody setTokenExpireTime(String tokenExpireTime) {
        this.tokenExpireTime = tokenExpireTime;
        return this;
    }
    public String getTokenExpireTime() {
        return this.tokenExpireTime;
    }

}
