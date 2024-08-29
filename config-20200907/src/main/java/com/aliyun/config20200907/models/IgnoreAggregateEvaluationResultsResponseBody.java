// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class IgnoreAggregateEvaluationResultsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0132CBF2-0B0B-59F2-9E84-07B38267BC32</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static IgnoreAggregateEvaluationResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IgnoreAggregateEvaluationResultsResponseBody self = new IgnoreAggregateEvaluationResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public IgnoreAggregateEvaluationResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
