// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetParametersForImportResponseBody extends TeaModel {
    /**
     * <p>The token that is used to import key material.</p>
     * <p>The token is valid for 24 hours. The value of this parameter is required when you call the <a href="https://help.aliyun.com/document_detail/68622.html">ImportKeyMaterial</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>Base64String</p>
     */
    @NameInMap("ImportToken")
    public String importToken;

    /**
     * <p>The globally unique ID of the CMK.</p>
     * <p>The value of this parameter is required when you call the <a href="https://help.aliyun.com/document_detail/68622.html">ImportKeyMaterial</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>202b9877-5a25-46e3-a763-e20791b5****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The public key that is used to encrypt key material.</p>
     * <p>The public key is Base64-encoded.</p>
     * 
     * <strong>example:</strong>
     * <p>MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlls4uIBxD0GG84C+lGBO6Dhpf1J3XimC6cPmPNaKKJMOzoX4tD+C+r7aZv8lZ3vnPfxuxvy/YwG+whUxTEEFUdqJTOIzhPfYucupqKM92crVHIuG+xtMVeHKjyTr+UrtKCsQikqHT+19yDRN/RMoo2HUx0gmEnRyXd8t3JyUXun9FdoxKA08GrsV7nodb9ZsoBLhnev7tTLcXvLyKW6XG1ZQCQm6dPnbnwLeDXR7uK0Lqn9PM28mBIdaiQUQxj2XbM1CoJA+JiyVX3Ptdb+4rqukb4Rb05B80Bs9xV/cf7FIku08l7xGhrGiQFq+DFXwQWtwihXHZxz3LhldU+4ZPwID****</p>
     */
    @NameInMap("PublicKey")
    public String publicKey;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>8cdf51fd-bcd6-d79a-0ef4-e52c9b5466dc</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the token expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-01-25T00:01:02Z</p>
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
