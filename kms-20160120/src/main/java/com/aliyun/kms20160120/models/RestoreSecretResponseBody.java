// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class RestoreSecretResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>e4885adf-548f-4ca5-8075-f540bbd3a55f</p>
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

    public static RestoreSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestoreSecretResponseBody self = new RestoreSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public RestoreSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RestoreSecretResponseBody setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

}
