// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetPublicKeyResponseBody extends TeaModel {
    /**
     * <p>The globally unique ID of the CMK.</p>
     * <br>
     * <p>>  If you set the KeyId parameter to the alias of the CMK, the ID of the CMK to which the alias is bound is returned.</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The version of the CMK that is used to encrypt the plaintext.</p>
     */
    @NameInMap("KeyVersionId")
    public String keyVersionId;

    /**
     * <p>The public key returned in the PEM format.</p>
     */
    @NameInMap("PublicKey")
    public String publicKey;

    /**
     * <p>The ID of the request.</p>
     */
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
