// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class CheckAccountTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckAccountTypeResponseBody body;

    public static CheckAccountTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAccountTypeResponse self = new CheckAccountTypeResponse();
        return TeaModel.build(map, self);
    }

    public CheckAccountTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAccountTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckAccountTypeResponse setBody(CheckAccountTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAccountTypeResponseBody getBody() {
        return this.body;
    }

}
