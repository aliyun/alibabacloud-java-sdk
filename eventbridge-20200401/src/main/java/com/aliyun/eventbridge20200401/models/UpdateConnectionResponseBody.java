// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateConnectionResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid value: 200, which indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8346BE8F-40F3-533D-A0B8-1359C31BD5BA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectionResponseBody self = new UpdateConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConnectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateConnectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
