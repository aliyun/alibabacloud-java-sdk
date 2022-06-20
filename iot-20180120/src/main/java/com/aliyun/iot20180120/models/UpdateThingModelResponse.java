// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateThingModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateThingModelResponseBody body;

    public static UpdateThingModelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateThingModelResponse self = new UpdateThingModelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateThingModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateThingModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateThingModelResponse setBody(UpdateThingModelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateThingModelResponseBody getBody() {
        return this.body;
    }

}
