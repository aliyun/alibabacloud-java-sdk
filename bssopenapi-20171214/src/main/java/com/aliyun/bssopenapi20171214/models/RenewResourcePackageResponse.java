// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RenewResourcePackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RenewResourcePackageResponseBody body;

    public static RenewResourcePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewResourcePackageResponse self = new RenewResourcePackageResponse();
        return TeaModel.build(map, self);
    }

    public RenewResourcePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewResourcePackageResponse setBody(RenewResourcePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewResourcePackageResponseBody getBody() {
        return this.body;
    }

}
