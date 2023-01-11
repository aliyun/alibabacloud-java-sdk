// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class IsvGetAppIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public IsvGetAppIdResponseBody body;

    public static IsvGetAppIdResponse build(java.util.Map<String, ?> map) throws Exception {
        IsvGetAppIdResponse self = new IsvGetAppIdResponse();
        return TeaModel.build(map, self);
    }

    public IsvGetAppIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IsvGetAppIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IsvGetAppIdResponse setBody(IsvGetAppIdResponseBody body) {
        this.body = body;
        return this;
    }
    public IsvGetAppIdResponseBody getBody() {
        return this.body;
    }

}
