// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechPushJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySpeechPushJobResponseBody body;

    public static QuerySpeechPushJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechPushJobResponse self = new QuerySpeechPushJobResponse();
        return TeaModel.build(map, self);
    }

    public QuerySpeechPushJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySpeechPushJobResponse setBody(QuerySpeechPushJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySpeechPushJobResponseBody getBody() {
        return this.body;
    }

}
