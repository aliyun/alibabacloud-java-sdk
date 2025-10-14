// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ExecuteLogQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]。</p>
     */
    @NameInMap("QueryResult")
    public java.util.List<?> queryResult;

    /**
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExecuteLogQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteLogQueryResponseBody self = new ExecuteLogQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteLogQueryResponseBody setQueryResult(java.util.List<?> queryResult) {
        this.queryResult = queryResult;
        return this;
    }
    public java.util.List<?> getQueryResult() {
        return this.queryResult;
    }

    public ExecuteLogQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
