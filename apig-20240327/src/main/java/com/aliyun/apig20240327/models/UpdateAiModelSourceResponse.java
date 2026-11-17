// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateAiModelSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAiModelSourceResponseBody body;

    public static UpdateAiModelSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiModelSourceResponse self = new UpdateAiModelSourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAiModelSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAiModelSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAiModelSourceResponse setBody(UpdateAiModelSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAiModelSourceResponseBody getBody() {
        return this.body;
    }

}
