// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ettrafficisp20230830.models;

import com.aliyun.tea.*;

public class AkDisableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AkDisableResponseBody body;

    public static AkDisableResponse build(java.util.Map<String, ?> map) throws Exception {
        AkDisableResponse self = new AkDisableResponse();
        return TeaModel.build(map, self);
    }

    public AkDisableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AkDisableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AkDisableResponse setBody(AkDisableResponseBody body) {
        this.body = body;
        return this;
    }
    public AkDisableResponseBody getBody() {
        return this.body;
    }

}
