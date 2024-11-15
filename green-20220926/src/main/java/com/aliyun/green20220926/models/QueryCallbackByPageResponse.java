// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class QueryCallbackByPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCallbackByPageResponseBody body;

    public static QueryCallbackByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCallbackByPageResponse self = new QueryCallbackByPageResponse();
        return TeaModel.build(map, self);
    }

    public QueryCallbackByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCallbackByPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCallbackByPageResponse setBody(QueryCallbackByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCallbackByPageResponseBody getBody() {
        return this.body;
    }

}
