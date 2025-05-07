// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryAxbBindFixedLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAxbBindFixedLineResponseBody body;

    public static QueryAxbBindFixedLineResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAxbBindFixedLineResponse self = new QueryAxbBindFixedLineResponse();
        return TeaModel.build(map, self);
    }

    public QueryAxbBindFixedLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAxbBindFixedLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAxbBindFixedLineResponse setBody(QueryAxbBindFixedLineResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAxbBindFixedLineResponseBody getBody() {
        return this.body;
    }

}
