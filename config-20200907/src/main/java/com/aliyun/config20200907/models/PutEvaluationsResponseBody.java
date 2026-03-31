// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class PutEvaluationsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EDB324E2-A202-5FE4-A9BC-31E2C34F78A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the evaluation results of the custom rule are submitted. Valid values:</p>
     * <ul>
     * <li>true: The evaluation results are submitted.</li>
     * <li>false: The evaluation results fail to be submitted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
