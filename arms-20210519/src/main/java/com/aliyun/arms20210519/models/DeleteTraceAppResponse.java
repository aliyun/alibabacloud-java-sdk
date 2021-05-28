// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class DeleteTraceAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTraceAppResponseBody body;

    public static DeleteTraceAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTraceAppResponse self = new DeleteTraceAppResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTraceAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTraceAppResponse setBody(DeleteTraceAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTraceAppResponseBody getBody() {
        return this.body;
    }

}
