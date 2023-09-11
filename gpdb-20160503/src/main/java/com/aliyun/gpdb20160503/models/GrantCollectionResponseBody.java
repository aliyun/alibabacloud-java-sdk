// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GrantCollectionResponseBody extends TeaModel {
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

    public static GrantCollectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantCollectionResponseBody self = new GrantCollectionResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantCollectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GrantCollectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GrantCollectionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
