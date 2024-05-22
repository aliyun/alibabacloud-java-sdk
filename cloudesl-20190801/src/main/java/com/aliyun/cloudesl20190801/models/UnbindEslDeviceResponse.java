// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class UnbindEslDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindEslDeviceResponseBody body;

    public static UnbindEslDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindEslDeviceResponse self = new UnbindEslDeviceResponse();
        return TeaModel.build(map, self);
    }

    public UnbindEslDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindEslDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindEslDeviceResponse setBody(UnbindEslDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindEslDeviceResponseBody getBody() {
        return this.body;
    }

}
