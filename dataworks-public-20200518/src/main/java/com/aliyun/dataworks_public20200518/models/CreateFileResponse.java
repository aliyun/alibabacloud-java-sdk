// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFileResponseBody body;

    public static CreateFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFileResponse self = new CreateFileResponse();
        return TeaModel.build(map, self);
    }

    public CreateFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFileResponse setBody(CreateFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFileResponseBody getBody() {
        return this.body;
    }

}
