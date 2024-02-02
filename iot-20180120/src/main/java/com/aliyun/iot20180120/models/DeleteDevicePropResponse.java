// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDevicePropResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDevicePropResponseBody body;

    public static DeleteDevicePropResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevicePropResponse self = new DeleteDevicePropResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDevicePropResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDevicePropResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDevicePropResponse setBody(DeleteDevicePropResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDevicePropResponseBody getBody() {
        return this.body;
    }

}
