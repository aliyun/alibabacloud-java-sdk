// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentProductVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEnvironmentProductVersionResponseBody body;

    public static UpdateEnvironmentProductVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvironmentProductVersionResponse self = new UpdateEnvironmentProductVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEnvironmentProductVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEnvironmentProductVersionResponse setBody(UpdateEnvironmentProductVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEnvironmentProductVersionResponseBody getBody() {
        return this.body;
    }

}
