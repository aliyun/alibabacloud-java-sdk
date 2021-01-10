// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateCustomizedFilterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCustomizedFilterResponseBody body;

    public static UpdateCustomizedFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomizedFilterResponse self = new UpdateCustomizedFilterResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomizedFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomizedFilterResponse setBody(UpdateCustomizedFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomizedFilterResponseBody getBody() {
        return this.body;
    }

}
