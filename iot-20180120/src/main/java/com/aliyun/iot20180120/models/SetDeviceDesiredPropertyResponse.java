// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetDeviceDesiredPropertyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDeviceDesiredPropertyResponseBody body;

    public static SetDeviceDesiredPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDeviceDesiredPropertyResponse self = new SetDeviceDesiredPropertyResponse();
        return TeaModel.build(map, self);
    }

    public SetDeviceDesiredPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDeviceDesiredPropertyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDeviceDesiredPropertyResponse setBody(SetDeviceDesiredPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDeviceDesiredPropertyResponseBody getBody() {
        return this.body;
    }

}
