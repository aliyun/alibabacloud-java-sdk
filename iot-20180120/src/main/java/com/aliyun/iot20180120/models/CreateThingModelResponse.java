// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateThingModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateThingModelResponseBody body;

    public static CreateThingModelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateThingModelResponse self = new CreateThingModelResponse();
        return TeaModel.build(map, self);
    }

    public CreateThingModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateThingModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateThingModelResponse setBody(CreateThingModelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateThingModelResponseBody getBody() {
        return this.body;
    }

}
