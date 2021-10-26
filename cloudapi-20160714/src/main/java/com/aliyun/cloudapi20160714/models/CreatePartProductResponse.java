// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreatePartProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePartProductResponseBody body;

    public static CreatePartProductResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePartProductResponse self = new CreatePartProductResponse();
        return TeaModel.build(map, self);
    }

    public CreatePartProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePartProductResponse setBody(CreatePartProductResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePartProductResponseBody getBody() {
        return this.body;
    }

}
