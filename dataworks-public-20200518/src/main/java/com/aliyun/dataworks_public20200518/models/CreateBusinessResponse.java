// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateBusinessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBusinessResponseBody body;

    public static CreateBusinessResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessResponse self = new CreateBusinessResponse();
        return TeaModel.build(map, self);
    }

    public CreateBusinessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBusinessResponse setBody(CreateBusinessResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBusinessResponseBody getBody() {
        return this.body;
    }

}
