// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DeleteSceneFunctionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSceneFunctionResponseBody body;

    public static DeleteSceneFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSceneFunctionResponse self = new DeleteSceneFunctionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSceneFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSceneFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSceneFunctionResponse setBody(DeleteSceneFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSceneFunctionResponseBody getBody() {
        return this.body;
    }

}
