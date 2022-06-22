// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DeleteSceneFunctionParameterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSceneFunctionParameterResponseBody body;

    public static DeleteSceneFunctionParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSceneFunctionParameterResponse self = new DeleteSceneFunctionParameterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSceneFunctionParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSceneFunctionParameterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSceneFunctionParameterResponse setBody(DeleteSceneFunctionParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSceneFunctionParameterResponseBody getBody() {
        return this.body;
    }

}
