// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class AddScriptSceneFunctionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddScriptSceneFunctionResponseBody body;

    public static AddScriptSceneFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        AddScriptSceneFunctionResponse self = new AddScriptSceneFunctionResponse();
        return TeaModel.build(map, self);
    }

    public AddScriptSceneFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddScriptSceneFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddScriptSceneFunctionResponse setBody(AddScriptSceneFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public AddScriptSceneFunctionResponseBody getBody() {
        return this.body;
    }

}
