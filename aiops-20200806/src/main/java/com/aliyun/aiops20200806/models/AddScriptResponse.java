// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class AddScriptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddScriptResponseBody body;

    public static AddScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        AddScriptResponse self = new AddScriptResponse();
        return TeaModel.build(map, self);
    }

    public AddScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddScriptResponse setBody(AddScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public AddScriptResponseBody getBody() {
        return this.body;
    }

}
