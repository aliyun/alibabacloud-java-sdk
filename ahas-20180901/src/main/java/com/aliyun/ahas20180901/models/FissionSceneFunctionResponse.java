// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class FissionSceneFunctionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FissionSceneFunctionResponseBody body;

    public static FissionSceneFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        FissionSceneFunctionResponse self = new FissionSceneFunctionResponse();
        return TeaModel.build(map, self);
    }

    public FissionSceneFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FissionSceneFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FissionSceneFunctionResponse setBody(FissionSceneFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public FissionSceneFunctionResponseBody getBody() {
        return this.body;
    }

}
