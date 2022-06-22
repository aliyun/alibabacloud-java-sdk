// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CheckOpenAhasStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckOpenAhasStatusResponseBody body;

    public static CheckOpenAhasStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckOpenAhasStatusResponse self = new CheckOpenAhasStatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckOpenAhasStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckOpenAhasStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckOpenAhasStatusResponse setBody(CheckOpenAhasStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckOpenAhasStatusResponseBody getBody() {
        return this.body;
    }

}
