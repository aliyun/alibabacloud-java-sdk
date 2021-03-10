// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateThingScriptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateThingScriptResponse setBody(CreateThingScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateThingScriptResponseBody getBody() {
        return this.body;
    }

}
