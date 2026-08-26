// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetTrustedOriginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTrustedOriginResponseBody body;

    public static GetTrustedOriginResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrustedOriginResponse self = new GetTrustedOriginResponse();
        return TeaModel.build(map, self);
    }

    public GetTrustedOriginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrustedOriginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrustedOriginResponse setBody(GetTrustedOriginResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrustedOriginResponseBody getBody() {
        return this.body;
    }

}
