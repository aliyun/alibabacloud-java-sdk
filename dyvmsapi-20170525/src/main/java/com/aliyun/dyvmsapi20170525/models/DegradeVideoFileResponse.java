// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class DegradeVideoFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DegradeVideoFileResponseBody body;

    public static DegradeVideoFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DegradeVideoFileResponse self = new DegradeVideoFileResponse();
        return TeaModel.build(map, self);
    }

    public DegradeVideoFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DegradeVideoFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DegradeVideoFileResponse setBody(DegradeVideoFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DegradeVideoFileResponseBody getBody() {
        return this.body;
    }

}
