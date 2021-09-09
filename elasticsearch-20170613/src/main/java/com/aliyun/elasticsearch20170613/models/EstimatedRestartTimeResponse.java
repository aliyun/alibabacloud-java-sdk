// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class EstimatedRestartTimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EstimatedRestartTimeResponseBody body;

    public static EstimatedRestartTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        EstimatedRestartTimeResponse self = new EstimatedRestartTimeResponse();
        return TeaModel.build(map, self);
    }

    public EstimatedRestartTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EstimatedRestartTimeResponse setBody(EstimatedRestartTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public EstimatedRestartTimeResponseBody getBody() {
        return this.body;
    }

}
