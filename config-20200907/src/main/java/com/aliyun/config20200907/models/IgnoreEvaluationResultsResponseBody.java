// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class IgnoreEvaluationResultsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1840CBF2-0B0B-59F2-9E84-07B38267A279</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static IgnoreEvaluationResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IgnoreEvaluationResultsResponseBody self = new IgnoreEvaluationResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public IgnoreEvaluationResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
