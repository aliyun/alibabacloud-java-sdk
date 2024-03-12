// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableApplicationResponseBody body;

    public static DisableApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableApplicationResponse self = new DisableApplicationResponse();
        return TeaModel.build(map, self);
    }

    public DisableApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableApplicationResponse setBody(DisableApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableApplicationResponseBody getBody() {
        return this.body;
    }

}
