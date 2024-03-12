// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableApplicationSsoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableApplicationSsoResponseBody body;

    public static DisableApplicationSsoResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableApplicationSsoResponse self = new DisableApplicationSsoResponse();
        return TeaModel.build(map, self);
    }

    public DisableApplicationSsoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableApplicationSsoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableApplicationSsoResponse setBody(DisableApplicationSsoResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableApplicationSsoResponseBody getBody() {
        return this.body;
    }

}
