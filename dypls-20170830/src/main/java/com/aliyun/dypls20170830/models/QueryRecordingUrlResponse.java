// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryRecordingUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRecordingUrlResponseBody body;

    public static QueryRecordingUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordingUrlResponse self = new QueryRecordingUrlResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecordingUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRecordingUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRecordingUrlResponse setBody(QueryRecordingUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecordingUrlResponseBody getBody() {
        return this.body;
    }

}
