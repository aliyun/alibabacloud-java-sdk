// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetDevicePropertyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDevicePropertyResponseBody body;

    public static SetDevicePropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDevicePropertyResponse self = new SetDevicePropertyResponse();
        return TeaModel.build(map, self);
    }

    public SetDevicePropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDevicePropertyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDevicePropertyResponse setBody(SetDevicePropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDevicePropertyResponseBody getBody() {
        return this.body;
    }

}
