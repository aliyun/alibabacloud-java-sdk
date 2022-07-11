// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class IdentifyCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public IdentifyCodeResponseBody body;

    public static IdentifyCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        IdentifyCodeResponse self = new IdentifyCodeResponse();
        return TeaModel.build(map, self);
    }

    public IdentifyCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IdentifyCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IdentifyCodeResponse setBody(IdentifyCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public IdentifyCodeResponseBody getBody() {
        return this.body;
    }

}
