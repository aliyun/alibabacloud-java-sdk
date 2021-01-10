// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceAllUserIdsByGroupIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryFaceAllUserIdsByGroupIdResponseBody body;

    public static QueryFaceAllUserIdsByGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceAllUserIdsByGroupIdResponse self = new QueryFaceAllUserIdsByGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceAllUserIdsByGroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFaceAllUserIdsByGroupIdResponse setBody(QueryFaceAllUserIdsByGroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaceAllUserIdsByGroupIdResponseBody getBody() {
        return this.body;
    }

}
