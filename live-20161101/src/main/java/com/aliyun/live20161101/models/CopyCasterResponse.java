// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CopyCasterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CopyCasterResponse setBody(CopyCasterResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyCasterResponseBody getBody() {
        return this.body;
    }

}
