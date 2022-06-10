// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateSettleConfirmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSettleConfirmResponseBody body;

    public static CreateSettleConfirmResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSettleConfirmResponse self = new CreateSettleConfirmResponse();
        return TeaModel.build(map, self);
    }

    public CreateSettleConfirmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSettleConfirmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSettleConfirmResponse setBody(CreateSettleConfirmResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSettleConfirmResponseBody getBody() {
        return this.body;
    }

}
