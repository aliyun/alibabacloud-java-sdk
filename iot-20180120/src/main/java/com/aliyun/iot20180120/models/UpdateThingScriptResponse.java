// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateThingScriptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateThingScriptResponseBody body;

    public static UpdateThingScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateThingScriptResponse self = new UpdateThingScriptResponse();
        return TeaModel.build(map, self);
    }

    public UpdateThingScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateThingScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateThingScriptResponse setBody(UpdateThingScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateThingScriptResponseBody getBody() {
        return this.body;
    }

}
