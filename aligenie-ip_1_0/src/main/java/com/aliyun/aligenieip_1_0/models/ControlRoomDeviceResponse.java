// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ControlRoomDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ControlRoomDeviceResponseBody body;

    public static ControlRoomDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ControlRoomDeviceResponse self = new ControlRoomDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ControlRoomDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ControlRoomDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ControlRoomDeviceResponse setBody(ControlRoomDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ControlRoomDeviceResponseBody getBody() {
        return this.body;
    }

}
