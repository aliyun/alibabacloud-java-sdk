// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryAccountByNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAccountByNameResponseBody body;

    public static QueryAccountByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountByNameResponse self = new QueryAccountByNameResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAccountByNameResponse setBody(QueryAccountByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccountByNameResponseBody getBody() {
        return this.body;
    }

}
