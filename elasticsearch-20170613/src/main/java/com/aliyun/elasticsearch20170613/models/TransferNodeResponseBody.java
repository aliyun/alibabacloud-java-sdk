// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class TransferNodeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Output:</p>
     * <br>
     * <p>*   true: The task is successfully executed.</p>
     * <p>*   false: The task failed to be executed.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static TransferNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransferNodeResponseBody self = new TransferNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public TransferNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TransferNodeResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
