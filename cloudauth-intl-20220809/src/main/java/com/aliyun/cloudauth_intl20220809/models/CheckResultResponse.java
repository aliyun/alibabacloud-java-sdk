// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CheckResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckResultResponseBody body;

    public static CheckResultResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckResultResponse self = new CheckResultResponse();
        return TeaModel.build(map, self);
    }

    public CheckResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckResultResponse setBody(CheckResultResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckResultResponseBody getBody() {
        return this.body;
    }

}
