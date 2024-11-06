// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteDocumentCollectionResponseBody extends TeaModel {
    /**
     * <p>Return message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Status, with the following possible values:</p>
     * <ul>
     * <li><strong>success</strong>: Success.</li>
     * <li><strong>fail</strong>: Failure.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static DeleteDocumentCollectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDocumentCollectionResponseBody self = new DeleteDocumentCollectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDocumentCollectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteDocumentCollectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDocumentCollectionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
