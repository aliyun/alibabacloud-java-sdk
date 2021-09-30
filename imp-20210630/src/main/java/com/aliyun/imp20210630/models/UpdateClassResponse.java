// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateClassResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateClassResponseBody body;

    public static UpdateClassResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClassResponse self = new UpdateClassResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClassResponse setBody(UpdateClassResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClassResponseBody getBody() {
        return this.body;
    }

}
