// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsDetectListNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySmsDetectListNewResponseBody body;

    public static QuerySmsDetectListNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsDetectListNewResponse self = new QuerySmsDetectListNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySmsDetectListNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySmsDetectListNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySmsDetectListNewResponse setBody(QuerySmsDetectListNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySmsDetectListNewResponseBody getBody() {
        return this.body;
    }

}
