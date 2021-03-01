// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class EnableDegradeControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableDegradeControlResponseBody body;

    public static EnableDegradeControlResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDegradeControlResponse self = new EnableDegradeControlResponse();
        return TeaModel.build(map, self);
    }

    public EnableDegradeControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDegradeControlResponse setBody(EnableDegradeControlResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDegradeControlResponseBody getBody() {
        return this.body;
    }

}
