// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class CompleteIconResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CompleteIconResponseBody body;

    public static CompleteIconResponse build(java.util.Map<String, ?> map) throws Exception {
        CompleteIconResponse self = new CompleteIconResponse();
        return TeaModel.build(map, self);
    }

    public CompleteIconResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompleteIconResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompleteIconResponse setBody(CompleteIconResponseBody body) {
        this.body = body;
        return this;
    }
    public CompleteIconResponseBody getBody() {
        return this.body;
    }

}
