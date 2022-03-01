// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class RecolorImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecolorImageResponseBody body;

    public static RecolorImageResponse build(java.util.Map<String, ?> map) throws Exception {
        RecolorImageResponse self = new RecolorImageResponse();
        return TeaModel.build(map, self);
    }

    public RecolorImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecolorImageResponse setBody(RecolorImageResponseBody body) {
        this.body = body;
        return this;
    }
    public RecolorImageResponseBody getBody() {
        return this.body;
    }

}
