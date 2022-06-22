// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateSceneFunctionParameterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSceneFunctionParameterResponseBody body;

    public static UpdateSceneFunctionParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSceneFunctionParameterResponse self = new UpdateSceneFunctionParameterResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSceneFunctionParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSceneFunctionParameterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSceneFunctionParameterResponse setBody(UpdateSceneFunctionParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSceneFunctionParameterResponseBody getBody() {
        return this.body;
    }

}
