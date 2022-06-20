// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryStudioAppListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryStudioAppListResponseBody body;

    public static QueryStudioAppListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStudioAppListResponse self = new QueryStudioAppListResponse();
        return TeaModel.build(map, self);
    }

    public QueryStudioAppListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryStudioAppListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryStudioAppListResponse setBody(QueryStudioAppListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryStudioAppListResponseBody getBody() {
        return this.body;
    }

}
