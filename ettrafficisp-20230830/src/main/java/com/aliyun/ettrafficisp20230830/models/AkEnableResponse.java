// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ettrafficisp20230830.models;

import com.aliyun.tea.*;

public class AkEnableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AkEnableResponseBody body;

    public static AkEnableResponse build(java.util.Map<String, ?> map) throws Exception {
        AkEnableResponse self = new AkEnableResponse();
        return TeaModel.build(map, self);
    }

    public AkEnableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AkEnableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AkEnableResponse setBody(AkEnableResponseBody body) {
        this.body = body;
        return this;
    }
    public AkEnableResponseBody getBody() {
        return this.body;
    }

}
