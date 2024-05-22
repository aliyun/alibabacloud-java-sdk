// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class AddEslDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddEslDeviceResponseBody body;

    public static AddEslDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEslDeviceResponse self = new AddEslDeviceResponse();
        return TeaModel.build(map, self);
    }

    public AddEslDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddEslDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddEslDeviceResponse setBody(AddEslDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEslDeviceResponseBody getBody() {
        return this.body;
    }

}
