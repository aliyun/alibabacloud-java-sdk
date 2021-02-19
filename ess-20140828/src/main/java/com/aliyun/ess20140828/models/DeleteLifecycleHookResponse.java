// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DeleteLifecycleHookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLifecycleHookResponseBody body;

    public static DeleteLifecycleHookResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLifecycleHookResponse self = new DeleteLifecycleHookResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLifecycleHookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLifecycleHookResponse setBody(DeleteLifecycleHookResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLifecycleHookResponseBody getBody() {
        return this.body;
    }

}
