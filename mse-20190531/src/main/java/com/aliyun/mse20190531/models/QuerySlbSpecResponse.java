// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QuerySlbSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySlbSpecResponseBody body;

    public static QuerySlbSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySlbSpecResponse self = new QuerySlbSpecResponse();
        return TeaModel.build(map, self);
    }

    public QuerySlbSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySlbSpecResponse setBody(QuerySlbSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySlbSpecResponseBody getBody() {
        return this.body;
    }

}
