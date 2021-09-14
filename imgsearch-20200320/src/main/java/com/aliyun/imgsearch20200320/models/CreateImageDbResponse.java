// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class CreateImageDbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateImageDbResponseBody body;

    public static CreateImageDbResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageDbResponse self = new CreateImageDbResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageDbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImageDbResponse setBody(CreateImageDbResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImageDbResponseBody getBody() {
        return this.body;
    }

}
