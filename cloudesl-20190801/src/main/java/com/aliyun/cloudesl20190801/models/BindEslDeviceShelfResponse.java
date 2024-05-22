// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class BindEslDeviceShelfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindEslDeviceShelfResponseBody body;

    public static BindEslDeviceShelfResponse build(java.util.Map<String, ?> map) throws Exception {
        BindEslDeviceShelfResponse self = new BindEslDeviceShelfResponse();
        return TeaModel.build(map, self);
    }

    public BindEslDeviceShelfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindEslDeviceShelfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindEslDeviceShelfResponse setBody(BindEslDeviceShelfResponseBody body) {
        this.body = body;
        return this;
    }
    public BindEslDeviceShelfResponseBody getBody() {
        return this.body;
    }

}
