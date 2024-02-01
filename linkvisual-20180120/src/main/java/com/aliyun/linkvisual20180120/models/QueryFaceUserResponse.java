// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFaceUserResponseBody body;

    public static QueryFaceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceUserResponse self = new QueryFaceUserResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFaceUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFaceUserResponse setBody(QueryFaceUserResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaceUserResponseBody getBody() {
        return this.body;
    }

}
