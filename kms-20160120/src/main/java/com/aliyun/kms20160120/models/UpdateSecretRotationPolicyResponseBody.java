// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateSecretRotationPolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>2c124f6f-4210-499f-b88a-69f54004d2d8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the secret.</p>
     * 
     * <strong>example:</strong>
     * <p>RdsSecret/Mysql5.4/MyCred</p>
     */
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
