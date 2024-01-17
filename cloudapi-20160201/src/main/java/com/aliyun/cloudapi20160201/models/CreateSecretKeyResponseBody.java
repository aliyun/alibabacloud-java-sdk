// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CreateSecretKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecretKeyId")
    public String secretKeyId;

    @NameInMap("SecretKeyName")
    public String secretKeyName;

    public static CreateSecretKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretKeyResponseBody self = new CreateSecretKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSecretKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSecretKeyResponseBody setSecretKeyId(String secretKeyId) {
        this.secretKeyId = secretKeyId;
        return this;
    }
    public String getSecretKeyId() {
        return this.secretKeyId;
    }

    public CreateSecretKeyResponseBody setSecretKeyName(String secretKeyName) {
        this.secretKeyName = secretKeyName;
        return this;
    }
    public String getSecretKeyName() {
        return this.secretKeyName;
    }

}
