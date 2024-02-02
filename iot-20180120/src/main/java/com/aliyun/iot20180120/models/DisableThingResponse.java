// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DisableThingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableThingResponseBody body;

    public static DisableThingResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableThingResponse self = new DisableThingResponse();
        return TeaModel.build(map, self);
    }

    public DisableThingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableThingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableThingResponse setBody(DisableThingResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableThingResponseBody getBody() {
        return this.body;
    }

}
