// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class WalkingDirectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WalkingDirectionResponseBody body;

    public static WalkingDirectionResponse build(java.util.Map<String, ?> map) throws Exception {
        WalkingDirectionResponse self = new WalkingDirectionResponse();
        return TeaModel.build(map, self);
    }

    public WalkingDirectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WalkingDirectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WalkingDirectionResponse setBody(WalkingDirectionResponseBody body) {
        this.body = body;
        return this;
    }
    public WalkingDirectionResponseBody getBody() {
        return this.body;
    }

}
