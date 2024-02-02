// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateContactFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateContactFlowResponseBody body;

    public static CreateContactFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContactFlowResponse self = new CreateContactFlowResponse();
        return TeaModel.build(map, self);
    }

    public CreateContactFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateContactFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateContactFlowResponse setBody(CreateContactFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateContactFlowResponseBody getBody() {
        return this.body;
    }

}
