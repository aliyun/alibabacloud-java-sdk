// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryRecordMinutesUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRecordMinutesUrlResponseBody body;

    public static QueryRecordMinutesUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordMinutesUrlResponse self = new QueryRecordMinutesUrlResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecordMinutesUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRecordMinutesUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRecordMinutesUrlResponse setBody(QueryRecordMinutesUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecordMinutesUrlResponseBody getBody() {
        return this.body;
    }

}
