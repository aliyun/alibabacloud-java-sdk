// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class UpdateFCTriggerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFCTriggerResponseBody body;

    public static UpdateFCTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFCTriggerResponse self = new UpdateFCTriggerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFCTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFCTriggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFCTriggerResponse setBody(UpdateFCTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFCTriggerResponseBody getBody() {
        return this.body;
    }

}
