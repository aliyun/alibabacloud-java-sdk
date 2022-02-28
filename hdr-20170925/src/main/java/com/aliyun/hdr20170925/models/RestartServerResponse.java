// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class RestartServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RestartServerResponseBody body;

    public static RestartServerResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartServerResponse self = new RestartServerResponse();
        return TeaModel.build(map, self);
    }

    public RestartServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartServerResponse setBody(RestartServerResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartServerResponseBody getBody() {
        return this.body;
    }

}
