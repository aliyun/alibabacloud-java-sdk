// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class CreateApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateApplicationResponseBody body;

    public static CreateApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationResponse self = new CreateApplicationResponse();
        return TeaModel.build(map, self);
    }

    public CreateApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApplicationResponse setBody(CreateApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApplicationResponseBody getBody() {
        return this.body;
    }

}
