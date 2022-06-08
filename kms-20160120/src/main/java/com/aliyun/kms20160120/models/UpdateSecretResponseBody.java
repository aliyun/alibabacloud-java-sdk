// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateSecretResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecretName")
    public String secretName;

    public static UpdateSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretResponseBody self = new UpdateSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSecretResponseBody setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

}
