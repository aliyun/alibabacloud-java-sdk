// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UpdateAccessPageStateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAccessPageStateResponseBody body;

    public static UpdateAccessPageStateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccessPageStateResponse self = new UpdateAccessPageStateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAccessPageStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAccessPageStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAccessPageStateResponse setBody(UpdateAccessPageStateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAccessPageStateResponseBody getBody() {
        return this.body;
    }

}
