// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Function body;

    public static CreateFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionResponse self = new CreateFunctionResponse();
        return TeaModel.build(map, self);
    }

    public CreateFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFunctionResponse setBody(Function body) {
        this.body = body;
        return this;
    }
    public Function getBody() {
        return this.body;
    }

}
