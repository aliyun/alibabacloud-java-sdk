// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class RenewInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RenewInstancesResponseBody body;

    public static RenewInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewInstancesResponse self = new RenewInstancesResponse();
        return TeaModel.build(map, self);
    }

    public RenewInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewInstancesResponse setBody(RenewInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewInstancesResponseBody getBody() {
        return this.body;
    }

}
