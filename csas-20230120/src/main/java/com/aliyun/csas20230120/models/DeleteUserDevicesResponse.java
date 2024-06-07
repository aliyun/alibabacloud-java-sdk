// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteUserDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserDevicesResponseBody body;

    public static DeleteUserDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserDevicesResponse self = new DeleteUserDevicesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserDevicesResponse setBody(DeleteUserDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserDevicesResponseBody getBody() {
        return this.body;
    }

}
