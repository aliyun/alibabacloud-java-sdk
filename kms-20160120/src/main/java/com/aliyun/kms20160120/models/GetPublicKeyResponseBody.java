// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetPublicKeyResponseBody extends TeaModel {
    /**
     * <p>The globally unique ID of the CMK.</p>
     * <blockquote>
     * <p> If you set the KeyId parameter to the alias of the CMK, the ID of the CMK to which the alias is bound is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5c438b18-05be-40ad-b6c2-3be6752c****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The version of the CMK that is used to encrypt the plaintext.</p>
     * 
     * <strong>example:</strong>
     * <p>2ab1a983-7072-4bbc-a582-584b5bd8****</p>
     */
    @NameInMap("KeyVersionId")
    public String keyVersionId;

    /**
     * <p>The public key returned in the PEM format.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN PUBLIC KEY-----\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAs5Yu9AEgATN2/e3nUz1K\nEy6ng8MSPutcse2/VECG/NUF9C6D4IsJ64ShzY3dcn34WYzTOe916eMJFxyrNrSw\nHtc4UOR5AvaoRrfpgu2uq+i70/ZXrWL+pGb1hgZV8cWheIHMxwrR3IiQlM5qN7EF\n9BdyWtyBfUGsp0Bn1VqlPc5G0x0a9xU2z9YtP994yDenNVIoIQ6Cov1lIEuwXAb2\n7boC41ePXwD0JWt41sP+rgCmpjBx00puIG+IlnoReEgI1ZGYmK98GgA/XzmNjZiD\nyvXJZAcM33Ue85+PkR5iHTtSEbi4QAoqpJabprUzz3Fin2j1dRrcacxGb7p31A9c\nJQIDAQAB\n-----END PUBLIC KEY-----\n</p>
     */
    @NameInMap("PublicKey")
    public String publicKey;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>475f1620-b9d3-4d35-b5c6-3fbdd941423d</p>
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
