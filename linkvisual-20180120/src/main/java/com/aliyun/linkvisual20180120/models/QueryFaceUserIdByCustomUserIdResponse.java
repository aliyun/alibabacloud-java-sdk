// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserIdByCustomUserIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryFaceUserIdByCustomUserIdResponseBody body;

    public static QueryFaceUserIdByCustomUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceUserIdByCustomUserIdResponse self = new QueryFaceUserIdByCustomUserIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceUserIdByCustomUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFaceUserIdByCustomUserIdResponse setBody(QueryFaceUserIdByCustomUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaceUserIdByCustomUserIdResponseBody getBody() {
        return this.body;
    }

}
