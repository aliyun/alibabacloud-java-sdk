// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AgreeLinkMicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AgreeLinkMicResponseBody body;

    public static AgreeLinkMicResponse build(java.util.Map<String, ?> map) throws Exception {
        AgreeLinkMicResponse self = new AgreeLinkMicResponse();
        return TeaModel.build(map, self);
    }

    public AgreeLinkMicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AgreeLinkMicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AgreeLinkMicResponse setBody(AgreeLinkMicResponseBody body) {
        this.body = body;
        return this;
    }
    public AgreeLinkMicResponseBody getBody() {
        return this.body;
    }

}
