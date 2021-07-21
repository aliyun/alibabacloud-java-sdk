// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateEnvChangeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEnvChangeResponseBody body;

    public static UpdateEnvChangeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvChangeResponse self = new UpdateEnvChangeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEnvChangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEnvChangeResponse setBody(UpdateEnvChangeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEnvChangeResponseBody getBody() {
        return this.body;
    }

}
