// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dg20190327.models;

import com.aliyun.tea.*;

public class GetUserGatewaysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserGatewaysResponseBody body;

    public static GetUserGatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserGatewaysResponse self = new GetUserGatewaysResponse();
        return TeaModel.build(map, self);
    }

    public GetUserGatewaysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserGatewaysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserGatewaysResponse setBody(GetUserGatewaysResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserGatewaysResponseBody getBody() {
        return this.body;
    }

}
