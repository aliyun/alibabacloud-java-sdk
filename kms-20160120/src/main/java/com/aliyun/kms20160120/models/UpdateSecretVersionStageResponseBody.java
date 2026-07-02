// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateSecretVersionStageResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique ID for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>8cad259f-4d77-40ec-bbd7-b9c47a423bb9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the secret.</p>
     * 
     * <strong>example:</strong>
     * <p>secret001</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    public static UpdateSecretVersionStageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecretVersionStageResponseBody self = new UpdateSecretVersionStageResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSecretVersionStageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSecretVersionStageResponseBody setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

}
