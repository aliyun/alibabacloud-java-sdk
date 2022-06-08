// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DecryptResponseBody extends TeaModel {
    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("KeyVersionId")
    public String keyVersionId;

    @NameInMap("Plaintext")
    public String plaintext;

    @NameInMap("RequestId")
    public String requestId;

    public static DecryptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DecryptResponseBody self = new DecryptResponseBody();
        return TeaModel.build(map, self);
    }

    public DecryptResponseBody setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public DecryptResponseBody setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
        return this;
    }
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    public DecryptResponseBody setPlaintext(String plaintext) {
        this.plaintext = plaintext;
        return this;
    }
    public String getPlaintext() {
        return this.plaintext;
    }

    public DecryptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
