// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreateVideoCreationTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVideoCreationTaskResponseBody body;

    public static CreateVideoCreationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoCreationTaskResponse self = new CreateVideoCreationTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateVideoCreationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVideoCreationTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVideoCreationTaskResponse setBody(CreateVideoCreationTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVideoCreationTaskResponseBody getBody() {
        return this.body;
    }

}
