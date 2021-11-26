// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateComponentIndexResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateComponentIndexResponseBody body;

    public static UpdateComponentIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateComponentIndexResponse self = new UpdateComponentIndexResponse();
        return TeaModel.build(map, self);
    }

    public UpdateComponentIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateComponentIndexResponse setBody(UpdateComponentIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateComponentIndexResponseBody getBody() {
        return this.body;
    }

}
