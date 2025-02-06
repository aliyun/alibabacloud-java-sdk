// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class QueryFaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFaceResponseBody body;

    public static QueryFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceResponse self = new QueryFaceResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFaceResponse setBody(QueryFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaceResponseBody getBody() {
        return this.body;
    }

}
