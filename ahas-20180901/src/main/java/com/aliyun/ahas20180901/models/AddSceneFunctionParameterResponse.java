// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class AddSceneFunctionParameterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddSceneFunctionParameterResponseBody body;

    public static AddSceneFunctionParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSceneFunctionParameterResponse self = new AddSceneFunctionParameterResponse();
        return TeaModel.build(map, self);
    }

    public AddSceneFunctionParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSceneFunctionParameterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSceneFunctionParameterResponse setBody(AddSceneFunctionParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSceneFunctionParameterResponseBody getBody() {
        return this.body;
    }

}
