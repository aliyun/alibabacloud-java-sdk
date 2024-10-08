// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class VerifySiteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifySiteResponseBody body;

    public static VerifySiteResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifySiteResponse self = new VerifySiteResponse();
        return TeaModel.build(map, self);
    }

    public VerifySiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifySiteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifySiteResponse setBody(VerifySiteResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifySiteResponseBody getBody() {
        return this.body;
    }

}
