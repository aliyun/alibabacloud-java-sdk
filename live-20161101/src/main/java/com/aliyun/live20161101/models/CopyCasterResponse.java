// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CopyCasterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CopyCasterResponseBody body;

    public static CopyCasterResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyCasterResponse self = new CopyCasterResponse();
        return TeaModel.build(map, self);
    }

    public CopyCasterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyCasterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyCasterResponse setBody(CopyCasterResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyCasterResponseBody getBody() {
        return this.body;
    }

}
