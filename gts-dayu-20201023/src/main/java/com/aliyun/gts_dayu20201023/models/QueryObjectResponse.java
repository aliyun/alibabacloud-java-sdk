// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20201023.models;

import com.aliyun.tea.*;

public class QueryObjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryObjectResponseBody body;

    public static QueryObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryObjectResponse self = new QueryObjectResponse();
        return TeaModel.build(map, self);
    }

    public QueryObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryObjectResponse setBody(QueryObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryObjectResponseBody getBody() {
        return this.body;
    }

}
