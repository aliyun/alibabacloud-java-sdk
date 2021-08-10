// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class CheckPatentSellStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckPatentSellStatusResponseBody body;

    public static CheckPatentSellStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckPatentSellStatusResponse self = new CheckPatentSellStatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckPatentSellStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckPatentSellStatusResponse setBody(CheckPatentSellStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckPatentSellStatusResponseBody getBody() {
        return this.body;
    }

}
