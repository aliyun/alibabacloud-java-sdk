// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20210713.models;

import com.aliyun.tea.*;

public class MemberOrderVerifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MemberOrderVerifyResponseBody body;

    public static MemberOrderVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        MemberOrderVerifyResponse self = new MemberOrderVerifyResponse();
        return TeaModel.build(map, self);
    }

    public MemberOrderVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MemberOrderVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MemberOrderVerifyResponse setBody(MemberOrderVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public MemberOrderVerifyResponseBody getBody() {
        return this.body;
    }

}
