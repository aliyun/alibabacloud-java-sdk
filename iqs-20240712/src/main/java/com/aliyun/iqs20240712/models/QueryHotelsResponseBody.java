// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class QueryHotelsResponseBody extends TeaModel {
    @NameInMap("queryResult")
    public QueryResult queryResult;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>78032F8B-0157-53F9-B1A8-3BD86ADE38D0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static QueryHotelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHotelsResponseBody self = new QueryHotelsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHotelsResponseBody setQueryResult(QueryResult queryResult) {
        this.queryResult = queryResult;
        return this;
    }
    public QueryResult getQueryResult() {
        return this.queryResult;
    }

    public QueryHotelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
