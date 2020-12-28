// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20171204.models;

import com.aliyun.tea.*;

public class StopLoggingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopLoggingResponseBody body;

    public static StopLoggingResponse build(java.util.Map<String, ?> map) throws Exception {
        StopLoggingResponse self = new StopLoggingResponse();
        return TeaModel.build(map, self);
    }

    public StopLoggingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopLoggingResponse setBody(StopLoggingResponseBody body) {
        this.body = body;
        return this;
    }
    public StopLoggingResponseBody getBody() {
        return this.body;
    }

}
