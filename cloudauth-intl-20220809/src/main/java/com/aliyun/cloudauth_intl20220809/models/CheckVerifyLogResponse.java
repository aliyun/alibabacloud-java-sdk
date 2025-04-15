// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CheckVerifyLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckVerifyLogResponseBody body;

    public static CheckVerifyLogResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckVerifyLogResponse self = new CheckVerifyLogResponse();
        return TeaModel.build(map, self);
    }

    public CheckVerifyLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckVerifyLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckVerifyLogResponse setBody(CheckVerifyLogResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckVerifyLogResponseBody getBody() {
        return this.body;
    }

}
