// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateWorkitemEstimateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWorkitemEstimateResponseBody body;

    public static CreateWorkitemEstimateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkitemEstimateResponse self = new CreateWorkitemEstimateResponse();
        return TeaModel.build(map, self);
    }

    public CreateWorkitemEstimateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWorkitemEstimateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWorkitemEstimateResponse setBody(CreateWorkitemEstimateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkitemEstimateResponseBody getBody() {
        return this.body;
    }

}
