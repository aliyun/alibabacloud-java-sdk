// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateFreeLockCorrectOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFreeLockCorrectOrderResponseBody body;

    public static CreateFreeLockCorrectOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFreeLockCorrectOrderResponse self = new CreateFreeLockCorrectOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateFreeLockCorrectOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFreeLockCorrectOrderResponse setBody(CreateFreeLockCorrectOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFreeLockCorrectOrderResponseBody getBody() {
        return this.body;
    }

}
