// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceRegistrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceRegistrationResponseBody body;

    public static GetServiceRegistrationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceRegistrationResponse self = new GetServiceRegistrationResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceRegistrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceRegistrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceRegistrationResponse setBody(GetServiceRegistrationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceRegistrationResponseBody getBody() {
        return this.body;
    }

}
