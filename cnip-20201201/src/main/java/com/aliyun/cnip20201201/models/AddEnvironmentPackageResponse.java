// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class AddEnvironmentPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddEnvironmentPackageResponseBody body;

    public static AddEnvironmentPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEnvironmentPackageResponse self = new AddEnvironmentPackageResponse();
        return TeaModel.build(map, self);
    }

    public AddEnvironmentPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddEnvironmentPackageResponse setBody(AddEnvironmentPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEnvironmentPackageResponseBody getBody() {
        return this.body;
    }

}
