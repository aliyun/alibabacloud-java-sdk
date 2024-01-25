// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateUserDevicesStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUserDevicesStatusResponseBody body;

    public static UpdateUserDevicesStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserDevicesStatusResponse self = new UpdateUserDevicesStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserDevicesStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserDevicesStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserDevicesStatusResponse setBody(UpdateUserDevicesStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserDevicesStatusResponseBody getBody() {
        return this.body;
    }

}
