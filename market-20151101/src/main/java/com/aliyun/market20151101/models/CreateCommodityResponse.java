// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class CreateCommodityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCommodityResponseBody body;

    public static CreateCommodityResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCommodityResponse self = new CreateCommodityResponse();
        return TeaModel.build(map, self);
    }

    public CreateCommodityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCommodityResponse setBody(CreateCommodityResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCommodityResponseBody getBody() {
        return this.body;
    }

}
