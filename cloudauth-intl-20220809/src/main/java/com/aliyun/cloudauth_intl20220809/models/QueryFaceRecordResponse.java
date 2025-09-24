// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class QueryFaceRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFaceRecordResponseBody body;

    public static QueryFaceRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceRecordResponse self = new QueryFaceRecordResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFaceRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFaceRecordResponse setBody(QueryFaceRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaceRecordResponseBody getBody() {
        return this.body;
    }

}
