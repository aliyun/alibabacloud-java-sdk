// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateRiskCheckTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRiskCheckTaskResponseBody body;

    public static CreateRiskCheckTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRiskCheckTaskResponse self = new CreateRiskCheckTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateRiskCheckTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRiskCheckTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRiskCheckTaskResponse setBody(CreateRiskCheckTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRiskCheckTaskResponseBody getBody() {
        return this.body;
    }

}
