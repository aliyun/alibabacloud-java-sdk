// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class BindLeaderInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindLeaderInstanceResponseBody body;

    public static BindLeaderInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        BindLeaderInstanceResponse self = new BindLeaderInstanceResponse();
        return TeaModel.build(map, self);
    }

    public BindLeaderInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindLeaderInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindLeaderInstanceResponse setBody(BindLeaderInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public BindLeaderInstanceResponseBody getBody() {
        return this.body;
    }

}
