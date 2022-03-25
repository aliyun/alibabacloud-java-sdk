// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DelBimProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DelBimProjectResponseBody body;

    public static DelBimProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DelBimProjectResponse self = new DelBimProjectResponse();
        return TeaModel.build(map, self);
    }

    public DelBimProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DelBimProjectResponse setBody(DelBimProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DelBimProjectResponseBody getBody() {
        return this.body;
    }

}
