// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CreatePackageConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePackageConfigResponseBody body;

    public static CreatePackageConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePackageConfigResponse self = new CreatePackageConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreatePackageConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePackageConfigResponse setBody(CreatePackageConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePackageConfigResponseBody getBody() {
        return this.body;
    }

}
