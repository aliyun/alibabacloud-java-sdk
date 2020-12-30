// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetOptimizeConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetOptimizeConfigResponseBody body;

    public static SetOptimizeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetOptimizeConfigResponse self = new SetOptimizeConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetOptimizeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetOptimizeConfigResponse setBody(SetOptimizeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetOptimizeConfigResponseBody getBody() {
        return this.body;
    }

}
