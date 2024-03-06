// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateClientKeyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("ClientKeyId")
    public String clientKeyId;

    /**
     * <p>The ID of the client key.</p>
     */
    @NameInMap("KeyAlgorithm")
    public String keyAlgorithm;

    /**
     * <p>The beginning of the validity period of the client key.</p>
     */
    @NameInMap("NotAfter")
    public String notAfter;

    /**
     * <p>The private key of the client key.</p>
     */
    @NameInMap("NotBefore")
    public String notBefore;

    /**
     * <p>The algorithm that is used to encrypt the private key of the client key. Currently, only RSA\_2048 is supported.</p>
     */
    @NameInMap("PrivateKeyData")
    public String privateKeyData;

    /**
     * <p>The beginning of the validity period of the client key.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard. The time must be in UTC. The time must be in the yyyy-MM-ddTHH:mm:ssZ format.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If you do not configure NotBefore, the default value is the time when the client key was created.</p>
     * <p>*   If you configure NotBefore, you must configure NotAfter.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateClientKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClientKeyResponseBody self = new CreateClientKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClientKeyResponseBody setClientKeyId(String clientKeyId) {
        this.clientKeyId = clientKeyId;
        return this;
    }
    public String getClientKeyId() {
        return this.clientKeyId;
    }

    public CreateClientKeyResponseBody setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
        return this;
    }
    public String getKeyAlgorithm() {
        return this.keyAlgorithm;
    }

    public CreateClientKeyResponseBody setNotAfter(String notAfter) {
        this.notAfter = notAfter;
        return this;
    }
    public String getNotAfter() {
        return this.notAfter;
    }

    public CreateClientKeyResponseBody setNotBefore(String notBefore) {
        this.notBefore = notBefore;
        return this;
    }
    public String getNotBefore() {
        return this.notBefore;
    }

    public CreateClientKeyResponseBody setPrivateKeyData(String privateKeyData) {
        this.privateKeyData = privateKeyData;
        return this;
    }
    public String getPrivateKeyData() {
        return this.privateKeyData;
    }

    public CreateClientKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
