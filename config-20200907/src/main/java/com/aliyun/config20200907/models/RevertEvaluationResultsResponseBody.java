// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class RevertEvaluationResultsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RevertEvaluationResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevertEvaluationResultsResponseBody self = new RevertEvaluationResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public RevertEvaluationResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
