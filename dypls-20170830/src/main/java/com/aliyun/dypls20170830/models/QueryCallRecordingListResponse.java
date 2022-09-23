// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryCallRecordingListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCallRecordingListResponseBody body;

    public static QueryCallRecordingListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCallRecordingListResponse self = new QueryCallRecordingListResponse();
        return TeaModel.build(map, self);
    }

    public QueryCallRecordingListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCallRecordingListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCallRecordingListResponse setBody(QueryCallRecordingListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCallRecordingListResponseBody getBody() {
        return this.body;
    }

}
