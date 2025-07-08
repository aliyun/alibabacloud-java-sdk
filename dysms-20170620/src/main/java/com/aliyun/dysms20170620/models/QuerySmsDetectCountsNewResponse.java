// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsDetectCountsNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsDetectCountsNewResponseBody body;

    public static QuerySmsDetectCountsNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsDetectCountsNewResponse self = new QuerySmsDetectCountsNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsDetectCountsNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsDetectCountsNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsDetectCountsNewResponse setBody(QuerySmsDetectCountsNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsDetectCountsNewResponseBody getBody() {
        return this.body;
    }

}
