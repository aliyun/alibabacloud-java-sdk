// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CreateIntlFixedPriceDomainOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIntlFixedPriceDomainOrderResponseBody body;

    public static CreateIntlFixedPriceDomainOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIntlFixedPriceDomainOrderResponse self = new CreateIntlFixedPriceDomainOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateIntlFixedPriceDomainOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIntlFixedPriceDomainOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIntlFixedPriceDomainOrderResponse setBody(CreateIntlFixedPriceDomainOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIntlFixedPriceDomainOrderResponseBody getBody() {
        return this.body;
    }

}
