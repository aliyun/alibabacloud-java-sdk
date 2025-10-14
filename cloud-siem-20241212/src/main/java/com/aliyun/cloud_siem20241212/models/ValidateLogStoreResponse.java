// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ValidateLogStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateLogStoreResponseBody body;

    public static ValidateLogStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateLogStoreResponse self = new ValidateLogStoreResponse();
        return TeaModel.build(map, self);
    }

    public ValidateLogStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateLogStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateLogStoreResponse setBody(ValidateLogStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateLogStoreResponseBody getBody() {
        return this.body;
    }

}
