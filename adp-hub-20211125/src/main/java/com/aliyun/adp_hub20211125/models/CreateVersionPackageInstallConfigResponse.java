// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp_hub20211125.models;

import com.aliyun.tea.*;

public class CreateVersionPackageInstallConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVersionPackageInstallConfigResponseBody body;

    public static CreateVersionPackageInstallConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVersionPackageInstallConfigResponse self = new CreateVersionPackageInstallConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateVersionPackageInstallConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVersionPackageInstallConfigResponse setBody(CreateVersionPackageInstallConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVersionPackageInstallConfigResponseBody getBody() {
        return this.body;
    }

}
