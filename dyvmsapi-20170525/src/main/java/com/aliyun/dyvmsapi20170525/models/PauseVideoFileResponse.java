// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class PauseVideoFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PauseVideoFileResponseBody body;

    public static PauseVideoFileResponse build(java.util.Map<String, ?> map) throws Exception {
        PauseVideoFileResponse self = new PauseVideoFileResponse();
        return TeaModel.build(map, self);
    }

    public PauseVideoFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PauseVideoFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PauseVideoFileResponse setBody(PauseVideoFileResponseBody body) {
        this.body = body;
        return this;
    }
    public PauseVideoFileResponseBody getBody() {
        return this.body;
    }

}
