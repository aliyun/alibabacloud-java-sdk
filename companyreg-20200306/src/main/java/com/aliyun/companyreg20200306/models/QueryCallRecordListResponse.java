// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryCallRecordListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCallRecordListResponseBody body;

    public static QueryCallRecordListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCallRecordListResponse self = new QueryCallRecordListResponse();
        return TeaModel.build(map, self);
    }

    public QueryCallRecordListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCallRecordListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCallRecordListResponse setBody(QueryCallRecordListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCallRecordListResponseBody getBody() {
        return this.body;
    }

}
