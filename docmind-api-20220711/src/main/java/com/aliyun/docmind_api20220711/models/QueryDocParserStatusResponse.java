// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class QueryDocParserStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDocParserStatusResponseBody body;

    public static QueryDocParserStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDocParserStatusResponse self = new QueryDocParserStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDocParserStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDocParserStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDocParserStatusResponse setBody(QueryDocParserStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDocParserStatusResponseBody getBody() {
        return this.body;
    }

}
