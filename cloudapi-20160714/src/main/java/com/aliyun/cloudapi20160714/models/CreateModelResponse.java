// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateModelResponseBody body;

    public static CreateModelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModelResponse self = new CreateModelResponse();
        return TeaModel.build(map, self);
    }

    public CreateModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateModelResponse setBody(CreateModelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateModelResponseBody getBody() {
        return this.body;
    }

}
