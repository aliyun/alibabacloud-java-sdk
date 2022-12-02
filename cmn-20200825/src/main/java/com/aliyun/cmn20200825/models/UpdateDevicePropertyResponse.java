// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDevicePropertyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDevicePropertyResponseBody body;

    public static UpdateDevicePropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDevicePropertyResponse self = new UpdateDevicePropertyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDevicePropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDevicePropertyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDevicePropertyResponse setBody(UpdateDevicePropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDevicePropertyResponseBody getBody() {
        return this.body;
    }

}
