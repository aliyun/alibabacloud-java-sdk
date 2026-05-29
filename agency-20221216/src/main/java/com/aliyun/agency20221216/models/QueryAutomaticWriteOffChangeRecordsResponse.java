// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class QueryAutomaticWriteOffChangeRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAutomaticWriteOffChangeRecordsResponseBody body;

    public static QueryAutomaticWriteOffChangeRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAutomaticWriteOffChangeRecordsResponse self = new QueryAutomaticWriteOffChangeRecordsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAutomaticWriteOffChangeRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAutomaticWriteOffChangeRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAutomaticWriteOffChangeRecordsResponse setBody(QueryAutomaticWriteOffChangeRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAutomaticWriteOffChangeRecordsResponseBody getBody() {
        return this.body;
    }

}
