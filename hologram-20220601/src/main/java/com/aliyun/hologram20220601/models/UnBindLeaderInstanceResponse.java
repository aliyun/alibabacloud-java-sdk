// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class UnBindLeaderInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnBindLeaderInstanceResponseBody body;

    public static UnBindLeaderInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnBindLeaderInstanceResponse self = new UnBindLeaderInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UnBindLeaderInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnBindLeaderInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnBindLeaderInstanceResponse setBody(UnBindLeaderInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnBindLeaderInstanceResponseBody getBody() {
        return this.body;
    }

}
