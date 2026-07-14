// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateModelOperatorApiKeyResponseBody extends TeaModel {
    /**
     * <p>API KEY ID。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ApiKeyId")
    public Integer apiKeyId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateModelOperatorApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModelOperatorApiKeyResponseBody self = new CreateModelOperatorApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModelOperatorApiKeyResponseBody setApiKeyId(Integer apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public Integer getApiKeyId() {
        return this.apiKeyId;
    }

    public CreateModelOperatorApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
