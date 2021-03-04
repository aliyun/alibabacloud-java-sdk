// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetParametersForImportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PublicKey")
    public String publicKey;

    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("TokenExpireTime")
    public String tokenExpireTime;

    @NameInMap("ImportToken")
    public String importToken;

    public static GetParametersForImportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetParametersForImportResponseBody self = new GetParametersForImportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetParametersForImportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetParametersForImportResponseBody setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public GetParametersForImportResponseBody setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GetParametersForImportResponseBody setTokenExpireTime(String tokenExpireTime) {
        this.tokenExpireTime = tokenExpireTime;
        return this;
    }
    public String getTokenExpireTime() {
        return this.tokenExpireTime;
    }

    public GetParametersForImportResponseBody setImportToken(String importToken) {
        this.importToken = importToken;
        return this;
    }
    public String getImportToken() {
        return this.importToken;
    }

}
