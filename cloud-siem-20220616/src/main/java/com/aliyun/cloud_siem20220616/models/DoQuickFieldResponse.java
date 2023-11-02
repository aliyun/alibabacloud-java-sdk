// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DoQuickFieldResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DoQuickFieldResponseBody body;

    public static DoQuickFieldResponse build(java.util.Map<String, ?> map) throws Exception {
        DoQuickFieldResponse self = new DoQuickFieldResponse();
        return TeaModel.build(map, self);
    }

    public DoQuickFieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DoQuickFieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DoQuickFieldResponse setBody(DoQuickFieldResponseBody body) {
        this.body = body;
        return this;
    }
    public DoQuickFieldResponseBody getBody() {
        return this.body;
    }

}
