// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEnvironmentNodeResponseBody body;

    public static UpdateEnvironmentNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvironmentNodeResponse self = new UpdateEnvironmentNodeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEnvironmentNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEnvironmentNodeResponse setBody(UpdateEnvironmentNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEnvironmentNodeResponseBody getBody() {
        return this.body;
    }

}
