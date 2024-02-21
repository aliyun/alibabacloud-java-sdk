// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class RenewInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RenewInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewInstancesResponse setBody(RenewInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewInstancesResponseBody getBody() {
        return this.body;
    }

}
