// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateBundleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBundleResponseBody body;

    public static CreateBundleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBundleResponse self = new CreateBundleResponse();
        return TeaModel.build(map, self);
    }

    public CreateBundleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBundleResponse setBody(CreateBundleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBundleResponseBody getBody() {
        return this.body;
    }

}
