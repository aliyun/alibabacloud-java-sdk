// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class PutEvaluationsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <br>
     * <p>*   true: The operation was successful.</p>
     * <p>*   false: The operation failed.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static PutEvaluationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutEvaluationsResponseBody self = new PutEvaluationsResponseBody();
        return TeaModel.build(map, self);
    }

    public PutEvaluationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutEvaluationsResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
