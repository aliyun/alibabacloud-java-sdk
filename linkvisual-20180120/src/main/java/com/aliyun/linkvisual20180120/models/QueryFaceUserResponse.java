// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryFaceUserResponse setBody(QueryFaceUserResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaceUserResponseBody getBody() {
        return this.body;
    }

}
