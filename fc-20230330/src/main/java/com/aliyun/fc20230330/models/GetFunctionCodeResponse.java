// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class GetFunctionCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OutputFuncCode body;

    public static GetFunctionCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionCodeResponse self = new GetFunctionCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetFunctionCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFunctionCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFunctionCodeResponse setBody(OutputFuncCode body) {
        this.body = body;
        return this;
    }
    public OutputFuncCode getBody() {
        return this.body;
    }

}
