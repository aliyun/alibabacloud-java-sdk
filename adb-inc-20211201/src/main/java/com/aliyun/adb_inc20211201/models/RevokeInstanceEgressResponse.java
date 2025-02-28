// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class RevokeInstanceEgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeInstanceEgressResponseBody body;

    public static RevokeInstanceEgressResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeInstanceEgressResponse self = new RevokeInstanceEgressResponse();
        return TeaModel.build(map, self);
    }

    public RevokeInstanceEgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeInstanceEgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeInstanceEgressResponse setBody(RevokeInstanceEgressResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeInstanceEgressResponseBody getBody() {
        return this.body;
    }

}
