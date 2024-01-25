// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DeleteApDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteApDeviceResponseBody body;

    public static DeleteApDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApDeviceResponse self = new DeleteApDeviceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApDeviceResponse setBody(DeleteApDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApDeviceResponseBody getBody() {
        return this.body;
    }

}
