// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricVerifyResponseBody extends TeaModel {
    /**
     * <p>The ID of the CMK. The ID must be globally unique.</p>
     * <br>
     * <p>>  If you set the KeyId parameter in the request to an alias, the ID of the CMK to which the alias is bound is returned.</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The version ID of the CMK that is used to encrypt the plaintext.</p>
     */
    @NameInMap("KeyVersionId")
    public String keyVersionId;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the signature passed the verification.</p>
     */
    @NameInMap("Value")
    public Boolean value;

    public static AsymmetricVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AsymmetricVerifyResponseBody self = new AsymmetricVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public AsymmetricVerifyResponseBody setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public AsymmetricVerifyResponseBody setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
        return this;
    }
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    public AsymmetricVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AsymmetricVerifyResponseBody setValue(Boolean value) {
        this.value = value;
        return this;
    }
    public Boolean getValue() {
        return this.value;
    }

}
