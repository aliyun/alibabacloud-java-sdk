// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GenerateDeviceNameListURLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateDeviceNameListURLResponseBody body;

    public static GenerateDeviceNameListURLResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateDeviceNameListURLResponse self = new GenerateDeviceNameListURLResponse();
        return TeaModel.build(map, self);
    }

    public GenerateDeviceNameListURLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateDeviceNameListURLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateDeviceNameListURLResponse setBody(GenerateDeviceNameListURLResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateDeviceNameListURLResponseBody getBody() {
        return this.body;
    }

}
