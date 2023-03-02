// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class CreateProduceForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateProduceForPartnerResponseBody body;

    public static CreateProduceForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProduceForPartnerResponse self = new CreateProduceForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public CreateProduceForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProduceForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProduceForPartnerResponse setBody(CreateProduceForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProduceForPartnerResponseBody getBody() {
        return this.body;
    }

}
