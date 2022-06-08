// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricVerifyResponseBody extends TeaModel {
    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("KeyVersionId")
    public String keyVersionId;

    @NameInMap("RequestId")
    public String requestId;

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
