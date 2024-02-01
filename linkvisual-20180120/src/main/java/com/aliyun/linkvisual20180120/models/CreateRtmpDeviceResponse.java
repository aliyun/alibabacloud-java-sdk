// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateRtmpDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRtmpDeviceResponseBody body;

    public static CreateRtmpDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRtmpDeviceResponse self = new CreateRtmpDeviceResponse();
        return TeaModel.build(map, self);
    }

    public CreateRtmpDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRtmpDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRtmpDeviceResponse setBody(CreateRtmpDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRtmpDeviceResponseBody getBody() {
        return this.body;
    }

}
