// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class RenewServiceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewServiceInstanceResponseBody body;

    public static RenewServiceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewServiceInstanceResponse self = new RenewServiceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RenewServiceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewServiceInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewServiceInstanceResponse setBody(RenewServiceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewServiceInstanceResponseBody getBody() {
        return this.body;
    }

}
