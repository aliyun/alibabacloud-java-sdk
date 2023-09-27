// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class ResetCustomizedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResetCustomizedResponseBody body;

    public static ResetCustomizedResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetCustomizedResponse self = new ResetCustomizedResponse();
        return TeaModel.build(map, self);
    }

    public ResetCustomizedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetCustomizedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetCustomizedResponse setBody(ResetCustomizedResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetCustomizedResponseBody getBody() {
        return this.body;
    }

}
