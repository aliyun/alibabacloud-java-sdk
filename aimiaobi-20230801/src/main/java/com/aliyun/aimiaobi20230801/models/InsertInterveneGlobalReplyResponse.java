// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class InsertInterveneGlobalReplyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsertInterveneGlobalReplyResponseBody body;

    public static InsertInterveneGlobalReplyResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertInterveneGlobalReplyResponse self = new InsertInterveneGlobalReplyResponse();
        return TeaModel.build(map, self);
    }

    public InsertInterveneGlobalReplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertInterveneGlobalReplyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertInterveneGlobalReplyResponse setBody(InsertInterveneGlobalReplyResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertInterveneGlobalReplyResponseBody getBody() {
        return this.body;
    }

}
