// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetDevicesPropertyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDevicesPropertyResponseBody body;

    public static SetDevicesPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDevicesPropertyResponse self = new SetDevicesPropertyResponse();
        return TeaModel.build(map, self);
    }

    public SetDevicesPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDevicesPropertyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDevicesPropertyResponse setBody(SetDevicesPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDevicesPropertyResponseBody getBody() {
        return this.body;
    }

}
