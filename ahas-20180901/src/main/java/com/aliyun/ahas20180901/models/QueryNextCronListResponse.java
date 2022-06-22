// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryNextCronListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryNextCronListResponseBody body;

    public static QueryNextCronListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNextCronListResponse self = new QueryNextCronListResponse();
        return TeaModel.build(map, self);
    }

    public QueryNextCronListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryNextCronListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryNextCronListResponse setBody(QueryNextCronListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryNextCronListResponseBody getBody() {
        return this.body;
    }

}
