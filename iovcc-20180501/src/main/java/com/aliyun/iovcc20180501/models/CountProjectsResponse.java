// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CountProjectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CountProjectsResponseBody body;

    public static CountProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        CountProjectsResponse self = new CountProjectsResponse();
        return TeaModel.build(map, self);
    }

    public CountProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountProjectsResponse setBody(CountProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public CountProjectsResponseBody getBody() {
        return this.body;
    }

}
