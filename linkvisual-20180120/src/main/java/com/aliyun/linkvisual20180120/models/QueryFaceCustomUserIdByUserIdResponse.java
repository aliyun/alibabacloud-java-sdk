// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceCustomUserIdByUserIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryFaceCustomUserIdByUserIdResponse setBody(QueryFaceCustomUserIdByUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaceCustomUserIdByUserIdResponseBody getBody() {
        return this.body;
    }

}
