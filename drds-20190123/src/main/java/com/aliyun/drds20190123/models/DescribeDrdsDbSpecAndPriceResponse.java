// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDbSpecAndPriceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDrdsDbSpecAndPriceResponseBody body;

    public static DescribeDrdsDbSpecAndPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDbSpecAndPriceResponse self = new DescribeDrdsDbSpecAndPriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDbSpecAndPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsDbSpecAndPriceResponse setBody(DescribeDrdsDbSpecAndPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsDbSpecAndPriceResponseBody getBody() {
        return this.body;
    }

}
