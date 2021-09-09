// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateLogstashChargeTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLogstashChargeTypeResponseBody body;

    public static UpdateLogstashChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogstashChargeTypeResponse self = new UpdateLogstashChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLogstashChargeTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLogstashChargeTypeResponse setBody(UpdateLogstashChargeTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLogstashChargeTypeResponseBody getBody() {
        return this.body;
    }

}
