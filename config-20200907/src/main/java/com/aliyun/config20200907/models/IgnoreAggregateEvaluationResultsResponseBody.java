// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class IgnoreAggregateEvaluationResultsResponseBody extends TeaModel {
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
