// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dashdeviceconsole20250408.models;

import com.aliyun.tea.*;

public class PushPromptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushPromptResponseBody body;

    public static PushPromptResponse build(java.util.Map<String, ?> map) throws Exception {
        PushPromptResponse self = new PushPromptResponse();
        return TeaModel.build(map, self);
    }

    public PushPromptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushPromptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushPromptResponse setBody(PushPromptResponseBody body) {
        this.body = body;
        return this;
    }
    public PushPromptResponseBody getBody() {
        return this.body;
    }

}
