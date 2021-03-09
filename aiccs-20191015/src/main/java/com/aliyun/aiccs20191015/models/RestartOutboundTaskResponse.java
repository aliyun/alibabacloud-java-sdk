// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class RestartOutboundTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RestartOutboundTaskResponseBody body;

    public static RestartOutboundTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartOutboundTaskResponse self = new RestartOutboundTaskResponse();
        return TeaModel.build(map, self);
    }

    public RestartOutboundTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartOutboundTaskResponse setBody(RestartOutboundTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartOutboundTaskResponseBody getBody() {
        return this.body;
    }

}
