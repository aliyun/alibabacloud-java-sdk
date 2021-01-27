// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateResourcePackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateResourcePackageResponseBody body;

    public static CreateResourcePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourcePackageResponse self = new CreateResourcePackageResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourcePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResourcePackageResponse setBody(CreateResourcePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResourcePackageResponseBody getBody() {
        return this.body;
    }

}
