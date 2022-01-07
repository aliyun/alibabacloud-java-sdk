// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.abfs20211230.models;

import com.aliyun.tea.*;

public class CreateBackFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBackFlowResponseBody body;

    public static CreateBackFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBackFlowResponse self = new CreateBackFlowResponse();
        return TeaModel.build(map, self);
    }

    public CreateBackFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBackFlowResponse setBody(CreateBackFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBackFlowResponseBody getBody() {
        return this.body;
    }

}
