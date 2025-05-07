// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryAxnBindFixedLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAxnBindFixedLineResponseBody body;

    public static QueryAxnBindFixedLineResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAxnBindFixedLineResponse self = new QueryAxnBindFixedLineResponse();
        return TeaModel.build(map, self);
    }

    public QueryAxnBindFixedLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAxnBindFixedLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAxnBindFixedLineResponse setBody(QueryAxnBindFixedLineResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAxnBindFixedLineResponseBody getBody() {
        return this.body;
    }

}
