// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class QueryGateVerifyRecordListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryGateVerifyRecordListResponseBody body;

    public static QueryGateVerifyRecordListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGateVerifyRecordListResponse self = new QueryGateVerifyRecordListResponse();
        return TeaModel.build(map, self);
    }

    public QueryGateVerifyRecordListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryGateVerifyRecordListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryGateVerifyRecordListResponse setBody(QueryGateVerifyRecordListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryGateVerifyRecordListResponseBody getBody() {
        return this.body;
    }

}
