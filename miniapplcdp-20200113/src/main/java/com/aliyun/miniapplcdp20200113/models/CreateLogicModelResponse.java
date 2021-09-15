// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateLogicModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLogicModelResponseBody body;

    public static CreateLogicModelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLogicModelResponse self = new CreateLogicModelResponse();
        return TeaModel.build(map, self);
    }

    public CreateLogicModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLogicModelResponse setBody(CreateLogicModelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLogicModelResponseBody getBody() {
        return this.body;
    }

}
