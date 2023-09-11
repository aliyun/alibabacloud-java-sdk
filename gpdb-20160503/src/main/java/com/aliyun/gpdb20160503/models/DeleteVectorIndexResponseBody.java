// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteVectorIndexResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **success**</p>
     * <p>*   **fail**</p>
     */
    @NameInMap("Status")
    public String status;

    public static DeleteVectorIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVectorIndexResponseBody self = new DeleteVectorIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVectorIndexResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteVectorIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteVectorIndexResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
