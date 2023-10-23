// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class GenerateDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateDeviceResponseBody body;

    public static GenerateDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateDeviceResponse self = new GenerateDeviceResponse();
        return TeaModel.build(map, self);
    }

    public GenerateDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateDeviceResponse setBody(GenerateDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateDeviceResponseBody getBody() {
        return this.body;
    }

}
