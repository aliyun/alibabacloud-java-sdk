// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateRtcMPUEventSubResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRtcMPUEventSubResponseBody body;

    public static UpdateRtcMPUEventSubResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRtcMPUEventSubResponse self = new UpdateRtcMPUEventSubResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRtcMPUEventSubResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRtcMPUEventSubResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRtcMPUEventSubResponse setBody(UpdateRtcMPUEventSubResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRtcMPUEventSubResponseBody getBody() {
        return this.body;
    }

}
