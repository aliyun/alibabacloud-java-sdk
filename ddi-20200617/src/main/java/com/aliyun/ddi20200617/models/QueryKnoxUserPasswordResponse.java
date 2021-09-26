// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class QueryKnoxUserPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryKnoxUserPasswordResponseBody body;

    public static QueryKnoxUserPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryKnoxUserPasswordResponse self = new QueryKnoxUserPasswordResponse();
        return TeaModel.build(map, self);
    }

    public QueryKnoxUserPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryKnoxUserPasswordResponse setBody(QueryKnoxUserPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryKnoxUserPasswordResponseBody getBody() {
        return this.body;
    }

}
