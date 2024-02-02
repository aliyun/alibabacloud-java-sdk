// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateThingScriptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateThingScriptResponseBody body;

    public static CreateThingScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateThingScriptResponse self = new CreateThingScriptResponse();
        return TeaModel.build(map, self);
    }

    public CreateThingScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateThingScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateThingScriptResponse setBody(CreateThingScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateThingScriptResponseBody getBody() {
        return this.body;
    }

}
