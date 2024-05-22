// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class DeleteEslDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEslDeviceResponseBody body;

    public static DeleteEslDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEslDeviceResponse self = new DeleteEslDeviceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEslDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEslDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEslDeviceResponse setBody(DeleteEslDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEslDeviceResponseBody getBody() {
        return this.body;
    }

}
