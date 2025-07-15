// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateRtcMPUEventSubResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRtcMPUEventSubResponseBody body;

    public static CreateRtcMPUEventSubResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRtcMPUEventSubResponse self = new CreateRtcMPUEventSubResponse();
        return TeaModel.build(map, self);
    }

    public CreateRtcMPUEventSubResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRtcMPUEventSubResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRtcMPUEventSubResponse setBody(CreateRtcMPUEventSubResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRtcMPUEventSubResponseBody getBody() {
        return this.body;
    }

}
