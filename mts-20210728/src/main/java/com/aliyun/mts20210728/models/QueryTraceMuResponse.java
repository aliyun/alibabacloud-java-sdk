// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class QueryTraceMuResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTraceMuResponseBody body;

    public static QueryTraceMuResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceMuResponse self = new QueryTraceMuResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraceMuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTraceMuResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTraceMuResponse setBody(QueryTraceMuResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTraceMuResponseBody getBody() {
        return this.body;
    }

}
