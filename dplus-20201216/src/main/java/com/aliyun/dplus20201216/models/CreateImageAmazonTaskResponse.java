// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class CreateImageAmazonTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateImageAmazonTaskResponseBody body;

    public static CreateImageAmazonTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageAmazonTaskResponse self = new CreateImageAmazonTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageAmazonTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImageAmazonTaskResponse setBody(CreateImageAmazonTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImageAmazonTaskResponseBody getBody() {
        return this.body;
    }

}
