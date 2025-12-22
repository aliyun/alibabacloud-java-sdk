// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreateImageDetectionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateImageDetectionTaskResponseBody body;

    public static CreateImageDetectionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageDetectionTaskResponse self = new CreateImageDetectionTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageDetectionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImageDetectionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateImageDetectionTaskResponse setBody(CreateImageDetectionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImageDetectionTaskResponseBody getBody() {
        return this.body;
    }

}
