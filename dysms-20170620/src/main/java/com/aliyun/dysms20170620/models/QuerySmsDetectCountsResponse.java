// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsDetectCountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsDetectCountsResponseBody body;

    public static QuerySmsDetectCountsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsDetectCountsResponse self = new QuerySmsDetectCountsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsDetectCountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsDetectCountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsDetectCountsResponse setBody(QuerySmsDetectCountsResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsDetectCountsResponseBody getBody() {
        return this.body;
    }

}
