// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySpeechListResponseBody body;

    public static QuerySpeechListResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechListResponse self = new QuerySpeechListResponse();
        return TeaModel.build(map, self);
    }

    public QuerySpeechListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySpeechListResponse setBody(QuerySpeechListResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySpeechListResponseBody getBody() {
        return this.body;
    }

}
