// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class ModifySecretKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecretKeyId")
    public String secretKeyId;

    @NameInMap("SecretKeyName")
    public String secretKeyName;

    public static ModifySecretKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySecretKeyResponseBody self = new ModifySecretKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySecretKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySecretKeyResponseBody setSecretKeyId(String secretKeyId) {
        this.secretKeyId = secretKeyId;
        return this;
    }
    public String getSecretKeyId() {
        return this.secretKeyId;
    }

    public ModifySecretKeyResponseBody setSecretKeyName(String secretKeyName) {
        this.secretKeyName = secretKeyName;
        return this;
    }
    public String getSecretKeyName() {
        return this.secretKeyName;
    }

}
