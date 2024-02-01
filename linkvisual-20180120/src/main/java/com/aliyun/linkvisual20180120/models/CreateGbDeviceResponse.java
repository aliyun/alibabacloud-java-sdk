// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateGbDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGbDeviceResponseBody body;

    public static CreateGbDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGbDeviceResponse self = new CreateGbDeviceResponse();
        return TeaModel.build(map, self);
    }

    public CreateGbDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGbDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGbDeviceResponse setBody(CreateGbDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGbDeviceResponseBody getBody() {
        return this.body;
    }

}
