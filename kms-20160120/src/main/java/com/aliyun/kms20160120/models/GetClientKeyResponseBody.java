// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetClientKeyResponseBody extends TeaModel {
    @NameInMap("AapName")
    public String aapName;

    @NameInMap("ClientKeyId")
    public String clientKeyId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("KeyAlgorithm")
    public String keyAlgorithm;

    @NameInMap("KeyOrigin")
    public String keyOrigin;

    @NameInMap("NotAfter")
    public String notAfter;

    @NameInMap("NotBefore")
    public String notBefore;

    @NameInMap("PublicKeyData")
    public String publicKeyData;

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
