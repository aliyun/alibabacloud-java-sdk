// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class BindInterconnectionUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BindInterconnectionUidResponseBody body;

    public static BindInterconnectionUidResponse build(java.util.Map<String, ?> map) throws Exception {
        BindInterconnectionUidResponse self = new BindInterconnectionUidResponse();
        return TeaModel.build(map, self);
    }

    public BindInterconnectionUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindInterconnectionUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindInterconnectionUidResponse setBody(BindInterconnectionUidResponseBody body) {
        this.body = body;
        return this;
    }
    public BindInterconnectionUidResponseBody getBody() {
        return this.body;
    }

}
