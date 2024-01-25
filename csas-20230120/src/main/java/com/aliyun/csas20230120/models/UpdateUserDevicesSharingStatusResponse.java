// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateUserDevicesSharingStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUserDevicesSharingStatusResponseBody body;

    public static UpdateUserDevicesSharingStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserDevicesSharingStatusResponse self = new UpdateUserDevicesSharingStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserDevicesSharingStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserDevicesSharingStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserDevicesSharingStatusResponse setBody(UpdateUserDevicesSharingStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserDevicesSharingStatusResponseBody getBody() {
        return this.body;
    }

}
