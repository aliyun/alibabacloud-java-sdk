// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DeniedMemberAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeniedMemberAccessResponseBody body;

    public static DeniedMemberAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        DeniedMemberAccessResponse self = new DeniedMemberAccessResponse();
        return TeaModel.build(map, self);
    }

    public DeniedMemberAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeniedMemberAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeniedMemberAccessResponse setBody(DeniedMemberAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public DeniedMemberAccessResponseBody getBody() {
        return this.body;
    }

}
