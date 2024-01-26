// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDevicesResponseBody body;

    public static DeleteDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevicesResponse self = new DeleteDevicesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDevicesResponse setBody(DeleteDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDevicesResponseBody getBody() {
        return this.body;
    }

}
