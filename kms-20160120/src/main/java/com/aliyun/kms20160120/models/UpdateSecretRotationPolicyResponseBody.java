// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateSecretRotationPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecretName")
    public String secretName;

    public static UpdateSecretRotationPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretRotationPolicyResponseBody self = new UpdateSecretRotationPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSecretRotationPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSecretRotationPolicyResponseBody setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

}
