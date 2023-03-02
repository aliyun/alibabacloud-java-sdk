// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class UnAuthorizeDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnAuthorizeDeviceResponseBody body;

    public static UnAuthorizeDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnAuthorizeDeviceResponse self = new UnAuthorizeDeviceResponse();
        return TeaModel.build(map, self);
    }

    public UnAuthorizeDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnAuthorizeDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnAuthorizeDeviceResponse setBody(UnAuthorizeDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnAuthorizeDeviceResponseBody getBody() {
        return this.body;
    }

}
