// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class FreezeMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FreezeMemberResponseBody body;

    public static FreezeMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        FreezeMemberResponse self = new FreezeMemberResponse();
        return TeaModel.build(map, self);
    }

    public FreezeMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FreezeMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FreezeMemberResponse setBody(FreezeMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public FreezeMemberResponseBody getBody() {
        return this.body;
    }

}
