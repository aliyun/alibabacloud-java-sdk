// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateHookConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateHookConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHookConfigurationResponse setBody(UpdateHookConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHookConfigurationResponseBody getBody() {
        return this.body;
    }

}
