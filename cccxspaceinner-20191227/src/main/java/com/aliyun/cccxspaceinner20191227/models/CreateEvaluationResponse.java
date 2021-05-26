// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CreateEvaluationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEvaluationResponseBody body;

    public static CreateEvaluationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEvaluationResponse self = new CreateEvaluationResponse();
        return TeaModel.build(map, self);
    }

    public CreateEvaluationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEvaluationResponse setBody(CreateEvaluationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEvaluationResponseBody getBody() {
        return this.body;
    }

}
