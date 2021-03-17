// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RecolorHDImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecolorHDImageResponseBody body;

    public static RecolorHDImageResponse build(java.util.Map<String, ?> map) throws Exception {
        RecolorHDImageResponse self = new RecolorHDImageResponse();
        return TeaModel.build(map, self);
    }

    public RecolorHDImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecolorHDImageResponse setBody(RecolorHDImageResponseBody body) {
        this.body = body;
        return this;
    }
    public RecolorHDImageResponseBody getBody() {
        return this.body;
    }

}
