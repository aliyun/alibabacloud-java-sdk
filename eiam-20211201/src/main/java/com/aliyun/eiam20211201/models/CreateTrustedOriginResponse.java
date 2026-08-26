// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateTrustedOriginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTrustedOriginResponseBody body;

    public static CreateTrustedOriginResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrustedOriginResponse self = new CreateTrustedOriginResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrustedOriginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrustedOriginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTrustedOriginResponse setBody(CreateTrustedOriginResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrustedOriginResponseBody getBody() {
        return this.body;
    }

}
