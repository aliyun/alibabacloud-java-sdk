// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class ReleaseSecretNoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseSecretNoResponseBody body;

    public static ReleaseSecretNoResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseSecretNoResponse self = new ReleaseSecretNoResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseSecretNoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseSecretNoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseSecretNoResponse setBody(ReleaseSecretNoResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseSecretNoResponseBody getBody() {
        return this.body;
    }

}
