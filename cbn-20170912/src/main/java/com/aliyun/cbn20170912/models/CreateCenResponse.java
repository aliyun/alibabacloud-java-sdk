// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCenResponseBody body;

    public static CreateCenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCenResponse self = new CreateCenResponse();
        return TeaModel.build(map, self);
    }

    public CreateCenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCenResponse setBody(CreateCenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCenResponseBody getBody() {
        return this.body;
    }

}
