// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateCmsOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCmsOrderResponseBody body;

    public static CreateCmsOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCmsOrderResponse self = new CreateCmsOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateCmsOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCmsOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCmsOrderResponse setBody(CreateCmsOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCmsOrderResponseBody getBody() {
        return this.body;
    }

}
