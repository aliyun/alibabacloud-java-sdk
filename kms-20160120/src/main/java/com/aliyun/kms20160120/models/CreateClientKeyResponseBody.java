// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateClientKeyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>KAAP.66abf237-63f6-4625-b8cf-47e1086e****</p>
     */
    @NameInMap("ClientKeyId")
    public String clientKeyId;

    /**
     * <p>The ID of the client key.</p>
     * 
     * <strong>example:</strong>
     * <p>RSA_2048</p>
     */
    @NameInMap("KeyAlgorithm")
    public String keyAlgorithm;

    /**
     * <p>The beginning of the validity period of the client key.</p>
     * 
     * <strong>example:</strong>
     * <p>2028-08-31T17:14:33Z</p>
     */
    @NameInMap("NotAfter")
    public String notAfter;

    /**
     * <p>The private key of the client key.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-08-31T17:14:33Z</p>
     */
    @NameInMap("NotBefore")
    public String notBefore;

    /**
     * <p>The algorithm that is used to encrypt the private key of the client key. Currently, only RSA_2048 is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>MIIJqwIBAzCCCXcGCSqGSIb3DQEHAaCCCWgEgglkMIIJYDCCBBcGCSqGSIb3DQEHBqCCBAgwgg******</p>
     */
    @NameInMap("PrivateKeyData")
    public String privateKeyData;

    /**
     * <p>The beginning of the validity period of the client key.</p>
     * <p>Specify the time in the ISO 8601 standard. The time must be in UTC. The time must be in the yyyy-MM-ddTHH:mm:ssZ format.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you do not configure NotBefore, the default value is the time when the client key was created.</li>
     * <li>If you configure NotBefore, you must configure NotAfter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2312e45f-b2fa-4c34-ad94-3eca50932916</p>
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
