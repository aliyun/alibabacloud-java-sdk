// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class UpdateDeviceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDeviceStatusResponseBody body;

    public static UpdateDeviceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceStatusResponse self = new UpdateDeviceStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeviceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDeviceStatusResponse setBody(UpdateDeviceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeviceStatusResponseBody getBody() {
        return this.body;
    }

}
