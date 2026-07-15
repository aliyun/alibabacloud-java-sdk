// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteAiModelCardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAiModelCardResponseBody body;

    public static DeleteAiModelCardResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAiModelCardResponse self = new DeleteAiModelCardResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAiModelCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAiModelCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAiModelCardResponse setBody(DeleteAiModelCardResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAiModelCardResponseBody getBody() {
        return this.body;
    }

}
