// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class CreateFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public CreateFlowResponse setBody(CreateFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlowResponseBody getBody() {
        return this.body;
    }

}
