// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class BindEslDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindEslDeviceResponseBody body;

    public static BindEslDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        BindEslDeviceResponse self = new BindEslDeviceResponse();
        return TeaModel.build(map, self);
    }

    public BindEslDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindEslDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindEslDeviceResponse setBody(BindEslDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public BindEslDeviceResponseBody getBody() {
        return this.body;
    }

}
