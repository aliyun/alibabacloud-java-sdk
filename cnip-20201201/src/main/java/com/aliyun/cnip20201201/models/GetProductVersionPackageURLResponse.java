// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductVersionPackageURLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetProductVersionPackageURLResponseBody body;

    public static GetProductVersionPackageURLResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionPackageURLResponse self = new GetProductVersionPackageURLResponse();
        return TeaModel.build(map, self);
    }

    public GetProductVersionPackageURLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductVersionPackageURLResponse setBody(GetProductVersionPackageURLResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductVersionPackageURLResponseBody getBody() {
        return this.body;
    }

}
