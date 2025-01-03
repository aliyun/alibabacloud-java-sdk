// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class ValidateResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateResourceResponseBody body;

    public static ValidateResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateResourceResponse self = new ValidateResourceResponse();
        return TeaModel.build(map, self);
    }

    public ValidateResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateResourceResponse setBody(ValidateResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateResourceResponseBody getBody() {
        return this.body;
    }

}
