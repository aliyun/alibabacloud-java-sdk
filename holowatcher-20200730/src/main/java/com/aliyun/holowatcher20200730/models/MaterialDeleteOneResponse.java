// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class MaterialDeleteOneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MaterialDeleteOneResponseBody body;

    public static MaterialDeleteOneResponse build(java.util.Map<String, ?> map) throws Exception {
        MaterialDeleteOneResponse self = new MaterialDeleteOneResponse();
        return TeaModel.build(map, self);
    }

    public MaterialDeleteOneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MaterialDeleteOneResponse setBody(MaterialDeleteOneResponseBody body) {
        this.body = body;
        return this;
    }
    public MaterialDeleteOneResponseBody getBody() {
        return this.body;
    }

}
