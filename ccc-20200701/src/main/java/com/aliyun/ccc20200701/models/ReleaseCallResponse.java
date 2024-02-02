// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ReleaseCallResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseCallResponseBody body;

    public static ReleaseCallResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseCallResponse self = new ReleaseCallResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseCallResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseCallResponse setBody(ReleaseCallResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseCallResponseBody getBody() {
        return this.body;
    }

}
