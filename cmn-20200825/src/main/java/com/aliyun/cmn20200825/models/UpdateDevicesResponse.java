// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDevicesResponseBody body;

    public static UpdateDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDevicesResponse self = new UpdateDevicesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDevicesResponse setBody(UpdateDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDevicesResponseBody getBody() {
        return this.body;
    }

}
