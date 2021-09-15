// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreatePageModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePageModelResponseBody body;

    public static CreatePageModelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePageModelResponse self = new CreatePageModelResponse();
        return TeaModel.build(map, self);
    }

    public CreatePageModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePageModelResponse setBody(CreatePageModelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePageModelResponseBody getBody() {
        return this.body;
    }

}
