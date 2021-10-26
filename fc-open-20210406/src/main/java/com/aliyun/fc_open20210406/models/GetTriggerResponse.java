// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetTriggerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTriggerResponseBody body;

    public static GetTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTriggerResponse self = new GetTriggerResponse();
        return TeaModel.build(map, self);
    }

    public GetTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTriggerResponse setBody(GetTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTriggerResponseBody getBody() {
        return this.body;
    }

}
