// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class MoveIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MoveIpResponseBody body;

    public static MoveIpResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveIpResponse self = new MoveIpResponse();
        return TeaModel.build(map, self);
    }

    public MoveIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveIpResponse setBody(MoveIpResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveIpResponseBody getBody() {
        return this.body;
    }

}
