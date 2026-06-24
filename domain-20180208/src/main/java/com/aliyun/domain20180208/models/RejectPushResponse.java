// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class RejectPushResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RejectPushResponseBody body;

    public static RejectPushResponse build(java.util.Map<String, ?> map) throws Exception {
        RejectPushResponse self = new RejectPushResponse();
        return TeaModel.build(map, self);
    }

    public RejectPushResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RejectPushResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RejectPushResponse setBody(RejectPushResponseBody body) {
        this.body = body;
        return this;
    }
    public RejectPushResponseBody getBody() {
        return this.body;
    }

}
