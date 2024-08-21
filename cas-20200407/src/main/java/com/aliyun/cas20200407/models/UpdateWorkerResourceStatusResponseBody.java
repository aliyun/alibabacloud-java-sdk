// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateWorkerResourceStatusResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Data")
    public Object data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-123456789ABC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateWorkerResourceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkerResourceStatusResponseBody self = new UpdateWorkerResourceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkerResourceStatusResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public UpdateWorkerResourceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
