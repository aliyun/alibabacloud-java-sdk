// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class PutEvaluationsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the evaluation results of the custom rule are submitted. Valid values:</p>
     * <br>
     * <p>*   true: The evaluation results are submitted.</p>
     * <p>*   false: The evaluation results fail to be submitted.</p>
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
