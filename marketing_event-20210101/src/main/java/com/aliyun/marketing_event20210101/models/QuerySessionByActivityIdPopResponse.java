// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class QuerySessionByActivityIdPopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySessionByActivityIdPopResponseBody body;

    public static QuerySessionByActivityIdPopResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySessionByActivityIdPopResponse self = new QuerySessionByActivityIdPopResponse();
        return TeaModel.build(map, self);
    }

    public QuerySessionByActivityIdPopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySessionByActivityIdPopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySessionByActivityIdPopResponse setBody(QuerySessionByActivityIdPopResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySessionByActivityIdPopResponseBody getBody() {
        return this.body;
    }

}
