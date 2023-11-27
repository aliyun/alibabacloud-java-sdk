// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class BindInterconnectionCidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BindInterconnectionCidResponseBody body;

    public static BindInterconnectionCidResponse build(java.util.Map<String, ?> map) throws Exception {
        BindInterconnectionCidResponse self = new BindInterconnectionCidResponse();
        return TeaModel.build(map, self);
    }

    public BindInterconnectionCidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindInterconnectionCidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindInterconnectionCidResponse setBody(BindInterconnectionCidResponseBody body) {
        this.body = body;
        return this;
    }
    public BindInterconnectionCidResponseBody getBody() {
        return this.body;
    }

}
