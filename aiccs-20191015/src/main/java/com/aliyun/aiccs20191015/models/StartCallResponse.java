// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StartCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartCallResponseBody body;

    public static StartCallResponse build(java.util.Map<String, ?> map) throws Exception {
        StartCallResponse self = new StartCallResponse();
        return TeaModel.build(map, self);
    }

    public StartCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartCallResponse setBody(StartCallResponseBody body) {
        this.body = body;
        return this;
    }
    public StartCallResponseBody getBody() {
        return this.body;
    }

}
