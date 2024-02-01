// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceCustomUserIdByUserIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFaceCustomUserIdByUserIdResponseBody body;

    public static QueryFaceCustomUserIdByUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceCustomUserIdByUserIdResponse self = new QueryFaceCustomUserIdByUserIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceCustomUserIdByUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFaceCustomUserIdByUserIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFaceCustomUserIdByUserIdResponse setBody(QueryFaceCustomUserIdByUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaceCustomUserIdByUserIdResponseBody getBody() {
        return this.body;
    }

}
