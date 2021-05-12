// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductVersionPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetProductVersionPackageResponseBody body;

    public static GetProductVersionPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionPackageResponse self = new GetProductVersionPackageResponse();
        return TeaModel.build(map, self);
    }

    public GetProductVersionPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductVersionPackageResponse setBody(GetProductVersionPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductVersionPackageResponseBody getBody() {
        return this.body;
    }

}
