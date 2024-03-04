// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class UpdateGeneratedContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGeneratedContentResponseBody body;

    public static UpdateGeneratedContentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGeneratedContentResponse self = new UpdateGeneratedContentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGeneratedContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGeneratedContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGeneratedContentResponse setBody(UpdateGeneratedContentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGeneratedContentResponseBody getBody() {
        return this.body;
    }

}
