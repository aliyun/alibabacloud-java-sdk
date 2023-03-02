// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class LockMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public LockMemberResponseBody body;

    public static LockMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        LockMemberResponse self = new LockMemberResponse();
        return TeaModel.build(map, self);
    }

    public LockMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LockMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LockMemberResponse setBody(LockMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public LockMemberResponseBody getBody() {
        return this.body;
    }

}
