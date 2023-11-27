// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UnbindInterconnectionUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindInterconnectionUidResponseBody body;

    public static UnbindInterconnectionUidResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindInterconnectionUidResponse self = new UnbindInterconnectionUidResponse();
        return TeaModel.build(map, self);
    }

    public UnbindInterconnectionUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindInterconnectionUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindInterconnectionUidResponse setBody(UnbindInterconnectionUidResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindInterconnectionUidResponseBody getBody() {
        return this.body;
    }

}
