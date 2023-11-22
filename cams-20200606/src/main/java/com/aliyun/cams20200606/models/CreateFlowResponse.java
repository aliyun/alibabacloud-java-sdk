// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFlowResponseBody body;

    public static CreateFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowResponse self = new CreateFlowResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFlowResponse setBody(CreateFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlowResponseBody getBody() {
        return this.body;
    }

}
