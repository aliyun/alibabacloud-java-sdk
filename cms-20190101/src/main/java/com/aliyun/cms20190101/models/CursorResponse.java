// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CursorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CursorResponseBody body;

    public static CursorResponse build(java.util.Map<String, ?> map) throws Exception {
        CursorResponse self = new CursorResponse();
        return TeaModel.build(map, self);
    }

    public CursorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CursorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CursorResponse setBody(CursorResponseBody body) {
        this.body = body;
        return this;
    }
    public CursorResponseBody getBody() {
        return this.body;
    }

}
