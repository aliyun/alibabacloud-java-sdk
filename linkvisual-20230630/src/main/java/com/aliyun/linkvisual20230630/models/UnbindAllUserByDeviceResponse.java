// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class UnbindAllUserByDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindAllUserByDeviceResponseBody body;

    public static UnbindAllUserByDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindAllUserByDeviceResponse self = new UnbindAllUserByDeviceResponse();
        return TeaModel.build(map, self);
    }

    public UnbindAllUserByDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindAllUserByDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindAllUserByDeviceResponse setBody(UnbindAllUserByDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindAllUserByDeviceResponseBody getBody() {
        return this.body;
    }

}
