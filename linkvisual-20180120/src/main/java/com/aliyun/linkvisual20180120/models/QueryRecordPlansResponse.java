// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordPlansResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRecordPlansResponseBody body;

    public static QueryRecordPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordPlansResponse self = new QueryRecordPlansResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecordPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRecordPlansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRecordPlansResponse setBody(QueryRecordPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecordPlansResponseBody getBody() {
        return this.body;
    }

}
