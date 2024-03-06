// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetClientKeyResponseBody extends TeaModel {
    /**
     * <p>The name of the application access point (AAP).</p>
     */
    @NameInMap("AapName")
    public String aapName;

    /**
     * <p>The ID of the client key.</p>
     */
    @NameInMap("ClientKeyId")
    public String clientKeyId;

    /**
     * <p>The time when the client key was created.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The private key algorithm of the client key.</p>
     */
    @NameInMap("KeyAlgorithm")
    public String keyAlgorithm;

    /**
     * <p>The provider of the client key.</p>
     * <br>
     * <p>Currently, only Key Management Service (KMS) is supported. The value is fixed as KMS_PROVIDED.</p>
     */
    @NameInMap("KeyOrigin")
    public String keyOrigin;

    /**
     * <p>The end of the validity period of the client key.</p>
     */
    @NameInMap("NotAfter")
    public String notAfter;

    /**
     * <p>The beginning of the validity period of the client key.</p>
     */
    @NameInMap("NotBefore")
    public String notBefore;

    /**
     * <p>The content of the public key of the client key.</p>
     */
    @NameInMap("PublicKeyData")
    public String publicKeyData;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetClientKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClientKeyResponseBody self = new GetClientKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClientKeyResponseBody setAapName(String aapName) {
        this.aapName = aapName;
        return this;
    }
    public String getAapName() {
        return this.aapName;
    }

    public GetClientKeyResponseBody setClientKeyId(String clientKeyId) {
        this.clientKeyId = clientKeyId;
        return this;
    }
    public String getClientKeyId() {
        return this.clientKeyId;
    }

    public GetClientKeyResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetClientKeyResponseBody setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
        return this;
    }
    public String getKeyAlgorithm() {
        return this.keyAlgorithm;
    }

    public GetClientKeyResponseBody setKeyOrigin(String keyOrigin) {
        this.keyOrigin = keyOrigin;
        return this;
    }
    public String getKeyOrigin() {
        return this.keyOrigin;
    }

    public GetClientKeyResponseBody setNotAfter(String notAfter) {
        this.notAfter = notAfter;
        return this;
    }
    public String getNotAfter() {
        return this.notAfter;
    }

    public GetClientKeyResponseBody setNotBefore(String notBefore) {
        this.notBefore = notBefore;
        return this;
    }
    public String getNotBefore() {
        return this.notBefore;
    }

    public GetClientKeyResponseBody setPublicKeyData(String publicKeyData) {
        this.publicKeyData = publicKeyData;
        return this;
    }
    public String getPublicKeyData() {
        return this.publicKeyData;
    }

    public GetClientKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
