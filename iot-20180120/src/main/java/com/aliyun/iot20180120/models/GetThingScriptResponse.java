// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingScriptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetThingScriptResponseBody body;

    public static GetThingScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        GetThingScriptResponse self = new GetThingScriptResponse();
        return TeaModel.build(map, self);
    }

    public GetThingScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetThingScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetThingScriptResponse setBody(GetThingScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public GetThingScriptResponseBody getBody() {
        return this.body;
    }

}
