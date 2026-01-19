// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableApplicationResourceServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableApplicationResourceServerResponseBody body;

    public static DisableApplicationResourceServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableApplicationResourceServerResponse self = new DisableApplicationResourceServerResponse();
        return TeaModel.build(map, self);
    }

    public DisableApplicationResourceServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableApplicationResourceServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableApplicationResourceServerResponse setBody(DisableApplicationResourceServerResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableApplicationResourceServerResponseBody getBody() {
        return this.body;
    }

}
