// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateTaskAsyncResponseBody extends TeaModel {
    /**
     * <p>The operation ID, which is used to obtain the result of the asynchronous node update. You can call the UpdateTaskAsync operation to obtain the result.</p>
     * 
     * <strong>example:</strong>
     * <p>e15ad21c-b0e9-4792-8f55-b037xxxxxxxx</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <p>The request ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTaskAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskAsyncResponseBody self = new UpdateTaskAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTaskAsyncResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public UpdateTaskAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
