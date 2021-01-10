// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UpdateHttpTriggerConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHttpTriggerConfigResponseBody body;

    public static UpdateHttpTriggerConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpTriggerConfigResponse self = new UpdateHttpTriggerConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHttpTriggerConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHttpTriggerConfigResponse setBody(UpdateHttpTriggerConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHttpTriggerConfigResponseBody getBody() {
        return this.body;
    }

}
