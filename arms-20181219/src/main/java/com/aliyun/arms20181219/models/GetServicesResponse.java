// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20181219.models;

import com.aliyun.tea.*;

public class GetServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetServicesResponseBody body;

    public static GetServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServicesResponse self = new GetServicesResponse();
        return TeaModel.build(map, self);
    }

    public GetServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServicesResponse setBody(GetServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServicesResponseBody getBody() {
        return this.body;
    }

}
