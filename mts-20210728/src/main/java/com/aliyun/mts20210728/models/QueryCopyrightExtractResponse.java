// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class QueryCopyrightExtractResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCopyrightExtractResponseBody body;

    public static QueryCopyrightExtractResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCopyrightExtractResponse self = new QueryCopyrightExtractResponse();
        return TeaModel.build(map, self);
    }

    public QueryCopyrightExtractResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCopyrightExtractResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCopyrightExtractResponse setBody(QueryCopyrightExtractResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCopyrightExtractResponseBody getBody() {
        return this.body;
    }

}
