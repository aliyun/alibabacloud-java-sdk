// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CreateLifecycleHookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLifecycleHookResponseBody body;

    public static CreateLifecycleHookResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLifecycleHookResponse self = new CreateLifecycleHookResponse();
        return TeaModel.build(map, self);
    }

    public CreateLifecycleHookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLifecycleHookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLifecycleHookResponse setBody(CreateLifecycleHookResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLifecycleHookResponseBody getBody() {
        return this.body;
    }

}
