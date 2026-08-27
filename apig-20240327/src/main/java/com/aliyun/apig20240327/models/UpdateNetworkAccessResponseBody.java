// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateNetworkAccessResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>019F3F7D-9EC4-5F8B-A3F7-97E1369C31BD</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateNetworkAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkAccessResponseBody self = new UpdateNetworkAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNetworkAccessResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateNetworkAccessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateNetworkAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
