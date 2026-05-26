// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentretailvision20260506.models;

import com.aliyun.tea.*;

public class QueryRecognitionResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRecognitionResultResponseBody body;

    public static QueryRecognitionResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRecognitionResultResponse self = new QueryRecognitionResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryRecognitionResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRecognitionResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRecognitionResultResponse setBody(QueryRecognitionResultResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRecognitionResultResponseBody getBody() {
        return this.body;
    }

}
