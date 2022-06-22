// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateSceneFunctionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSceneFunctionResponseBody body;

    public static UpdateSceneFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSceneFunctionResponse self = new UpdateSceneFunctionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSceneFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSceneFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSceneFunctionResponse setBody(UpdateSceneFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSceneFunctionResponseBody getBody() {
        return this.body;
    }

}
