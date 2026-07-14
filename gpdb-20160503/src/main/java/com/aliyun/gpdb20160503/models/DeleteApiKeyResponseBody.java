// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteApiKeyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>api-xxxxxx</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiKeyResponseBody self = new DeleteApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApiKeyResponseBody setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public DeleteApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
