// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeleteAiModelSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAiModelSourceResponseBody body;

    public static DeleteAiModelSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAiModelSourceResponse self = new DeleteAiModelSourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAiModelSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAiModelSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAiModelSourceResponse setBody(DeleteAiModelSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAiModelSourceResponseBody getBody() {
        return this.body;
    }

}
