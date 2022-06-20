// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySpeechResponseBody body;

    public static QuerySpeechResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechResponse self = new QuerySpeechResponse();
        return TeaModel.build(map, self);
    }

    public QuerySpeechResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySpeechResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySpeechResponse setBody(QuerySpeechResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySpeechResponseBody getBody() {
        return this.body;
    }

}
