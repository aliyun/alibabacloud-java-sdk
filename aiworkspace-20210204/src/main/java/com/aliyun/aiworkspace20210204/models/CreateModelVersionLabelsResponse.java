// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateModelVersionLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateModelVersionLabelsResponseBody body;

    public static CreateModelVersionLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModelVersionLabelsResponse self = new CreateModelVersionLabelsResponse();
        return TeaModel.build(map, self);
    }

    public CreateModelVersionLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateModelVersionLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateModelVersionLabelsResponse setBody(CreateModelVersionLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateModelVersionLabelsResponseBody getBody() {
        return this.body;
    }

}
