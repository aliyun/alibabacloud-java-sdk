// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CheckOpenSaleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckOpenSaleResponseBody body;

    public static CheckOpenSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckOpenSaleResponse self = new CheckOpenSaleResponse();
        return TeaModel.build(map, self);
    }

    public CheckOpenSaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckOpenSaleResponse setBody(CheckOpenSaleResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckOpenSaleResponseBody getBody() {
        return this.body;
    }

}
