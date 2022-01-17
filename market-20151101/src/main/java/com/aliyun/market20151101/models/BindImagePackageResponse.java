// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class BindImagePackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindImagePackageResponseBody body;

    public static BindImagePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        BindImagePackageResponse self = new BindImagePackageResponse();
        return TeaModel.build(map, self);
    }

    public BindImagePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindImagePackageResponse setBody(BindImagePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public BindImagePackageResponseBody getBody() {
        return this.body;
    }

}
