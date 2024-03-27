// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateFreeLockCorrectOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateFreeLockCorrectOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFreeLockCorrectOrderResponse setBody(CreateFreeLockCorrectOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFreeLockCorrectOrderResponseBody getBody() {
        return this.body;
    }

}
