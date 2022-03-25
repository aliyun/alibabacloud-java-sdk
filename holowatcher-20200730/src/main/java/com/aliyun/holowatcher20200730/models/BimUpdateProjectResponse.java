// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimUpdateProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BimUpdateProjectResponseBody body;

    public static BimUpdateProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        BimUpdateProjectResponse self = new BimUpdateProjectResponse();
        return TeaModel.build(map, self);
    }

    public BimUpdateProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BimUpdateProjectResponse setBody(BimUpdateProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public BimUpdateProjectResponseBody getBody() {
        return this.body;
    }

}
