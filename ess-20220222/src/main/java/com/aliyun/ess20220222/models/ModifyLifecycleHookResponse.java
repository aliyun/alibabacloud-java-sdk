// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyLifecycleHookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLifecycleHookResponseBody body;

    public static ModifyLifecycleHookResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLifecycleHookResponse self = new ModifyLifecycleHookResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLifecycleHookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLifecycleHookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLifecycleHookResponse setBody(ModifyLifecycleHookResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLifecycleHookResponseBody getBody() {
        return this.body;
    }

}
