// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DoSelfDelegateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DoSelfDelegateResponseBody body;

    public static DoSelfDelegateResponse build(java.util.Map<String, ?> map) throws Exception {
        DoSelfDelegateResponse self = new DoSelfDelegateResponse();
        return TeaModel.build(map, self);
    }

    public DoSelfDelegateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DoSelfDelegateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DoSelfDelegateResponse setBody(DoSelfDelegateResponseBody body) {
        this.body = body;
        return this;
    }
    public DoSelfDelegateResponseBody getBody() {
        return this.body;
    }

}
