// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class RenewServiceInstanceResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewServiceInstanceResourcesResponseBody body;

    public static RenewServiceInstanceResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewServiceInstanceResourcesResponse self = new RenewServiceInstanceResourcesResponse();
        return TeaModel.build(map, self);
    }

    public RenewServiceInstanceResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewServiceInstanceResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewServiceInstanceResourcesResponse setBody(RenewServiceInstanceResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewServiceInstanceResourcesResponseBody getBody() {
        return this.body;
    }

}
