// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateNetworkPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateNetworkPackageResponseBody body;

    public static CreateNetworkPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkPackageResponse self = new CreateNetworkPackageResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetworkPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNetworkPackageResponse setBody(CreateNetworkPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNetworkPackageResponseBody getBody() {
        return this.body;
    }

}
