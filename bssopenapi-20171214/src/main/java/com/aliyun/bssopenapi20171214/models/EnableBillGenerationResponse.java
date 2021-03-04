// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class EnableBillGenerationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableBillGenerationResponseBody body;

    public static EnableBillGenerationResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableBillGenerationResponse self = new EnableBillGenerationResponse();
        return TeaModel.build(map, self);
    }

    public EnableBillGenerationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableBillGenerationResponse setBody(EnableBillGenerationResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableBillGenerationResponseBody getBody() {
        return this.body;
    }

}
