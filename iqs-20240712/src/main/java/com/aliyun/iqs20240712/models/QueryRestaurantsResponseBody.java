// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class QueryRestaurantsResponseBody extends TeaModel {
    @NameInMap("queryResult")
    public QueryResult queryResult;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D78E16C0-4D44-5065-BFF7-127F7859F687</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static QueryRestaurantsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRestaurantsResponseBody self = new QueryRestaurantsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRestaurantsResponseBody setQueryResult(QueryResult queryResult) {
        this.queryResult = queryResult;
        return this;
    }
    public QueryResult getQueryResult() {
        return this.queryResult;
    }

    public QueryRestaurantsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
