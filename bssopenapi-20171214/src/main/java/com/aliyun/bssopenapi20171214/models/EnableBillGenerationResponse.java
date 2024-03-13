// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class EnableBillGenerationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public EnableBillGenerationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableBillGenerationResponse setBody(EnableBillGenerationResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableBillGenerationResponseBody getBody() {
        return this.body;
    }

}
