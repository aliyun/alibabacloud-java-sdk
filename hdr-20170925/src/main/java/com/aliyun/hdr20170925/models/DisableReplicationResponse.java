// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DisableReplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DisableReplicationResponseBody body;

    public static DisableReplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableReplicationResponse self = new DisableReplicationResponse();
        return TeaModel.build(map, self);
    }

    public DisableReplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableReplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableReplicationResponse setBody(DisableReplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableReplicationResponseBody getBody() {
        return this.body;
    }

}
