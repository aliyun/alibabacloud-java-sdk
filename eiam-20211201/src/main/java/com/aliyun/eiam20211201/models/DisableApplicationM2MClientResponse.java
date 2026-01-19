// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableApplicationM2MClientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableApplicationM2MClientResponseBody body;

    public static DisableApplicationM2MClientResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableApplicationM2MClientResponse self = new DisableApplicationM2MClientResponse();
        return TeaModel.build(map, self);
    }

    public DisableApplicationM2MClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableApplicationM2MClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableApplicationM2MClientResponse setBody(DisableApplicationM2MClientResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableApplicationM2MClientResponseBody getBody() {
        return this.body;
    }

}
