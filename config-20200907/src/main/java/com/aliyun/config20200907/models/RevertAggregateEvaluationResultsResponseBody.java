// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class RevertAggregateEvaluationResultsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RevertAggregateEvaluationResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevertAggregateEvaluationResultsResponseBody self = new RevertAggregateEvaluationResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public RevertAggregateEvaluationResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
