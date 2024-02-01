// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFaceUserBatchResponseBody body;

    public static QueryFaceUserBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceUserBatchResponse self = new QueryFaceUserBatchResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceUserBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFaceUserBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFaceUserBatchResponse setBody(QueryFaceUserBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaceUserBatchResponseBody getBody() {
        return this.body;
    }

}
