// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SkipVideoFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SkipVideoFileResponseBody body;

    public static SkipVideoFileResponse build(java.util.Map<String, ?> map) throws Exception {
        SkipVideoFileResponse self = new SkipVideoFileResponse();
        return TeaModel.build(map, self);
    }

    public SkipVideoFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SkipVideoFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SkipVideoFileResponse setBody(SkipVideoFileResponseBody body) {
        this.body = body;
        return this;
    }
    public SkipVideoFileResponseBody getBody() {
        return this.body;
    }

}
