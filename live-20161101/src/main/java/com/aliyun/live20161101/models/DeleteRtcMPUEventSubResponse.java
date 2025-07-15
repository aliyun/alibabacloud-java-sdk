// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteRtcMPUEventSubResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRtcMPUEventSubResponseBody body;

    public static DeleteRtcMPUEventSubResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRtcMPUEventSubResponse self = new DeleteRtcMPUEventSubResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRtcMPUEventSubResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRtcMPUEventSubResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRtcMPUEventSubResponse setBody(DeleteRtcMPUEventSubResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRtcMPUEventSubResponseBody getBody() {
        return this.body;
    }

}
