// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDeviceResponseBody body;

    public static DeleteDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceResponse self = new DeleteDeviceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDeviceResponse setBody(DeleteDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeviceResponseBody getBody() {
        return this.body;
    }

}
