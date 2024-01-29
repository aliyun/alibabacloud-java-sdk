// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreatePublishTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePublishTaskResponseBody body;

    public static CreatePublishTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePublishTaskResponse self = new CreatePublishTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreatePublishTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePublishTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePublishTaskResponse setBody(CreatePublishTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePublishTaskResponseBody getBody() {
        return this.body;
    }

}
