// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryMessageCallbackNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMessageCallbackNewResponseBody body;

    public static QueryMessageCallbackNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageCallbackNewResponse self = new QueryMessageCallbackNewResponse();
        return TeaModel.build(map, self);
    }

    public QueryMessageCallbackNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMessageCallbackNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMessageCallbackNewResponse setBody(QueryMessageCallbackNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMessageCallbackNewResponseBody getBody() {
        return this.body;
    }

}
