// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetRangeConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetRangeConfigResponseBody body;

    public static SetRangeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetRangeConfigResponse self = new SetRangeConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetRangeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetRangeConfigResponse setBody(SetRangeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetRangeConfigResponseBody getBody() {
        return this.body;
    }

}
