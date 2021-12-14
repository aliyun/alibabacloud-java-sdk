// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryRandomResResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRandomResResponseBody body;

    public static QueryRandomResResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRandomResResponse self = new QueryRandomResResponse();
        return TeaModel.build(map, self);
    }

    public QueryRandomResResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRandomResResponse setBody(QueryRandomResResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRandomResResponseBody getBody() {
        return this.body;
    }

}
