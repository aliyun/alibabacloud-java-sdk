// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class ReallocNgResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReallocNgResourceResponseBody body;

    public static ReallocNgResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReallocNgResourceResponse self = new ReallocNgResourceResponse();
        return TeaModel.build(map, self);
    }

    public ReallocNgResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReallocNgResourceResponse setBody(ReallocNgResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReallocNgResourceResponseBody getBody() {
        return this.body;
    }

}
