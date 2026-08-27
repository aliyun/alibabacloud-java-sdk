// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchUpdateHttpApiOperationResponseBody extends TeaModel {
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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4CF2E0A5-xxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static BatchUpdateHttpApiOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateHttpApiOperationResponseBody self = new BatchUpdateHttpApiOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchUpdateHttpApiOperationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchUpdateHttpApiOperationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchUpdateHttpApiOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
