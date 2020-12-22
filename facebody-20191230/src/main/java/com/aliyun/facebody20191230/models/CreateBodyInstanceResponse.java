// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CreateBodyInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBodyInstanceResponseBody body;

    public static CreateBodyInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBodyInstanceResponse self = new CreateBodyInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateBodyInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBodyInstanceResponse setBody(CreateBodyInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBodyInstanceResponseBody getBody() {
        return this.body;
    }

}
