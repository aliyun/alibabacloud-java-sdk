// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateModelLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateModelLabelsResponseBody body;

    public static CreateModelLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModelLabelsResponse self = new CreateModelLabelsResponse();
        return TeaModel.build(map, self);
    }

    public CreateModelLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateModelLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateModelLabelsResponse setBody(CreateModelLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateModelLabelsResponseBody getBody() {
        return this.body;
    }

}
