// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GrantHonorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantHonorResponseBody body;

    public static GrantHonorResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantHonorResponse self = new GrantHonorResponse();
        return TeaModel.build(map, self);
    }

    public GrantHonorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantHonorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantHonorResponse setBody(GrantHonorResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantHonorResponseBody getBody() {
        return this.body;
    }

}
