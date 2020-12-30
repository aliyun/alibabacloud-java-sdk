// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class UpdateFCTriggerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateFCTriggerResponse setBody(UpdateFCTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFCTriggerResponseBody getBody() {
        return this.body;
    }

}
