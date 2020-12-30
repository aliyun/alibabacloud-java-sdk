// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.databot20200330.models;

import com.aliyun.tea.*;

public class QueryDatabotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDatabotResponseBody body;

    public static QueryDatabotResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDatabotResponse self = new QueryDatabotResponse();
        return TeaModel.build(map, self);
    }

    public QueryDatabotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDatabotResponse setBody(QueryDatabotResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDatabotResponseBody getBody() {
        return this.body;
    }

}
