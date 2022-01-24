// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateBackendModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBackendModelResponseBody body;

    public static CreateBackendModelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBackendModelResponse self = new CreateBackendModelResponse();
        return TeaModel.build(map, self);
    }

    public CreateBackendModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBackendModelResponse setBody(CreateBackendModelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBackendModelResponseBody getBody() {
        return this.body;
    }

}
