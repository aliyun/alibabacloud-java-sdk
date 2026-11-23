// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateSecretValueResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5C2B60C6-03CE-5F31-A8A4-13FCBEBACA1C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The ciphertext ID.</p>
     * 
     * <strong>example:</strong>
     * <p>st-xxxxxxxxxx</p>
     */
    @NameInMap("secretId")
    public String secretId;

    public static CreateSecretValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretValueResponseBody self = new CreateSecretValueResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSecretValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSecretValueResponseBody setSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }
    public String getSecretId() {
        return this.secretId;
    }

}
