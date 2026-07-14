// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateApiKeyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sk-xxxxxxx</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <strong>example:</strong>
     * <p>api-xxxxxxx</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApiKeyResponseBody self = new CreateApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApiKeyResponseBody setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public CreateApiKeyResponseBody setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public CreateApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
