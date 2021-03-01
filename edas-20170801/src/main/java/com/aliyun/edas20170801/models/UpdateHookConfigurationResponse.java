// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateHookConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHookConfigurationResponseBody body;

    public static UpdateHookConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHookConfigurationResponse self = new UpdateHookConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHookConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHookConfigurationResponse setBody(UpdateHookConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHookConfigurationResponseBody getBody() {
        return this.body;
    }

}
