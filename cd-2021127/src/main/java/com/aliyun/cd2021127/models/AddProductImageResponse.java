// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class AddProductImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddProductImageResponseBody body;

    public static AddProductImageResponse build(java.util.Map<String, ?> map) throws Exception {
        AddProductImageResponse self = new AddProductImageResponse();
        return TeaModel.build(map, self);
    }

    public AddProductImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddProductImageResponse setBody(AddProductImageResponseBody body) {
        this.body = body;
        return this;
    }
    public AddProductImageResponseBody getBody() {
        return this.body;
    }

}
