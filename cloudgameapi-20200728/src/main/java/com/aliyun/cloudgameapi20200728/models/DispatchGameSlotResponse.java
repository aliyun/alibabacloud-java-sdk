// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class DispatchGameSlotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DispatchGameSlotResponseBody body;

    public static DispatchGameSlotResponse build(java.util.Map<String, ?> map) throws Exception {
        DispatchGameSlotResponse self = new DispatchGameSlotResponse();
        return TeaModel.build(map, self);
    }

    public DispatchGameSlotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DispatchGameSlotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DispatchGameSlotResponse setBody(DispatchGameSlotResponseBody body) {
        this.body = body;
        return this;
    }
    public DispatchGameSlotResponseBody getBody() {
        return this.body;
    }

}
