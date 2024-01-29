// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateInstancePublishTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateInstancePublishTaskResponseBody body;

    public static CreateInstancePublishTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstancePublishTaskResponse self = new CreateInstancePublishTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstancePublishTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstancePublishTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInstancePublishTaskResponse setBody(CreateInstancePublishTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstancePublishTaskResponseBody getBody() {
        return this.body;
    }

}
