// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class ContrastSmartVerifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ContrastSmartVerifyResponseBody body;

    public static ContrastSmartVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        ContrastSmartVerifyResponse self = new ContrastSmartVerifyResponse();
        return TeaModel.build(map, self);
    }

    public ContrastSmartVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ContrastSmartVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ContrastSmartVerifyResponse setBody(ContrastSmartVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public ContrastSmartVerifyResponseBody getBody() {
        return this.body;
    }

}
