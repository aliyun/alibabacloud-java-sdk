// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryApplicationStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryApplicationStatusResponseBody body;

    public static QueryApplicationStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationStatusResponse self = new QueryApplicationStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryApplicationStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryApplicationStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryApplicationStatusResponse setBody(QueryApplicationStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryApplicationStatusResponseBody getBody() {
        return this.body;
    }

}
