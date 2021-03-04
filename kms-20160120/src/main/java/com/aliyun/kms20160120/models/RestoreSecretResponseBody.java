// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class RestoreSecretResponseBody extends TeaModel {
    @NameInMap("SecretName")
    public String secretName;

    @NameInMap("RequestId")
    public String requestId;

    public static RestoreSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestoreSecretResponseBody self = new RestoreSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public RestoreSecretResponseBody setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public RestoreSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
