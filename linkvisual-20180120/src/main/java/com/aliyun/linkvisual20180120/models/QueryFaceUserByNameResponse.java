// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserByNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFaceUserByNameResponseBody body;

    public static QueryFaceUserByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceUserByNameResponse self = new QueryFaceUserByNameResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceUserByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFaceUserByNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFaceUserByNameResponse setBody(QueryFaceUserByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaceUserByNameResponseBody getBody() {
        return this.body;
    }

}
