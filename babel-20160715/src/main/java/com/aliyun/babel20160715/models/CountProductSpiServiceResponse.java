// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class CountProductSpiServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CountProductSpiServiceResponseBody body;

    public static CountProductSpiServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CountProductSpiServiceResponse self = new CountProductSpiServiceResponse();
        return TeaModel.build(map, self);
    }

    public CountProductSpiServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountProductSpiServiceResponse setBody(CountProductSpiServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CountProductSpiServiceResponseBody getBody() {
        return this.body;
    }

}
