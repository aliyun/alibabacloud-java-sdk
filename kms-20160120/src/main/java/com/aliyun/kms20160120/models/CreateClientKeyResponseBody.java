// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateClientKeyResponseBody extends TeaModel {
    @NameInMap("ClientKeyId")
    public String clientKeyId;

    @NameInMap("KeyAlgorithm")
    public String keyAlgorithm;

    @NameInMap("NotAfter")
    public String notAfter;

    @NameInMap("NotBefore")
    public String notBefore;

    @NameInMap("PrivateKeyData")
    public String privateKeyData;

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
