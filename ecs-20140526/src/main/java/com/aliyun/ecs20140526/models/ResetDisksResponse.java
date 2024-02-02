// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ResetDisksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetDisksResponseBody body;

    public static ResetDisksResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetDisksResponse self = new ResetDisksResponse();
        return TeaModel.build(map, self);
    }

    public ResetDisksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetDisksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetDisksResponse setBody(ResetDisksResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetDisksResponseBody getBody() {
        return this.body;
    }

}
