// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class CheckUsedPropertyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckUsedPropertyResponseBody body;

    public static CheckUsedPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckUsedPropertyResponse self = new CheckUsedPropertyResponse();
        return TeaModel.build(map, self);
    }

    public CheckUsedPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckUsedPropertyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckUsedPropertyResponse setBody(CheckUsedPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckUsedPropertyResponseBody getBody() {
        return this.body;
    }

}
