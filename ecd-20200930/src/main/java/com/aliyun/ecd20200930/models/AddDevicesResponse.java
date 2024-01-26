// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDevicesResponseBody body;

    public static AddDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDevicesResponse self = new AddDevicesResponse();
        return TeaModel.build(map, self);
    }

    public AddDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDevicesResponse setBody(AddDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDevicesResponseBody getBody() {
        return this.body;
    }

}
