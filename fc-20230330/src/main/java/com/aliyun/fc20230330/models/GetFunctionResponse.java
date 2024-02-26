// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class GetFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Function body;

    public static GetFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionResponse self = new GetFunctionResponse();
        return TeaModel.build(map, self);
    }

    public GetFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFunctionResponse setBody(Function body) {
        this.body = body;
        return this;
    }
    public Function getBody() {
        return this.body;
    }

}
