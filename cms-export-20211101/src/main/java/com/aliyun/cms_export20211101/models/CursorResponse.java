// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms_export20211101.models;

import com.aliyun.tea.*;

public class CursorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public CursorResponse setBody(CursorResponseBody body) {
        this.body = body;
        return this;
    }
    public CursorResponseBody getBody() {
        return this.body;
    }

}
