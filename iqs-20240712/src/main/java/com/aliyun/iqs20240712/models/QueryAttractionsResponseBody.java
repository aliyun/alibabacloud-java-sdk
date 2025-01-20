// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class QueryAttractionsResponseBody extends TeaModel {
    @NameInMap("queryResult")
    public QueryResult queryResult;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>ECB2144C-E277-5434-80E6-12D26678D364</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static QueryAttractionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAttractionsResponseBody self = new QueryAttractionsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAttractionsResponseBody setQueryResult(QueryResult queryResult) {
        this.queryResult = queryResult;
        return this;
    }
    public QueryResult getQueryResult() {
        return this.queryResult;
    }

    public QueryAttractionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
