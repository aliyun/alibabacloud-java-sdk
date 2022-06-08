// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricDecryptResponseBody extends TeaModel {
    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("KeyVersionId")
    public String keyVersionId;

    @NameInMap("Plaintext")
    public String plaintext;

    @NameInMap("RequestId")
    public String requestId;

    public static AsymmetricDecryptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AsymmetricDecryptResponseBody self = new AsymmetricDecryptResponseBody();
        return TeaModel.build(map, self);
    }

    public AsymmetricDecryptResponseBody setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public AsymmetricDecryptResponseBody setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
        return this;
    }
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    public AsymmetricDecryptResponseBody setPlaintext(String plaintext) {
        this.plaintext = plaintext;
        return this;
    }
    public String getPlaintext() {
        return this.plaintext;
    }

    public AsymmetricDecryptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
