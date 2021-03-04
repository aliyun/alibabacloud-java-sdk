// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateSecretVersionStageResponseBody extends TeaModel {
    @NameInMap("SecretName")
    public String secretName;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSecretVersionStageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretVersionStageResponseBody self = new UpdateSecretVersionStageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSecretVersionStageResponseBody setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public UpdateSecretVersionStageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
