// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechPushJobSpeechResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySpeechPushJobSpeechResponseBody body;

    public static QuerySpeechPushJobSpeechResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechPushJobSpeechResponse self = new QuerySpeechPushJobSpeechResponse();
        return TeaModel.build(map, self);
    }

    public QuerySpeechPushJobSpeechResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySpeechPushJobSpeechResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySpeechPushJobSpeechResponse setBody(QuerySpeechPushJobSpeechResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySpeechPushJobSpeechResponseBody getBody() {
        return this.body;
    }

}
