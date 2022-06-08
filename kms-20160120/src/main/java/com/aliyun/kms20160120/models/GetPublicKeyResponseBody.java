// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetPublicKeyResponseBody extends TeaModel {
    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("KeyVersionId")
    public String keyVersionId;

    @NameInMap("PublicKey")
    public String publicKey;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPublicKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPublicKeyResponseBody self = new GetPublicKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPublicKeyResponseBody setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GetPublicKeyResponseBody setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
        return this;
    }
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    public GetPublicKeyResponseBody setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public GetPublicKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
