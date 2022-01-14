// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class RevokeMpsMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RevokeMpsMessageResponseBody body;

    public static RevokeMpsMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeMpsMessageResponse self = new RevokeMpsMessageResponse();
        return TeaModel.build(map, self);
    }

    public RevokeMpsMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeMpsMessageResponse setBody(RevokeMpsMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeMpsMessageResponseBody getBody() {
        return this.body;
    }

}
