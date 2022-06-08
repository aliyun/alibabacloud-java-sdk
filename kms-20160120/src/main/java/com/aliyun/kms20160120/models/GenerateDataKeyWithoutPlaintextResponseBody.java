// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateDataKeyWithoutPlaintextResponseBody extends TeaModel {
    @NameInMap("CiphertextBlob")
    public String ciphertextBlob;

    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("KeyVersionId")
    public String keyVersionId;

    @NameInMap("RequestId")
    public String requestId;

    public static GenerateDataKeyWithoutPlaintextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateDataKeyWithoutPlaintextResponseBody self = new GenerateDataKeyWithoutPlaintextResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateDataKeyWithoutPlaintextResponseBody setCiphertextBlob(String ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    public GenerateDataKeyWithoutPlaintextResponseBody setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GenerateDataKeyWithoutPlaintextResponseBody setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
        return this;
    }
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    public GenerateDataKeyWithoutPlaintextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
