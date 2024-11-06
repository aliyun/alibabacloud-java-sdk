// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateVectorIndexResponseBody extends TeaModel {
    /**
     * <p>Detailed information returned by the API.</p>
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
     * <p>API execution status. Value description:</p>
     * <ul>
     * <li><strong>success</strong>: Execution succeeded.</li>
     * <li><strong>fail</strong>: Execution failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreateVectorIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVectorIndexResponseBody self = new CreateVectorIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVectorIndexResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVectorIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVectorIndexResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
