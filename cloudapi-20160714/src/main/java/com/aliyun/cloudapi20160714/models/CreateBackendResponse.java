// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateBackendResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBackendResponseBody body;

    public static CreateBackendResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBackendResponse self = new CreateBackendResponse();
        return TeaModel.build(map, self);
    }

    public CreateBackendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBackendResponse setBody(CreateBackendResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBackendResponseBody getBody() {
        return this.body;
    }

}
