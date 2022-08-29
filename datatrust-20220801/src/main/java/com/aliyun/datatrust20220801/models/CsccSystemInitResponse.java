// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class CsccSystemInitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CsccSystemInitResponseBody body;

    public static CsccSystemInitResponse build(java.util.Map<String, ?> map) throws Exception {
        CsccSystemInitResponse self = new CsccSystemInitResponse();
        return TeaModel.build(map, self);
    }

    public CsccSystemInitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CsccSystemInitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CsccSystemInitResponse setBody(CsccSystemInitResponseBody body) {
        this.body = body;
        return this;
    }
    public CsccSystemInitResponseBody getBody() {
        return this.body;
    }

}
