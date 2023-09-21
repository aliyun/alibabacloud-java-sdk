// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateProcCorrectOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateProcCorrectOrderResponseBody body;

    public static CreateProcCorrectOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProcCorrectOrderResponse self = new CreateProcCorrectOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateProcCorrectOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProcCorrectOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProcCorrectOrderResponse setBody(CreateProcCorrectOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProcCorrectOrderResponseBody getBody() {
        return this.body;
    }

}
