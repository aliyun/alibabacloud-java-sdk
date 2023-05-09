// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class CheckGrantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckGrantResponseBody body;

    public static CheckGrantResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckGrantResponse self = new CheckGrantResponse();
        return TeaModel.build(map, self);
    }

    public CheckGrantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckGrantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckGrantResponse setBody(CheckGrantResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckGrantResponseBody getBody() {
        return this.body;
    }

}
