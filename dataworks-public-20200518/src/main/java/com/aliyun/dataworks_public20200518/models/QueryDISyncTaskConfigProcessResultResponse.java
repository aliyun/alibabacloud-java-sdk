// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryDISyncTaskConfigProcessResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDISyncTaskConfigProcessResultResponseBody body;

    public static QueryDISyncTaskConfigProcessResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDISyncTaskConfigProcessResultResponse self = new QueryDISyncTaskConfigProcessResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryDISyncTaskConfigProcessResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDISyncTaskConfigProcessResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDISyncTaskConfigProcessResultResponse setBody(QueryDISyncTaskConfigProcessResultResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDISyncTaskConfigProcessResultResponseBody getBody() {
        return this.body;
    }

}
