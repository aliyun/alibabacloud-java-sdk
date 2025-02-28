// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateServiceTestTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServiceTestTaskResponseBody body;

    public static CreateServiceTestTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceTestTaskResponse self = new CreateServiceTestTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceTestTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceTestTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceTestTaskResponse setBody(CreateServiceTestTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceTestTaskResponseBody getBody() {
        return this.body;
    }

}
