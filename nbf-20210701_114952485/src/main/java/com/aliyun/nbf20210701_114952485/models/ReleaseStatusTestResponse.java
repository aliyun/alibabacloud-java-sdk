// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_114952485.models;

import com.aliyun.tea.*;

public class ReleaseStatusTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseStatusTestResponseBody body;

    public static ReleaseStatusTestResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseStatusTestResponse self = new ReleaseStatusTestResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseStatusTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseStatusTestResponse setBody(ReleaseStatusTestResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseStatusTestResponseBody getBody() {
        return this.body;
    }

}
