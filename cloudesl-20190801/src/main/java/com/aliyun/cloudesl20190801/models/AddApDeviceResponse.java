// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class AddApDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddApDeviceResponseBody body;

    public static AddApDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddApDeviceResponse self = new AddApDeviceResponse();
        return TeaModel.build(map, self);
    }

    public AddApDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddApDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddApDeviceResponse setBody(AddApDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddApDeviceResponseBody getBody() {
        return this.body;
    }

}
