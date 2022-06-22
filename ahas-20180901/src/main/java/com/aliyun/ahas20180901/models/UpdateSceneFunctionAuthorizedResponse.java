// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateSceneFunctionAuthorizedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSceneFunctionAuthorizedResponseBody body;

    public static UpdateSceneFunctionAuthorizedResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSceneFunctionAuthorizedResponse self = new UpdateSceneFunctionAuthorizedResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSceneFunctionAuthorizedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSceneFunctionAuthorizedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSceneFunctionAuthorizedResponse setBody(UpdateSceneFunctionAuthorizedResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSceneFunctionAuthorizedResponseBody getBody() {
        return this.body;
    }

}
