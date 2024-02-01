// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRecordResponseBody body;

    public static QueryRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordResponse self = new QueryRecordResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRecordResponse setBody(QueryRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecordResponseBody getBody() {
        return this.body;
    }

}
