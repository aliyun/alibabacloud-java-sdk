// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class WalkingDirectionNovaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WalkingDirectionNovaResponseBody body;

    public static WalkingDirectionNovaResponse build(java.util.Map<String, ?> map) throws Exception {
        WalkingDirectionNovaResponse self = new WalkingDirectionNovaResponse();
        return TeaModel.build(map, self);
    }

    public WalkingDirectionNovaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WalkingDirectionNovaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WalkingDirectionNovaResponse setBody(WalkingDirectionNovaResponseBody body) {
        this.body = body;
        return this;
    }
    public WalkingDirectionNovaResponseBody getBody() {
        return this.body;
    }

}
