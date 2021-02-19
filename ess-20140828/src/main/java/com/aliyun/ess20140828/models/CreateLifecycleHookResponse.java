// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class CreateLifecycleHookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateLifecycleHookResponse setBody(CreateLifecycleHookResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLifecycleHookResponseBody getBody() {
        return this.body;
    }

}
