// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateAccessConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAccessConfigurationResponseBody body;

    public static UpdateAccessConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccessConfigurationResponse self = new UpdateAccessConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAccessConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAccessConfigurationResponse setBody(UpdateAccessConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAccessConfigurationResponseBody getBody() {
        return this.body;
    }

}
