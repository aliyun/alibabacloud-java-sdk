// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DecryptResponseBody extends TeaModel {
    /**
     * <p>The ID of the customer master key (CMK) that is used to decrypt the ciphertext.</p>
     * <p>It is the GUID of the CMK.</p>
     * 
     * <strong>example:</strong>
     * <p>202b9877-5a25-46e3-a763-e20791b5****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The ID of the CMK version that is used to decrypt the ciphertext.</p>
     * 
     * <strong>example:</strong>
     * <p>2ab1a983-7072-4bbc-a582-584b5bd8****</p>
     */
    @NameInMap("KeyVersionId")
    public String keyVersionId;

    /**
     * <p>The plaintext that is generated after decryption.</p>
     * 
     * <strong>example:</strong>
     * <p>tRYXuCwgja12xxO1N/gZERDDCLw9doZEQiPDk/Bv****</p>
     */
    @NameInMap("Plaintext")
    public String plaintext;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>207596a2-36d3-4840-b1bd-f87044699bd7</p>
     */
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
