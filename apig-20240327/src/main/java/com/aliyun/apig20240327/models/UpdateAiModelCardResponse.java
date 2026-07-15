// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateAiModelCardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAiModelCardResponseBody body;

    public static UpdateAiModelCardResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiModelCardResponse self = new UpdateAiModelCardResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAiModelCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAiModelCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAiModelCardResponse setBody(UpdateAiModelCardResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAiModelCardResponseBody getBody() {
        return this.body;
    }

}
