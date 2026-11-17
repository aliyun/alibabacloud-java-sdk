// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteAiModelSourceModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAiModelSourceModelResponseBody body;

    public static DeleteAiModelSourceModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAiModelSourceModelResponse self = new DeleteAiModelSourceModelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAiModelSourceModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAiModelSourceModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAiModelSourceModelResponse setBody(DeleteAiModelSourceModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAiModelSourceModelResponseBody getBody() {
        return this.body;
    }

}
