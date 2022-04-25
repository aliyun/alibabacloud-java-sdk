// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class AAbckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AAbckResponseBody body;

    public static AAbckResponse build(java.util.Map<String, ?> map) throws Exception {
        AAbckResponse self = new AAbckResponse();
        return TeaModel.build(map, self);
    }

    public AAbckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AAbckResponse setBody(AAbckResponseBody body) {
        this.body = body;
        return this;
    }
    public AAbckResponseBody getBody() {
        return this.body;
    }

}
